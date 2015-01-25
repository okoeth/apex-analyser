
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IterationOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IterationOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Asc"/>
 *     &lt;enumeration value="Desc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IterationOrder")
@XmlEnum
public enum IterationOrder {

    @XmlEnumValue("Asc")
    ASC("Asc"),
    @XmlEnumValue("Desc")
    DESC("Desc");
    private final String value;

    IterationOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IterationOrder fromValue(String v) {
        for (IterationOrder c: IterationOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
