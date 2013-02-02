
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aussenluft.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="aussenluft">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAC"/>
 *     &lt;enumeration value="WAN"/>
 *     &lt;enumeration value="ERD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "aussenluft")
@XmlEnum
public enum Aussenluft {

    DAC,
    WAN,
    ERD;

    public String value() {
        return name();
    }

    public static Aussenluft fromValue(String v) {
        return valueOf(v);
    }

}
