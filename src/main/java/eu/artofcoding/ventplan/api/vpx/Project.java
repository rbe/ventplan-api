
package eu.artofcoding.ventplan.api.vpx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ersteller" type="{}contact"/>
 *         &lt;element name="erstellt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bearbeitet" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="geschickt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bauvorhaben" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bauvorhabenAnschrift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bauvorhabenPlz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bauvorhabenOrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notizen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gebaude" type="{}building"/>
 *         &lt;element name="zentralgerat" type="{}device"/>
 *         &lt;element name="druckverlust" type="{}druckverlust" minOccurs="0"/>
 *         &lt;element name="akustik" type="{}akustik" minOccurs="0"/>
 *         &lt;element name="firma" type="{}company" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project", propOrder = {
    "ersteller",
    "erstellt",
    "bearbeitet",
    "geschickt",
    "bauvorhaben",
    "bauvorhabenAnschrift",
    "bauvorhabenPlz",
    "bauvorhabenOrt",
    "notizen",
    "gebaude",
    "zentralgerat",
    "druckverlust",
    "akustik",
    "firma"
})
public class Project {

    @XmlElement(required = true)
    protected Contact ersteller;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erstellt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bearbeitet;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar geschickt;
    @XmlElement(required = true)
    protected String bauvorhaben;
    protected String bauvorhabenAnschrift;
    protected String bauvorhabenPlz;
    protected String bauvorhabenOrt;
    protected String notizen;
    @XmlElement(required = true)
    protected Building gebaude;
    @XmlElement(required = true)
    protected Device zentralgerat;
    protected Druckverlust druckverlust;
    protected Akustik akustik;
    @XmlElement(required = true)
    protected List<Company> firma;

    /**
     * Gets the value of the ersteller property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getErsteller() {
        return ersteller;
    }

    /**
     * Sets the value of the ersteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setErsteller(Contact value) {
        this.ersteller = value;
    }

    /**
     * Gets the value of the erstellt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErstellt() {
        return erstellt;
    }

    /**
     * Sets the value of the erstellt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErstellt(XMLGregorianCalendar value) {
        this.erstellt = value;
    }

    /**
     * Gets the value of the bearbeitet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBearbeitet() {
        return bearbeitet;
    }

    /**
     * Sets the value of the bearbeitet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBearbeitet(XMLGregorianCalendar value) {
        this.bearbeitet = value;
    }

    /**
     * Gets the value of the geschickt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeschickt() {
        return geschickt;
    }

    /**
     * Sets the value of the geschickt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeschickt(XMLGregorianCalendar value) {
        this.geschickt = value;
    }

    /**
     * Gets the value of the bauvorhaben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBauvorhaben() {
        return bauvorhaben;
    }

    /**
     * Sets the value of the bauvorhaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBauvorhaben(String value) {
        this.bauvorhaben = value;
    }

    /**
     * Gets the value of the bauvorhabenAnschrift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBauvorhabenAnschrift() {
        return bauvorhabenAnschrift;
    }

    /**
     * Sets the value of the bauvorhabenAnschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBauvorhabenAnschrift(String value) {
        this.bauvorhabenAnschrift = value;
    }

    /**
     * Gets the value of the bauvorhabenPlz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBauvorhabenPlz() {
        return bauvorhabenPlz;
    }

    /**
     * Sets the value of the bauvorhabenPlz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBauvorhabenPlz(String value) {
        this.bauvorhabenPlz = value;
    }

    /**
     * Gets the value of the bauvorhabenOrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBauvorhabenOrt() {
        return bauvorhabenOrt;
    }

    /**
     * Sets the value of the bauvorhabenOrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBauvorhabenOrt(String value) {
        this.bauvorhabenOrt = value;
    }

    /**
     * Gets the value of the notizen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotizen() {
        return notizen;
    }

    /**
     * Sets the value of the notizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotizen(String value) {
        this.notizen = value;
    }

    /**
     * Gets the value of the gebaude property.
     * 
     * @return
     *     possible object is
     *     {@link Building }
     *     
     */
    public Building getGebaude() {
        return gebaude;
    }

    /**
     * Sets the value of the gebaude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Building }
     *     
     */
    public void setGebaude(Building value) {
        this.gebaude = value;
    }

    /**
     * Gets the value of the zentralgerat property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getZentralgerat() {
        return zentralgerat;
    }

    /**
     * Sets the value of the zentralgerat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setZentralgerat(Device value) {
        this.zentralgerat = value;
    }

    /**
     * Gets the value of the druckverlust property.
     * 
     * @return
     *     possible object is
     *     {@link Druckverlust }
     *     
     */
    public Druckverlust getDruckverlust() {
        return druckverlust;
    }

    /**
     * Sets the value of the druckverlust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Druckverlust }
     *     
     */
    public void setDruckverlust(Druckverlust value) {
        this.druckverlust = value;
    }

    /**
     * Gets the value of the akustik property.
     * 
     * @return
     *     possible object is
     *     {@link Akustik }
     *     
     */
    public Akustik getAkustik() {
        return akustik;
    }

    /**
     * Sets the value of the akustik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akustik }
     *     
     */
    public void setAkustik(Akustik value) {
        this.akustik = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firma property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirma().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Company }
     * 
     * 
     */
    public List<Company> getFirma() {
        if (firma == null) {
            firma = new ArrayList<Company>();
        }
        return this.firma;
    }

}
