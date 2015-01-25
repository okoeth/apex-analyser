
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartsWith.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StartsWith">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Consonant"/>
 *     &lt;enumeration value="Vowel"/>
 *     &lt;enumeration value="Special"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StartsWith")
@XmlEnum
public enum StartsWith {

    @XmlEnumValue("Consonant")
    CONSONANT("Consonant"),
    @XmlEnumValue("Vowel")
    VOWEL("Vowel"),
    @XmlEnumValue("Special")
    SPECIAL("Special");
    private final String value;

    StartsWith(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StartsWith fromValue(String v) {
        for (StartsWith c: StartsWith.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
