
package eu.artofcoding.ventplan.api.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for luftart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="luftart">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZU"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="ZUA"/>
 *     &lt;enumeration value="UB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "luftart")
@XmlEnum
public enum Luftart {

    ZU,
    AB,
    ZUA,
    UB;

    public String value() {
        return name();
    }

    public static Luftart fromValue(String v) {
        return valueOf(v);
    }

}
