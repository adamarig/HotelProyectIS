package com.example.Hotel;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

///Modelo//
import Modelo.Cliente;
import Modelo.Habitacion;
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
	public ReservacionResponse getReservacion (@RequestPayload ReservacionRequest peticion) {
		ReservacionResponse respuesta = new ReservacionResponse();
		
		ReservacionDao Reservacion = new ReservacionDao(peticion.getFechaLlegada(), peticion.getFechaSalida(), 
				peticion.getNumAdultos(),peticion.getNumNinos(),peticion.getTipoHabitacion(),peticion.getIdCliente());
		
		double precio = Reservacion.getPrecio();
		if (Reservacion.registrarReservacion()) {
			respuesta.setRespuesta("Se ha registrado con exito");
			respuesta.setPrecio(precio);
		} else {
			respuesta.setRespuesta("No se ha podido registrar con exito intentalo de nuevo");
		}
		
		return respuesta;
	}
	
	
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EditarReservacionRequest")

	@ResponsePayload
	public EditarReservacionResponse getEditarCliente (@RequestPayload EditarReservacionRequest peticion) {
		EditarReservacionResponse respuesta = new EditarReservacionResponse();
		ReservacionDao r = new ReservacionDao (peticion.getFechaLlegada(),peticion.getFechaSalida(), peticion.getNumAdultos(), 
				peticion.getNumNinos(),peticion.getTipoHabitacion(),peticion. getIdCliente());
		if (r.verificarIdReservacion()) {
			if (r.Editar()) {
				respuesta.setRespuesta("Se ha Editado con exito tus datos");
				respuesta.setPrecio(r.getPrecio());
			} else {
				respuesta.setRespuesta("No se ha podido editar tus datos ");
			}
		} 
		return respuesta;
	
	
	
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "CancelarReservacionRequest")
    
	@ResponsePayload
	public CancelarReservacionResponse getCancelarReservacion (@RequestPayload CancelarReservacionRequest peticion) {
		CancelarReservacionResponse respuesta = new CancelarReservacionResponse();
		
		ReservacionDao Reservacion = new ReservacionDao(peticion.getIdReservacion());
		
		if (Reservacion.eliminarReservacion()) {
			respuesta.setRespuesta("Se ha cancelado con exito");
		} else {
			respuesta.setRespuesta("No se ha podido cancelar con exito");
		}
		
		return respuesta;
	}
	
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "MostrarReservacionRequest")

	@ResponsePayload
	public MostrarReservacionResponse getMostrarReservacion (@RequestPayload MostrarReservacionRequest peticion) {
		MostrarReservacionResponse respuesta = new MostrarReservacionResponse();
		
		ReservacionDao Reservacion = new ReservacionDao(peticion.getIdReservacion());
		
		Reservacion rep = Reservacion.MostrarReservacion(peticion.getIdReservacion());
		
		if (rep != null) {
			java.util.Date date1 = Calendar.getInstance().getTime();  
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy-mm-dd");  
            String fechaLlegada = dateFormat1.format(rep.getFechaLlegada());  
			respuesta.setFechaLlegada(fechaLlegada);
			
			java.util.Date date2 = Calendar.getInstance().getTime();  
            DateFormat dateFormat2 = new SimpleDateFormat("yyyy-mm-dd");  
            String fechaSalida = dateFormat2.format(rep.getFechaSalida());  
			respuesta.setFechaLlegada(fechaSalida);
			
			respuesta.setIdCliente(rep.getIdCliente());
			respuesta.setNumAdultos(rep.getNumAdultos());
			respuesta.setNumNinos(rep.getNumNinos());
			respuesta.setTipoHabitacion(rep.getTipoHabitacion());
			respuesta.setPrecio(rep.getPrecio());
		}
		
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
			if (cliente.Editar()) {
				respuesta.setRespuesta("Se ha Editado con exito "+cliente.getNombre()+" "+cliente.getApellido()+" "+cliente.getTelefono()+" "+cliente.getCorreo()+"" +cliente.getTipoPago()+"");
			} else {
				respuesta.setRespuesta("No se ha podido editar tus datos ");
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
	public MostrarClienteResponse getMostrarCliente (@RequestPayload MostrarClienteRequest peticion) {
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
		HabitacionDao Habitacion =  new  HabitacionDao ( peticion . getNumeroHabitacion (), peticion . getPiso(),
				peticion . getNumPersonas(), peticion . getTipoHabitacion(), peticion . getEstado(), peticion.getPrecio());
		if(Habitacion.AgregarHabitacion()){
			respuesta . setRespuesta ( "Habitación agregada con exito:" + Habitacion.getNumeroHabitacion() + "" + Habitacion.getPiso()
			+ ""+Habitacion.getNumPersonas() + ""+Habitacion.getTipoHabitacion()+ "" +Habitacion.getEstado()+ ""+Habitacion.getPrecio()+ "");
		} else {
			respuesta . setRespuesta ( " No se ha agregado la habitacion con exito:");
		}
		return respuesta;
		
		}
	 
	/////////////////////////////////////EDITAR HABITACION/////////////////////////////////////////////
	
	@PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "EditarHabitacionRequest")

	@ResponsePayload
	public EditarHabitacionResponse getEditarCliente (@RequestPayload EditarHabitacionRequest peticion) {
		EditarHabitacionResponse respuesta = new EditarHabitacionResponse();
		HabitacionDao Habitacion = new HabitacionDao ( peticion . getNumeroHabitacion (), peticion . getPiso(),
				peticion . getNumPersonas(), peticion . getTipoHabitacion(), peticion . getEstado(), peticion.getPrecio());
		if (Habitacion.verificarIdHabitacion()) {
			if (Habitacion.Editar()) {
				respuesta.setRespuesta("Se ha Editado con exito ");
			} else {
				respuesta.setRespuesta("No se ha podido editar tus datos ");
			}
		} 
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
	public DisponibilidadResponse getDisponibilidad (@RequestPayload DisponibilidadRequest peticion) {
		DisponibilidadResponse respuesta = new DisponibilidadResponse();
		HabitacionDao habit = new HabitacionDao(peticion.getIdHabitacion());
		
		Habitacion h = habit.Disponibilidad(peticion.getIdHabitacion());
		
		
		if (h != null) {
			respuesta.setNumeroHabitacion(h.getNumeroHabitacion());
			respuesta.setNumPersonas(h.getNumPersonas());
			respuesta.setPiso(h.getPiso());
			respuesta.setTipoHabitacion(h.getTipoHabitacion());
			respuesta.setEstado(h.getEstado());
			respuesta.setPrecio(h.getPrecio());
		
		
	}
		return respuesta;
	}
	
	
}
