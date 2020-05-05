//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.04 a las 09:23:56 PM CDT 
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
 *         &lt;element name="NumeroHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumPersonas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "piso",
    "numPersonas",
    "tipoHabitacion",
    "idHabitacion"
})
@XmlRootElement(name = "EditarHabitacionRequest")
public class EditarHabitacionRequest {

    @XmlElement(name = "NumeroHabitacion")
    protected int numeroHabitacion;
    @XmlElement(name = "Piso", required = true)
    protected String piso;
    @XmlElement(name = "NumPersonas")
    protected int numPersonas;
    @XmlElement(required = true)
    protected String tipoHabitacion;
    protected int idHabitacion;

    /**
     * Obtiene el valor de la propiedad numeroHabitacion.
     * 
     */
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    /**
     * Define el valor de la propiedad numeroHabitacion.
     * 
     */
    public void setNumeroHabitacion(int value) {
        this.numeroHabitacion = value;
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
     * Obtiene el valor de la propiedad numPersonas.
     * 
     */
    public int getNumPersonas() {
        return numPersonas;
    }

    /**
     * Define el valor de la propiedad numPersonas.
     * 
     */
    public void setNumPersonas(int value) {
        this.numPersonas = value;
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
     * Obtiene el valor de la propiedad idHabitacion.
     * 
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * Define el valor de la propiedad idHabitacion.
     * 
     */
    public void setIdHabitacion(int value) {
        this.idHabitacion = value;
    }

}
