package com.example.Hotel;


import org.example.hotel.CancelarReservacionResponse;
import org.example.hotel.AgregarHabitacionRequest;
import org.example.hotel.AgregarHabitacionResponse;
import org.example.hotel.CancelarReservacionRequest;
import org.example.hotel.DisponibilidadRequest;
import org.example.hotel.DisponibilidadResponse;
import org.example.hotel.EditarReservacionResponse;
import org.example.hotel.PagoRequest;
import org.example.hotel.PagoResponse;
import org.example.hotel.EditarReservacionRequest;
import org.example.hotel.ReservacionRequest;
import org.example.hotel.ReservacionResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;





@Endpoint
public class EndPoint {
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "ReservacionRequest")

	@ResponsePayload
	public ReservacionResponse getLlegada(@RequestPayload ReservacionRequest peticion) {
		ReservacionResponse respuesta= new ReservacionResponse();
		respuesta.setRespuesta("Tu reservación es: " + peticion.getFechaLlegada() +  peticion.getFechaSalida()
		+ peticion.getNumAdultos() + peticion.getNumNinos() +  peticion.getTipoHabitacion() );
		return respuesta ;
	
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "CancelarReservacionRequest")

	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "DisponibilidadRequest")

	@ResponsePayload
	public DisponibilidadResponse getTipoHabitacion(@RequestPayload DisponibilidadRequest peticion) {
		DisponibilidadResponse respuesta= new DisponibilidadResponse();
		respuesta.setRespuesta("Esta disponible: " + peticion.getTipoHabitacion());
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
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "HabitacionRequest")

	@ResponsePayload
	public AgregarHabitacionResponse getTipoHabitacion(@RequestPayload AgregarHabitacionRequest peticion) {
		AgregarHabitacionResponse respuesta= new AgregarHabitacionResponse();
		respuesta.setRespuesta("Tipo de habitación: " + peticion.getTipoHabitacion());
		return respuesta;
	
	}
	
	
	
}