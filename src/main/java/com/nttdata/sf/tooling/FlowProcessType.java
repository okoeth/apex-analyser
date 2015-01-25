
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowProcessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowProcessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AutoLaunchedFlow"/>
 *     &lt;enumeration value="Flow"/>
 *     &lt;enumeration value="Workflow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowProcessType")
@XmlEnum
public enum FlowProcessType {

    @XmlEnumValue("AutoLaunchedFlow")
    AUTO_LAUNCHED_FLOW("AutoLaunchedFlow"),
    @XmlEnumValue("Flow")
    FLOW("Flow"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow");
    private final String value;

    FlowProcessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowProcessType fromValue(String v) {
        for (FlowProcessType c: FlowProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
