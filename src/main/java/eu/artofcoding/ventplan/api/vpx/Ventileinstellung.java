
package eu.artofcoding.ventplan.api.vpx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ventileinstellung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ventileinstellung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="luftart" type="{}ventileinstellungLuftart"/>
 *         &lt;element name="raum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teilstrecken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ventilbezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ventileinstellung", propOrder = {
    "luftart",
    "raum",
    "teilstrecken",
    "ventilbezeichnung"
})
public class Ventileinstellung {

    @XmlElement(required = true)
    protected VentileinstellungLuftart luftart;
    @XmlElement(required = true)
    protected String raum;
    @XmlElement(required = true)
    protected String teilstrecken;
    @XmlElement(required = true)
    protected String ventilbezeichnung;

    /**
     * Gets the value of the luftart property.
     * 
     * @return
     *     possible object is
     *     {@link VentileinstellungLuftart }
     *     
     */
    public VentileinstellungLuftart getLuftart() {
        return luftart;
    }

    /**
     * Sets the value of the luftart property.
     * 
     * @param value
     *     allowed object is
     *     {@link VentileinstellungLuftart }
     *     
     */
    public void setLuftart(VentileinstellungLuftart value) {
        this.luftart = value;
    }

    /**
     * Gets the value of the raum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaum() {
        return raum;
    }

    /**
     * Sets the value of the raum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaum(String value) {
        this.raum = value;
    }

    /**
     * Gets the value of the teilstrecken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeilstrecken() {
        return teilstrecken;
    }

    /**
     * Sets the value of the teilstrecken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeilstrecken(String value) {
        this.teilstrecken = value;
    }

    /**
     * Gets the value of the ventilbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVentilbezeichnung() {
        return ventilbezeichnung;
    }

    /**
     * Sets the value of the ventilbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVentilbezeichnung(String value) {
        this.ventilbezeichnung = value;
    }

}
