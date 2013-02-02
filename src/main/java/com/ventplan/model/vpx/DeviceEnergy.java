
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceEnergy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceEnergy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zuAbluftWarme" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bemessung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ruckgewinnung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="regelung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceEnergy", propOrder = {
    "zuAbluftWarme",
    "bemessung",
    "ruckgewinnung",
    "regelung"
})
public class DeviceEnergy {

    protected Boolean zuAbluftWarme;
    protected Boolean bemessung;
    protected Boolean ruckgewinnung;
    protected Boolean regelung;

    /**
     * Gets the value of the zuAbluftWarme property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZuAbluftWarme() {
        return zuAbluftWarme;
    }

    /**
     * Sets the value of the zuAbluftWarme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZuAbluftWarme(Boolean value) {
        this.zuAbluftWarme = value;
    }

    /**
     * Gets the value of the bemessung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBemessung() {
        return bemessung;
    }

    /**
     * Sets the value of the bemessung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBemessung(Boolean value) {
        this.bemessung = value;
    }

    /**
     * Gets the value of the ruckgewinnung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuckgewinnung() {
        return ruckgewinnung;
    }

    /**
     * Sets the value of the ruckgewinnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuckgewinnung(Boolean value) {
        this.ruckgewinnung = value;
    }

    /**
     * Gets the value of the regelung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegelung() {
        return regelung;
    }

    /**
     * Sets the value of the regelung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegelung(Boolean value) {
        this.regelung = value;
    }

}
