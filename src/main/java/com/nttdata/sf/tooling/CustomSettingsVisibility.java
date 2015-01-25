
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSettingsVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomSettingsVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Protected"/>
 *     &lt;enumeration value="Public"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomSettingsVisibility")
@XmlEnum
public enum CustomSettingsVisibility {

    @XmlEnumValue("Protected")
    PROTECTED("Protected"),
    @XmlEnumValue("Public")
    PUBLIC("Public");
    private final String value;

    CustomSettingsVisibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomSettingsVisibility fromValue(String v) {
        for (CustomSettingsVisibility c: CustomSettingsVisibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
