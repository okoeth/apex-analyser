
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueTypeField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueTypeField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foreignKeyDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isForeignKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isNameField" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minOccurs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="picklistValues" type="{urn:tooling.soap.sforce.com}PicklistEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soapType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueTypeField", propOrder = {
    "foreignKeyDomain",
    "isForeignKey",
    "isNameField",
    "minOccurs",
    "name",
    "picklistValues",
    "soapType"
})
public class ValueTypeField {

    protected List<String> foreignKeyDomain;
    protected boolean isForeignKey;
    protected boolean isNameField;
    protected int minOccurs;
    @XmlElement(required = true)
    protected String name;
    protected List<PicklistEntry> picklistValues;
    @XmlElement(required = true)
    protected String soapType;

    /**
     * Gets the value of the foreignKeyDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreignKeyDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignKeyDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getForeignKeyDomain() {
        if (foreignKeyDomain == null) {
            foreignKeyDomain = new ArrayList<String>();
        }
        return this.foreignKeyDomain;
    }

    /**
     * Gets the value of the isForeignKey property.
     * 
     */
    public boolean isIsForeignKey() {
        return isForeignKey;
    }

    /**
     * Sets the value of the isForeignKey property.
     * 
     */
    public void setIsForeignKey(boolean value) {
        this.isForeignKey = value;
    }

    /**
     * Gets the value of the isNameField property.
     * 
     */
    public boolean isIsNameField() {
        return isNameField;
    }

    /**
     * Sets the value of the isNameField property.
     * 
     */
    public void setIsNameField(boolean value) {
        this.isNameField = value;
    }

    /**
     * Gets the value of the minOccurs property.
     * 
     */
    public int getMinOccurs() {
        return minOccurs;
    }

    /**
     * Sets the value of the minOccurs property.
     * 
     */
    public void setMinOccurs(int value) {
        this.minOccurs = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the picklistValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picklistValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicklistValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistEntry }
     * 
     * 
     */
    public List<PicklistEntry> getPicklistValues() {
        if (picklistValues == null) {
            picklistValues = new ArrayList<PicklistEntry>();
        }
        return this.picklistValues;
    }

    /**
     * Gets the value of the soapType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoapType() {
        return soapType;
    }

    /**
     * Sets the value of the soapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoapType(String value) {
        this.soapType = value;
    }

}
