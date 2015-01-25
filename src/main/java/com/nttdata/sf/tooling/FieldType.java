
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AutoNumber"/>
 *     &lt;enumeration value="Lookup"/>
 *     &lt;enumeration value="MasterDetail"/>
 *     &lt;enumeration value="Checkbox"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="Picklist"/>
 *     &lt;enumeration value="MultiselectPicklist"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="TextArea"/>
 *     &lt;enumeration value="LongTextArea"/>
 *     &lt;enumeration value="Html"/>
 *     &lt;enumeration value="Url"/>
 *     &lt;enumeration value="EncryptedText"/>
 *     &lt;enumeration value="Summary"/>
 *     &lt;enumeration value="Hierarchy"/>
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="CustomDataType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldType")
@XmlEnum
public enum FieldType {

    @XmlEnumValue("AutoNumber")
    AUTO_NUMBER("AutoNumber"),
    @XmlEnumValue("Lookup")
    LOOKUP("Lookup"),
    @XmlEnumValue("MasterDetail")
    MASTER_DETAIL("MasterDetail"),
    @XmlEnumValue("Checkbox")
    CHECKBOX("Checkbox"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Picklist")
    PICKLIST("Picklist"),
    @XmlEnumValue("MultiselectPicklist")
    MULTISELECT_PICKLIST("MultiselectPicklist"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea"),
    @XmlEnumValue("LongTextArea")
    LONG_TEXT_AREA("LongTextArea"),
    @XmlEnumValue("Html")
    HTML("Html"),
    @XmlEnumValue("Url")
    URL("Url"),
    @XmlEnumValue("EncryptedText")
    ENCRYPTED_TEXT("EncryptedText"),
    @XmlEnumValue("Summary")
    SUMMARY("Summary"),
    @XmlEnumValue("Hierarchy")
    HIERARCHY("Hierarchy"),
    @XmlEnumValue("File")
    FILE("File"),
    @XmlEnumValue("CustomDataType")
    CUSTOM_DATA_TYPE("CustomDataType");
    private final String value;

    FieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldType fromValue(String v) {
        for (FieldType c: FieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
