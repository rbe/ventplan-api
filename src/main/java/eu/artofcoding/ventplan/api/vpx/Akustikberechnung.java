
package eu.artofcoding.ventplan.api.vpx;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for akustikberechnung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="akustikberechnung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="raum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slpErhohungKanalnetz" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="slpErhohungFilter" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="hauptschalldampfer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hauptschalldampfer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anzahlUmlenkungen" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="luftverteilerkastenStck" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="langsdampfungKanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="langsdampfungKanalLfdm" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="schalldampferVentil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="einfugungsdammwert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raumabsorption" type="{}raumabsorption"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "akustikberechnung", propOrder = {
    "raum",
    "slpErhohungKanalnetz",
    "slpErhohungFilter",
    "hauptschalldampfer1",
    "hauptschalldampfer2",
    "anzahlUmlenkungen",
    "luftverteilerkastenStck",
    "langsdampfungKanal",
    "langsdampfungKanalLfdm",
    "schalldampferVentil",
    "einfugungsdammwert",
    "raumabsorption"
})
public class Akustikberechnung {

    @XmlElement(required = true)
    protected String raum;
    @XmlElement(required = true, nillable = true)
    protected BigInteger slpErhohungKanalnetz;
    @XmlElement(required = true, nillable = true)
    protected BigInteger slpErhohungFilter;
    protected String hauptschalldampfer1;
    protected String hauptschalldampfer2;
    @XmlElement(required = true, nillable = true)
    protected BigInteger anzahlUmlenkungen;
    @XmlElement(required = true, nillable = true)
    protected BigInteger luftverteilerkastenStck;
    protected String langsdampfungKanal;
    @XmlElement(required = true, nillable = true)
    protected BigInteger langsdampfungKanalLfdm;
    protected String schalldampferVentil;
    protected String einfugungsdammwert;
    @XmlElement(required = true)
    protected String raumabsorption;

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
     * Gets the value of the slpErhohungKanalnetz property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlpErhohungKanalnetz() {
        return slpErhohungKanalnetz;
    }

    /**
     * Sets the value of the slpErhohungKanalnetz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlpErhohungKanalnetz(BigInteger value) {
        this.slpErhohungKanalnetz = value;
    }

    /**
     * Gets the value of the slpErhohungFilter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlpErhohungFilter() {
        return slpErhohungFilter;
    }

    /**
     * Sets the value of the slpErhohungFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlpErhohungFilter(BigInteger value) {
        this.slpErhohungFilter = value;
    }

    /**
     * Gets the value of the hauptschalldampfer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHauptschalldampfer1() {
        return hauptschalldampfer1;
    }

    /**
     * Sets the value of the hauptschalldampfer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHauptschalldampfer1(String value) {
        this.hauptschalldampfer1 = value;
    }

    /**
     * Gets the value of the hauptschalldampfer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHauptschalldampfer2() {
        return hauptschalldampfer2;
    }

    /**
     * Sets the value of the hauptschalldampfer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHauptschalldampfer2(String value) {
        this.hauptschalldampfer2 = value;
    }

    /**
     * Gets the value of the anzahlUmlenkungen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlUmlenkungen() {
        return anzahlUmlenkungen;
    }

    /**
     * Sets the value of the anzahlUmlenkungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlUmlenkungen(BigInteger value) {
        this.anzahlUmlenkungen = value;
    }

    /**
     * Gets the value of the luftverteilerkastenStck property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLuftverteilerkastenStck() {
        return luftverteilerkastenStck;
    }

    /**
     * Sets the value of the luftverteilerkastenStck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLuftverteilerkastenStck(BigInteger value) {
        this.luftverteilerkastenStck = value;
    }

    /**
     * Gets the value of the langsdampfungKanal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangsdampfungKanal() {
        return langsdampfungKanal;
    }

    /**
     * Sets the value of the langsdampfungKanal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangsdampfungKanal(String value) {
        this.langsdampfungKanal = value;
    }

    /**
     * Gets the value of the langsdampfungKanalLfdm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLangsdampfungKanalLfdm() {
        return langsdampfungKanalLfdm;
    }

    /**
     * Sets the value of the langsdampfungKanalLfdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLangsdampfungKanalLfdm(BigInteger value) {
        this.langsdampfungKanalLfdm = value;
    }

    /**
     * Gets the value of the schalldampferVentil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchalldampferVentil() {
        return schalldampferVentil;
    }

    /**
     * Sets the value of the schalldampferVentil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchalldampferVentil(String value) {
        this.schalldampferVentil = value;
    }

    /**
     * Gets the value of the einfugungsdammwert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEinfugungsdammwert() {
        return einfugungsdammwert;
    }

    /**
     * Sets the value of the einfugungsdammwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEinfugungsdammwert(String value) {
        this.einfugungsdammwert = value;
    }

    /**
     * Gets the value of the raumabsorption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaumabsorption() {
        return raumabsorption;
    }

    /**
     * Sets the value of the raumabsorption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaumabsorption(String value) {
        this.raumabsorption = value;
    }

}
