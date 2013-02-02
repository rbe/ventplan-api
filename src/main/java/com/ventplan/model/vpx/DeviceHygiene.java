
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceHygiene complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceHygiene">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ausfuhrung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="keineVerschmutzung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dichtheitsklasseB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceHygiene", propOrder = {
    "ausfuhrung",
    "filterung",
    "keineVerschmutzung",
    "dichtheitsklasseB"
})
public class DeviceHygiene {

    protected Boolean ausfuhrung;
    protected Boolean filterung;
    protected Boolean keineVerschmutzung;
    protected Boolean dichtheitsklasseB;

    /**
     * Gets the value of the ausfuhrung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAusfuhrung() {
        return ausfuhrung;
    }

    /**
     * Sets the value of the ausfuhrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAusfuhrung(Boolean value) {
        this.ausfuhrung = value;
    }

    /**
     * Gets the value of the filterung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterung() {
        return filterung;
    }

    /**
     * Sets the value of the filterung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterung(Boolean value) {
        this.filterung = value;
    }

    /**
     * Gets the value of the keineVerschmutzung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeineVerschmutzung() {
        return keineVerschmutzung;
    }

    /**
     * Sets the value of the keineVerschmutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeineVerschmutzung(Boolean value) {
        this.keineVerschmutzung = value;
    }

    /**
     * Gets the value of the dichtheitsklasseB property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDichtheitsklasseB() {
        return dichtheitsklasseB;
    }

    /**
     * Sets the value of the dichtheitsklasseB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDichtheitsklasseB(Boolean value) {
        this.dichtheitsklasseB = value;
    }

}
