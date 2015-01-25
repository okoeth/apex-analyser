
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailTemplateStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailTemplateStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="freeForm"/>
 *     &lt;enumeration value="formalLetter"/>
 *     &lt;enumeration value="promotionRight"/>
 *     &lt;enumeration value="promotionLeft"/>
 *     &lt;enumeration value="newsletter"/>
 *     &lt;enumeration value="products"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailTemplateStyle")
@XmlEnum
public enum EmailTemplateStyle {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("freeForm")
    FREE_FORM("freeForm"),
    @XmlEnumValue("formalLetter")
    FORMAL_LETTER("formalLetter"),
    @XmlEnumValue("promotionRight")
    PROMOTION_RIGHT("promotionRight"),
    @XmlEnumValue("promotionLeft")
    PROMOTION_LEFT("promotionLeft"),
    @XmlEnumValue("newsletter")
    NEWSLETTER("newsletter"),
    @XmlEnumValue("products")
    PRODUCTS("products");
    private final String value;

    EmailTemplateStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailTemplateStyle fromValue(String v) {
        for (EmailTemplateStyle c: EmailTemplateStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
