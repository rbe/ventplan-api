
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gebaudeLage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gebaudeLage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCH"/>
 *     &lt;enumeration value="STA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gebaudeLage")
@XmlEnum
public enum GebaudeLage {

    SCH,
    STA;

    public String value() {
        return name();
    }

    public static GebaudeLage fromValue(String v) {
        return valueOf(v);
    }

}
