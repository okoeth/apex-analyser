
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionEmailSenderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionEmailSenderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CurrentUser"/>
 *     &lt;enumeration value="OrgWideEmailAddress"/>
 *     &lt;enumeration value="DefaultWorkflowUser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionEmailSenderType")
@XmlEnum
public enum ActionEmailSenderType {

    @XmlEnumValue("CurrentUser")
    CURRENT_USER("CurrentUser"),
    @XmlEnumValue("OrgWideEmailAddress")
    ORG_WIDE_EMAIL_ADDRESS("OrgWideEmailAddress"),
    @XmlEnumValue("DefaultWorkflowUser")
    DEFAULT_WORKFLOW_USER("DefaultWorkflowUser");
    private final String value;

    ActionEmailSenderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionEmailSenderType fromValue(String v) {
        for (ActionEmailSenderType c: ActionEmailSenderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
