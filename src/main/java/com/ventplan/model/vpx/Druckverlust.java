
package com.ventplan.model.vpx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for druckverlust complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="druckverlust">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kanalnetz" type="{}kanalnetz" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ventileinstellung" type="{}ventileinstellung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "druckverlust", propOrder = {
    "kanalnetz",
    "ventileinstellung"
})
public class Druckverlust {

    protected List<Kanalnetz> kanalnetz;
    protected List<Ventileinstellung> ventileinstellung;

    /**
     * Gets the value of the kanalnetz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kanalnetz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKanalnetz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kanalnetz }
     * 
     * 
     */
    public List<Kanalnetz> getKanalnetz() {
        if (kanalnetz == null) {
            kanalnetz = new ArrayList<Kanalnetz>();
        }
        return this.kanalnetz;
    }

    /**
     * Gets the value of the ventileinstellung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ventileinstellung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVentileinstellung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ventileinstellung }
     * 
     * 
     */
    public List<Ventileinstellung> getVentileinstellung() {
        if (ventileinstellung == null) {
            ventileinstellung = new ArrayList<Ventileinstellung>();
        }
        return this.ventileinstellung;
    }

}
