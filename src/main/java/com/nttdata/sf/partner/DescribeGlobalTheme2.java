
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeGlobalTheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeGlobalTheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="global" type="{urn:partner.soap.sforce.com}DescribeGlobalResult"/>
 *         &lt;element name="theme" type="{urn:partner.soap.sforce.com}DescribeThemeResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeGlobalTheme", propOrder = {
    "global",
    "theme"
})
public class DescribeGlobalTheme2 {

    @XmlElement(required = true)
    protected DescribeGlobalResult global;
    @XmlElement(required = true)
    protected DescribeThemeResult theme;

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeGlobalResult }
     *     
     */
    public DescribeGlobalResult getGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeGlobalResult }
     *     
     */
    public void setGlobal(DescribeGlobalResult value) {
        this.global = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeThemeResult }
     *     
     */
    public DescribeThemeResult getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeThemeResult }
     *     
     */
    public void setTheme(DescribeThemeResult value) {
        this.theme = value;
    }

}
