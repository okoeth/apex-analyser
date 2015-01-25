
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexiPageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlexiPageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AppPage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlexiPageType")
@XmlEnum
public enum FlexiPageType {

    @XmlEnumValue("AppPage")
    APP_PAGE("AppPage");
    private final String value;

    FlexiPageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlexiPageType fromValue(String v) {
        for (FlexiPageType c: FlexiPageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
