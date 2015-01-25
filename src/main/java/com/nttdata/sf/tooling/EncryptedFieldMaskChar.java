
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedFieldMaskChar.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncryptedFieldMaskChar">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="asterisk"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncryptedFieldMaskChar")
@XmlEnum
public enum EncryptedFieldMaskChar {

    @XmlEnumValue("asterisk")
    ASTERISK("asterisk"),
    X("X");
    private final String value;

    EncryptedFieldMaskChar(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptedFieldMaskChar fromValue(String v) {
        for (EncryptedFieldMaskChar c: EncryptedFieldMaskChar.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
