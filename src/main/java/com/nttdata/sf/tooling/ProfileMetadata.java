
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="applicationVisibilities" type="{urn:tooling.soap.sforce.com}ProfileApplicationVisibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classAccesses" type="{urn:tooling.soap.sforce.com}ProfileApexClassAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customPermissions" type="{urn:tooling.soap.sforce.com}ProfileCustomPermissions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalDataSourceAccesses" type="{urn:tooling.soap.sforce.com}ProfileExternalDataSourceAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldPermissions" type="{urn:tooling.soap.sforce.com}ProfileFieldLevelSecurity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loginHours" type="{urn:tooling.soap.sforce.com}ProfileLoginHours" minOccurs="0"/>
 *         &lt;element name="loginIpRanges" type="{urn:tooling.soap.sforce.com}ProfileLoginIpRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objectPermissions" type="{urn:tooling.soap.sforce.com}ProfileObjectPermissions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageAccesses" type="{urn:tooling.soap.sforce.com}ProfileApexPageAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordTypeVisibilities" type="{urn:tooling.soap.sforce.com}ProfileRecordTypeVisibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tabVisibilities" type="{urn:tooling.soap.sforce.com}ProfileTabVisibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPermissions" type="{urn:tooling.soap.sforce.com}ProfileUserPermission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileMetadata", propOrder = {
    "applicationVisibilities",
    "classAccesses",
    "custom",
    "customPermissions",
    "description",
    "externalDataSourceAccesses",
    "fieldPermissions",
    "loginHours",
    "loginIpRanges",
    "objectPermissions",
    "pageAccesses",
    "recordTypeVisibilities",
    "tabVisibilities",
    "userLicense",
    "userPermissions"
})
public class ProfileMetadata
    extends Metadata
{

    protected List<ProfileApplicationVisibility> applicationVisibilities;
    protected List<ProfileApexClassAccess> classAccesses;
    protected Boolean custom;
    protected List<ProfileCustomPermissions> customPermissions;
    protected String description;
    protected List<ProfileExternalDataSourceAccess> externalDataSourceAccesses;
    protected List<ProfileFieldLevelSecurity> fieldPermissions;
    protected ProfileLoginHours loginHours;
    protected List<ProfileLoginIpRange> loginIpRanges;
    protected List<ProfileObjectPermissions> objectPermissions;
    protected List<ProfileApexPageAccess> pageAccesses;
    protected List<ProfileRecordTypeVisibility> recordTypeVisibilities;
    protected List<ProfileTabVisibility> tabVisibilities;
    protected String userLicense;
    protected List<ProfileUserPermission> userPermissions;

    /**
     * Gets the value of the applicationVisibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationVisibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationVisibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileApplicationVisibility }
     * 
     * 
     */
    public List<ProfileApplicationVisibility> getApplicationVisibilities() {
        if (applicationVisibilities == null) {
            applicationVisibilities = new ArrayList<ProfileApplicationVisibility>();
        }
        return this.applicationVisibilities;
    }

    /**
     * Gets the value of the classAccesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classAccesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassAccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileApexClassAccess }
     * 
     * 
     */
    public List<ProfileApexClassAccess> getClassAccesses() {
        if (classAccesses == null) {
            classAccesses = new ArrayList<ProfileApexClassAccess>();
        }
        return this.classAccesses;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustom(Boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the customPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileCustomPermissions }
     * 
     * 
     */
    public List<ProfileCustomPermissions> getCustomPermissions() {
        if (customPermissions == null) {
            customPermissions = new ArrayList<ProfileCustomPermissions>();
        }
        return this.customPermissions;
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
     * Gets the value of the externalDataSourceAccesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalDataSourceAccesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalDataSourceAccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileExternalDataSourceAccess }
     * 
     * 
     */
    public List<ProfileExternalDataSourceAccess> getExternalDataSourceAccesses() {
        if (externalDataSourceAccesses == null) {
            externalDataSourceAccesses = new ArrayList<ProfileExternalDataSourceAccess>();
        }
        return this.externalDataSourceAccesses;
    }

    /**
     * Gets the value of the fieldPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileFieldLevelSecurity }
     * 
     * 
     */
    public List<ProfileFieldLevelSecurity> getFieldPermissions() {
        if (fieldPermissions == null) {
            fieldPermissions = new ArrayList<ProfileFieldLevelSecurity>();
        }
        return this.fieldPermissions;
    }

    /**
     * Gets the value of the loginHours property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileLoginHours }
     *     
     */
    public ProfileLoginHours getLoginHours() {
        return loginHours;
    }

    /**
     * Sets the value of the loginHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileLoginHours }
     *     
     */
    public void setLoginHours(ProfileLoginHours value) {
        this.loginHours = value;
    }

    /**
     * Gets the value of the loginIpRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loginIpRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoginIpRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileLoginIpRange }
     * 
     * 
     */
    public List<ProfileLoginIpRange> getLoginIpRanges() {
        if (loginIpRanges == null) {
            loginIpRanges = new ArrayList<ProfileLoginIpRange>();
        }
        return this.loginIpRanges;
    }

    /**
     * Gets the value of the objectPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileObjectPermissions }
     * 
     * 
     */
    public List<ProfileObjectPermissions> getObjectPermissions() {
        if (objectPermissions == null) {
            objectPermissions = new ArrayList<ProfileObjectPermissions>();
        }
        return this.objectPermissions;
    }

    /**
     * Gets the value of the pageAccesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageAccesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageAccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileApexPageAccess }
     * 
     * 
     */
    public List<ProfileApexPageAccess> getPageAccesses() {
        if (pageAccesses == null) {
            pageAccesses = new ArrayList<ProfileApexPageAccess>();
        }
        return this.pageAccesses;
    }

    /**
     * Gets the value of the recordTypeVisibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTypeVisibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTypeVisibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileRecordTypeVisibility }
     * 
     * 
     */
    public List<ProfileRecordTypeVisibility> getRecordTypeVisibilities() {
        if (recordTypeVisibilities == null) {
            recordTypeVisibilities = new ArrayList<ProfileRecordTypeVisibility>();
        }
        return this.recordTypeVisibilities;
    }

    /**
     * Gets the value of the tabVisibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabVisibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabVisibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileTabVisibility }
     * 
     * 
     */
    public List<ProfileTabVisibility> getTabVisibilities() {
        if (tabVisibilities == null) {
            tabVisibilities = new ArrayList<ProfileTabVisibility>();
        }
        return this.tabVisibilities;
    }

    /**
     * Gets the value of the userLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLicense() {
        return userLicense;
    }

    /**
     * Sets the value of the userLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLicense(String value) {
        this.userLicense = value;
    }

    /**
     * Gets the value of the userPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileUserPermission }
     * 
     * 
     */
    public List<ProfileUserPermission> getUserPermissions() {
        if (userPermissions == null) {
            userPermissions = new ArrayList<ProfileUserPermission>();
        }
        return this.userPermissions;
    }

}
