
package eu.artofcoding.ventplan.api.vpx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for akustik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="akustik">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zuluft" type="{}akustikberechnung"/>
 *         &lt;element name="abluft" type="{}akustikberechnung"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "akustik", propOrder = {
    "zuluft",
    "abluft"
})
public class Akustik {

    @XmlElement(required = true)
    protected Akustikberechnung zuluft;
    @XmlElement(required = true)
    protected Akustikberechnung abluft;

    /**
     * Gets the value of the zuluft property.
     * 
     * @return
     *     possible object is
     *     {@link Akustikberechnung }
     *     
     */
    public Akustikberechnung getZuluft() {
        return zuluft;
    }

    /**
     * Sets the value of the zuluft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akustikberechnung }
     *     
     */
    public void setZuluft(Akustikberechnung value) {
        this.zuluft = value;
    }

    /**
     * Gets the value of the abluft property.
     * 
     * @return
     *     possible object is
     *     {@link Akustikberechnung }
     *     
     */
    public Akustikberechnung getAbluft() {
        return abluft;
    }

    /**
     * Sets the value of the abluft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akustikberechnung }
     *     
     */
    public void setAbluft(Akustikberechnung value) {
        this.abluft = value;
    }

}
