
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionEmailRecipientTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionEmailRecipientTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="role"/>
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="opportunityTeam"/>
 *     &lt;enumeration value="accountTeam"/>
 *     &lt;enumeration value="roleSubordinates"/>
 *     &lt;enumeration value="owner"/>
 *     &lt;enumeration value="creator"/>
 *     &lt;enumeration value="partnerUser"/>
 *     &lt;enumeration value="accountOwner"/>
 *     &lt;enumeration value="customerPortalUser"/>
 *     &lt;enumeration value="portalRole"/>
 *     &lt;enumeration value="portalRoleSubordinates"/>
 *     &lt;enumeration value="contactLookup"/>
 *     &lt;enumeration value="userLookup"/>
 *     &lt;enumeration value="roleSubordinatesInternal"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="caseTeam"/>
 *     &lt;enumeration value="campaignMemberDerivedOwner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionEmailRecipientTypes")
@XmlEnum
public enum ActionEmailRecipientTypes {

    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("role")
    ROLE("role"),
    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("opportunityTeam")
    OPPORTUNITY_TEAM("opportunityTeam"),
    @XmlEnumValue("accountTeam")
    ACCOUNT_TEAM("accountTeam"),
    @XmlEnumValue("roleSubordinates")
    ROLE_SUBORDINATES("roleSubordinates"),
    @XmlEnumValue("owner")
    OWNER("owner"),
    @XmlEnumValue("creator")
    CREATOR("creator"),
    @XmlEnumValue("partnerUser")
    PARTNER_USER("partnerUser"),
    @XmlEnumValue("accountOwner")
    ACCOUNT_OWNER("accountOwner"),
    @XmlEnumValue("customerPortalUser")
    CUSTOMER_PORTAL_USER("customerPortalUser"),
    @XmlEnumValue("portalRole")
    PORTAL_ROLE("portalRole"),
    @XmlEnumValue("portalRoleSubordinates")
    PORTAL_ROLE_SUBORDINATES("portalRoleSubordinates"),
    @XmlEnumValue("contactLookup")
    CONTACT_LOOKUP("contactLookup"),
    @XmlEnumValue("userLookup")
    USER_LOOKUP("userLookup"),
    @XmlEnumValue("roleSubordinatesInternal")
    ROLE_SUBORDINATES_INTERNAL("roleSubordinatesInternal"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("caseTeam")
    CASE_TEAM("caseTeam"),
    @XmlEnumValue("campaignMemberDerivedOwner")
    CAMPAIGN_MEMBER_DERIVED_OWNER("campaignMemberDerivedOwner");
    private final String value;

    ActionEmailRecipientTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionEmailRecipientTypes fromValue(String v) {
        for (ActionEmailRecipientTypes c: ActionEmailRecipientTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
