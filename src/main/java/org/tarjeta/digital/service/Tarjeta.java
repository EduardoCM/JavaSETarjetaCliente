
package org.tarjeta.digital.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tarjeta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tarjeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCaudicidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://service.digital.tarjeta.org/}marcaEnum" minOccurs="0"/>
 *         &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarjeta", propOrder = {
    "cvv",
    "fechaCaudicidad",
    "marca",
    "nombreEntidad",
    "nombreTitular",
    "numeroTarjeta"
})
public class Tarjeta {

    protected String cvv;
    protected String fechaCaudicidad;
    @XmlSchemaType(name = "string")
    protected MarcaEnum marca;
    protected String nombreEntidad;
    protected String nombreTitular;
    protected String numeroTarjeta;

    /**
     * Gets the value of the cvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * Gets the value of the fechaCaudicidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCaudicidad() {
        return fechaCaudicidad;
    }

    /**
     * Sets the value of the fechaCaudicidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCaudicidad(String value) {
        this.fechaCaudicidad = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link MarcaEnum }
     *     
     */
    public MarcaEnum getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarcaEnum }
     *     
     */
    public void setMarca(MarcaEnum value) {
        this.marca = value;
    }

    /**
     * Gets the value of the nombreEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    /**
     * Sets the value of the nombreEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidad(String value) {
        this.nombreEntidad = value;
    }

    /**
     * Gets the value of the nombreTitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Sets the value of the nombreTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
    }

    /**
     * Gets the value of the numeroTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Sets the value of the numeroTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

	@Override
	public String toString() {
		return "Tarjeta [cvv=" + cvv + ", fechaCaudicidad=" + fechaCaudicidad + ", marca=" + marca + ", nombreEntidad="
				+ nombreEntidad + ", nombreTitular=" + nombreTitular + ", numeroTarjeta=" + numeroTarjeta + "]";
	}
    
    

}
