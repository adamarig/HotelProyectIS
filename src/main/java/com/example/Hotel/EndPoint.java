package com.example.Hotel;


import org.example.hotel.CancelarReservacionResponse;
import org.example.hotel.CancelarReservacionRequest;
import org.example.hotel.AgregarHabitacionRequest;
import org.example.hotel.AgregarHabitacionResponse;
import org.example.hotel.DisponibilidadRequest;
import org.example.hotel.DisponibilidadResponse;
import org.example.hotel.EditarClienteRequest;
import org.example.hotel.EditarClienteResponse;
import org.example.hotel.EditarHabitacionRequest;
import org.example.hotel.EditarHabitacionResponse;
import org.example.hotel.EditarReservacionResponse;
import org.example.hotel.EliminarClienteRequest;
import org.example.hotel.EliminarClienteResponse;
import org.example.hotel.EliminarHabitacionRequest;
import org.example.hotel.EliminarHabitacionResponse;
import org.example.hotel.MostrarReservacionRequest;
import org.example.hotel.MostrarReservacionResponse;
import org.example.hotel.RegistrarClienteRequest;
import org.example.hotel.RegistrarClienteResponse;
import org.example.hotel.EditarReservacionRequest;
import org.example.hotel.ReservacionRequest;
import org.example.hotel.ReservacionResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



//Reservaciones//

@Endpoint
public class EndPoint {
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "ReservacionRequest")

	@ResponsePayload
	public ReservacionResponse getReservacion(@RequestPayload ReservacionRequest peticion) {
		ReservacionResponse respuesta= new ReservacionResponse();
		respuesta.setRespuesta("Tu reservación es: " + peticion.getFechaLlegada() +  peticion.getFechaSalida()
		+ peticion.getNumAdultos() + peticion.getNumNinos() +  peticion.getTipoHabitacion() );
		return respuesta ;
	
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
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "RegistrarClienteRequest")
    @ResponsePayload
	public RegistrarClienteResponse getRegistrar(@RequestPayload RegistrarClienteRequest peticion) {
		RegistrarClienteResponse respuesta= new RegistrarClienteResponse();
		respuesta.setRespuesta("Tu registro ha sido un exito: " + peticion.getNombre() +  peticion.getApellido()
		+ peticion.getTelefono() + peticion.getCorreo() +  peticion.getTipoPago() );
		return respuesta ;
	
	}
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EditarClienteRequest")
    @ResponsePayload
	public EditarClienteResponse getEditar(@RequestPayload EditarClienteRequest peticion) {
		EditarClienteResponse respuesta= new EditarClienteResponse();
		respuesta.setRespuesta("Tus datos han sido editados con exito: " + peticion.getNombre() +  peticion.getApellido()
		+ peticion.getTelefono() + peticion.getCorreo() +  peticion.getTipoPago() + peticion.getIdCliente() );
		return respuesta ;
	
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EliminarClienteRequest")
    @ResponsePayload
	public EliminarClienteResponse getEliminar(@RequestPayload EliminarClienteRequest peticion) {
		EliminarClienteResponse respuesta= new EliminarClienteResponse();
		respuesta.setRespuesta("Cliente Eliminado " + peticion.getIdCliente() );
		return respuesta ;
	
	
	
	}
	
 ///Habitaciones///
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "HabitacionRequest")

	@ResponsePayload
	public AgregarHabitacionResponse getAgregarHabitacion(@RequestPayload AgregarHabitacionRequest peticion) {
		AgregarHabitacionResponse respuesta= new AgregarHabitacionResponse();
		respuesta.setRespuesta("Tipo de habitación: " + peticion.getNumeroHabitacion() + peticion.getNumPersonas()+ peticion.getPiso()+ peticion.getTipoHabitacion());
		return respuesta;
	
	}
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EditarHabitacionRequest")

	@ResponsePayload
	public EditarHabitacionResponse getEditarHabitacion(@RequestPayload EditarHabitacionRequest peticion) {
		EditarHabitacionResponse respuesta= new EditarHabitacionResponse();
		respuesta.setRespuesta("Tipo de habitación: " + peticion.getTipoHabitacion());
		return respuesta;
	
	}
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EliminarHabitacionRequest")

	@ResponsePayload
	public EliminarHabitacionResponse getEliminarHabitacion(@RequestPayload EliminarHabitacionRequest peticion) {
		EliminarHabitacionResponse respuesta= new EliminarHabitacionResponse();
		respuesta.setRespuesta("Tipo de habitación: " + peticion.getIdHabitacion());
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