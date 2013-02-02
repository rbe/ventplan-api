
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geschoss.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="geschoss">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="EG"/>
 *     &lt;enumeration value="OG"/>
 *     &lt;enumeration value="DG"/>
 *     &lt;enumeration value="SB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "geschoss")
@XmlEnum
public enum Geschoss {

    KG,
    EG,
    OG,
    DG,
    SB;

    public String value() {
        return name();
    }

    public static Geschoss fromValue(String v) {
        return valueOf(v);
    }

}
