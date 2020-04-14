//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.03 a las 12:16:32 AM CST 
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
 *         &lt;element name="Llegada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Salida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumAdultos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumNinos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "llegada",
    "salida",
    "numAdultos",
    "numNinos",
    "tipoHabitacion",
    "precio",
    "nombreCliente"
})
@XmlRootElement(name = "ReservacionRequest")
public class ReservacionRequest {

    @XmlElement(name = "Llegada", required = true)
    protected String llegada;
    @XmlElement(name = "Salida", required = true)
    protected String salida;
    @XmlElement(name = "NumAdultos")
    protected int numAdultos;
    @XmlElement(name = "NumNinos")
    protected int numNinos;
    @XmlElement(required = true)
    protected String tipoHabitacion;
    protected int precio;
    @XmlElement(name = "NombreCliente", required = true)
    protected String nombreCliente;

    /**
     * Obtiene el valor de la propiedad llegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlegada() {
        return llegada;
    }

    /**
     * Define el valor de la propiedad llegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlegada(String value) {
        this.llegada = value;
    }

    /**
     * Obtiene el valor de la propiedad salida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalida() {
        return salida;
    }

    /**
     * Define el valor de la propiedad salida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalida(String value) {
        this.salida = value;
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
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(int value) {
        this.precio = value;
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

}
