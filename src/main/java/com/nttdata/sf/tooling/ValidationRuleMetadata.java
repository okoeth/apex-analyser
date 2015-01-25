
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationRuleMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationRuleMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorConditionFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorDisplayField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationRuleMetadata", propOrder = {
    "active",
    "description",
    "errorConditionFormula",
    "errorDisplayField",
    "errorMessage"
})
public class ValidationRuleMetadata
    extends Metadata
{

    protected boolean active;
    protected String description;
    @XmlElement(required = true)
    protected String errorConditionFormula;
    protected String errorDisplayField;
    @XmlElement(required = true)
    protected String errorMessage;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
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
     * Gets the value of the errorConditionFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorConditionFormula() {
        return errorConditionFormula;
    }

    /**
     * Sets the value of the errorConditionFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorConditionFormula(String value) {
        this.errorConditionFormula = value;
    }

    /**
     * Gets the value of the errorDisplayField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDisplayField() {
        return errorDisplayField;
    }

    /**
     * Sets the value of the errorDisplayField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDisplayField(String value) {
        this.errorDisplayField = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
