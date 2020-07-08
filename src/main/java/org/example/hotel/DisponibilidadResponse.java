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
 *         &lt;element name="NumeroHabitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumPersonas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "numeroHabitacion",
    "numPersonas",
    "piso",
    "tipoHabitacion",
    "estado",
    "precio",
    "respuesta"
})
@XmlRootElement(name = "DisponibilidadResponse")
public class DisponibilidadResponse {

    @XmlElement(name = "NumeroHabitacion", required = true)
    protected String numeroHabitacion;
    @XmlElement(name = "NumPersonas", required = true)
    protected String numPersonas;
    @XmlElement(name = "Piso", required = true)
    protected String piso;
    @XmlElement(required = true)
    protected String tipoHabitacion;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String precio;
    @XmlElement(required = true)
    protected String respuesta;

    /**
     * Obtiene el valor de la propiedad numeroHabitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    /**
     * Define el valor de la propiedad numeroHabitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroHabitacion(String value) {
        this.numeroHabitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numPersonas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPersonas() {
        return numPersonas;
    }

    /**
     * Define el valor de la propiedad numPersonas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPersonas(String value) {
        this.numPersonas = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

}
