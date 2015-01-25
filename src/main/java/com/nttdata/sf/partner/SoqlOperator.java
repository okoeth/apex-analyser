
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soqlOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="soqlOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equals"/>
 *     &lt;enumeration value="excludes"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="greaterThanOrEqualTo"/>
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="includes"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="lessThanOrEqualTo"/>
 *     &lt;enumeration value="like"/>
 *     &lt;enumeration value="notEquals"/>
 *     &lt;enumeration value="notIn"/>
 *     &lt;enumeration value="within"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "soqlOperator")
@XmlEnum
public enum SoqlOperator {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("excludes")
    EXCLUDES("excludes"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("greaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("greaterThanOrEqualTo"),
    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("includes")
    INCLUDES("includes"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("lessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("lessThanOrEqualTo"),
    @XmlEnumValue("like")
    LIKE("like"),
    @XmlEnumValue("notEquals")
    NOT_EQUALS("notEquals"),
    @XmlEnumValue("notIn")
    NOT_IN("notIn"),
    @XmlEnumValue("within")
    WITHIN("within");
    private final String value;

    SoqlOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoqlOperator fromValue(String v) {
        for (SoqlOperator c: SoqlOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
