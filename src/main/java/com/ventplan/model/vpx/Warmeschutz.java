
package com.ventplan.model.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for warmeschutz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="warmeschutz">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOC"/>
 *     &lt;enumeration value="NIE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "warmeschutz")
@XmlEnum
public enum Warmeschutz {

    HOC,
    NIE;

    public String value() {
        return name();
    }

    public static Warmeschutz fromValue(String v) {
        return valueOf(v);
    }

}
