
package eu.artofcoding.ventplan.api.vpx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geometrie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geometrie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wohnflache" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="mittlereRaumhohe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="luftvolumen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="geluftetesVolumen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gelufteteFlache" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geometrie", propOrder = {
    "wohnflache",
    "mittlereRaumhohe",
    "luftvolumen",
    "geluftetesVolumen",
    "gelufteteFlache"
})
public class Geometrie {

    protected Double wohnflache;
    protected Double mittlereRaumhohe;
    protected Double luftvolumen;
    protected Double geluftetesVolumen;
    protected Double gelufteteFlache;

    /**
     * Gets the value of the wohnflache property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWohnflache() {
        return wohnflache;
    }

    /**
     * Sets the value of the wohnflache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWohnflache(Double value) {
        this.wohnflache = value;
    }

    /**
     * Gets the value of the mittlereRaumhohe property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMittlereRaumhohe() {
        return mittlereRaumhohe;
    }

    /**
     * Sets the value of the mittlereRaumhohe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMittlereRaumhohe(Double value) {
        this.mittlereRaumhohe = value;
    }

    /**
     * Gets the value of the luftvolumen property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLuftvolumen() {
        return luftvolumen;
    }

    /**
     * Sets the value of the luftvolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLuftvolumen(Double value) {
        this.luftvolumen = value;
    }

    /**
     * Gets the value of the geluftetesVolumen property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGeluftetesVolumen() {
        return geluftetesVolumen;
    }

    /**
     * Sets the value of the geluftetesVolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGeluftetesVolumen(Double value) {
        this.geluftetesVolumen = value;
    }

    /**
     * Gets the value of the gelufteteFlache property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGelufteteFlache() {
        return gelufteteFlache;
    }

    /**
     * Sets the value of the gelufteteFlache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGelufteteFlache(Double value) {
        this.gelufteteFlache = value;
    }

}
