//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.07 a las 01:33:37 AM CDT 
//


package org.example.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="idReservacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaLlegada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumAdultos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumNinos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idReservacion",
    "fechaLlegada",
    "fechaSalida",
    "numAdultos",
    "numNinos",
    "tipoHabitacion",
    "nombreCliente",
    "telefono",
    "idCliente"
})
@XmlRootElement(name = "EditarReservacionRequest")
public class EditarReservacionRequest {

    protected int idReservacion;
    @XmlElement(required = true)
    protected String fechaLlegada;
    @XmlElement(required = true)
    protected String fechaSalida;
    @XmlElement(name = "NumAdultos", required = true)
    protected String numAdultos;
    @XmlElement(name = "NumNinos", required = true)
    protected String numNinos;
    @XmlElement(required = true)
    protected String tipoHabitacion;
    @XmlElement(required = true)
    protected String nombreCliente;
    @XmlElement(required = true)
    protected String telefono;
    protected int idCliente;

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

    /**
     * Obtiene el valor de la propiedad fechaLlegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * Define el valor de la propiedad fechaLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaLlegada(String value) {
        this.fechaLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Define el valor de la propiedad fechaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSalida(String value) {
        this.fechaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad numAdultos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAdultos() {
        return numAdultos;
    }

    /**
     * Define el valor de la propiedad numAdultos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAdultos(String value) {
        this.numAdultos = value;
    }

    /**
     * Obtiene el valor de la propiedad numNinos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumNinos() {
        return numNinos;
    }

    /**
     * Define el valor de la propiedad numNinos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumNinos(String value) {
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
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
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

}
