
package eu.artofcoding.ventplan.api.vpx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projekt" type="{}project"/>
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
    "projekt"
})
@XmlRootElement(name = "ventplan-project")
public class VentplanProject {

    @XmlElement(required = true)
    protected Project projekt;

    /**
     * Gets the value of the projekt property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProjekt() {
        return projekt;
    }

    /**
     * Sets the value of the projekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProjekt(Project value) {
        this.projekt = value;
    }

}
