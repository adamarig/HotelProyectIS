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
	
	
	public ReservacionDao(Date fechaLlegada, Date fechaSalida, String NumAdultos, String NumNinos, String tipoHabitacion,int idCliente ) {
		
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.NumAdultos = NumAdultos;
		this.NumNinos = NumNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.idCliente = idCliente;
	}


	public ReservacionDao(Date fechaLlegada, Date fechaSalida, String numAdultos, String numNinos, String tipoHabitacion,
			int idCliente, double precio) {
	
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.NumAdultos = numAdultos;
		this.NumNinos = numNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.idCliente = idCliente;
		this.precio = precio;
	}


	public ReservacionDao() throws ClassNotFoundException{
		database = new ConexionAWS();
	}
	

	public ReservacionDao(int idReservacion) {
		this.idReservacion = idReservacion;
	}
	
	
	
	
public ReservacionDao(Date fechaLlegada, Date fechaSalida, String numAdultos, String numNinos, String tipoHabitacion,
			int idCliente, int idReservacion) {
		
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.NumAdultos = numAdultos;
		this.NumNinos = numNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.idCliente = idCliente;
		this.idReservacion = idReservacion;
	}


///////////////////////Insertar datos en la tabla reservacion///////////////////////////////////
	
	public boolean AgregarReservacion() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO reservacion (fechaLlegada,fechaSalida,NumAdultos,NumNinos,tipoHabitacion) VALUES "
					+ "('"+this.fechaLlegada+"','"+this.fechaSalida+"','"+this.NumAdultos+"','"+this.NumNinos +"','"+this.tipoHabitacion +"','"+this.idCliente +"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public String getFechaLlegada() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFechaSalida() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getNumAdultos() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getNumNinos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getTipoHabitacion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getIdCliente() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public String getIdReservacion() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
