
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataPipelineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataPipelineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pig"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataPipelineType")
@XmlEnum
public enum DataPipelineType {

    @XmlEnumValue("Pig")
    PIG("Pig");
    private final String value;

    DataPipelineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataPipelineType fromValue(String v) {
        for (DataPipelineType c: DataPipelineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
