
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutSectionStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LayoutSectionStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TwoColumnsTopToBottom"/>
 *     &lt;enumeration value="TwoColumnsLeftToRight"/>
 *     &lt;enumeration value="OneColumn"/>
 *     &lt;enumeration value="CustomLinks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LayoutSectionStyle")
@XmlEnum
public enum LayoutSectionStyle {

    @XmlEnumValue("TwoColumnsTopToBottom")
    TWO_COLUMNS_TOP_TO_BOTTOM("TwoColumnsTopToBottom"),
    @XmlEnumValue("TwoColumnsLeftToRight")
    TWO_COLUMNS_LEFT_TO_RIGHT("TwoColumnsLeftToRight"),
    @XmlEnumValue("OneColumn")
    ONE_COLUMN("OneColumn"),
    @XmlEnumValue("CustomLinks")
    CUSTOM_LINKS("CustomLinks");
    private final String value;

    LayoutSectionStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayoutSectionStyle fromValue(String v) {
        for (LayoutSectionStyle c: LayoutSectionStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
