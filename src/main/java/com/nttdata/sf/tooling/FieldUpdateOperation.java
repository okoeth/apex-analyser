
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldUpdateOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldUpdateOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Formula"/>
 *     &lt;enumeration value="Literal"/>
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="NextValue"/>
 *     &lt;enumeration value="PreviousValue"/>
 *     &lt;enumeration value="LookupValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldUpdateOperation")
@XmlEnum
public enum FieldUpdateOperation {

    @XmlEnumValue("Formula")
    FORMULA("Formula"),
    @XmlEnumValue("Literal")
    LITERAL("Literal"),
    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("NextValue")
    NEXT_VALUE("NextValue"),
    @XmlEnumValue("PreviousValue")
    PREVIOUS_VALUE("PreviousValue"),
    @XmlEnumValue("LookupValue")
    LOOKUP_VALUE("LookupValue");
    private final String value;

    FieldUpdateOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldUpdateOperation fromValue(String v) {
        for (FieldUpdateOperation c: FieldUpdateOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
