
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gebaudeTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gebaudeTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MFH"/>
 *     &lt;enumeration value="EFH"/>
 *     &lt;enumeration value="MAI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gebaudeTyp")
@XmlEnum
public enum GebaudeTyp {

    MFH,
    EFH,
    MAI;

    public String value() {
        return name();
    }

    public static GebaudeTyp fromValue(String v) {
        return valueOf(v);
    }

}
