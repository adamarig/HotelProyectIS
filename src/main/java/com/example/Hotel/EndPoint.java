package com.example.Hotel;


import org.example.hotel.CancelarReservacionResponse;
import org.example.hotel.CancelarReservacionRequest;
import org.example.hotel.DisponibilidadRequest;
import org.example.hotel.DisponibilidadResponse;
import org.example.hotel.EditarReservacionResponse;
import org.example.hotel.HabitacionRequest;
import org.example.hotel.HabitacionResponse;
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

	@ResponsePayload
	
	public CancelarReservacionResponse getCancelarReservacion (@RequestPayload CancelarReservacionRequest peticion) {
		CancelarReservacionResponse respuesta = new CancelarReservacionResponse();
		
		ReservacionHotel reservacion = new ReservacionHotel(peticion.getIdReservacion());
		
		if (reservacion.eliminarReservacion()) {
			respuesta.setRespuesta("Se ha eliminado la reservacion del sistema");
		} else {
			respuesta.setRespuesta("No se ha podido eliminar la reservacion de la base de datos");
		}
		
		return respuesta;
	}
	
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
		+ peticion.getNumAdultos() + peticion.getNumNinos() + peticion.getPrecio()
		+  peticion.getTipoHabitacion()+ peticion.getNombreCliente());
		return respuesta;
	
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "HabitacionRequest")

	@ResponsePayload
	public HabitacionResponse getTipoHabitacion(@RequestPayload HabitacionRequest peticion) {
		HabitacionResponse respuesta= new HabitacionResponse();
		respuesta.setRespuesta("Tipo de habitación: " + peticion.getTipoHabitacion());
		return respuesta;
	
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "PagoRequest")

	@ResponsePayload
	public PagoResponse getTipoPago(@RequestPayload PagoRequest peticion) {
		PagoResponse respuesta= new PagoResponse();
		respuesta.setRespuesta("Su pago fue: " + peticion.getTipoPago());
		return respuesta;
	
	}
	
}