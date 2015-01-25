
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFieldMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deleteConstraint" type="{urn:tooling.soap.sforce.com}DeleteConstraint" minOccurs="0"/>
 *         &lt;element name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="escapeMarkup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalDeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formulaTreatBlanksAs" type="{urn:tooling.soap.sforce.com}TreatBlanksAs" minOccurs="0"/>
 *         &lt;element name="inlineHelpText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isFilteringDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isNameField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSortingDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lookupFilter" type="{urn:tooling.soap.sforce.com}LookupFilter" minOccurs="0"/>
 *         &lt;element name="maskChar" type="{urn:tooling.soap.sforce.com}EncryptedFieldMaskChar" minOccurs="0"/>
 *         &lt;element name="maskType" type="{urn:tooling.soap.sforce.com}EncryptedFieldMaskType" minOccurs="0"/>
 *         &lt;element name="picklist" type="{urn:tooling.soap.sforce.com}Picklist" minOccurs="0"/>
 *         &lt;element name="populateExistingRows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="referenceTargetField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reparentableMasterDetail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="restrictedAdminField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startingNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="stripMarkup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="summarizedField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summaryForeignKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summaryOperation" type="{urn:tooling.soap.sforce.com}SummaryOperations" minOccurs="0"/>
 *         &lt;element name="trackFeedHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trackHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trackTrending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:tooling.soap.sforce.com}FieldType" minOccurs="0"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="visibleLines" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="writeRequiresMasterRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldMetadata", propOrder = {
    "caseSensitive",
    "customDataType",
    "defaultValue",
    "deleteConstraint",
    "deprecated",
    "description",
    "displayFormat",
    "escapeMarkup",
    "externalDeveloperName",
    "externalId",
    "formula",
    "formulaTreatBlanksAs",
    "inlineHelpText",
    "isFilteringDisabled",
    "isNameField",
    "isSortingDisabled",
    "label",
    "length",
    "lookupFilter",
    "maskChar",
    "maskType",
    "picklist",
    "populateExistingRows",
    "precision",
    "referenceTargetField",
    "referenceTo",
    "relationshipLabel",
    "relationshipName",
    "relationshipOrder",
    "reparentableMasterDetail",
    "required",
    "restrictedAdminField",
    "scale",
    "startingNumber",
    "stripMarkup",
    "summarizedField",
    "summaryForeignKey",
    "summaryOperation",
    "trackFeedHistory",
    "trackHistory",
    "trackTrending",
    "type",
    "unique",
    "visibleLines",
    "writeRequiresMasterRead"
})
public class CustomFieldMetadata
    extends Metadata
{

    protected Boolean caseSensitive;
    protected String customDataType;
    protected String defaultValue;
    protected DeleteConstraint deleteConstraint;
    protected Boolean deprecated;
    protected String description;
    protected String displayFormat;
    protected Boolean escapeMarkup;
    protected String externalDeveloperName;
    protected Boolean externalId;
    protected String formula;
    protected TreatBlanksAs formulaTreatBlanksAs;
    protected String inlineHelpText;
    protected Boolean isFilteringDisabled;
    protected Boolean isNameField;
    protected Boolean isSortingDisabled;
    protected String label;
    protected Integer length;
    protected LookupFilter lookupFilter;
    protected EncryptedFieldMaskChar maskChar;
    protected EncryptedFieldMaskType maskType;
    protected Picklist picklist;
    protected Boolean populateExistingRows;
    protected Integer precision;
    protected String referenceTargetField;
    protected String referenceTo;
    protected String relationshipLabel;
    protected String relationshipName;
    protected Integer relationshipOrder;
    protected Boolean reparentableMasterDetail;
    protected Boolean required;
    protected Boolean restrictedAdminField;
    protected Integer scale;
    protected Integer startingNumber;
    protected Boolean stripMarkup;
    protected String summarizedField;
    protected String summaryForeignKey;
    protected SummaryOperations summaryOperation;
    protected Boolean trackFeedHistory;
    protected Boolean trackHistory;
    protected Boolean trackTrending;
    protected FieldType type;
    protected Boolean unique;
    protected Integer visibleLines;
    protected Boolean writeRequiresMasterRead;

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the customDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDataType() {
        return customDataType;
    }

    /**
     * Sets the value of the customDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDataType(String value) {
        this.customDataType = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the deleteConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteConstraint }
     *     
     */
    public DeleteConstraint getDeleteConstraint() {
        return deleteConstraint;
    }

    /**
     * Sets the value of the deleteConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteConstraint }
     *     
     */
    public void setDeleteConstraint(DeleteConstraint value) {
        this.deleteConstraint = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

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
     * Gets the value of the displayFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFormat() {
        return displayFormat;
    }

    /**
     * Sets the value of the displayFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFormat(String value) {
        this.displayFormat = value;
    }

    /**
     * Gets the value of the escapeMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscapeMarkup() {
        return escapeMarkup;
    }

    /**
     * Sets the value of the escapeMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscapeMarkup(Boolean value) {
        this.escapeMarkup = value;
    }

    /**
     * Gets the value of the externalDeveloperName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDeveloperName() {
        return externalDeveloperName;
    }

    /**
     * Sets the value of the externalDeveloperName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDeveloperName(String value) {
        this.externalDeveloperName = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalId(Boolean value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the formulaTreatBlanksAs property.
     * 
     * @return
     *     possible object is
     *     {@link TreatBlanksAs }
     *     
     */
    public TreatBlanksAs getFormulaTreatBlanksAs() {
        return formulaTreatBlanksAs;
    }

    /**
     * Sets the value of the formulaTreatBlanksAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatBlanksAs }
     *     
     */
    public void setFormulaTreatBlanksAs(TreatBlanksAs value) {
        this.formulaTreatBlanksAs = value;
    }

    /**
     * Gets the value of the inlineHelpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineHelpText() {
        return inlineHelpText;
    }

    /**
     * Sets the value of the inlineHelpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineHelpText(String value) {
        this.inlineHelpText = value;
    }

    /**
     * Gets the value of the isFilteringDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFilteringDisabled() {
        return isFilteringDisabled;
    }

    /**
     * Sets the value of the isFilteringDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFilteringDisabled(Boolean value) {
        this.isFilteringDisabled = value;
    }

    /**
     * Gets the value of the isNameField property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNameField() {
        return isNameField;
    }

    /**
     * Sets the value of the isNameField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNameField(Boolean value) {
        this.isNameField = value;
    }

    /**
     * Gets the value of the isSortingDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSortingDisabled() {
        return isSortingDisabled;
    }

    /**
     * Sets the value of the isSortingDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSortingDisabled(Boolean value) {
        this.isSortingDisabled = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the lookupFilter property.
     * 
     * @return
     *     possible object is
     *     {@link LookupFilter }
     *     
     */
    public LookupFilter getLookupFilter() {
        return lookupFilter;
    }

    /**
     * Sets the value of the lookupFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupFilter }
     *     
     */
    public void setLookupFilter(LookupFilter value) {
        this.lookupFilter = value;
    }

    /**
     * Gets the value of the maskChar property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedFieldMaskChar }
     *     
     */
    public EncryptedFieldMaskChar getMaskChar() {
        return maskChar;
    }

    /**
     * Sets the value of the maskChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedFieldMaskChar }
     *     
     */
    public void setMaskChar(EncryptedFieldMaskChar value) {
        this.maskChar = value;
    }

    /**
     * Gets the value of the maskType property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedFieldMaskType }
     *     
     */
    public EncryptedFieldMaskType getMaskType() {
        return maskType;
    }

    /**
     * Sets the value of the maskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedFieldMaskType }
     *     
     */
    public void setMaskType(EncryptedFieldMaskType value) {
        this.maskType = value;
    }

    /**
     * Gets the value of the picklist property.
     * 
     * @return
     *     possible object is
     *     {@link Picklist }
     *     
     */
    public Picklist getPicklist() {
        return picklist;
    }

    /**
     * Sets the value of the picklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Picklist }
     *     
     */
    public void setPicklist(Picklist value) {
        this.picklist = value;
    }

    /**
     * Gets the value of the populateExistingRows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPopulateExistingRows() {
        return populateExistingRows;
    }

    /**
     * Sets the value of the populateExistingRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPopulateExistingRows(Boolean value) {
        this.populateExistingRows = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the referenceTargetField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTargetField() {
        return referenceTargetField;
    }

    /**
     * Sets the value of the referenceTargetField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTargetField(String value) {
        this.referenceTargetField = value;
    }

    /**
     * Gets the value of the referenceTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTo() {
        return referenceTo;
    }

    /**
     * Sets the value of the referenceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTo(String value) {
        this.referenceTo = value;
    }

    /**
     * Gets the value of the relationshipLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipLabel() {
        return relationshipLabel;
    }

    /**
     * Sets the value of the relationshipLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipLabel(String value) {
        this.relationshipLabel = value;
    }

    /**
     * Gets the value of the relationshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    /**
     * Gets the value of the relationshipOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelationshipOrder() {
        return relationshipOrder;
    }

    /**
     * Sets the value of the relationshipOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelationshipOrder(Integer value) {
        this.relationshipOrder = value;
    }

    /**
     * Gets the value of the reparentableMasterDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReparentableMasterDetail() {
        return reparentableMasterDetail;
    }

    /**
     * Sets the value of the reparentableMasterDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReparentableMasterDetail(Boolean value) {
        this.reparentableMasterDetail = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the restrictedAdminField property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedAdminField() {
        return restrictedAdminField;
    }

    /**
     * Sets the value of the restrictedAdminField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedAdminField(Boolean value) {
        this.restrictedAdminField = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * Gets the value of the startingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingNumber() {
        return startingNumber;
    }

    /**
     * Sets the value of the startingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingNumber(Integer value) {
        this.startingNumber = value;
    }

    /**
     * Gets the value of the stripMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStripMarkup() {
        return stripMarkup;
    }

    /**
     * Sets the value of the stripMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStripMarkup(Boolean value) {
        this.stripMarkup = value;
    }

    /**
     * Gets the value of the summarizedField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummarizedField() {
        return summarizedField;
    }

    /**
     * Sets the value of the summarizedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummarizedField(String value) {
        this.summarizedField = value;
    }

    /**
     * Gets the value of the summaryForeignKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryForeignKey() {
        return summaryForeignKey;
    }

    /**
     * Sets the value of the summaryForeignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryForeignKey(String value) {
        this.summaryForeignKey = value;
    }

    /**
     * Gets the value of the summaryOperation property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryOperations }
     *     
     */
    public SummaryOperations getSummaryOperation() {
        return summaryOperation;
    }

    /**
     * Sets the value of the summaryOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryOperations }
     *     
     */
    public void setSummaryOperation(SummaryOperations value) {
        this.summaryOperation = value;
    }

    /**
     * Gets the value of the trackFeedHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackFeedHistory() {
        return trackFeedHistory;
    }

    /**
     * Sets the value of the trackFeedHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackFeedHistory(Boolean value) {
        this.trackFeedHistory = value;
    }

    /**
     * Gets the value of the trackHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackHistory() {
        return trackHistory;
    }

    /**
     * Sets the value of the trackHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackHistory(Boolean value) {
        this.trackHistory = value;
    }

    /**
     * Gets the value of the trackTrending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackTrending() {
        return trackTrending;
    }

    /**
     * Sets the value of the trackTrending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackTrending(Boolean value) {
        this.trackTrending = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setType(FieldType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnique(Boolean value) {
        this.unique = value;
    }

    /**
     * Gets the value of the visibleLines property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisibleLines() {
        return visibleLines;
    }

    /**
     * Sets the value of the visibleLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisibleLines(Integer value) {
        this.visibleLines = value;
    }

    /**
     * Gets the value of the writeRequiresMasterRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWriteRequiresMasterRead() {
        return writeRequiresMasterRead;
    }

    /**
     * Sets the value of the writeRequiresMasterRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteRequiresMasterRead(Boolean value) {
        this.writeRequiresMasterRead = value;
    }

}
