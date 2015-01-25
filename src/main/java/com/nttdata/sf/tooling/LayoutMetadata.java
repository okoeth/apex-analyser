
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="customButtons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customConsoleComponents" type="{urn:tooling.soap.sforce.com}CustomConsoleComponents" minOccurs="0"/>
 *         &lt;element name="emailDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excludeButtons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="feedLayout" type="{urn:tooling.soap.sforce.com}FeedLayout" minOccurs="0"/>
 *         &lt;element name="headers" type="{urn:tooling.soap.sforce.com}LayoutHeader" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="layoutSections" type="{urn:tooling.soap.sforce.com}LayoutSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="miniLayout" type="{urn:tooling.soap.sforce.com}MiniLayout" minOccurs="0"/>
 *         &lt;element name="multilineLayoutFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quickActionList" type="{urn:tooling.soap.sforce.com}QuickActionListMetadata" minOccurs="0"/>
 *         &lt;element name="relatedContent" type="{urn:tooling.soap.sforce.com}RelatedContent" minOccurs="0"/>
 *         &lt;element name="relatedLists" type="{urn:tooling.soap.sforce.com}RelatedListItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedObjects" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="runAssignmentRulesDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showEmailCheckbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showHighlightsPanel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showInteractionLogPanel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showKnowledgeComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showRunAssignmentRulesCheckbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showSolutionSection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showSubmitAndAttachButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="summaryLayout" type="{urn:tooling.soap.sforce.com}SummaryLayout" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutMetadata", propOrder = {
    "customButtons",
    "customConsoleComponents",
    "emailDefault",
    "excludeButtons",
    "feedLayout",
    "headers",
    "layoutSections",
    "miniLayout",
    "multilineLayoutFields",
    "quickActionList",
    "relatedContent",
    "relatedLists",
    "relatedObjects",
    "runAssignmentRulesDefault",
    "showEmailCheckbox",
    "showHighlightsPanel",
    "showInteractionLogPanel",
    "showKnowledgeComponent",
    "showRunAssignmentRulesCheckbox",
    "showSolutionSection",
    "showSubmitAndAttachButton",
    "summaryLayout"
})
public class LayoutMetadata
    extends Metadata
{

    protected List<String> customButtons;
    protected CustomConsoleComponents customConsoleComponents;
    protected Boolean emailDefault;
    protected List<String> excludeButtons;
    protected FeedLayout feedLayout;
    protected List<LayoutHeader> headers;
    protected List<LayoutSection> layoutSections;
    protected MiniLayout miniLayout;
    protected List<String> multilineLayoutFields;
    protected QuickActionListMetadata quickActionList;
    protected RelatedContent relatedContent;
    protected List<RelatedListItem> relatedLists;
    protected List<String> relatedObjects;
    protected Boolean runAssignmentRulesDefault;
    protected Boolean showEmailCheckbox;
    protected Boolean showHighlightsPanel;
    protected Boolean showInteractionLogPanel;
    protected Boolean showKnowledgeComponent;
    protected Boolean showRunAssignmentRulesCheckbox;
    protected Boolean showSolutionSection;
    protected Boolean showSubmitAndAttachButton;
    protected SummaryLayout summaryLayout;

    /**
     * Gets the value of the customButtons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customButtons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomButtons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomButtons() {
        if (customButtons == null) {
            customButtons = new ArrayList<String>();
        }
        return this.customButtons;
    }

    /**
     * Gets the value of the customConsoleComponents property.
     * 
     * @return
     *     possible object is
     *     {@link CustomConsoleComponents }
     *     
     */
    public CustomConsoleComponents getCustomConsoleComponents() {
        return customConsoleComponents;
    }

    /**
     * Sets the value of the customConsoleComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomConsoleComponents }
     *     
     */
    public void setCustomConsoleComponents(CustomConsoleComponents value) {
        this.customConsoleComponents = value;
    }

    /**
     * Gets the value of the emailDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailDefault() {
        return emailDefault;
    }

    /**
     * Sets the value of the emailDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailDefault(Boolean value) {
        this.emailDefault = value;
    }

    /**
     * Gets the value of the excludeButtons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeButtons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeButtons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeButtons() {
        if (excludeButtons == null) {
            excludeButtons = new ArrayList<String>();
        }
        return this.excludeButtons;
    }

    /**
     * Gets the value of the feedLayout property.
     * 
     * @return
     *     possible object is
     *     {@link FeedLayout }
     *     
     */
    public FeedLayout getFeedLayout() {
        return feedLayout;
    }

    /**
     * Sets the value of the feedLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedLayout }
     *     
     */
    public void setFeedLayout(FeedLayout value) {
        this.feedLayout = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutHeader }
     * 
     * 
     */
    public List<LayoutHeader> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<LayoutHeader>();
        }
        return this.headers;
    }

    /**
     * Gets the value of the layoutSections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutSections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutSection }
     * 
     * 
     */
    public List<LayoutSection> getLayoutSections() {
        if (layoutSections == null) {
            layoutSections = new ArrayList<LayoutSection>();
        }
        return this.layoutSections;
    }

    /**
     * Gets the value of the miniLayout property.
     * 
     * @return
     *     possible object is
     *     {@link MiniLayout }
     *     
     */
    public MiniLayout getMiniLayout() {
        return miniLayout;
    }

    /**
     * Sets the value of the miniLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiniLayout }
     *     
     */
    public void setMiniLayout(MiniLayout value) {
        this.miniLayout = value;
    }

    /**
     * Gets the value of the multilineLayoutFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multilineLayoutFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultilineLayoutFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMultilineLayoutFields() {
        if (multilineLayoutFields == null) {
            multilineLayoutFields = new ArrayList<String>();
        }
        return this.multilineLayoutFields;
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
     * {@link RelatedListItem }
     * 
     * 
     */
    public List<RelatedListItem> getRelatedLists() {
        if (relatedLists == null) {
            relatedLists = new ArrayList<RelatedListItem>();
        }
        return this.relatedLists;
    }

    /**
     * Gets the value of the relatedObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelatedObjects() {
        if (relatedObjects == null) {
            relatedObjects = new ArrayList<String>();
        }
        return this.relatedObjects;
    }

    /**
     * Gets the value of the runAssignmentRulesDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunAssignmentRulesDefault() {
        return runAssignmentRulesDefault;
    }

    /**
     * Sets the value of the runAssignmentRulesDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunAssignmentRulesDefault(Boolean value) {
        this.runAssignmentRulesDefault = value;
    }

    /**
     * Gets the value of the showEmailCheckbox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEmailCheckbox() {
        return showEmailCheckbox;
    }

    /**
     * Sets the value of the showEmailCheckbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEmailCheckbox(Boolean value) {
        this.showEmailCheckbox = value;
    }

    /**
     * Gets the value of the showHighlightsPanel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowHighlightsPanel() {
        return showHighlightsPanel;
    }

    /**
     * Sets the value of the showHighlightsPanel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowHighlightsPanel(Boolean value) {
        this.showHighlightsPanel = value;
    }

    /**
     * Gets the value of the showInteractionLogPanel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInteractionLogPanel() {
        return showInteractionLogPanel;
    }

    /**
     * Sets the value of the showInteractionLogPanel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInteractionLogPanel(Boolean value) {
        this.showInteractionLogPanel = value;
    }

    /**
     * Gets the value of the showKnowledgeComponent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowKnowledgeComponent() {
        return showKnowledgeComponent;
    }

    /**
     * Sets the value of the showKnowledgeComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowKnowledgeComponent(Boolean value) {
        this.showKnowledgeComponent = value;
    }

    /**
     * Gets the value of the showRunAssignmentRulesCheckbox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowRunAssignmentRulesCheckbox() {
        return showRunAssignmentRulesCheckbox;
    }

    /**
     * Sets the value of the showRunAssignmentRulesCheckbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowRunAssignmentRulesCheckbox(Boolean value) {
        this.showRunAssignmentRulesCheckbox = value;
    }

    /**
     * Gets the value of the showSolutionSection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSolutionSection() {
        return showSolutionSection;
    }

    /**
     * Sets the value of the showSolutionSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSolutionSection(Boolean value) {
        this.showSolutionSection = value;
    }

    /**
     * Gets the value of the showSubmitAndAttachButton property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSubmitAndAttachButton() {
        return showSubmitAndAttachButton;
    }

    /**
     * Sets the value of the showSubmitAndAttachButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSubmitAndAttachButton(Boolean value) {
        this.showSubmitAndAttachButton = value;
    }

    /**
     * Gets the value of the summaryLayout property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryLayout }
     *     
     */
    public SummaryLayout getSummaryLayout() {
        return summaryLayout;
    }

    /**
     * Sets the value of the summaryLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryLayout }
     *     
     */
    public void setSummaryLayout(SummaryLayout value) {
        this.summaryLayout = value;
    }

}
