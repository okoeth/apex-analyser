
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CompactLayouts" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="DefaultCompactLayout" type="{urn:tooling.soap.sforce.com}CompactLayoutInfo" minOccurs="0"/>
 *         &lt;element name="DefaultCompactLayoutId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fields" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsApexTriggerable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCompactLayoutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCustomizable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWorkflowEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{urn:tooling.soap.sforce.com}CustomObjectMetadata" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PluralLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualifiedApiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordTypes" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="WorkflowAlerts" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="WorkflowFieldUpdates" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="WorkflowOutboundMessages" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="WorkflowTasks" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityDefinition", propOrder = {
    "compactLayouts",
    "customFields",
    "defaultCompactLayout",
    "defaultCompactLayoutId",
    "developerName",
    "durableId",
    "fields",
    "fullName",
    "isApexTriggerable",
    "isCompactLayoutable",
    "isCustomizable",
    "isWorkflowEnabled",
    "label",
    "masterLabel",
    "metadata",
    "namespacePrefix",
    "pluralLabel",
    "qualifiedApiName",
    "recordTypes",
    "workflowAlerts",
    "workflowFieldUpdates",
    "workflowOutboundMessages",
    "workflowTasks"
})
public class EntityDefinition
    extends SObject
{

    @XmlElementRef(name = "CompactLayouts", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> compactLayouts;
    @XmlElementRef(name = "CustomFields", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> customFields;
    @XmlElementRef(name = "DefaultCompactLayout", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CompactLayoutInfo> defaultCompactLayout;
    @XmlElementRef(name = "DefaultCompactLayoutId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultCompactLayoutId;
    @XmlElementRef(name = "DeveloperName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> developerName;
    @XmlElementRef(name = "DurableId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> durableId;
    @XmlElementRef(name = "Fields", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> fields;
    @XmlElementRef(name = "FullName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullName;
    @XmlElementRef(name = "IsApexTriggerable", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isApexTriggerable;
    @XmlElementRef(name = "IsCompactLayoutable", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCompactLayoutable;
    @XmlElementRef(name = "IsCustomizable", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCustomizable;
    @XmlElementRef(name = "IsWorkflowEnabled", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isWorkflowEnabled;
    @XmlElementRef(name = "Label", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> label;
    @XmlElementRef(name = "MasterLabel", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterLabel;
    @XmlElementRef(name = "Metadata", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomObjectMetadata> metadata;
    @XmlElementRef(name = "NamespacePrefix", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namespacePrefix;
    @XmlElementRef(name = "PluralLabel", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pluralLabel;
    @XmlElementRef(name = "QualifiedApiName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qualifiedApiName;
    @XmlElementRef(name = "RecordTypes", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> recordTypes;
    @XmlElementRef(name = "WorkflowAlerts", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> workflowAlerts;
    @XmlElementRef(name = "WorkflowFieldUpdates", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> workflowFieldUpdates;
    @XmlElementRef(name = "WorkflowOutboundMessages", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> workflowOutboundMessages;
    @XmlElementRef(name = "WorkflowTasks", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> workflowTasks;

    /**
     * Gets the value of the compactLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getCompactLayouts() {
        return compactLayouts;
    }

    /**
     * Sets the value of the compactLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setCompactLayouts(JAXBElement<QueryResult> value) {
        this.compactLayouts = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setCustomFields(JAXBElement<QueryResult> value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the defaultCompactLayout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompactLayoutInfo }{@code >}
     *     
     */
    public JAXBElement<CompactLayoutInfo> getDefaultCompactLayout() {
        return defaultCompactLayout;
    }

    /**
     * Sets the value of the defaultCompactLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompactLayoutInfo }{@code >}
     *     
     */
    public void setDefaultCompactLayout(JAXBElement<CompactLayoutInfo> value) {
        this.defaultCompactLayout = value;
    }

    /**
     * Gets the value of the defaultCompactLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultCompactLayoutId() {
        return defaultCompactLayoutId;
    }

    /**
     * Sets the value of the defaultCompactLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultCompactLayoutId(JAXBElement<String> value) {
        this.defaultCompactLayoutId = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeveloperName(JAXBElement<String> value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the durableId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDurableId() {
        return durableId;
    }

    /**
     * Sets the value of the durableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDurableId(JAXBElement<String> value) {
        this.durableId = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setFields(JAXBElement<QueryResult> value) {
        this.fields = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullName(JAXBElement<String> value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the isApexTriggerable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsApexTriggerable() {
        return isApexTriggerable;
    }

    /**
     * Sets the value of the isApexTriggerable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsApexTriggerable(JAXBElement<Boolean> value) {
        this.isApexTriggerable = value;
    }

    /**
     * Gets the value of the isCompactLayoutable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCompactLayoutable() {
        return isCompactLayoutable;
    }

    /**
     * Sets the value of the isCompactLayoutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCompactLayoutable(JAXBElement<Boolean> value) {
        this.isCompactLayoutable = value;
    }

    /**
     * Gets the value of the isCustomizable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCustomizable() {
        return isCustomizable;
    }

    /**
     * Sets the value of the isCustomizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCustomizable(JAXBElement<Boolean> value) {
        this.isCustomizable = value;
    }

    /**
     * Gets the value of the isWorkflowEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsWorkflowEnabled() {
        return isWorkflowEnabled;
    }

    /**
     * Sets the value of the isWorkflowEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsWorkflowEnabled(JAXBElement<Boolean> value) {
        this.isWorkflowEnabled = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLabel(JAXBElement<String> value) {
        this.label = value;
    }

    /**
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterLabel(JAXBElement<String> value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomObjectMetadata }{@code >}
     *     
     */
    public JAXBElement<CustomObjectMetadata> getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomObjectMetadata }{@code >}
     *     
     */
    public void setMetadata(JAXBElement<CustomObjectMetadata> value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNamespacePrefix(JAXBElement<String> value) {
        this.namespacePrefix = value;
    }

    /**
     * Gets the value of the pluralLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPluralLabel() {
        return pluralLabel;
    }

    /**
     * Sets the value of the pluralLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPluralLabel(JAXBElement<String> value) {
        this.pluralLabel = value;
    }

    /**
     * Gets the value of the qualifiedApiName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQualifiedApiName() {
        return qualifiedApiName;
    }

    /**
     * Sets the value of the qualifiedApiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQualifiedApiName(JAXBElement<String> value) {
        this.qualifiedApiName = value;
    }

    /**
     * Gets the value of the recordTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getRecordTypes() {
        return recordTypes;
    }

    /**
     * Sets the value of the recordTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setRecordTypes(JAXBElement<QueryResult> value) {
        this.recordTypes = value;
    }

    /**
     * Gets the value of the workflowAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getWorkflowAlerts() {
        return workflowAlerts;
    }

    /**
     * Sets the value of the workflowAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setWorkflowAlerts(JAXBElement<QueryResult> value) {
        this.workflowAlerts = value;
    }

    /**
     * Gets the value of the workflowFieldUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getWorkflowFieldUpdates() {
        return workflowFieldUpdates;
    }

    /**
     * Sets the value of the workflowFieldUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setWorkflowFieldUpdates(JAXBElement<QueryResult> value) {
        this.workflowFieldUpdates = value;
    }

    /**
     * Gets the value of the workflowOutboundMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getWorkflowOutboundMessages() {
        return workflowOutboundMessages;
    }

    /**
     * Sets the value of the workflowOutboundMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setWorkflowOutboundMessages(JAXBElement<QueryResult> value) {
        this.workflowOutboundMessages = value;
    }

    /**
     * Gets the value of the workflowTasks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getWorkflowTasks() {
        return workflowTasks;
    }

    /**
     * Sets the value of the workflowTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setWorkflowTasks(JAXBElement<QueryResult> value) {
        this.workflowTasks = value;
    }

}
