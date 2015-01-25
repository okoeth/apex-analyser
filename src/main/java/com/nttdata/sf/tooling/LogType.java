
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Debugonly"/>
 *     &lt;enumeration value="Db"/>
 *     &lt;enumeration value="Profiling"/>
 *     &lt;enumeration value="Callout"/>
 *     &lt;enumeration value="Detail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogType")
@XmlEnum
public enum LogType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Debugonly")
    DEBUGONLY("Debugonly"),
    @XmlEnumValue("Db")
    DB("Db"),
    @XmlEnumValue("Profiling")
    PROFILING("Profiling"),
    @XmlEnumValue("Callout")
    CALLOUT("Callout"),
    @XmlEnumValue("Detail")
    DETAIL("Detail");
    private final String value;

    LogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogType fromValue(String v) {
        for (LogType c: LogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
