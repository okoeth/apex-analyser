
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvocableActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvocableActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="quickAction"/>
 *     &lt;enumeration value="submit"/>
 *     &lt;enumeration value="chatterPost"/>
 *     &lt;enumeration value="emailSimple"/>
 *     &lt;enumeration value="emailAlert"/>
 *     &lt;enumeration value="flow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvocableActionType")
@XmlEnum
public enum InvocableActionType {

    @XmlEnumValue("quickAction")
    QUICK_ACTION("quickAction"),
    @XmlEnumValue("submit")
    SUBMIT("submit"),
    @XmlEnumValue("chatterPost")
    CHATTER_POST("chatterPost"),
    @XmlEnumValue("emailSimple")
    EMAIL_SIMPLE("emailSimple"),
    @XmlEnumValue("emailAlert")
    EMAIL_ALERT("emailAlert"),
    @XmlEnumValue("flow")
    FLOW("flow");
    private final String value;

    InvocableActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvocableActionType fromValue(String v) {
        for (InvocableActionType c: InvocableActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
