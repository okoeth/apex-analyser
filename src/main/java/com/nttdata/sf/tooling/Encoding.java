
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Encoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Encoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UTF-8"/>
 *     &lt;enumeration value="ISO-8859-1"/>
 *     &lt;enumeration value="Shift_JIS"/>
 *     &lt;enumeration value="ISO-2022-JP"/>
 *     &lt;enumeration value="EUC-JP"/>
 *     &lt;enumeration value="ks_c_5601-1987"/>
 *     &lt;enumeration value="Big5"/>
 *     &lt;enumeration value="GB2312"/>
 *     &lt;enumeration value="Big5-HKSCS"/>
 *     &lt;enumeration value="x-SJIS_0213"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Encoding")
@XmlEnum
public enum Encoding {

    @XmlEnumValue("UTF-8")
    UTF_8("UTF-8"),
    @XmlEnumValue("ISO-8859-1")
    ISO_8859_1("ISO-8859-1"),
    @XmlEnumValue("Shift_JIS")
    SHIFT_JIS("Shift_JIS"),
    @XmlEnumValue("ISO-2022-JP")
    ISO_2022_JP("ISO-2022-JP"),
    @XmlEnumValue("EUC-JP")
    EUC_JP("EUC-JP"),
    @XmlEnumValue("ks_c_5601-1987")
    KS_C_5601_1987("ks_c_5601-1987"),
    @XmlEnumValue("Big5")
    BIG_5("Big5"),
    @XmlEnumValue("GB2312")
    GB_2312("GB2312"),
    @XmlEnumValue("Big5-HKSCS")
    BIG_5_HKSCS("Big5-HKSCS"),
    @XmlEnumValue("x-SJIS_0213")
    X_SJIS_0213("x-SJIS_0213");
    private final String value;

    Encoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Encoding fromValue(String v) {
        for (Encoding c: Encoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
