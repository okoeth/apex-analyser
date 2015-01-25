
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailTemplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailTemplateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="html"/>
 *     &lt;enumeration value="custom"/>
 *     &lt;enumeration value="visualforce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailTemplateType")
@XmlEnum
public enum EmailTemplateType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("html")
    HTML("html"),
    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("visualforce")
    VISUALFORCE("visualforce");
    private final String value;

    EmailTemplateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailTemplateType fromValue(String v) {
        for (EmailTemplateType c: EmailTemplateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
