
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileLoginHours complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileLoginHours">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fridayEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fridayStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mondayEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mondayStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saturdayEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saturdayStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sundayEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sundayStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thursdayEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thursdayStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuesdayEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuesdayStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wednesdayEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wednesdayStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileLoginHours", propOrder = {
    "fridayEnd",
    "fridayStart",
    "mondayEnd",
    "mondayStart",
    "saturdayEnd",
    "saturdayStart",
    "sundayEnd",
    "sundayStart",
    "thursdayEnd",
    "thursdayStart",
    "tuesdayEnd",
    "tuesdayStart",
    "wednesdayEnd",
    "wednesdayStart"
})
public class ProfileLoginHours {

    protected String fridayEnd;
    protected String fridayStart;
    protected String mondayEnd;
    protected String mondayStart;
    protected String saturdayEnd;
    protected String saturdayStart;
    protected String sundayEnd;
    protected String sundayStart;
    protected String thursdayEnd;
    protected String thursdayStart;
    protected String tuesdayEnd;
    protected String tuesdayStart;
    protected String wednesdayEnd;
    protected String wednesdayStart;

    /**
     * Gets the value of the fridayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFridayEnd() {
        return fridayEnd;
    }

    /**
     * Sets the value of the fridayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFridayEnd(String value) {
        this.fridayEnd = value;
    }

    /**
     * Gets the value of the fridayStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFridayStart() {
        return fridayStart;
    }

    /**
     * Sets the value of the fridayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFridayStart(String value) {
        this.fridayStart = value;
    }

    /**
     * Gets the value of the mondayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMondayEnd() {
        return mondayEnd;
    }

    /**
     * Sets the value of the mondayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMondayEnd(String value) {
        this.mondayEnd = value;
    }

    /**
     * Gets the value of the mondayStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMondayStart() {
        return mondayStart;
    }

    /**
     * Sets the value of the mondayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMondayStart(String value) {
        this.mondayStart = value;
    }

    /**
     * Gets the value of the saturdayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayEnd() {
        return saturdayEnd;
    }

    /**
     * Sets the value of the saturdayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayEnd(String value) {
        this.saturdayEnd = value;
    }

    /**
     * Gets the value of the saturdayStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayStart() {
        return saturdayStart;
    }

    /**
     * Sets the value of the saturdayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayStart(String value) {
        this.saturdayStart = value;
    }

    /**
     * Gets the value of the sundayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSundayEnd() {
        return sundayEnd;
    }

    /**
     * Sets the value of the sundayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSundayEnd(String value) {
        this.sundayEnd = value;
    }

    /**
     * Gets the value of the sundayStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSundayStart() {
        return sundayStart;
    }

    /**
     * Sets the value of the sundayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSundayStart(String value) {
        this.sundayStart = value;
    }

    /**
     * Gets the value of the thursdayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThursdayEnd() {
        return thursdayEnd;
    }

    /**
     * Sets the value of the thursdayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThursdayEnd(String value) {
        this.thursdayEnd = value;
    }

    /**
     * Gets the value of the thursdayStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThursdayStart() {
        return thursdayStart;
    }

    /**
     * Sets the value of the thursdayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThursdayStart(String value) {
        this.thursdayStart = value;
    }

    /**
     * Gets the value of the tuesdayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuesdayEnd() {
        return tuesdayEnd;
    }

    /**
     * Sets the value of the tuesdayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuesdayEnd(String value) {
        this.tuesdayEnd = value;
    }

    /**
     * Gets the value of the tuesdayStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuesdayStart() {
        return tuesdayStart;
    }

    /**
     * Sets the value of the tuesdayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuesdayStart(String value) {
        this.tuesdayStart = value;
    }

    /**
     * Gets the value of the wednesdayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWednesdayEnd() {
        return wednesdayEnd;
    }

    /**
     * Sets the value of the wednesdayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWednesdayEnd(String value) {
        this.wednesdayEnd = value;
    }

    /**
     * Gets the value of the wednesdayStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWednesdayStart() {
        return wednesdayStart;
    }

    /**
     * Sets the value of the wednesdayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWednesdayStart(String value) {
        this.wednesdayStart = value;
    }

}
