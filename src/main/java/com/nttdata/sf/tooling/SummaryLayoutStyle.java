
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryLayoutStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummaryLayoutStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="QuoteTemplate"/>
 *     &lt;enumeration value="DefaultQuoteTemplate"/>
 *     &lt;enumeration value="CaseInteraction"/>
 *     &lt;enumeration value="QuickActionLayoutLeftRight"/>
 *     &lt;enumeration value="QuickActionLayoutTopDown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SummaryLayoutStyle")
@XmlEnum
public enum SummaryLayoutStyle {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("QuoteTemplate")
    QUOTE_TEMPLATE("QuoteTemplate"),
    @XmlEnumValue("DefaultQuoteTemplate")
    DEFAULT_QUOTE_TEMPLATE("DefaultQuoteTemplate"),
    @XmlEnumValue("CaseInteraction")
    CASE_INTERACTION("CaseInteraction"),
    @XmlEnumValue("QuickActionLayoutLeftRight")
    QUICK_ACTION_LAYOUT_LEFT_RIGHT("QuickActionLayoutLeftRight"),
    @XmlEnumValue("QuickActionLayoutTopDown")
    QUICK_ACTION_LAYOUT_TOP_DOWN("QuickActionLayoutTopDown");
    private final String value;

    SummaryLayoutStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SummaryLayoutStyle fromValue(String v) {
        for (SummaryLayoutStyle c: SummaryLayoutStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
