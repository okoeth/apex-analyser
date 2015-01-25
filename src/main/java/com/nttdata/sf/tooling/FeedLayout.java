
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autocollapsePublisher" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="compactFeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="feedFilterPosition" type="{urn:tooling.soap.sforce.com}FeedLayoutFilterPosition" minOccurs="0"/>
 *         &lt;element name="feedFilters" type="{urn:tooling.soap.sforce.com}FeedLayoutFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fullWidthFeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hideSidebar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="leftComponents" type="{urn:tooling.soap.sforce.com}FeedLayoutComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rightComponents" type="{urn:tooling.soap.sforce.com}FeedLayoutComponent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedLayout", propOrder = {
    "autocollapsePublisher",
    "compactFeed",
    "feedFilterPosition",
    "feedFilters",
    "fullWidthFeed",
    "hideSidebar",
    "leftComponents",
    "rightComponents"
})
public class FeedLayout {

    protected Boolean autocollapsePublisher;
    protected Boolean compactFeed;
    protected FeedLayoutFilterPosition feedFilterPosition;
    protected List<FeedLayoutFilter> feedFilters;
    protected Boolean fullWidthFeed;
    protected Boolean hideSidebar;
    protected List<FeedLayoutComponent> leftComponents;
    protected List<FeedLayoutComponent> rightComponents;

    /**
     * Gets the value of the autocollapsePublisher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutocollapsePublisher() {
        return autocollapsePublisher;
    }

    /**
     * Sets the value of the autocollapsePublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutocollapsePublisher(Boolean value) {
        this.autocollapsePublisher = value;
    }

    /**
     * Gets the value of the compactFeed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompactFeed() {
        return compactFeed;
    }

    /**
     * Sets the value of the compactFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompactFeed(Boolean value) {
        this.compactFeed = value;
    }

    /**
     * Gets the value of the feedFilterPosition property.
     * 
     * @return
     *     possible object is
     *     {@link FeedLayoutFilterPosition }
     *     
     */
    public FeedLayoutFilterPosition getFeedFilterPosition() {
        return feedFilterPosition;
    }

    /**
     * Sets the value of the feedFilterPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedLayoutFilterPosition }
     *     
     */
    public void setFeedFilterPosition(FeedLayoutFilterPosition value) {
        this.feedFilterPosition = value;
    }

    /**
     * Gets the value of the feedFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedLayoutFilter }
     * 
     * 
     */
    public List<FeedLayoutFilter> getFeedFilters() {
        if (feedFilters == null) {
            feedFilters = new ArrayList<FeedLayoutFilter>();
        }
        return this.feedFilters;
    }

    /**
     * Gets the value of the fullWidthFeed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullWidthFeed() {
        return fullWidthFeed;
    }

    /**
     * Sets the value of the fullWidthFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullWidthFeed(Boolean value) {
        this.fullWidthFeed = value;
    }

    /**
     * Gets the value of the hideSidebar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideSidebar() {
        return hideSidebar;
    }

    /**
     * Sets the value of the hideSidebar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideSidebar(Boolean value) {
        this.hideSidebar = value;
    }

    /**
     * Gets the value of the leftComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leftComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeftComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedLayoutComponent }
     * 
     * 
     */
    public List<FeedLayoutComponent> getLeftComponents() {
        if (leftComponents == null) {
            leftComponents = new ArrayList<FeedLayoutComponent>();
        }
        return this.leftComponents;
    }

    /**
     * Gets the value of the rightComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedLayoutComponent }
     * 
     * 
     */
    public List<FeedLayoutComponent> getRightComponents() {
        if (rightComponents == null) {
            rightComponents = new ArrayList<FeedLayoutComponent>();
        }
        return this.rightComponents;
    }

}
