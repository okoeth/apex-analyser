
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSettingsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomSettingsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="List"/>
 *     &lt;enumeration value="Hierarchy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomSettingsType")
@XmlEnum
public enum CustomSettingsType {

    @XmlEnumValue("List")
    LIST("List"),
    @XmlEnumValue("Hierarchy")
    HIERARCHY("Hierarchy");
    private final String value;

    CustomSettingsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomSettingsType fromValue(String v) {
        for (CustomSettingsType c: CustomSettingsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
