package Modelo;

public class Cliente {

	
	public String nombre;
	public String apellido;
	public String telefono;
	public String correo;
  	public String tipoPago;
  	public int idCliente;
  	
	public Cliente( String nombre, String apellido, String telefono, String correo, String tipoPago ,int idCliente) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.tipoPago = tipoPago;
		this.idCliente = idCliente;
	}
	
	
	
	public Cliente(String nombre, String apellido, String telefono, String correo, String tipoPago) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.tipoPago = tipoPago;
	}



	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
  	
  	
}
