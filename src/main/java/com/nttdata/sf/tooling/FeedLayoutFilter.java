
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedLayoutFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedLayoutFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedFilterType" type="{urn:tooling.soap.sforce.com}FeedLayoutFilterType"/>
 *         &lt;element name="feedItemType" type="{urn:tooling.soap.sforce.com}FeedItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedLayoutFilter", propOrder = {
    "feedFilterType",
    "feedItemType"
})
public class FeedLayoutFilter {

    @XmlElement(required = true)
    protected FeedLayoutFilterType feedFilterType;
    protected FeedItemType feedItemType;

    /**
     * Gets the value of the feedFilterType property.
     * 
     * @return
     *     possible object is
     *     {@link FeedLayoutFilterType }
     *     
     */
    public FeedLayoutFilterType getFeedFilterType() {
        return feedFilterType;
    }

    /**
     * Sets the value of the feedFilterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedLayoutFilterType }
     *     
     */
    public void setFeedFilterType(FeedLayoutFilterType value) {
        this.feedFilterType = value;
    }

    /**
     * Gets the value of the feedItemType property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemType }
     *     
     */
    public FeedItemType getFeedItemType() {
        return feedItemType;
    }

    /**
     * Sets the value of the feedItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemType }
     *     
     */
    public void setFeedItemType(FeedItemType value) {
        this.feedItemType = value;
    }

}
