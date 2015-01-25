
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowVersionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowVersionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Obsolete"/>
 *     &lt;enumeration value="InvalidDraft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowVersionStatus")
@XmlEnum
public enum FlowVersionStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Obsolete")
    OBSOLETE("Obsolete"),
    @XmlEnumValue("InvalidDraft")
    INVALID_DRAFT("InvalidDraft");
    private final String value;

    FlowVersionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowVersionStatus fromValue(String v) {
        for (FlowVersionStatus c: FlowVersionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
