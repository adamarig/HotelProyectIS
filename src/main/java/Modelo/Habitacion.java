package Modelo;

public class Habitacion {

	public String NumeroHabitacion;
    public String NumeroPersonas;
	public String piso;
	public String tipoHabitacion; 
	public String estado;
    public String precio;
    
    
	public Habitacion( String NumeroPersonas, String tipoHabitacion ,String NumeroHabitacion,String piso,String estado, String precio) {
		this.NumeroHabitacion= NumeroHabitacion;
		this.piso = piso;
		this.NumeroPersonas = NumeroPersonas;
		this.tipoHabitacion = tipoHabitacion;
		this.estado = estado;
		this.precio = precio;
	}

	

	public Habitacion(String tipoHabitacion, String Estado) {
		// TODO Auto-generated constructor stub
	}


	public String getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}



	public String getNumeroHabitacion() {
		return NumeroHabitacion;
	}


	@Override
	public String toString() {
		return "Habitacion [NumeroHabitacion=" + NumeroHabitacion + ", NumeroPersonas=" + NumeroPersonas + ", piso="
				+ piso + ", tipoHabitacion=" + tipoHabitacion + ", estado=" + estado + ", precio=" + precio + "]";
	}


	public void setNumeroHabitacion(String numeroHabitacion) {
		NumeroHabitacion = numeroHabitacion;
	}


	public String getNumeroPersonas() {
		return NumeroPersonas;
	}


	public void setNumeroPersonas(String numeroPersonas) {
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


	public String getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}
	

	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getNumPersonas() {
		// TODO Auto-generated method stub
		return null;
	}

}