
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedFieldMaskType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncryptedFieldMaskType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="creditCard"/>
 *     &lt;enumeration value="ssn"/>
 *     &lt;enumeration value="lastFour"/>
 *     &lt;enumeration value="sin"/>
 *     &lt;enumeration value="nino"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncryptedFieldMaskType")
@XmlEnum
public enum EncryptedFieldMaskType {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("ssn")
    SSN("ssn"),
    @XmlEnumValue("lastFour")
    LAST_FOUR("lastFour"),
    @XmlEnumValue("sin")
    SIN("sin"),
    @XmlEnumValue("nino")
    NINO("nino");
    private final String value;

    EncryptedFieldMaskType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptedFieldMaskType fromValue(String v) {
        for (EncryptedFieldMaskType c: EncryptedFieldMaskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
