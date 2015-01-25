
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTimeUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowTimeUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hours"/>
 *     &lt;enumeration value="Days"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowTimeUnits")
@XmlEnum
public enum WorkflowTimeUnits {

    @XmlEnumValue("Hours")
    HOURS("Hours"),
    @XmlEnumValue("Days")
    DAYS("Days");
    private final String value;

    WorkflowTimeUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowTimeUnits fromValue(String v) {
        for (WorkflowTimeUnits c: WorkflowTimeUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
