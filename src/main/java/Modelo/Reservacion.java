package Modelo;

import java.sql.Date;



public class Reservacion {
	
	private int idReservacion;
	private String fechaLlegada;
	private String fechaSalida;
	private String NumAdultos;
	private String NumNinos;
	private String tipoHabitacion;
	private String nombreCliente;
	private String telefono;
	private double precio;
	private int idCliente;
	
	
	
	
	


	public Reservacion(int idReservacion, String fechaLlegada, String fechaSalida, String NumAdultos, String NumNinos,
			String tipoHabitacion,String nombreCliente,String telefono,double precio, int idCliente) {
		this.idReservacion = idReservacion;
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.NumAdultos = NumAdultos;
		this.NumNinos = NumNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.nombreCliente=nombreCliente;
		this.telefono=telefono;
		this.precio = precio;
		this.idCliente = idCliente;
	}

	

	public Reservacion(String fechaLlegada, String fechaSalida, String NumAdultos, String NumNinos, String tipoHabitacion, String nombreCliente,
			String telefono, double precio, int idCliente) {
		
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.NumAdultos = NumAdultos;
		this.NumNinos = NumNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.nombreCliente=nombreCliente;
		this.telefono=telefono;
		this.precio = precio;
		this.idCliente = idCliente;
	}
	



	public int getIdReservacion() {
		return idReservacion;
	}
	public void setIdReservacion(int idReservacion) {
		this.idReservacion = idReservacion;
	}
	public String getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getNumAdultos() {
		return NumAdultos;
	}
	public void setNumAdultos(String NumAdultos) {
		NumAdultos = NumAdultos;
	}
	public String getNumNinos() {
		return NumNinos;
	}
	public void setNumNinos(String NumNinos) {
		NumNinos = NumNinos;
	}
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
	
	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	

}