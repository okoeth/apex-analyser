
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteConstraint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeleteConstraint">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cascade"/>
 *     &lt;enumeration value="Restrict"/>
 *     &lt;enumeration value="SetNull"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeleteConstraint")
@XmlEnum
public enum DeleteConstraint {

    @XmlEnumValue("Cascade")
    CASCADE("Cascade"),
    @XmlEnumValue("Restrict")
    RESTRICT("Restrict"),
    @XmlEnumValue("SetNull")
    SET_NULL("SetNull");
    private final String value;

    DeleteConstraint(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeleteConstraint fromValue(String v) {
        for (DeleteConstraint c: DeleteConstraint.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
