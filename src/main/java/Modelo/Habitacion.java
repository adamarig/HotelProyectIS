package Modelo;

public class Habitacion {

	public String NumeroHabitacion;
    public int NumeroPersonas;
	public String piso;
	public String tipoHabitacion; 
	
    public String Estado;
    public String precio;
	public Habitacion( int NumeroPersonas, String tipoHabitacion ,String NumeroHabitacion,String piso,String Estado, String precio) {
		this.NumeroHabitacion= NumeroHabitacion;
		this.piso = piso;
		this.NumeroPersonas = NumeroPersonas;
		this.tipoHabitacion = tipoHabitacion;
		this.Estado = Estado;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Habitacion [NumeroHabitacion=" + NumeroHabitacion + ", NumeroPersonas=" + NumeroPersonas + ", piso="
				+ piso + ", tipoHabitacion=" + tipoHabitacion + "]";
	}


	public String getNumeroHabitacion() {
		return NumeroHabitacion;
	}


	public void setNumeroHabitacion(String numeroHabitacion) {
		NumeroHabitacion = numeroHabitacion;
	}


	public int getNumeroPersonas() {
		return NumeroPersonas;
	}


	public void setNumeroPersonas(int numeroPersonas) {
		NumeroPersonas = numeroPersonas;
	}


	public String getPiso() {
		return piso;
	}


	public void setPiso(String piso) {
		this.piso = piso;
	}


	public String getTipoHabitacion() {
		return tipoHabitacion;
	}


	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	

}