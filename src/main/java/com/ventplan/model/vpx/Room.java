
package com.ventplan.model.vpx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for room complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="room">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="raumnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raumtyp" type="{}raumtyp" minOccurs="0"/>
 *         &lt;element name="geschoss" type="{}geschoss" minOccurs="0"/>
 *         &lt;element name="luftart" type="{}luftart" minOccurs="0"/>
 *         &lt;element name="raumflache" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="raumhohe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="raumlange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="raumvolumen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="zuluftfaktor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="abluftvolumenstrom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="luftwechsel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="volumenstrom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bezeichnungAbluftventile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anzahlAbluftventile" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="abluftmengeJeVentil" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bezeichnungZuluftventile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anzahlZuluftventile" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="zuluftmengeJeVentil" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ventilebene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anzahlUberstromventile" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="uberstromelement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxTurspaltHohe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tur" type="{}door" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "room", propOrder = {
    "position",
    "raumnummer",
    "bezeichnung",
    "raumtyp",
    "geschoss",
    "luftart",
    "raumflache",
    "raumhohe",
    "raumlange",
    "raumvolumen",
    "zuluftfaktor",
    "abluftvolumenstrom",
    "luftwechsel",
    "volumenstrom",
    "bezeichnungAbluftventile",
    "anzahlAbluftventile",
    "abluftmengeJeVentil",
    "bezeichnungZuluftventile",
    "anzahlZuluftventile",
    "zuluftmengeJeVentil",
    "ventilebene",
    "anzahlUberstromventile",
    "uberstromelement",
    "maxTurspaltHohe",
    "tur"
})
public class Room {

    protected BigInteger position;
    protected String raumnummer;
    protected String bezeichnung;
    protected Raumtyp raumtyp;
    protected Geschoss geschoss;
    protected Luftart luftart;
    protected Double raumflache;
    protected Double raumhohe;
    protected Double raumlange;
    protected Double raumvolumen;
    protected Double zuluftfaktor;
    protected Double abluftvolumenstrom;
    protected Double luftwechsel;
    protected Double volumenstrom;
    protected String bezeichnungAbluftventile;
    protected BigInteger anzahlAbluftventile;
    protected Double abluftmengeJeVentil;
    protected String bezeichnungZuluftventile;
    protected BigInteger anzahlZuluftventile;
    protected Double zuluftmengeJeVentil;
    protected String ventilebene;
    protected BigInteger anzahlUberstromventile;
    protected String uberstromelement;
    protected Double maxTurspaltHohe;
    protected List<Door> tur;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the raumnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaumnummer() {
        return raumnummer;
    }

    /**
     * Sets the value of the raumnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaumnummer(String value) {
        this.raumnummer = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the raumtyp property.
     * 
     * @return
     *     possible object is
     *     {@link Raumtyp }
     *     
     */
    public Raumtyp getRaumtyp() {
        return raumtyp;
    }

    /**
     * Sets the value of the raumtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Raumtyp }
     *     
     */
    public void setRaumtyp(Raumtyp value) {
        this.raumtyp = value;
    }

    /**
     * Gets the value of the geschoss property.
     * 
     * @return
     *     possible object is
     *     {@link Geschoss }
     *     
     */
    public Geschoss getGeschoss() {
        return geschoss;
    }

    /**
     * Sets the value of the geschoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geschoss }
     *     
     */
    public void setGeschoss(Geschoss value) {
        this.geschoss = value;
    }

    /**
     * Gets the value of the luftart property.
     * 
     * @return
     *     possible object is
     *     {@link Luftart }
     *     
     */
    public Luftart getLuftart() {
        return luftart;
    }

    /**
     * Sets the value of the luftart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Luftart }
     *     
     */
    public void setLuftart(Luftart value) {
        this.luftart = value;
    }

    /**
     * Gets the value of the raumflache property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRaumflache() {
        return raumflache;
    }

    /**
     * Sets the value of the raumflache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRaumflache(Double value) {
        this.raumflache = value;
    }

    /**
     * Gets the value of the raumhohe property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRaumhohe() {
        return raumhohe;
    }

    /**
     * Sets the value of the raumhohe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRaumhohe(Double value) {
        this.raumhohe = value;
    }

    /**
     * Gets the value of the raumlange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRaumlange() {
        return raumlange;
    }

    /**
     * Sets the value of the raumlange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRaumlange(Double value) {
        this.raumlange = value;
    }

    /**
     * Gets the value of the raumvolumen property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRaumvolumen() {
        return raumvolumen;
    }

    /**
     * Sets the value of the raumvolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRaumvolumen(Double value) {
        this.raumvolumen = value;
    }

    /**
     * Gets the value of the zuluftfaktor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZuluftfaktor() {
        return zuluftfaktor;
    }

    /**
     * Sets the value of the zuluftfaktor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZuluftfaktor(Double value) {
        this.zuluftfaktor = value;
    }

    /**
     * Gets the value of the abluftvolumenstrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbluftvolumenstrom() {
        return abluftvolumenstrom;
    }

    /**
     * Sets the value of the abluftvolumenstrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbluftvolumenstrom(Double value) {
        this.abluftvolumenstrom = value;
    }

    /**
     * Gets the value of the luftwechsel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLuftwechsel() {
        return luftwechsel;
    }

    /**
     * Sets the value of the luftwechsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLuftwechsel(Double value) {
        this.luftwechsel = value;
    }

    /**
     * Gets the value of the volumenstrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVolumenstrom() {
        return volumenstrom;
    }

    /**
     * Sets the value of the volumenstrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVolumenstrom(Double value) {
        this.volumenstrom = value;
    }

    /**
     * Gets the value of the bezeichnungAbluftventile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungAbluftventile() {
        return bezeichnungAbluftventile;
    }

    /**
     * Sets the value of the bezeichnungAbluftventile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungAbluftventile(String value) {
        this.bezeichnungAbluftventile = value;
    }

    /**
     * Gets the value of the anzahlAbluftventile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlAbluftventile() {
        return anzahlAbluftventile;
    }

    /**
     * Sets the value of the anzahlAbluftventile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlAbluftventile(BigInteger value) {
        this.anzahlAbluftventile = value;
    }

    /**
     * Gets the value of the abluftmengeJeVentil property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbluftmengeJeVentil() {
        return abluftmengeJeVentil;
    }

    /**
     * Sets the value of the abluftmengeJeVentil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbluftmengeJeVentil(Double value) {
        this.abluftmengeJeVentil = value;
    }

    /**
     * Gets the value of the bezeichnungZuluftventile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungZuluftventile() {
        return bezeichnungZuluftventile;
    }

    /**
     * Sets the value of the bezeichnungZuluftventile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungZuluftventile(String value) {
        this.bezeichnungZuluftventile = value;
    }

    /**
     * Gets the value of the anzahlZuluftventile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlZuluftventile() {
        return anzahlZuluftventile;
    }

    /**
     * Sets the value of the anzahlZuluftventile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlZuluftventile(BigInteger value) {
        this.anzahlZuluftventile = value;
    }

    /**
     * Gets the value of the zuluftmengeJeVentil property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZuluftmengeJeVentil() {
        return zuluftmengeJeVentil;
    }

    /**
     * Sets the value of the zuluftmengeJeVentil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZuluftmengeJeVentil(Double value) {
        this.zuluftmengeJeVentil = value;
    }

    /**
     * Gets the value of the ventilebene property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVentilebene() {
        return ventilebene;
    }

    /**
     * Sets the value of the ventilebene property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVentilebene(String value) {
        this.ventilebene = value;
    }

    /**
     * Gets the value of the anzahlUberstromventile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlUberstromventile() {
        return anzahlUberstromventile;
    }

    /**
     * Sets the value of the anzahlUberstromventile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlUberstromventile(BigInteger value) {
        this.anzahlUberstromventile = value;
    }

    /**
     * Gets the value of the uberstromelement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUberstromelement() {
        return uberstromelement;
    }

    /**
     * Sets the value of the uberstromelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUberstromelement(String value) {
        this.uberstromelement = value;
    }

    /**
     * Gets the value of the maxTurspaltHohe property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTurspaltHohe() {
        return maxTurspaltHohe;
    }

    /**
     * Sets the value of the maxTurspaltHohe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTurspaltHohe(Double value) {
        this.maxTurspaltHohe = value;
    }

    /**
     * Gets the value of the tur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Door }
     * 
     * 
     */
    public List<Door> getTur() {
        if (tur == null) {
            tur = new ArrayList<Door>();
        }
        return this.tur;
    }

}
