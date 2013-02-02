
package com.ventplan.model.vpx;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for door complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="door">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="breite" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="querschnitt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="spalthohe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dichtung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "door", propOrder = {
    "name",
    "breite",
    "querschnitt",
    "spalthohe",
    "dichtung"
})
public class Door {

    @XmlElement(defaultValue = "T\u00fcr")
    protected String name;
    @XmlElement(defaultValue = "0")
    protected BigInteger breite;
    @XmlElement(defaultValue = "0")
    protected Double querschnitt;
    @XmlElement(defaultValue = "0")
    protected Double spalthohe;
    @XmlElement(defaultValue = "true")
    protected Boolean dichtung;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the breite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBreite() {
        return breite;
    }

    /**
     * Sets the value of the breite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBreite(BigInteger value) {
        this.breite = value;
    }

    /**
     * Gets the value of the querschnitt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuerschnitt() {
        return querschnitt;
    }

    /**
     * Sets the value of the querschnitt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuerschnitt(Double value) {
        this.querschnitt = value;
    }

    /**
     * Gets the value of the spalthohe property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpalthohe() {
        return spalthohe;
    }

    /**
     * Sets the value of the spalthohe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpalthohe(Double value) {
        this.spalthohe = value;
    }

    /**
     * Gets the value of the dichtung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDichtung() {
        return dichtung;
    }

    /**
     * Sets the value of the dichtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDichtung(Boolean value) {
        this.dichtung = value;
    }

}
