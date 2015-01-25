
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogCategoryLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogCategoryLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Finest"/>
 *     &lt;enumeration value="Finer"/>
 *     &lt;enumeration value="Fine"/>
 *     &lt;enumeration value="Debug"/>
 *     &lt;enumeration value="Info"/>
 *     &lt;enumeration value="Warn"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogCategoryLevel")
@XmlEnum
public enum LogCategoryLevel {

    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Finest")
    FINEST("Finest"),
    @XmlEnumValue("Finer")
    FINER("Finer"),
    @XmlEnumValue("Fine")
    FINE("Fine"),
    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Warn")
    WARN("Warn"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    LogCategoryLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogCategoryLevel fromValue(String v) {
        for (LogCategoryLevel c: LogCategoryLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
