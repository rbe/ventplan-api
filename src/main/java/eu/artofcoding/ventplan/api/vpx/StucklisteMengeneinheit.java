
package eu.artofcoding.ventplan.api.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stucklisteMengeneinheit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stucklisteMengeneinheit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="St\u00fcck"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stucklisteMengeneinheit")
@XmlEnum
public enum StucklisteMengeneinheit {

    @XmlEnumValue("Meter")
    METER("Meter"),
    @XmlEnumValue("St\u00fcck")
    ST\u00dcCK("St\u00fcck");
    private final String value;

    StucklisteMengeneinheit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StucklisteMengeneinheit fromValue(String v) {
        for (StucklisteMengeneinheit c: StucklisteMengeneinheit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
