
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTaskAssignedToTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionTaskAssignedToTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="role"/>
 *     &lt;enumeration value="opportunityTeam"/>
 *     &lt;enumeration value="accountTeam"/>
 *     &lt;enumeration value="owner"/>
 *     &lt;enumeration value="accountOwner"/>
 *     &lt;enumeration value="creator"/>
 *     &lt;enumeration value="accountCreator"/>
 *     &lt;enumeration value="partnerUser"/>
 *     &lt;enumeration value="portalRole"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionTaskAssignedToTypes")
@XmlEnum
public enum ActionTaskAssignedToTypes {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("role")
    ROLE("role"),
    @XmlEnumValue("opportunityTeam")
    OPPORTUNITY_TEAM("opportunityTeam"),
    @XmlEnumValue("accountTeam")
    ACCOUNT_TEAM("accountTeam"),
    @XmlEnumValue("owner")
    OWNER("owner"),
    @XmlEnumValue("accountOwner")
    ACCOUNT_OWNER("accountOwner"),
    @XmlEnumValue("creator")
    CREATOR("creator"),
    @XmlEnumValue("accountCreator")
    ACCOUNT_CREATOR("accountCreator"),
    @XmlEnumValue("partnerUser")
    PARTNER_USER("partnerUser"),
    @XmlEnumValue("portalRole")
    PORTAL_ROLE("portalRole");
    private final String value;

    ActionTaskAssignedToTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionTaskAssignedToTypes fromValue(String v) {
        for (ActionTaskAssignedToTypes c: ActionTaskAssignedToTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
