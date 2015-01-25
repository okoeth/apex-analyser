
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessHoursSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessHoursSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Case"/>
 *     &lt;enumeration value="Static"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessHoursSourceType")
@XmlEnum
public enum BusinessHoursSourceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Case")
    CASE("Case"),
    @XmlEnumValue("Static")
    STATIC("Static");
    private final String value;

    BusinessHoursSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessHoursSourceType fromValue(String v) {
        for (BusinessHoursSourceType c: BusinessHoursSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
