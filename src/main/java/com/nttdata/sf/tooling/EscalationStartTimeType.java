
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EscalationStartTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EscalationStartTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CaseCreation"/>
 *     &lt;enumeration value="CaseLastModified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EscalationStartTimeType")
@XmlEnum
public enum EscalationStartTimeType {

    @XmlEnumValue("CaseCreation")
    CASE_CREATION("CaseCreation"),
    @XmlEnumValue("CaseLastModified")
    CASE_LAST_MODIFIED("CaseLastModified");
    private final String value;

    EscalationStartTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EscalationStartTimeType fromValue(String v) {
        for (EscalationStartTimeType c: EscalationStartTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
