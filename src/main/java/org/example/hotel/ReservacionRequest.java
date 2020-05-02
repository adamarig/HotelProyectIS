//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.01 a las 08:19:51 PM CDT 
//


package org.example.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaLlegada" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumAdultos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumNinos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idReservacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fechaLlegada",
    "fechaSalida",
    "numAdultos",
    "numNinos",
    "tipoHabitacion",
    "idCliente",
    "idReservacion"
})
@XmlRootElement(name = "ReservacionRequest")
public class ReservacionRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaLlegada;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaSalida;
    @XmlElement(name = "NumAdultos")
    protected int numAdultos;
    @XmlElement(name = "NumNinos")
    protected int numNinos;
    @XmlElement(required = true)
    protected String tipoHabitacion;
    protected int idCliente;
    protected int idReservacion;

    /**
     * Obtiene el valor de la propiedad fechaLlegada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * Define el valor de la propiedad fechaLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLlegada(XMLGregorianCalendar value) {
        this.fechaLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSalida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Define el valor de la propiedad fechaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSalida(XMLGregorianCalendar value) {
        this.fechaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad numAdultos.
     * 
     */
    public int getNumAdultos() {
        return numAdultos;
    }

    /**
     * Define el valor de la propiedad numAdultos.
     * 
     */
    public void setNumAdultos(int value) {
        this.numAdultos = value;
    }

    /**
     * Obtiene el valor de la propiedad numNinos.
     * 
     */
    public int getNumNinos() {
        return numNinos;
    }

    /**
     * Define el valor de la propiedad numNinos.
     * 
     */
    public void setNumNinos(int value) {
        this.numNinos = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoHabitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Define el valor de la propiedad tipoHabitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoHabitacion(String value) {
        this.tipoHabitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idReservacion.
     * 
     */
    public int getIdReservacion() {
        return idReservacion;
    }

    /**
     * Define el valor de la propiedad idReservacion.
     * 
     */
    public void setIdReservacion(int value) {
        this.idReservacion = value;
    }

}
