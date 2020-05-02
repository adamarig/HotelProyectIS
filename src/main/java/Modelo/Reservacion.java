package Modelo;

import java.sql.Date;



public class Reservacion {
	
	private int idReservacion;
	private Date fechallegada;
	private Date fechasalida;
	private String NumAdultos;
	private String NumNinos;
	private String tipoHabitacion;
	private double precio;
	private int idCliente;
	
	
	
	
	public Reservacion(int idReservacion, Date fechallegada, Date fechasalida, String NumAdultos, String NumNinos,
			String tipoHabitacion, double precio, int idCliente) {
		super();
		this.idReservacion = idReservacion;
		this.fechallegada = fechallegada;
		this.fechasalida = fechasalida;
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
	public Date getFechallegada() {
		return fechallegada;
	}
	public void setFechallegada(Date fechallegada) {
		this.fechallegada = fechallegada;
	}
	public Date getFechasalida() {
		return fechasalida;
	}
	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
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