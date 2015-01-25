
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutHeader.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LayoutHeader">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PersonalTagging"/>
 *     &lt;enumeration value="PublicTagging"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LayoutHeader")
@XmlEnum
public enum LayoutHeader {

    @XmlEnumValue("PersonalTagging")
    PERSONAL_TAGGING("PersonalTagging"),
    @XmlEnumValue("PublicTagging")
    PUBLIC_TAGGING("PublicTagging");
    private final String value;

    LayoutHeader(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayoutHeader fromValue(String v) {
        for (LayoutHeader c: LayoutHeader.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
