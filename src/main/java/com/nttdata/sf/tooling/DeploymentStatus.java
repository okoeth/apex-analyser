
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeploymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeploymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InDevelopment"/>
 *     &lt;enumeration value="Deployed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeploymentStatus")
@XmlEnum
public enum DeploymentStatus {

    @XmlEnumValue("InDevelopment")
    IN_DEVELOPMENT("InDevelopment"),
    @XmlEnumValue("Deployed")
    DEPLOYED("Deployed");
    private final String value;

    DeploymentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeploymentStatus fromValue(String v) {
        for (DeploymentStatus c: DeploymentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
