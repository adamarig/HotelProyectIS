package com.example.Hotel;


import org.example.hotel.AgregarHabitacionRequest;
import org.example.hotel.AgregarHabitacionResponse;
import org.example.hotel.CancelarReservacionRequest;
import org.example.hotel.CancelarReservacionResponse;
import org.example.hotel.DisponibilidadRequest;
import org.example.hotel.DisponibilidadResponse;
import org.example.hotel.EditarClienteRequest;
import org.example.hotel.EditarClienteResponse;
import org.example.hotel.EditarHabitacionRequest;
import org.example.hotel.EditarHabitacionResponse;
import org.example.hotel.EditarReservacionRequest;
import org.example.hotel.EditarReservacionResponse;
import org.example.hotel.EliminarClienteRequest;
import org.example.hotel.EliminarClienteResponse;
import org.example.hotel.EliminarHabitacionRequest;
import org.example.hotel.EliminarHabitacionResponse;
import org.example.hotel.MostrarClienteRequest;
import org.example.hotel.MostrarClienteResponse;
import org.example.hotel.MostrarReservacionRequest;
import org.example.hotel.MostrarReservacionResponse;
import org.example.hotel.RegistrarClienteRequest;
import org.example.hotel.RegistrarClienteResponse;
import org.example.hotel.ReservacionRequest;
import org.example.hotel.ReservacionResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

///DAO///
import Dao.ClientesDao;
import Dao.HabitacionDao;
import Dao.ReservacionDao;
import Modelo.Cliente;
import Modelo.Reservacion;



//Reservaciones//

@Endpoint
public class EndPoint {
/*	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "ReservacionRequest")

	@ResponsePayload
	public ReservacionResponse getReservacion(@RequestPayload ReservacionRequest peticion) {
		ReservacionResponse respuesta= new ReservacionResponse();
		respuesta.setRespuesta("Tu reservación ha sido un exito: " + peticion.getFechaLlegada() +  peticion.getFechaSalida()
		+ peticion.getNumAdultos() + peticion.getNumNinos() +  peticion.getTipoHabitacion() );
		return respuesta ;
	
	}
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "ReservacionRequest")

	@ResponsePayload
	public ReservacionResponse  getAgregarHabitacion ( @RequestPayload  ReservacionRequest  peticion ) {
		ReservacionResponse respuesta = new  ReservacionResponse ();
		ReservacionDao Reservacion =  new  ReservacionDao ( peticion . getFechaLlegada (), peticion . getFechaSalida(),
				peticion . getNumAdultos(), peticion . getNumNinos(), peticion . getTipoHabitacion(), peticion . getIdCliente(), peticion . getIdReservacion());
		if(Reservacion.AgregarReservacion()){
			respuesta . setRespuesta ( "Habitación agregada con exito:" + Reservacion.getFechaLlegada() + "" + Reservacion.getFechaSalida()
			+ ""+Reservacion.getNumAdultos() + ""+Reservacion.getNumNinos()+ "" +Reservacion.getTipoHabitacion()+ "" +Reservacion.getIdCliente());
		} else {
			respuesta . setRespuesta ( " No se ha agregado la habitacion con exito:" + Reservacion.getFechaLlegada() + "" + Reservacion.getFechaSalida()
			+ ""+Reservacion.getNumAdultos() + ""+Reservacion.getNumNinos()+ "" +Reservacion.getTipoHabitacion()+ "" +Reservacion.getIdCliente());
		}
		return respuesta;
		
		}
		*/
	
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "ReservacionRequest")
	@ResponsePayload
	public ReservacionResponse getHacerReservacion (@RequestPayload ReservacionRequest peticion) {
		ReservacionResponse respuesta = new ReservacionResponse();
		
		ReservacionDao reservacion = new ReservacionDao(peticion.getFechaLlegada(), peticion.getFechaSalida(), 
				peticion.getNumAdultos(),peticion.getNumNinos(),peticion.getTipoHabitacion(),peticion.getIdCliente());
		
		double precio = reservacion.getPrecio();
		if (reservacion.AgregarReservacion()) {
			respuesta.setRespuesta("Se ha registrado la reservacion en el sistema");
			respuesta.setPrecio(precio);
		} else {
			respuesta.setRespuesta("No se ha podido registrar la reservacion en la base de datos");
		}
		
		return respuesta;
	}
	
	
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EditarReservacionRequest")

	@ResponsePayload
	public EditarReservacionResponse getLlegada(@RequestPayload EditarReservacionRequest peticion) {
		EditarReservacionResponse respuesta= new EditarReservacionResponse();
		respuesta.setRespuesta("Su reservación fue editada con exito: " + peticion.getFechaLlegada() + peticion.getFechaSalida() 
		+ peticion.getNumAdultos() + peticion.getNumNinos() 
		+  peticion.getTipoHabitacion()+ peticion.getIdCliente());
		return respuesta;
	
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "CancelarReservacionRequest")
    
	@ResponsePayload
	public CancelarReservacionResponse getLlegada(@RequestPayload CancelarReservacionRequest peticion) {
		CancelarReservacionResponse respuesta= new CancelarReservacionResponse();
		respuesta.setRespuesta("Su reservación fue cancelada con exito: " + peticion.getIdReservacion());
		return respuesta;
	
	}
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "MostrarReservacionRequest")

	@ResponsePayload
	public MostrarReservacionResponse getMostrar(@RequestPayload MostrarReservacionRequest peticion) {
		MostrarReservacionResponse respuesta= new MostrarReservacionResponse();
		respuesta.setRespuesta("Su reservación es: " + peticion.getIdReservacion());
		return respuesta;
	
	}
///Clientes///
/*
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "RegistrarClienteRequest")
    @ResponsePayload
	public RegistrarClienteResponse getRegistrar(@RequestPayload RegistrarClienteRequest peticion) {
		RegistrarClienteResponse respuesta= new RegistrarClienteResponse();
		respuesta.setRespuesta("Tu registro ha sido un exito: " + peticion.getNombre() +  peticion.getApellido()
		+ peticion.getTelefono() + peticion.getCorreo() +  peticion.getTipoPago() );
		return respuesta ;
	
	}
	*/
	
	/////////////////////////////////////////////REGISTRAR CLIENTE////////////////////////////////////////////////////
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "RegistrarClienteRequest")

	@ResponsePayload
	public RegistrarClienteResponse  getRegistrarCliente ( @RequestPayload  RegistrarClienteRequest  peticion ) {
		RegistrarClienteResponse respuesta = new  RegistrarClienteResponse ();
		ClientesDao Cliente =  new  ClientesDao ( 0,peticion . getNombre (), peticion . getApellido(),
				peticion . getTelefono(), peticion . getCorreo(), peticion . getTipoPago());
		if(Cliente.RegistrarCliente()){
			respuesta . setRespuesta ( "Tu registro ha sido un exito:" + Cliente.getNombre() + "" + Cliente.getApellido()
			+ "");
		} else {
			respuesta . setRespuesta ( " No se ha registrado con exito:" + Cliente.getNombre() + "" + Cliente.getApellido()
			+ ""+Cliente.getTelefono() + ""+Cliente.getCorreo() + ""+ Cliente.getTipoPago() + "");
		}
		return respuesta;
		
		}
	 
	
	
	/*
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EditarClienteRequest")
    @ResponsePayload
	public EditarClienteResponse getEditar(@RequestPayload EditarClienteRequest peticion) {
		EditarClienteResponse respuesta= new EditarClienteResponse();
		respuesta.setRespuesta("Tus datos han sido editados con exito: " + peticion.getNombre() +  peticion.getApellido()
		+ peticion.getTelefono() + peticion.getCorreo() +  peticion.getTipoPago()  );
		return respuesta ;
	
	}
	*/
	
/////////////////////////////////////////EDITAR CLIENTE/////////////////////////////////////////////////////	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EditarClienteRequest")
	
	@ResponsePayload
	public EditarClienteResponse getEditarCliente (@RequestPayload EditarClienteRequest peticion) {
		EditarClienteResponse respuesta = new EditarClienteResponse();
		ClientesDao cliente = new ClientesDao (peticion.getIdCliente(),peticion.getNombre(), peticion.getApellido(), 
				peticion.getTelefono(),peticion.getCorreo(), peticion.getTipoPago());
		if (cliente.verificarIdCliente()) {
			if (cliente.EditarCliente()) {
				respuesta.setRespuesta("Se ha Editado con exito "+cliente.getNombre()+" "+cliente.getApellido()+" "+cliente.getTelefono()+" "+cliente.getCorreo()+"" +cliente.getTipoPago()+"");
			} else {
				respuesta.setRespuesta("No se ha podido editar  "+cliente.getNombre()+" "+cliente.getApellido()+"");
			}
		} 
		return respuesta;
	
	
	
	}
	
	/*
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EliminarClienteRequest")
    @ResponsePayload
	public EliminarClienteResponse getEliminar(@RequestPayload EliminarClienteRequest peticion) {
		EliminarClienteResponse respuesta= new EliminarClienteResponse();
		respuesta.setRespuesta("Cliente Eliminado " + peticion.getIdCliente() );
		return respuesta ;
	
	
	
	}
	*/
	
//////////////////////////////////////ELIMINAR CLIENTE///////////////////////////////////////////	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EliminarClienteRequest")
	@ResponsePayload
	public EliminarClienteResponse getEliminarCliente (@RequestPayload EliminarClienteRequest peticion) {
		EliminarClienteResponse respuesta = new EliminarClienteResponse();
		ClientesDao cliente = new ClientesDao(peticion.getIdCliente());
		if (cliente.eliminarCliente()) {
			respuesta.setRespuesta("Se ha eliminado al cliente con exito");
		} else {
			respuesta.setRespuesta("No se ha podido eliminar al cliente intentelo de nuevo");
		}
		return respuesta;
	}
		
	
///////////////////////////////////////MOSTRAR CLIENTE//////////////////////////////////////////////	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "MostrarClienteRequest")
	@ResponsePayload
	public MostrarClienteResponse getConsultarCliente (@RequestPayload MostrarClienteRequest peticion) {
		MostrarClienteResponse respuesta = new MostrarClienteResponse();
		ClientesDao cliente = new ClientesDao(peticion.getIdCliente());
		
		Cliente c = cliente.MostrarCliente(peticion.getIdCliente());
		
		
		if (c != null) {
			respuesta.setNombre(c.getNombre());
			respuesta.setApellido(c.getApellido());
			respuesta.setCorreo(c.getCorreo());
			respuesta.setTelefono(c.getTelefono());
			respuesta.setTipoPago(c.getTipoPago());
		}
		
		return respuesta;
	}
	
	
	
	
											///Habitaciones///
	
	//////////////////////////////////AGREGAR HABITACION/////////////////////////////////////////
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "AgregarHabitacionRequest")

	@ResponsePayload
	public AgregarHabitacionResponse  getAgregarHabitacion ( @RequestPayload  AgregarHabitacionRequest  peticion ) {
		AgregarHabitacionResponse respuesta = new  AgregarHabitacionResponse ();
		HabitacionDao Habitacion =  new  HabitacionDao (0, peticion . getNumeroHabitacion (), peticion . getPiso(),
				peticion . getNumPersonas(), peticion . getTipoHabitacion());
		if(Habitacion.AgregarHabitacion()){
			respuesta . setRespuesta ( "Habitación agregada con exito:" + Habitacion.getNumeroHabitacion() + "" + Habitacion.getPiso()
			+ ""+Habitacion.getNumPersonas() + ""+Habitacion.getTipoHabitacion()+ "");
		} else {
			respuesta . setRespuesta ( " No se ha agregado la habitacion con exito:" + Habitacion.getNumeroHabitacion() + "" + Habitacion.getPiso()
			+ ""+Habitacion.getNumPersonas() + ""+Habitacion.getTipoHabitacion() +  "");
		}
		return respuesta;
		
		}
	 
	/////////////////////////////////////EDITAR HABITACION/////////////////////////////////////////////
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EditarHabitacionRequest")

	@ResponsePayload
	public EditarHabitacionResponse getEditarHabitacion(@RequestPayload EditarHabitacionRequest peticion) {
		EditarHabitacionResponse respuesta= new EditarHabitacionResponse();
		respuesta.setRespuesta("Datos de habitacion han sido editados con exito: " + peticion.getTipoHabitacion());
		return respuesta;
	
	}
	
	/*
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EliminarHabitacionRequest")

	@ResponsePayload
	public EliminarHabitacionResponse getEliminarHabitacion(@RequestPayload EliminarHabitacionRequest peticion) {
		EliminarHabitacionResponse respuesta= new EliminarHabitacionResponse();
		respuesta.setRespuesta("Habitacion eliminada con exito: " + peticion.getIdHabitacion());
		return respuesta;
	
	}

	*/
	
	/////////////////////////////ELIMINAR HABITACION//////////////////////////////////////////////
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EliminarHabitacionRequest")
	@ResponsePayload
	public EliminarHabitacionResponse getEliminarHabit (@RequestPayload EliminarHabitacionRequest peticion) {
		EliminarHabitacionResponse respuesta = new EliminarHabitacionResponse();
		HabitacionDao habit = new HabitacionDao ( peticion.getIdHabitacion());
		if (habit.eliminarHabit()) {
			respuesta.setRespuesta("Se ha eliminado la habitacion con exito");
		} else {
			respuesta.setRespuesta("No se ha podido eliminar la habitacion intentelo de nuevo");
		}
		return respuesta;
	}
		
	
	
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "DisponibilidadRequest")

	@ResponsePayload
	public DisponibilidadResponse getDisponibilidadHabitacion(@RequestPayload DisponibilidadRequest peticion) {
		DisponibilidadResponse respuesta= new DisponibilidadResponse();
		respuesta.setRespuesta("Esta disponible: " + peticion.getTipoHabitacion());
		return respuesta;
	
	}
	
}