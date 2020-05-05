package Dao;

import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.ConexionAWS;
import Modelo.Cliente;
import Modelo.Habitacion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HabitacionDao {

	
	private int idHabitacion;
	
	private String numeroHabitacion;
	private String numPersonas;
	private String piso;
	private String tipoHabitacion;
	private String estado;
	private String precio;
	
	private ConexionAWS database;
	
	
	public HabitacionDao (String numeroHabitacion,String numPersonas,String piso,String tipoHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
		this.numPersonas = numPersonas;
		this.piso= piso;
		this.tipoHabitacion=tipoHabitacion;
		
	}
	
	
	
	
	
	public HabitacionDao(String numeroHabitacion, String numPersonas, String piso, String tipoHabitacion, String estado,
			String precio) {
		
		this.numeroHabitacion = numeroHabitacion;
		this.numPersonas = numPersonas;
		this.piso = piso;
		this.tipoHabitacion = tipoHabitacion;
		this.estado = estado;
		this.precio = precio;
	}





	public String getPrecio() {
		return precio;
	}





	public HabitacionDao(String tipoHabitacion, String estado) {
		super();
		this.tipoHabitacion = tipoHabitacion;
		this.estado = estado;
	}





	public HabitacionDao(int idHabitacion, String numeroHabitacion, String numPersonas, String piso,
			String tipoHabitacion) {

		this.idHabitacion = idHabitacion;
		this.numeroHabitacion = numeroHabitacion;
		this.numPersonas = numPersonas;
		this.piso = piso;
		this.tipoHabitacion = tipoHabitacion;
	}




	
	

	public HabitacionDao() throws ClassNotFoundException{
		database = new ConexionAWS();
	}
	
	
	 
	public HabitacionDao(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	
	





	///////////////////////Insertar datos en la tabla Habitacion///////////////////////////////////	
	public boolean AgregarHabitacion() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO habitacion (numeroHabitacion,numPersonas,piso,tipoHabitacion,estado,precio) VALUES "
					+ "('"+this.numeroHabitacion+"','"+this.numPersonas+"','"+this.piso+"','"+this.tipoHabitacion +"','"+this.estado +"','"+this.precio +"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	

	
///////////////////////Eliminar datos en la tabla habitacion mediante idHabitacion///////////////////////////////////
	
	public boolean eliminarHabit() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"DELETE FROM habitacion WHERE idHabitacion = "+this.idHabitacion);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

/////////////////////DISPONIBILIDAD DE LA HABITACION///////////////////////////777
	public Habitacion Disponibilidad(int id) {
		Habitacion habitacion = null;
		this.database = new ConexionAWS();
		try {
			ResultSet rs = database.connection().createStatement().executeQuery("SELECT * FROM habitacion WHERE idHabitacion="+id);
			while(rs!= null && rs.next()) {
				habitacion = new Habitacion(rs.getString("numeroHabitacion"), rs.getString("numPersonas")
						, rs.getString("piso"), rs.getString("tipoHabitacion"),rs.getString("estado"),rs.getString("precio"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return habitacion;
	}
	
//////////////////////////////EDITAR////////////////////////////
	public boolean Editar() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute("UPDATE habitacion SET  numeroHabitacion = '"+numeroHabitacion+"', numPersonas = '"+numPersonas+"', piso = '"+piso+"',tipoHabitacion = '"+tipoHabitacion+"', estado = '"+estado+"', precio = '"+precio+"' WHERE idHabitacion = "+ idHabitacion);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	
	public boolean verificarIdHabitacion() {
		boolean existe = false;
		this.database = new ConexionAWS();
			try {
				final String queryCheck = "SELECT * FROM habitacion WHERE idHabitacion = "+this.idHabitacion;
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
	public String getNumeroHabitacion() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumPersonas() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getPiso() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTipoHabitacion() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getIdHabitacion() {
		// TODO Auto-generated method stub
		return idHabitacion ;
	}

	public String getEstado() {
		// TODO Auto-generated method stub
		return estado ;
	}


	
	
	
}
