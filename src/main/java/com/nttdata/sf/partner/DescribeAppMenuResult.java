
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeAppMenuResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeAppMenuResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appMenuItems" type="{urn:partner.soap.sforce.com}DescribeAppMenuItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeAppMenuResult", propOrder = {
    "appMenuItems"
})
public class DescribeAppMenuResult {

    protected List<DescribeAppMenuItem> appMenuItems;

    /**
     * Gets the value of the appMenuItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appMenuItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppMenuItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeAppMenuItem }
     * 
     * 
     */
    public List<DescribeAppMenuItem> getAppMenuItems() {
        if (appMenuItems == null) {
            appMenuItems = new ArrayList<DescribeAppMenuItem>();
        }
        return this.appMenuItems;
    }

}
