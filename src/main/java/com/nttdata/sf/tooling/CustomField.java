
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityDefinition" type="{urn:tooling.soap.sforce.com}EntityDefinition" minOccurs="0"/>
 *         &lt;element name="EntityDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InlineHelpText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaskChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{urn:tooling.soap.sforce.com}CustomFieldMetadata" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelationshipLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SummaryOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TableEnumOrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomField", propOrder = {
    "createdDate",
    "defaultValue",
    "description",
    "developerName",
    "entityDefinition",
    "entityDefinitionId",
    "fullName",
    "inlineHelpText",
    "lastModifiedDate",
    "length",
    "maskChar",
    "maskType",
    "metadata",
    "namespacePrefix",
    "precision",
    "relationshipLabel",
    "scale",
    "summaryOperation",
    "tableEnumOrId"
})
public class CustomField
    extends SObject
{

    @XmlElementRef(name = "CreatedDate", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "DefaultValue", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultValue;
    @XmlElementRef(name = "Description", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DeveloperName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> developerName;
    @XmlElementRef(name = "EntityDefinition", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityDefinition> entityDefinition;
    @XmlElementRef(name = "EntityDefinitionId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityDefinitionId;
    @XmlElementRef(name = "FullName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullName;
    @XmlElementRef(name = "InlineHelpText", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inlineHelpText;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "Length", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> length;
    @XmlElementRef(name = "MaskChar", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maskChar;
    @XmlElementRef(name = "MaskType", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maskType;
    @XmlElementRef(name = "Metadata", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomFieldMetadata> metadata;
    @XmlElementRef(name = "NamespacePrefix", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namespacePrefix;
    @XmlElementRef(name = "Precision", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> precision;
    @XmlElementRef(name = "RelationshipLabel", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relationshipLabel;
    @XmlElementRef(name = "Scale", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scale;
    @XmlElementRef(name = "SummaryOperation", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summaryOperation;
    @XmlElementRef(name = "TableEnumOrId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tableEnumOrId;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultValue(JAXBElement<String> value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
     * Gets the value of the inlineHelpText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInlineHelpText() {
        return inlineHelpText;
    }

    /**
     * Sets the value of the inlineHelpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInlineHelpText(JAXBElement<String> value) {
        this.inlineHelpText = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLength(JAXBElement<Integer> value) {
        this.length = value;
    }

    /**
     * Gets the value of the maskChar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaskChar() {
        return maskChar;
    }

    /**
     * Sets the value of the maskChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaskChar(JAXBElement<String> value) {
        this.maskChar = value;
    }

    /**
     * Gets the value of the maskType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaskType() {
        return maskType;
    }

    /**
     * Sets the value of the maskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaskType(JAXBElement<String> value) {
        this.maskType = value;
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
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrecision(JAXBElement<Integer> value) {
        this.precision = value;
    }

    /**
     * Gets the value of the relationshipLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelationshipLabel() {
        return relationshipLabel;
    }

    /**
     * Sets the value of the relationshipLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelationshipLabel(JAXBElement<String> value) {
        this.relationshipLabel = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScale(JAXBElement<Integer> value) {
        this.scale = value;
    }

    /**
     * Gets the value of the summaryOperation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummaryOperation() {
        return summaryOperation;
    }

    /**
     * Sets the value of the summaryOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummaryOperation(JAXBElement<String> value) {
        this.summaryOperation = value;
    }

    /**
     * Gets the value of the tableEnumOrId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTableEnumOrId() {
        return tableEnumOrId;
    }

    /**
     * Sets the value of the tableEnumOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTableEnumOrId(JAXBElement<String> value) {
        this.tableEnumOrId = value;
    }

}
