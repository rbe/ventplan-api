
package eu.artofcoding.ventplan.api.vpx;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kanalnetz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kanalnetz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="luftart" type="{}kanalnetzLuftart"/>
 *         &lt;element name="nrTeilstrecke" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="luftmenge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="kanalbezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kanallange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kanalnetz", propOrder = {
    "luftart",
    "nrTeilstrecke",
    "luftmenge",
    "kanalbezeichnung",
    "kanallange"
})
public class Kanalnetz {

    @XmlElement(required = true)
    protected KanalnetzLuftart luftart;
    @XmlElement(required = true)
    protected BigInteger nrTeilstrecke;
    protected double luftmenge;
    @XmlElement(required = true)
    protected String kanalbezeichnung;
    protected double kanallange;

    /**
     * Gets the value of the luftart property.
     * 
     * @return
     *     possible object is
     *     {@link KanalnetzLuftart }
     *     
     */
    public KanalnetzLuftart getLuftart() {
        return luftart;
    }

    /**
     * Sets the value of the luftart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KanalnetzLuftart }
     *     
     */
    public void setLuftart(KanalnetzLuftart value) {
        this.luftart = value;
    }

    /**
     * Gets the value of the nrTeilstrecke property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrTeilstrecke() {
        return nrTeilstrecke;
    }

    /**
     * Sets the value of the nrTeilstrecke property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrTeilstrecke(BigInteger value) {
        this.nrTeilstrecke = value;
    }

    /**
     * Gets the value of the luftmenge property.
     * 
     */
    public double getLuftmenge() {
        return luftmenge;
    }

    /**
     * Sets the value of the luftmenge property.
     * 
     */
    public void setLuftmenge(double value) {
        this.luftmenge = value;
    }

    /**
     * Gets the value of the kanalbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKanalbezeichnung() {
        return kanalbezeichnung;
    }

    /**
     * Sets the value of the kanalbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKanalbezeichnung(String value) {
        this.kanalbezeichnung = value;
    }

    /**
     * Gets the value of the kanallange property.
     * 
     */
    public double getKanallange() {
        return kanallange;
    }

    /**
     * Sets the value of the kanallange property.
     * 
     */
    public void setKanallange(double value) {
        this.kanallange = value;
    }

}
