
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowScreenFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowScreenFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DisplayText"/>
 *     &lt;enumeration value="InputField"/>
 *     &lt;enumeration value="LargeTextArea"/>
 *     &lt;enumeration value="PasswordField"/>
 *     &lt;enumeration value="RadioButtons"/>
 *     &lt;enumeration value="DropdownBox"/>
 *     &lt;enumeration value="MultiSelectCheckboxes"/>
 *     &lt;enumeration value="MultiSelectPicklist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowScreenFieldType")
@XmlEnum
public enum FlowScreenFieldType {

    @XmlEnumValue("DisplayText")
    DISPLAY_TEXT("DisplayText"),
    @XmlEnumValue("InputField")
    INPUT_FIELD("InputField"),
    @XmlEnumValue("LargeTextArea")
    LARGE_TEXT_AREA("LargeTextArea"),
    @XmlEnumValue("PasswordField")
    PASSWORD_FIELD("PasswordField"),
    @XmlEnumValue("RadioButtons")
    RADIO_BUTTONS("RadioButtons"),
    @XmlEnumValue("DropdownBox")
    DROPDOWN_BOX("DropdownBox"),
    @XmlEnumValue("MultiSelectCheckboxes")
    MULTI_SELECT_CHECKBOXES("MultiSelectCheckboxes"),
    @XmlEnumValue("MultiSelectPicklist")
    MULTI_SELECT_PICKLIST("MultiSelectPicklist");
    private final String value;

    FlowScreenFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowScreenFieldType fromValue(String v) {
        for (FlowScreenFieldType c: FlowScreenFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
