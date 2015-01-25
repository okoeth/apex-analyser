
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowAssignmentOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowAssignmentOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Assign"/>
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Subtract"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowAssignmentOperator")
@XmlEnum
public enum FlowAssignmentOperator {

    @XmlEnumValue("Assign")
    ASSIGN("Assign"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Subtract")
    SUBTRACT("Subtract");
    private final String value;

    FlowAssignmentOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowAssignmentOperator fromValue(String v) {
        for (FlowAssignmentOperator c: FlowAssignmentOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
