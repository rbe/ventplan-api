
package eu.artofcoding.ventplan.api.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fortluft.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fortluft">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAC"/>
 *     &lt;enumeration value="WAN"/>
 *     &lt;enumeration value="LIC"/>
 *     &lt;enumeration value="BOG135"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fortluft")
@XmlEnum
public enum Fortluft {

    DAC("DAC"),
    WAN("WAN"),
    LIC("LIC"),
    @XmlEnumValue("BOG135")
    BOG_135("BOG135");
    private final String value;

    Fortluft(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Fortluft fromValue(String v) {
        for (Fortluft c: Fortluft.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
