
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLinkWindowType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebLinkWindowType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="newWindow"/>
 *     &lt;enumeration value="sidebar"/>
 *     &lt;enumeration value="noSidebar"/>
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="onClickJavaScript"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebLinkWindowType")
@XmlEnum
public enum WebLinkWindowType {

    @XmlEnumValue("newWindow")
    NEW_WINDOW("newWindow"),
    @XmlEnumValue("sidebar")
    SIDEBAR("sidebar"),
    @XmlEnumValue("noSidebar")
    NO_SIDEBAR("noSidebar"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("onClickJavaScript")
    ON_CLICK_JAVA_SCRIPT("onClickJavaScript");
    private final String value;

    WebLinkWindowType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLinkWindowType fromValue(String v) {
        for (WebLinkWindowType c: WebLinkWindowType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
