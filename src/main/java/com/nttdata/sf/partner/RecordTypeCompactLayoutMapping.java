
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordTypeCompactLayoutMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordTypeCompactLayoutMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="compactLayoutId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="compactLayoutName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordTypeId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="recordTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTypeCompactLayoutMapping", propOrder = {
    "available",
    "compactLayoutId",
    "compactLayoutName",
    "recordTypeId",
    "recordTypeName"
})
public class RecordTypeCompactLayoutMapping {

    protected boolean available;
    @XmlElement(required = true, nillable = true)
    protected String compactLayoutId;
    @XmlElement(required = true)
    protected String compactLayoutName;
    @XmlElement(required = true)
    protected String recordTypeId;
    @XmlElement(required = true)
    protected String recordTypeName;

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the compactLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompactLayoutId() {
        return compactLayoutId;
    }

    /**
     * Sets the value of the compactLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompactLayoutId(String value) {
        this.compactLayoutId = value;
    }

    /**
     * Gets the value of the compactLayoutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompactLayoutName() {
        return compactLayoutName;
    }

    /**
     * Sets the value of the compactLayoutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompactLayoutName(String value) {
        this.compactLayoutName = value;
    }

    /**
     * Gets the value of the recordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * Sets the value of the recordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeId(String value) {
        this.recordTypeId = value;
    }

    /**
     * Gets the value of the recordTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeName() {
        return recordTypeName;
    }

    /**
     * Sets the value of the recordTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeName(String value) {
        this.recordTypeName = value;
    }

}
