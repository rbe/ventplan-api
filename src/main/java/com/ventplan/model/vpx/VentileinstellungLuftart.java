
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ventileinstellungLuftart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ventileinstellungLuftart">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZU"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="FO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ventileinstellungLuftart")
@XmlEnum
public enum VentileinstellungLuftart {

    ZU,
    AB,
    AU,
    FO;

    public String value() {
        return name();
    }

    public static VentileinstellungLuftart fromValue(String v) {
        return valueOf(v);
    }

}
