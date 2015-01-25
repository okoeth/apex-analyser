
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="SObject"/>
 *     &lt;enumeration value="DateTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowDataType")
@XmlEnum
public enum FlowDataType {

    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("SObject")
    S_OBJECT("SObject"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime");
    private final String value;

    FlowDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowDataType fromValue(String v) {
        for (FlowDataType c: FlowDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
