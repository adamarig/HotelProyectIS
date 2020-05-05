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
import java.sql.Date;




import javax.xml.datatype.XMLGregorianCalendar;

public class ReservacionDao {

	private Date fechaLlegada;
	private Date fechaSalida;
	private String NumAdultos;
	private String NumNinos;
	private String tipoHabitacion;
	private int idCliente;
	private int idReservacion;
	private ConexionAWS database;
	
	private double precio;
	
	
	public ReservacionDao(int idReservacion, String fechaLlegada, String fechaSalida, String numAdultos, String numNinos,
			int numCamas, String tipoHabitacion,  int idCliente) {
		this.idReservacion = idReservacion;
		this.fechaLlegada = Date.valueOf(fechaLlegada);
		this.fechaSalida = Date.valueOf(fechaSalida);
		this.NumAdultos = NumAdultos;
		this.NumNinos = NumNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.idCliente = idCliente;
	}
	
	
	public ReservacionDao(String fechaLlegada, String fechaSalida, String NumAdultos, String NumNinos,
			 String tipoHabitacion, int idCliente) {
		this.fechaLlegada = Date.valueOf(fechaLlegada);
		this.fechaSalida = Date.valueOf(fechaSalida);
		this.NumAdultos = NumAdultos;
		this.NumNinos = NumNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.idCliente = idCliente;
	}
	
	/**
	 * @param idReservacion
	 */
	public ReservacionDao(int idReservacion) {
		this.idReservacion = idReservacion;
	}

	public ReservacionDao(XMLGregorianCalendar fechaLlegada2, XMLGregorianCalendar fechaSalida2, String numAdultos2,
			String numNinos2, String tipoHabitacion2, int idCliente2) {
		// TODO Auto-generated constructor stub
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
	public boolean registrarReservacion() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO reservacion (fechaLlegada, fechaSalida, numAdultos, numNinos, tipoHabitacion, precio, idCliente) VALUES "
					+ "('"+this.fechaLlegada+"','"+this.fechaSalida+"','"+this.NumAdultos+"','"+this.NumNinos+"','"+this.tipoHabitacion+"','"+this.precio+"','"+this.idCliente+"')");
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
		
		int dias=(int) ((this.fechaSalida.getTime()-this.fechaLlegada.getTime())/86400000);
		
		switch (this.tipoHabitacion) {
			case "Individual":
				costoHabitacion = 500.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Doble":
				costoHabitacion = 800.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Triple":
				costoHabitacion = 1200.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Quad":
				costoHabitacion = 1350.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Queen":
				costoHabitacion = 1500.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Doble-Doble":
				costoHabitacion = 1800.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Suite":
				costoHabitacion = 2000.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Suite Estudio":
				costoHabitacion = 3000.0;
				this.precio = costoHabitacion * dias;
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
			ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM reservacion WHERE idReservacion="+id);
			while(rs.next()) {
				reservacion = new Reservacion(rs.getDate("fechaLlegada"),rs.getDate("fechaSalida"),
						rs.getString("numAdultos"), rs.getString("NumNinos"),rs.getString("tipoHabitacion"), 
						rs.getDouble("precio"), rs.getInt("idCliente"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reservacion;
	}

	public boolean Editar() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute("UPDATE habitacion SET  fechaLlegada = '"+fechaLlegada+"', fechaSalida = '"+fechaSalida+"', NumAdultos = '"+NumAdultos+"',NumNinos = '"+NumNinos+"', precio = '"+precio+"', idCliente = '"+idCliente+"' WHERE idReservacion = "+ idReservacion);
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
