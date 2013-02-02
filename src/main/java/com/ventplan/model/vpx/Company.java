
package com.ventplan.model.vpx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firma1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firma2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rolle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adresse" type="{}address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kontakt" type="{}contact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "company", propOrder = {
    "firma1",
    "firma2",
    "rolle",
    "email",
    "tel",
    "fax",
    "adresse",
    "kontakt"
})
public class Company {

    protected String firma1;
    protected String firma2;
    protected String rolle;
    protected String email;
    protected String tel;
    protected String fax;
    protected List<Address> adresse;
    protected List<Contact> kontakt;

    /**
     * Gets the value of the firma1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma1() {
        return firma1;
    }

    /**
     * Sets the value of the firma1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma1(String value) {
        this.firma1 = value;
    }

    /**
     * Gets the value of the firma2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma2() {
        return firma2;
    }

    /**
     * Sets the value of the firma2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma2(String value) {
        this.firma2 = value;
    }

    /**
     * Gets the value of the rolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolle() {
        return rolle;
    }

    /**
     * Sets the value of the rolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolle(String value) {
        this.rolle = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the adresse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAdresse() {
        if (adresse == null) {
            adresse = new ArrayList<Address>();
        }
        return this.adresse;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kontakt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKontakt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getKontakt() {
        if (kontakt == null) {
            kontakt = new ArrayList<Contact>();
        }
        return this.kontakt;
    }

}
