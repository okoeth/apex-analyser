
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PicklistValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PicklistValue">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="allowEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controllingFieldValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="converted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cssExposed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecastCategory" type="{urn:tooling.soap.sforce.com}ForecastCategories" minOccurs="0"/>
 *         &lt;element name="highPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="probability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reverseRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="won" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PicklistValue", propOrder = {
    "allowEmail",
    "closed",
    "color",
    "controllingFieldValues",
    "converted",
    "cssExposed",
    "_default",
    "description",
    "forecastCategory",
    "highPriority",
    "probability",
    "reverseRole",
    "reviewed",
    "won"
})
public class PicklistValue
    extends Metadata
{

    protected Boolean allowEmail;
    protected Boolean closed;
    protected String color;
    protected List<String> controllingFieldValues;
    protected Boolean converted;
    protected Boolean cssExposed;
    @XmlElement(name = "default")
    protected boolean _default;
    protected String description;
    protected ForecastCategories forecastCategory;
    protected Boolean highPriority;
    protected Integer probability;
    protected String reverseRole;
    protected Boolean reviewed;
    protected Boolean won;

    /**
     * Gets the value of the allowEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowEmail() {
        return allowEmail;
    }

    /**
     * Sets the value of the allowEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowEmail(Boolean value) {
        this.allowEmail = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed(Boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the controllingFieldValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controllingFieldValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControllingFieldValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getControllingFieldValues() {
        if (controllingFieldValues == null) {
            controllingFieldValues = new ArrayList<String>();
        }
        return this.controllingFieldValues;
    }

    /**
     * Gets the value of the converted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConverted() {
        return converted;
    }

    /**
     * Sets the value of the converted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConverted(Boolean value) {
        this.converted = value;
    }

    /**
     * Gets the value of the cssExposed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCssExposed() {
        return cssExposed;
    }

    /**
     * Sets the value of the cssExposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCssExposed(Boolean value) {
        this.cssExposed = value;
    }

    /**
     * Gets the value of the default property.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
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
     * Gets the value of the forecastCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastCategories }
     *     
     */
    public ForecastCategories getForecastCategory() {
        return forecastCategory;
    }

    /**
     * Sets the value of the forecastCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastCategories }
     *     
     */
    public void setForecastCategory(ForecastCategories value) {
        this.forecastCategory = value;
    }

    /**
     * Gets the value of the highPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighPriority() {
        return highPriority;
    }

    /**
     * Sets the value of the highPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighPriority(Boolean value) {
        this.highPriority = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProbability(Integer value) {
        this.probability = value;
    }

    /**
     * Gets the value of the reverseRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseRole() {
        return reverseRole;
    }

    /**
     * Sets the value of the reverseRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseRole(String value) {
        this.reverseRole = value;
    }

    /**
     * Gets the value of the reviewed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviewed() {
        return reviewed;
    }

    /**
     * Sets the value of the reviewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviewed(Boolean value) {
        this.reviewed = value;
    }

    /**
     * Gets the value of the won property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWon() {
        return won;
    }

    /**
     * Sets the value of the won property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWon(Boolean value) {
        this.won = value;
    }

}
