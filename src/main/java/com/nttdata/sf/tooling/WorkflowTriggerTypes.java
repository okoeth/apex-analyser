
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTriggerTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowTriggerTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="onCreateOnly"/>
 *     &lt;enumeration value="onCreateOrTriggeringUpdate"/>
 *     &lt;enumeration value="onAllChanges"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowTriggerTypes")
@XmlEnum
public enum WorkflowTriggerTypes {

    @XmlEnumValue("onCreateOnly")
    ON_CREATE_ONLY("onCreateOnly"),
    @XmlEnumValue("onCreateOrTriggeringUpdate")
    ON_CREATE_OR_TRIGGERING_UPDATE("onCreateOrTriggeringUpdate"),
    @XmlEnumValue("onAllChanges")
    ON_ALL_CHANGES("onAllChanges");
    private final String value;

    WorkflowTriggerTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowTriggerTypes fromValue(String v) {
        for (WorkflowTriggerTypes c: WorkflowTriggerTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
