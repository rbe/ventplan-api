
package com.ventplan.model.vpx;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manuell" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="volumenstrom" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="geratestandort" type="{}geratestandort" minOccurs="0"/>
 *         &lt;element name="energie" type="{}deviceEnergy" minOccurs="0"/>
 *         &lt;element name="hygiene" type="{}deviceHygiene" minOccurs="0"/>
 *         &lt;element name="ruckschlagkappe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="schallschutz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="feuerstatte" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "device", propOrder = {
    "name",
    "manuell",
    "volumenstrom",
    "geratestandort",
    "energie",
    "hygiene",
    "ruckschlagkappe",
    "schallschutz",
    "feuerstatte"
})
public class Device {

    protected String name;
    protected Boolean manuell;
    protected BigInteger volumenstrom;
    protected Geratestandort geratestandort;
    protected DeviceEnergy energie;
    protected DeviceHygiene hygiene;
    protected Boolean ruckschlagkappe;
    protected Boolean schallschutz;
    protected Boolean feuerstatte;

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
     * Gets the value of the manuell property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManuell() {
        return manuell;
    }

    /**
     * Sets the value of the manuell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManuell(Boolean value) {
        this.manuell = value;
    }

    /**
     * Gets the value of the volumenstrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVolumenstrom() {
        return volumenstrom;
    }

    /**
     * Sets the value of the volumenstrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVolumenstrom(BigInteger value) {
        this.volumenstrom = value;
    }

    /**
     * Gets the value of the geratestandort property.
     * 
     * @return
     *     possible object is
     *     {@link Geratestandort }
     *     
     */
    public Geratestandort getGeratestandort() {
        return geratestandort;
    }

    /**
     * Sets the value of the geratestandort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geratestandort }
     *     
     */
    public void setGeratestandort(Geratestandort value) {
        this.geratestandort = value;
    }

    /**
     * Gets the value of the energie property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceEnergy }
     *     
     */
    public DeviceEnergy getEnergie() {
        return energie;
    }

    /**
     * Sets the value of the energie property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceEnergy }
     *     
     */
    public void setEnergie(DeviceEnergy value) {
        this.energie = value;
    }

    /**
     * Gets the value of the hygiene property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceHygiene }
     *     
     */
    public DeviceHygiene getHygiene() {
        return hygiene;
    }

    /**
     * Sets the value of the hygiene property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceHygiene }
     *     
     */
    public void setHygiene(DeviceHygiene value) {
        this.hygiene = value;
    }

    /**
     * Gets the value of the ruckschlagkappe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuckschlagkappe() {
        return ruckschlagkappe;
    }

    /**
     * Sets the value of the ruckschlagkappe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuckschlagkappe(Boolean value) {
        this.ruckschlagkappe = value;
    }

    /**
     * Gets the value of the schallschutz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchallschutz() {
        return schallschutz;
    }

    /**
     * Sets the value of the schallschutz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchallschutz(Boolean value) {
        this.schallschutz = value;
    }

    /**
     * Gets the value of the feuerstatte property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeuerstatte() {
        return feuerstatte;
    }

    /**
     * Sets the value of the feuerstatte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeuerstatte(Boolean value) {
        this.feuerstatte = value;
    }

}
