package Dao;

import java.sql.SQLException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.ConexionAWS;
import Modelo.Reservacion;
import java.util.logging.Level;
import java.util.logging.Logger;





import javax.xml.datatype.XMLGregorianCalendar;

public class ReservacionDao {

	
	/**
	 * @param idReservacion
	 * @param fechaLlegada
	 * @param fechaSalida
	 * @param numAdultos
	 * @param numNinos
	 * @param tipoHabitacion
	 * @param nombreCliente
	 * @param telefono
	 * @param precio
	 * @param idCliente
	 */
	
	private String fechaLlegada;
	private String fechaSalida;
	private String NumAdultos;
	private String NumNinos;
	private String tipoHabitacion;
	private String nombreCliente;
	private String telefono;
	private double precio;
	private int idCliente;
	private int idReservacion;
	private ConexionAWS database;
	
	
	
	
	public ReservacionDao(int idReservacion, String fechaLlegada, String fechaSalida, String NumAdultos, String NumNinos,
			String tipoHabitacion,String nombreCliente,String telefono,int idCliente) {
		this.idReservacion = idReservacion;
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.NumAdultos = NumAdultos;
		this.NumNinos = NumNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.nombreCliente = nombreCliente;
		this.telefono= telefono;
		this.idCliente = idCliente;
	}
	
	
	public ReservacionDao(String fechaLlegada, String fechaSalida, String NumAdultos, String NumNinos,
			 String tipoHabitacion, String nombreCliente,String telefono,int idCliente) {
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.NumAdultos = NumAdultos;
		this.NumNinos = NumNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.nombreCliente=nombreCliente;
		this.telefono=telefono;
		this.idCliente = idCliente;
	}
	




	/**
	 * @param idReservacion
	 */
	public ReservacionDao(int idReservacion) {
		this.idReservacion = idReservacion;
	}

	

	/**
	 * @return the idReservacion
	 */
	public int getIdReservacion() {
		return idReservacion;
	}

	
	/**
	 * Metodo para agregar una reservacion
	 * @return
	 */
	public boolean RegistrarReservacion1() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO reservacion (fechaLlegada, fechaSalida, NumAdultos ,NumNinos, tipoHabitacion, nombreCliente, telefono, precio, idCliente) VALUES "
					+ "('"+this.fechaLlegada+"','"+this.fechaSalida+"','"+this.NumAdultos+"', '"+this.NumNinos+"','"+this.tipoHabitacion+"','"+this.nombreCliente+"','"+this.telefono+"','"+getPrecio()+"',"+this.idCliente+")");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	

	
	
	/**
	 * Metodo para eliminar una reservacion
	 * @return true si se elimina la reservacion de forma exitosa
	 */
	public boolean eliminarReservacion() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"DELETE FROM reservacion WHERE idReservacion = "+this.idReservacion);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	/**
	 * Metodo para obtener el precio aproximado de la estancia
	 * @return precio
	 */
	public double getPrecio() {
		double costoHabitacion = 0.0;
		
		
		switch (this.tipoHabitacion) {
			case "Individual":
				costoHabitacion = 500.0;
				this.precio = costoHabitacion;
				break;
			case "Doble":
				costoHabitacion = 800.0;
				this.precio = costoHabitacion;
				break;
			case "Triple":
				costoHabitacion = 1200.0;
				this.precio = costoHabitacion;
				break;
			case "Quad":
				costoHabitacion = 1350.0;
				this.precio = costoHabitacion ;
				break;
			case "Queen":
				costoHabitacion = 1500.0;
				this.precio = costoHabitacion ;
				break;
			case "Doble-Doble":
				costoHabitacion = 1800.0;
				this.precio = costoHabitacion ;
				break;
			case "Suite":
				costoHabitacion = 2000.0;
				this.precio = costoHabitacion ;
				break;
			case "Suite Estudio":
				costoHabitacion = 3000.0;
				this.precio = costoHabitacion ;
				break;
		}
		
		return this.precio;
	}
	
	/**
	 * Metodo para mostrar una reservacion
	 * @param id
	 * @return
	 */
	public Reservacion MostrarReservacion(int id) {
		Reservacion reservacion = null;
		this.database = new ConexionAWS();
		try {
			ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM reservacion WHERE idReservacion="+id );
			while(rs.next()) {
				reservacion = new Reservacion(rs.getString("fechaLlegada"),rs.getString("fechaSalida"),
						rs.getString("NumAdultos"), rs.getString("NumNinos"),rs.getString("tipoHabitacion"),
						rs.getString("nombreCliente"),rs.getString("telefono"),
						rs.getDouble("precio"), rs.getInt("idCliente"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reservacion;
	}

	public boolean EditarR() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"UPDATE reservacion SET "
							+ "fechaLlegada = '"+this.fechaLlegada+"'"
							+ " ,fechaSalida = '"+this.fechaSalida+"'"
							+ " ,NumAdultos = "+this.NumAdultos
							+ " ,NumNinos = "+this.NumNinos
							+ " ,tipoHabitacion = '"+this.tipoHabitacion+"'"
							+ " ,nombreCliente = '"+this.nombreCliente+"'"
							+ " ,telefono = '"+this.telefono+"'"
							+ " ,precio = '"+this.precio+"'"
							+ " ,idCliente = "+this.idCliente
							+ " WHERE idReservacion = "+this.idReservacion);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	public boolean verificarIdReservacion() {
		boolean existe = false;
		this.database = new ConexionAWS();
			try {
				final String queryCheck = "SELECT * FROM reservacion WHERE idReservacion = "+this.idReservacion;
				final PreparedStatement ps = this.database.connection().prepareStatement(queryCheck);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
				}
				
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}

}
