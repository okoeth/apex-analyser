
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeThemeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeThemeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="themeItems" type="{urn:partner.soap.sforce.com}DescribeThemeItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeThemeResult", propOrder = {
    "themeItems"
})
public class DescribeThemeResult {

    protected List<DescribeThemeItem> themeItems;

    /**
     * Gets the value of the themeItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the themeItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThemeItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeThemeItem }
     * 
     * 
     */
    public List<DescribeThemeItem> getThemeItems() {
        if (themeItems == null) {
            themeItems = new ArrayList<DescribeThemeItem>();
        }
        return this.themeItems;
    }

}
