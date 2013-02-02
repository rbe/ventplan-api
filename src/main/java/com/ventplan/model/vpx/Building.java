
package com.ventplan.model.vpx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for building complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="building">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gebaudeTyp" type="{}gebaudeTyp" minOccurs="0"/>
 *         &lt;element name="gebaudeLage" type="{}gebaudeLage" minOccurs="0"/>
 *         &lt;element name="warmeschutz" type="{}warmeschutz" minOccurs="0"/>
 *         &lt;element name="luftdichtheit" type="{}luftdichtheit" minOccurs="0"/>
 *         &lt;element name="luftdichtheitDruckdifferenz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="luftdichtheitLuftwechsel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="luftdichtheitDruckexponent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="besAnfFaktor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="personenAnzahl" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="personenVolumen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="aussenluft" type="{}aussenluft" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fortluft" type="{}fortluft" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="luftkanalverlegung" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zuluftdurchlasse" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="abluftdurchlasse" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{}geometrie" minOccurs="0"/>
 *         &lt;element name="raum" type="{}room" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "building", propOrder = {
    "gebaudeTyp",
    "gebaudeLage",
    "warmeschutz",
    "luftdichtheit",
    "luftdichtheitDruckdifferenz",
    "luftdichtheitLuftwechsel",
    "luftdichtheitDruckexponent",
    "besAnfFaktor",
    "personenAnzahl",
    "personenVolumen",
    "aussenluft",
    "fortluft",
    "luftkanalverlegung",
    "zuluftdurchlasse",
    "abluftdurchlasse",
    "geometrie",
    "raum"
})
public class Building {

    protected GebaudeTyp gebaudeTyp;
    protected GebaudeLage gebaudeLage;
    protected Warmeschutz warmeschutz;
    protected Luftdichtheit luftdichtheit;
    protected Double luftdichtheitDruckdifferenz;
    protected Double luftdichtheitLuftwechsel;
    protected Double luftdichtheitDruckexponent;
    protected Double besAnfFaktor;
    protected BigInteger personenAnzahl;
    protected Double personenVolumen;
    protected List<Aussenluft> aussenluft;
    protected List<Fortluft> fortluft;
    protected List<String> luftkanalverlegung;
    protected List<String> zuluftdurchlasse;
    protected List<String> abluftdurchlasse;
    protected Geometrie geometrie;
    protected List<Room> raum;

    /**
     * Gets the value of the gebaudeTyp property.
     * 
     * @return
     *     possible object is
     *     {@link GebaudeTyp }
     *     
     */
    public GebaudeTyp getGebaudeTyp() {
        return gebaudeTyp;
    }

    /**
     * Sets the value of the gebaudeTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GebaudeTyp }
     *     
     */
    public void setGebaudeTyp(GebaudeTyp value) {
        this.gebaudeTyp = value;
    }

    /**
     * Gets the value of the gebaudeLage property.
     * 
     * @return
     *     possible object is
     *     {@link GebaudeLage }
     *     
     */
    public GebaudeLage getGebaudeLage() {
        return gebaudeLage;
    }

    /**
     * Sets the value of the gebaudeLage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GebaudeLage }
     *     
     */
    public void setGebaudeLage(GebaudeLage value) {
        this.gebaudeLage = value;
    }

    /**
     * Gets the value of the warmeschutz property.
     * 
     * @return
     *     possible object is
     *     {@link Warmeschutz }
     *     
     */
    public Warmeschutz getWarmeschutz() {
        return warmeschutz;
    }

    /**
     * Sets the value of the warmeschutz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warmeschutz }
     *     
     */
    public void setWarmeschutz(Warmeschutz value) {
        this.warmeschutz = value;
    }

    /**
     * Gets the value of the luftdichtheit property.
     * 
     * @return
     *     possible object is
     *     {@link Luftdichtheit }
     *     
     */
    public Luftdichtheit getLuftdichtheit() {
        return luftdichtheit;
    }

    /**
     * Sets the value of the luftdichtheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Luftdichtheit }
     *     
     */
    public void setLuftdichtheit(Luftdichtheit value) {
        this.luftdichtheit = value;
    }

    /**
     * Gets the value of the luftdichtheitDruckdifferenz property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLuftdichtheitDruckdifferenz() {
        return luftdichtheitDruckdifferenz;
    }

    /**
     * Sets the value of the luftdichtheitDruckdifferenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLuftdichtheitDruckdifferenz(Double value) {
        this.luftdichtheitDruckdifferenz = value;
    }

    /**
     * Gets the value of the luftdichtheitLuftwechsel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLuftdichtheitLuftwechsel() {
        return luftdichtheitLuftwechsel;
    }

    /**
     * Sets the value of the luftdichtheitLuftwechsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLuftdichtheitLuftwechsel(Double value) {
        this.luftdichtheitLuftwechsel = value;
    }

    /**
     * Gets the value of the luftdichtheitDruckexponent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLuftdichtheitDruckexponent() {
        return luftdichtheitDruckexponent;
    }

    /**
     * Sets the value of the luftdichtheitDruckexponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLuftdichtheitDruckexponent(Double value) {
        this.luftdichtheitDruckexponent = value;
    }

    /**
     * Gets the value of the besAnfFaktor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBesAnfFaktor() {
        return besAnfFaktor;
    }

    /**
     * Sets the value of the besAnfFaktor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBesAnfFaktor(Double value) {
        this.besAnfFaktor = value;
    }

    /**
     * Gets the value of the personenAnzahl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonenAnzahl() {
        return personenAnzahl;
    }

    /**
     * Sets the value of the personenAnzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonenAnzahl(BigInteger value) {
        this.personenAnzahl = value;
    }

    /**
     * Gets the value of the personenVolumen property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPersonenVolumen() {
        return personenVolumen;
    }

    /**
     * Sets the value of the personenVolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPersonenVolumen(Double value) {
        this.personenVolumen = value;
    }

    /**
     * Gets the value of the aussenluft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aussenluft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAussenluft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aussenluft }
     * 
     * 
     */
    public List<Aussenluft> getAussenluft() {
        if (aussenluft == null) {
            aussenluft = new ArrayList<Aussenluft>();
        }
        return this.aussenluft;
    }

    /**
     * Gets the value of the fortluft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fortluft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFortluft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fortluft }
     * 
     * 
     */
    public List<Fortluft> getFortluft() {
        if (fortluft == null) {
            fortluft = new ArrayList<Fortluft>();
        }
        return this.fortluft;
    }

    /**
     * Gets the value of the luftkanalverlegung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luftkanalverlegung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuftkanalverlegung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLuftkanalverlegung() {
        if (luftkanalverlegung == null) {
            luftkanalverlegung = new ArrayList<String>();
        }
        return this.luftkanalverlegung;
    }

    /**
     * Gets the value of the zuluftdurchlasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuluftdurchlasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuluftdurchlasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZuluftdurchlasse() {
        if (zuluftdurchlasse == null) {
            zuluftdurchlasse = new ArrayList<String>();
        }
        return this.zuluftdurchlasse;
    }

    /**
     * Gets the value of the abluftdurchlasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abluftdurchlasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbluftdurchlasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAbluftdurchlasse() {
        if (abluftdurchlasse == null) {
            abluftdurchlasse = new ArrayList<String>();
        }
        return this.abluftdurchlasse;
    }

    /**
     * Gets the value of the geometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Geometrie }
     *     
     */
    public Geometrie getGeometrie() {
        return geometrie;
    }

    /**
     * Sets the value of the geometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometrie }
     *     
     */
    public void setGeometrie(Geometrie value) {
        this.geometrie = value;
    }

    /**
     * Gets the value of the raum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Room }
     * 
     * 
     */
    public List<Room> getRaum() {
        if (raum == null) {
            raum = new ArrayList<Room>();
        }
        return this.raum;
    }

}
