
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TabOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LeftToRight"/>
 *     &lt;enumeration value="TopToBottom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TabOrderType")
@XmlEnum
public enum TabOrderType {

    @XmlEnumValue("LeftToRight")
    LEFT_TO_RIGHT("LeftToRight"),
    @XmlEnumValue("TopToBottom")
    TOP_TO_BOTTOM("TopToBottom");
    private final String value;

    TabOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TabOrderType fromValue(String v) {
        for (TabOrderType c: TabOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
