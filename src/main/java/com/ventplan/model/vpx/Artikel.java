
package com.ventplan.model.vpx;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for artikel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="artikel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="anzahl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="artikelnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artikelbezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="luftart" type="{}luftart" minOccurs="0"/>
 *         &lt;element name="liefermenge" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="preis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="mengeneinheit" type="{}stucklisteMengeneinheit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artikel", propOrder = {
    "position",
    "anzahl",
    "artikelnummer",
    "artikelbezeichnung",
    "luftart",
    "liefermenge",
    "preis",
    "mengeneinheit"
})
public class Artikel {

    protected BigInteger position;
    protected Double anzahl;
    protected String artikelnummer;
    protected String artikelbezeichnung;
    protected Luftart luftart;
    protected Double liefermenge;
    protected Double preis;
    protected StucklisteMengeneinheit mengeneinheit;

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
     * Gets the value of the anzahl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnzahl() {
        return anzahl;
    }

    /**
     * Sets the value of the anzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnzahl(Double value) {
        this.anzahl = value;
    }

    /**
     * Gets the value of the artikelnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtikelnummer() {
        return artikelnummer;
    }

    /**
     * Sets the value of the artikelnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtikelnummer(String value) {
        this.artikelnummer = value;
    }

    /**
     * Gets the value of the artikelbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtikelbezeichnung() {
        return artikelbezeichnung;
    }

    /**
     * Sets the value of the artikelbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtikelbezeichnung(String value) {
        this.artikelbezeichnung = value;
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
     * Gets the value of the liefermenge property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLiefermenge() {
        return liefermenge;
    }

    /**
     * Sets the value of the liefermenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLiefermenge(Double value) {
        this.liefermenge = value;
    }

    /**
     * Gets the value of the preis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreis() {
        return preis;
    }

    /**
     * Sets the value of the preis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreis(Double value) {
        this.preis = value;
    }

    /**
     * Gets the value of the mengeneinheit property.
     * 
     * @return
     *     possible object is
     *     {@link StucklisteMengeneinheit }
     *     
     */
    public StucklisteMengeneinheit getMengeneinheit() {
        return mengeneinheit;
    }

    /**
     * Sets the value of the mengeneinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link StucklisteMengeneinheit }
     *     
     */
    public void setMengeneinheit(StucklisteMengeneinheit value) {
        this.mengeneinheit = value;
    }

}
