
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileObjectPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileObjectPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="modifyAllRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="object" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewAllRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileObjectPermissions", propOrder = {
    "allowCreate",
    "allowDelete",
    "allowEdit",
    "allowRead",
    "modifyAllRecords",
    "object",
    "viewAllRecords"
})
public class ProfileObjectPermissions {

    protected Boolean allowCreate;
    protected Boolean allowDelete;
    protected Boolean allowEdit;
    protected Boolean allowRead;
    protected Boolean modifyAllRecords;
    @XmlElement(required = true)
    protected String object;
    protected Boolean viewAllRecords;

    /**
     * Gets the value of the allowCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCreate() {
        return allowCreate;
    }

    /**
     * Sets the value of the allowCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCreate(Boolean value) {
        this.allowCreate = value;
    }

    /**
     * Gets the value of the allowDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDelete() {
        return allowDelete;
    }

    /**
     * Sets the value of the allowDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDelete(Boolean value) {
        this.allowDelete = value;
    }

    /**
     * Gets the value of the allowEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowEdit() {
        return allowEdit;
    }

    /**
     * Sets the value of the allowEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowEdit(Boolean value) {
        this.allowEdit = value;
    }

    /**
     * Gets the value of the allowRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowRead() {
        return allowRead;
    }

    /**
     * Sets the value of the allowRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowRead(Boolean value) {
        this.allowRead = value;
    }

    /**
     * Gets the value of the modifyAllRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifyAllRecords() {
        return modifyAllRecords;
    }

    /**
     * Sets the value of the modifyAllRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifyAllRecords(Boolean value) {
        this.modifyAllRecords = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
    }

    /**
     * Gets the value of the viewAllRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewAllRecords() {
        return viewAllRecords;
    }

    /**
     * Sets the value of the viewAllRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewAllRecords(Boolean value) {
        this.viewAllRecords = value;
    }

}
