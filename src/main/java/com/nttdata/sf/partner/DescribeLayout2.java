
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buttonLayoutSection" type="{urn:partner.soap.sforce.com}DescribeLayoutButtonSection" minOccurs="0"/>
 *         &lt;element name="detailLayoutSections" type="{urn:partner.soap.sforce.com}DescribeLayoutSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="editLayoutSections" type="{urn:partner.soap.sforce.com}DescribeLayoutSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="highlightsPanelLayoutSection" type="{urn:partner.soap.sforce.com}DescribeLayoutSection" minOccurs="0"/>
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="quickActionList" type="{urn:partner.soap.sforce.com}DescribeQuickActionListResult" minOccurs="0"/>
 *         &lt;element name="relatedContent" type="{urn:partner.soap.sforce.com}RelatedContent" minOccurs="0"/>
 *         &lt;element name="relatedLists" type="{urn:partner.soap.sforce.com}RelatedList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayout", propOrder = {
    "buttonLayoutSection",
    "detailLayoutSections",
    "editLayoutSections",
    "highlightsPanelLayoutSection",
    "id",
    "quickActionList",
    "relatedContent",
    "relatedLists"
})
public class DescribeLayout2 {

    protected DescribeLayoutButtonSection buttonLayoutSection;
    protected List<DescribeLayoutSection> detailLayoutSections;
    protected List<DescribeLayoutSection> editLayoutSections;
    protected DescribeLayoutSection highlightsPanelLayoutSection;
    @XmlElement(required = true, nillable = true)
    protected String id;
    protected DescribeQuickActionListResult quickActionList;
    protected RelatedContent relatedContent;
    protected List<RelatedList> relatedLists;

    /**
     * Gets the value of the buttonLayoutSection property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutButtonSection }
     *     
     */
    public DescribeLayoutButtonSection getButtonLayoutSection() {
        return buttonLayoutSection;
    }

    /**
     * Sets the value of the buttonLayoutSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutButtonSection }
     *     
     */
    public void setButtonLayoutSection(DescribeLayoutButtonSection value) {
        this.buttonLayoutSection = value;
    }

    /**
     * Gets the value of the detailLayoutSections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailLayoutSections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailLayoutSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutSection }
     * 
     * 
     */
    public List<DescribeLayoutSection> getDetailLayoutSections() {
        if (detailLayoutSections == null) {
            detailLayoutSections = new ArrayList<DescribeLayoutSection>();
        }
        return this.detailLayoutSections;
    }

    /**
     * Gets the value of the editLayoutSections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editLayoutSections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditLayoutSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutSection }
     * 
     * 
     */
    public List<DescribeLayoutSection> getEditLayoutSections() {
        if (editLayoutSections == null) {
            editLayoutSections = new ArrayList<DescribeLayoutSection>();
        }
        return this.editLayoutSections;
    }

    /**
     * Gets the value of the highlightsPanelLayoutSection property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutSection }
     *     
     */
    public DescribeLayoutSection getHighlightsPanelLayoutSection() {
        return highlightsPanelLayoutSection;
    }

    /**
     * Sets the value of the highlightsPanelLayoutSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutSection }
     *     
     */
    public void setHighlightsPanelLayoutSection(DescribeLayoutSection value) {
        this.highlightsPanelLayoutSection = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the quickActionList property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeQuickActionListResult }
     *     
     */
    public DescribeQuickActionListResult getQuickActionList() {
        return quickActionList;
    }

    /**
     * Sets the value of the quickActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeQuickActionListResult }
     *     
     */
    public void setQuickActionList(DescribeQuickActionListResult value) {
        this.quickActionList = value;
    }

    /**
     * Gets the value of the relatedContent property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedContent }
     *     
     */
    public RelatedContent getRelatedContent() {
        return relatedContent;
    }

    /**
     * Sets the value of the relatedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedContent }
     *     
     */
    public void setRelatedContent(RelatedContent value) {
        this.relatedContent = value;
    }

    /**
     * Gets the value of the relatedLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedList }
     * 
     * 
     */
    public List<RelatedList> getRelatedLists() {
        if (relatedLists == null) {
            relatedLists = new ArrayList<RelatedList>();
        }
        return this.relatedLists;
    }

}
