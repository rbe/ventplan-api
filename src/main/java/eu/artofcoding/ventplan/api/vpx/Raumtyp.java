
package eu.artofcoding.ventplan.api.vpx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for raumtyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="raumtyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WOH"/>
 *     &lt;enumeration value="KIN"/>
 *     &lt;enumeration value="SLF"/>
 *     &lt;enumeration value="ESS"/>
 *     &lt;enumeration value="ARB"/>
 *     &lt;enumeration value="GAS"/>
 *     &lt;enumeration value="HAU"/>
 *     &lt;enumeration value="KEL"/>
 *     &lt;enumeration value="WC"/>
 *     &lt;enumeration value="KUC"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="DUS"/>
 *     &lt;enumeration value="SAU"/>
 *     &lt;enumeration value="FLU"/>
 *     &lt;enumeration value="DIE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "raumtyp")
@XmlEnum
public enum Raumtyp {

    WOH,
    KIN,
    SLF,
    ESS,
    ARB,
    GAS,
    HAU,
    KEL,
    WC,
    KUC,
    BAD,
    DUS,
    SAU,
    FLU,
    DIE;

    public String value() {
        return name();
    }

    public static Raumtyp fromValue(String v) {
        return valueOf(v);
    }

}
