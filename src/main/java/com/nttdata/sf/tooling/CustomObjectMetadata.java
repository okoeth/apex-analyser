
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomObjectMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomObjectMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="compactLayoutAssignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customHelp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customHelpPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customSettingsType" type="{urn:tooling.soap.sforce.com}CustomSettingsType" minOccurs="0"/>
 *         &lt;element name="customSettingsVisibility" type="{urn:tooling.soap.sforce.com}CustomSettingsVisibility" minOccurs="0"/>
 *         &lt;element name="deploymentStatus" type="{urn:tooling.soap.sforce.com}DeploymentStatus" minOccurs="0"/>
 *         &lt;element name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableActivities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableBulkApi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableDivisions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableEnhancedLookup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSharing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableStreamingApi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalRepository" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalSharingModel" type="{urn:tooling.soap.sforce.com}SharingModel" minOccurs="0"/>
 *         &lt;element name="gender" type="{urn:tooling.soap.sforce.com}Gender" minOccurs="0"/>
 *         &lt;element name="household" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluralLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordTypeTrackHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sharingModel" type="{urn:tooling.soap.sforce.com}SharingModel" minOccurs="0"/>
 *         &lt;element name="startsWith" type="{urn:tooling.soap.sforce.com}StartsWith" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomObjectMetadata", propOrder = {
    "compactLayoutAssignment",
    "customHelp",
    "customHelpPage",
    "customSettingsType",
    "customSettingsVisibility",
    "deploymentStatus",
    "deprecated",
    "description",
    "enableActivities",
    "enableBulkApi",
    "enableDivisions",
    "enableEnhancedLookup",
    "enableFeeds",
    "enableHistory",
    "enableReports",
    "enableSharing",
    "enableStreamingApi",
    "externalDataSource",
    "externalName",
    "externalRepository",
    "externalSharingModel",
    "gender",
    "household",
    "label",
    "pluralLabel",
    "recordTypeTrackHistory",
    "sharingModel",
    "startsWith"
})
public class CustomObjectMetadata
    extends Metadata
{

    protected String compactLayoutAssignment;
    protected String customHelp;
    protected String customHelpPage;
    protected CustomSettingsType customSettingsType;
    protected CustomSettingsVisibility customSettingsVisibility;
    protected DeploymentStatus deploymentStatus;
    protected Boolean deprecated;
    protected String description;
    protected Boolean enableActivities;
    protected Boolean enableBulkApi;
    protected Boolean enableDivisions;
    protected Boolean enableEnhancedLookup;
    protected Boolean enableFeeds;
    protected Boolean enableHistory;
    protected Boolean enableReports;
    protected Boolean enableSharing;
    protected Boolean enableStreamingApi;
    protected String externalDataSource;
    protected String externalName;
    protected String externalRepository;
    protected SharingModel externalSharingModel;
    protected Gender gender;
    protected Boolean household;
    protected String label;
    protected String pluralLabel;
    protected Boolean recordTypeTrackHistory;
    protected SharingModel sharingModel;
    protected StartsWith startsWith;

    /**
     * Gets the value of the compactLayoutAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompactLayoutAssignment() {
        return compactLayoutAssignment;
    }

    /**
     * Sets the value of the compactLayoutAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompactLayoutAssignment(String value) {
        this.compactLayoutAssignment = value;
    }

    /**
     * Gets the value of the customHelp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHelp() {
        return customHelp;
    }

    /**
     * Sets the value of the customHelp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomHelp(String value) {
        this.customHelp = value;
    }

    /**
     * Gets the value of the customHelpPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHelpPage() {
        return customHelpPage;
    }

    /**
     * Sets the value of the customHelpPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomHelpPage(String value) {
        this.customHelpPage = value;
    }

    /**
     * Gets the value of the customSettingsType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSettingsType }
     *     
     */
    public CustomSettingsType getCustomSettingsType() {
        return customSettingsType;
    }

    /**
     * Sets the value of the customSettingsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSettingsType }
     *     
     */
    public void setCustomSettingsType(CustomSettingsType value) {
        this.customSettingsType = value;
    }

    /**
     * Gets the value of the customSettingsVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSettingsVisibility }
     *     
     */
    public CustomSettingsVisibility getCustomSettingsVisibility() {
        return customSettingsVisibility;
    }

    /**
     * Sets the value of the customSettingsVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSettingsVisibility }
     *     
     */
    public void setCustomSettingsVisibility(CustomSettingsVisibility value) {
        this.customSettingsVisibility = value;
    }

    /**
     * Gets the value of the deploymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentStatus }
     *     
     */
    public DeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }

    /**
     * Sets the value of the deploymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentStatus }
     *     
     */
    public void setDeploymentStatus(DeploymentStatus value) {
        this.deploymentStatus = value;
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
     * Gets the value of the enableActivities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableActivities() {
        return enableActivities;
    }

    /**
     * Sets the value of the enableActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableActivities(Boolean value) {
        this.enableActivities = value;
    }

    /**
     * Gets the value of the enableBulkApi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableBulkApi() {
        return enableBulkApi;
    }

    /**
     * Sets the value of the enableBulkApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableBulkApi(Boolean value) {
        this.enableBulkApi = value;
    }

    /**
     * Gets the value of the enableDivisions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDivisions() {
        return enableDivisions;
    }

    /**
     * Sets the value of the enableDivisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDivisions(Boolean value) {
        this.enableDivisions = value;
    }

    /**
     * Gets the value of the enableEnhancedLookup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEnhancedLookup() {
        return enableEnhancedLookup;
    }

    /**
     * Sets the value of the enableEnhancedLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEnhancedLookup(Boolean value) {
        this.enableEnhancedLookup = value;
    }

    /**
     * Gets the value of the enableFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableFeeds() {
        return enableFeeds;
    }

    /**
     * Sets the value of the enableFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableFeeds(Boolean value) {
        this.enableFeeds = value;
    }

    /**
     * Gets the value of the enableHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHistory() {
        return enableHistory;
    }

    /**
     * Sets the value of the enableHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHistory(Boolean value) {
        this.enableHistory = value;
    }

    /**
     * Gets the value of the enableReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableReports() {
        return enableReports;
    }

    /**
     * Sets the value of the enableReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableReports(Boolean value) {
        this.enableReports = value;
    }

    /**
     * Gets the value of the enableSharing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSharing() {
        return enableSharing;
    }

    /**
     * Sets the value of the enableSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSharing(Boolean value) {
        this.enableSharing = value;
    }

    /**
     * Gets the value of the enableStreamingApi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableStreamingApi() {
        return enableStreamingApi;
    }

    /**
     * Sets the value of the enableStreamingApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableStreamingApi(Boolean value) {
        this.enableStreamingApi = value;
    }

    /**
     * Gets the value of the externalDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDataSource() {
        return externalDataSource;
    }

    /**
     * Sets the value of the externalDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDataSource(String value) {
        this.externalDataSource = value;
    }

    /**
     * Gets the value of the externalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalName() {
        return externalName;
    }

    /**
     * Sets the value of the externalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalName(String value) {
        this.externalName = value;
    }

    /**
     * Gets the value of the externalRepository property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRepository() {
        return externalRepository;
    }

    /**
     * Sets the value of the externalRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRepository(String value) {
        this.externalRepository = value;
    }

    /**
     * Gets the value of the externalSharingModel property.
     * 
     * @return
     *     possible object is
     *     {@link SharingModel }
     *     
     */
    public SharingModel getExternalSharingModel() {
        return externalSharingModel;
    }

    /**
     * Sets the value of the externalSharingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingModel }
     *     
     */
    public void setExternalSharingModel(SharingModel value) {
        this.externalSharingModel = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the household property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHousehold() {
        return household;
    }

    /**
     * Sets the value of the household property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHousehold(Boolean value) {
        this.household = value;
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
     * Gets the value of the pluralLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralLabel() {
        return pluralLabel;
    }

    /**
     * Sets the value of the pluralLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralLabel(String value) {
        this.pluralLabel = value;
    }

    /**
     * Gets the value of the recordTypeTrackHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordTypeTrackHistory() {
        return recordTypeTrackHistory;
    }

    /**
     * Sets the value of the recordTypeTrackHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordTypeTrackHistory(Boolean value) {
        this.recordTypeTrackHistory = value;
    }

    /**
     * Gets the value of the sharingModel property.
     * 
     * @return
     *     possible object is
     *     {@link SharingModel }
     *     
     */
    public SharingModel getSharingModel() {
        return sharingModel;
    }

    /**
     * Sets the value of the sharingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingModel }
     *     
     */
    public void setSharingModel(SharingModel value) {
        this.sharingModel = value;
    }

    /**
     * Gets the value of the startsWith property.
     * 
     * @return
     *     possible object is
     *     {@link StartsWith }
     *     
     */
    public StartsWith getStartsWith() {
        return startsWith;
    }

    /**
     * Sets the value of the startsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartsWith }
     *     
     */
    public void setStartsWith(StartsWith value) {
        this.startsWith = value;
    }

}
