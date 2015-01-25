
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryOperations.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummaryOperations">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="count"/>
 *     &lt;enumeration value="sum"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="max"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SummaryOperations")
@XmlEnum
public enum SummaryOperations {

    @XmlEnumValue("count")
    COUNT("count"),
    @XmlEnumValue("sum")
    SUM("sum"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("max")
    MAX("max");
    private final String value;

    SummaryOperations(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SummaryOperations fromValue(String v) {
        for (SummaryOperations c: SummaryOperations.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
