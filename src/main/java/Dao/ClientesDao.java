package Dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.ConexionAWS;
import Modelo.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientesDao {
    
	private int idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String tipoPago;

	
	private ConexionAWS database;

	public ClientesDao(String nombre,String apellido,String telefono,String correo, String tipoPago) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono= telefono;
		this.correo=correo;
		this.tipoPago=tipoPago;
	
	}
	
	public ClientesDao() throws ClassNotFoundException{
		database = new ConexionAWS();
	}
	
	
	public ClientesDao(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
	
	public ClientesDao(int idCliente, String nombre,String apellido, String telefono, String correo, String tipoPago) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.tipoPago = tipoPago;
	}
	

	
	
///////////////////////Insertar datos en la tabla Cliente///////////////////////////////////	
	
	public boolean RegistrarCliente() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO clientes (nombre,apellido,telefono,correo,tipoPago) VALUES "
					+ "('"+this.nombre+"','"+this.apellido+"','"+this.telefono+"','"+this.correo+"','"+this.tipoPago+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	

	
///////////////////////Editar datos en la tabla Cliente///////////////////////////////////	
	
	public boolean Editar() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute("UPDATE clientes SET  nombre = '"+nombre+"', apellido = '"+apellido+"', telefono = '"+telefono+"',correo = '"+correo+"', tipoPago = '"+tipoPago+"' WHERE idCliente = "+ idCliente);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
///////////////////////Eliminar datos en la tabla Cliente mediante idCliente///////////////////////////////////
	public boolean eliminarCliente() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connection().createStatement().execute(
					"DELETE FROM clientes WHERE idCliente = "+this.idCliente);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	
////////////////////VERIFICAR EL ID DEL CLIENTE///////////////////////////////////////
	public boolean verificarIdCliente() {
		boolean existe = false;
		this.database = new ConexionAWS();
			try {
				final String queryCheck = "SELECT * FROM clientes WHERE idCliente = "+this.idCliente;
				final PreparedStatement ps = this.database.connection().prepareStatement(queryCheck);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
				}
				
				
				//this.database.connect().createStatement().execute("SELECT * FROM clientes WHERE idCliente = "+this.idCliente);
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}
	
	
////////////////////////////MOSTRAR DATOS DE LA TABLA CLIENTE //////////////////////////////////////////	

	public Cliente MostrarCliente(int id) {
		Cliente cliente = null;
		this.database = new ConexionAWS();
		try {
			ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM clientes WHERE idCliente="+id);
			while(rs.next()) {
				cliente = new Cliente(rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono")
						, rs.getString("correo"), rs.getString("tipoPago"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}
	
	
	///GETS///

	
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}
	
		public String getTelefono() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getCorreo() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public String getTipoPago() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		public String getIdCliente() {
			// TODO Auto-generated method stub
			return null;
		}
		
	
	
}

	