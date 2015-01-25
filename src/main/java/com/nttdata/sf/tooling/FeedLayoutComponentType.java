
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedLayoutComponentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedLayoutComponentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HelpAndToolLinks"/>
 *     &lt;enumeration value="CustomButtons"/>
 *     &lt;enumeration value="Following"/>
 *     &lt;enumeration value="Followers"/>
 *     &lt;enumeration value="CustomLinks"/>
 *     &lt;enumeration value="Milestones"/>
 *     &lt;enumeration value="Topics"/>
 *     &lt;enumeration value="Visualforce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedLayoutComponentType")
@XmlEnum
public enum FeedLayoutComponentType {

    @XmlEnumValue("HelpAndToolLinks")
    HELP_AND_TOOL_LINKS("HelpAndToolLinks"),
    @XmlEnumValue("CustomButtons")
    CUSTOM_BUTTONS("CustomButtons"),
    @XmlEnumValue("Following")
    FOLLOWING("Following"),
    @XmlEnumValue("Followers")
    FOLLOWERS("Followers"),
    @XmlEnumValue("CustomLinks")
    CUSTOM_LINKS("CustomLinks"),
    @XmlEnumValue("Milestones")
    MILESTONES("Milestones"),
    @XmlEnumValue("Topics")
    TOPICS("Topics"),
    @XmlEnumValue("Visualforce")
    VISUALFORCE("Visualforce");
    private final String value;

    FeedLayoutComponentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedLayoutComponentType fromValue(String v) {
        for (FeedLayoutComponentType c: FeedLayoutComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
