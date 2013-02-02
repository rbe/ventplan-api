
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for luftdichtheit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="luftdichtheit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "luftdichtheit")
@XmlEnum
public enum Luftdichtheit {

    A,
    B,
    C,
    M;

    public String value() {
        return name();
    }

    public static Luftdichtheit fromValue(String v) {
        return valueOf(v);
    }

}
