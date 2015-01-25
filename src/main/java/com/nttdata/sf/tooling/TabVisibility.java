
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TabVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hidden"/>
 *     &lt;enumeration value="DefaultOff"/>
 *     &lt;enumeration value="DefaultOn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TabVisibility")
@XmlEnum
public enum TabVisibility {

    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),
    @XmlEnumValue("DefaultOff")
    DEFAULT_OFF("DefaultOff"),
    @XmlEnumValue("DefaultOn")
    DEFAULT_ON("DefaultOn");
    private final String value;

    TabVisibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TabVisibility fromValue(String v) {
        for (TabVisibility c: TabVisibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
