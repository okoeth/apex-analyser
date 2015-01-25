
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexiPageMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexiPageMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexiPageRegions" type="{urn:tooling.soap.sforce.com}FlexiPageRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="masterLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quickActionList" type="{urn:tooling.soap.sforce.com}QuickActionListMetadata" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:tooling.soap.sforce.com}FlexiPageType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexiPageMetadata", propOrder = {
    "description",
    "flexiPageRegions",
    "masterLabel",
    "quickActionList",
    "type"
})
public class FlexiPageMetadata
    extends Metadata
{

    protected String description;
    protected List<FlexiPageRegion> flexiPageRegions;
    @XmlElement(required = true)
    protected String masterLabel;
    protected QuickActionListMetadata quickActionList;
    @XmlElement(required = true)
    protected FlexiPageType type;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the flexiPageRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flexiPageRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlexiPageRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexiPageRegion }
     * 
     * 
     */
    public List<FlexiPageRegion> getFlexiPageRegions() {
        if (flexiPageRegions == null) {
            flexiPageRegions = new ArrayList<FlexiPageRegion>();
        }
        return this.flexiPageRegions;
    }

    /**
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLabel(String value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the quickActionList property.
     * 
     * @return
     *     possible object is
     *     {@link QuickActionListMetadata }
     *     
     */
    public QuickActionListMetadata getQuickActionList() {
        return quickActionList;
    }

    /**
     * Sets the value of the quickActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickActionListMetadata }
     *     
     */
    public void setQuickActionList(QuickActionListMetadata value) {
        this.quickActionList = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FlexiPageType }
     *     
     */
    public FlexiPageType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexiPageType }
     *     
     */
    public void setType(FlexiPageType value) {
        this.type = value;
    }

}
