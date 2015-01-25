
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastCategories.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastCategories">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Omitted"/>
 *     &lt;enumeration value="Pipeline"/>
 *     &lt;enumeration value="BestCase"/>
 *     &lt;enumeration value="Forecast"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForecastCategories")
@XmlEnum
public enum ForecastCategories {

    @XmlEnumValue("Omitted")
    OMITTED("Omitted"),
    @XmlEnumValue("Pipeline")
    PIPELINE("Pipeline"),
    @XmlEnumValue("BestCase")
    BEST_CASE("BestCase"),
    @XmlEnumValue("Forecast")
    FORECAST("Forecast"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    ForecastCategories(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForecastCategories fromValue(String v) {
        for (ForecastCategories c: ForecastCategories.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
