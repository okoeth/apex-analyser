
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedLayoutFilterPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedLayoutFilterPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CenterDropDown"/>
 *     &lt;enumeration value="LeftFixed"/>
 *     &lt;enumeration value="LeftFloat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedLayoutFilterPosition")
@XmlEnum
public enum FeedLayoutFilterPosition {

    @XmlEnumValue("CenterDropDown")
    CENTER_DROP_DOWN("CenterDropDown"),
    @XmlEnumValue("LeftFixed")
    LEFT_FIXED("LeftFixed"),
    @XmlEnumValue("LeftFloat")
    LEFT_FLOAT("LeftFloat");
    private final String value;

    FeedLayoutFilterPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedLayoutFilterPosition fromValue(String v) {
        for (FeedLayoutFilterPosition c: FeedLayoutFilterPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
