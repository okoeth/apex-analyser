
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UiBehavior.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UiBehavior">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Edit"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Readonly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UiBehavior")
@XmlEnum
public enum UiBehavior {

    @XmlEnumValue("Edit")
    EDIT("Edit"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Readonly")
    READONLY("Readonly");
    private final String value;

    UiBehavior(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UiBehavior fromValue(String v) {
        for (UiBehavior c: UiBehavior.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
