
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kanalnetzLuftart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kanalnetzLuftart">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZU"/>
 *     &lt;enumeration value="AB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "kanalnetzLuftart")
@XmlEnum
public enum KanalnetzLuftart {

    ZU,
    AB;

    public String value() {
        return name();
    }

    public static KanalnetzLuftart fromValue(String v) {
        return valueOf(v);
    }

}
