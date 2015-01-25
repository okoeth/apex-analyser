
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeRelatedContentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeRelatedContentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="describeLayoutItem" type="{urn:partner.soap.sforce.com}DescribeLayoutItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeRelatedContentItem", propOrder = {
    "describeLayoutItem"
})
public class DescribeRelatedContentItem {

    @XmlElement(required = true)
    protected DescribeLayoutItem describeLayoutItem;

    /**
     * Gets the value of the describeLayoutItem property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutItem }
     *     
     */
    public DescribeLayoutItem getDescribeLayoutItem() {
        return describeLayoutItem;
    }

    /**
     * Sets the value of the describeLayoutItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutItem }
     *     
     */
    public void setDescribeLayoutItem(DescribeLayoutItem value) {
        this.describeLayoutItem = value;
    }

}
