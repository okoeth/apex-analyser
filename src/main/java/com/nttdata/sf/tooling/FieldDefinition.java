
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CompactLayoutItems" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityDefinition" type="{urn:tooling.soap.sforce.com}EntityDefinition" minOccurs="0"/>
 *         &lt;element name="EntityDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCompactLayoutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWorkflowFilterable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{urn:tooling.soap.sforce.com}CustomFieldMetadata" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualifiedApiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkflowFieldUpdates" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDefinition", propOrder = {
    "compactLayoutItems",
    "developerName",
    "durableId",
    "entityDefinition",
    "entityDefinitionId",
    "fullName",
    "isCompactLayoutable",
    "isWorkflowFilterable",
    "label",
    "masterLabel",
    "metadata",
    "namespacePrefix",
    "qualifiedApiName",
    "workflowFieldUpdates"
})
public class FieldDefinition
    extends SObject
{

    @XmlElementRef(name = "CompactLayoutItems", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> compactLayoutItems;
    @XmlElementRef(name = "DeveloperName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> developerName;
    @XmlElementRef(name = "DurableId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> durableId;
    @XmlElementRef(name = "EntityDefinition", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityDefinition> entityDefinition;
    @XmlElementRef(name = "EntityDefinitionId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityDefinitionId;
    @XmlElementRef(name = "FullName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullName;
    @XmlElementRef(name = "IsCompactLayoutable", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCompactLayoutable;
    @XmlElementRef(name = "IsWorkflowFilterable", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isWorkflowFilterable;
    @XmlElementRef(name = "Label", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> label;
    @XmlElementRef(name = "MasterLabel", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterLabel;
    @XmlElementRef(name = "Metadata", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomFieldMetadata> metadata;
    @XmlElementRef(name = "NamespacePrefix", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namespacePrefix;
    @XmlElementRef(name = "QualifiedApiName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qualifiedApiName;
    @XmlElementRef(name = "WorkflowFieldUpdates", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> workflowFieldUpdates;

    /**
     * Gets the value of the compactLayoutItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getCompactLayoutItems() {
        return compactLayoutItems;
    }

    /**
     * Sets the value of the compactLayoutItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setCompactLayoutItems(JAXBElement<QueryResult> value) {
        this.compactLayoutItems = value;
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
     * Gets the value of the entityDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}
     *     
     */
    public JAXBElement<EntityDefinition> getEntityDefinition() {
        return entityDefinition;
    }

    /**
     * Sets the value of the entityDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityDefinition }{@code >}
     *     
     */
    public void setEntityDefinition(JAXBElement<EntityDefinition> value) {
        this.entityDefinition = value;
    }

    /**
     * Gets the value of the entityDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityDefinitionId() {
        return entityDefinitionId;
    }

    /**
     * Sets the value of the entityDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityDefinitionId(JAXBElement<String> value) {
        this.entityDefinitionId = value;
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
     * Gets the value of the isWorkflowFilterable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsWorkflowFilterable() {
        return isWorkflowFilterable;
    }

    /**
     * Sets the value of the isWorkflowFilterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsWorkflowFilterable(JAXBElement<Boolean> value) {
        this.isWorkflowFilterable = value;
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
     *     {@link JAXBElement }{@code <}{@link CustomFieldMetadata }{@code >}
     *     
     */
    public JAXBElement<CustomFieldMetadata> getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomFieldMetadata }{@code >}
     *     
     */
    public void setMetadata(JAXBElement<CustomFieldMetadata> value) {
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

}
