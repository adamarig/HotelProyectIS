package Modelo;

import java.sql.Date;



public class Reservacion {
	
	private int idReservacion;
	private Date fechaLlegada;
	private Date fechaSalida;
	private String NumAdultos;
	private String NumNinos;
	private String tipoHabitacion;
	private double precio;
	private int idCliente;
	
	
	
	
	public Reservacion(Date fechaLlegada, Date fechaSalida, String NumAdultos, String NumNinos,
			String tipoHabitacion, double precio, int idCliente) {
		super();
		this.idReservacion = idReservacion;
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.NumAdultos = NumAdultos;
		this.NumNinos = NumNinos;
		this.tipoHabitacion = tipoHabitacion;
		this.precio = precio;
		this.idCliente = idCliente;
	}
	
	public int getIdReservacion() {
		return idReservacion;
	}
	public void setIdReservacion(int idReservacion) {
		this.idReservacion = idReservacion;
	}
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
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