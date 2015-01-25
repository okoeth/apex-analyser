
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharingModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharingModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="ReadSelect"/>
 *     &lt;enumeration value="ReadWrite"/>
 *     &lt;enumeration value="ReadWriteTransfer"/>
 *     &lt;enumeration value="FullAccess"/>
 *     &lt;enumeration value="ControlledByParent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SharingModel")
@XmlEnum
public enum SharingModel {

    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("ReadSelect")
    READ_SELECT("ReadSelect"),
    @XmlEnumValue("ReadWrite")
    READ_WRITE("ReadWrite"),
    @XmlEnumValue("ReadWriteTransfer")
    READ_WRITE_TRANSFER("ReadWriteTransfer"),
    @XmlEnumValue("FullAccess")
    FULL_ACCESS("FullAccess"),
    @XmlEnumValue("ControlledByParent")
    CONTROLLED_BY_PARENT("ControlledByParent");
    private final String value;

    SharingModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SharingModel fromValue(String v) {
        for (SharingModel c: SharingModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
