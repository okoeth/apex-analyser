
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickActionTemplateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickActionTemplateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultValueFormulas" type="{urn:sobject.partner.soap.sforce.com}sObject"/>
 *         &lt;element name="defaultValues" type="{urn:sobject.partner.soap.sforce.com}sObject"/>
 *         &lt;element name="errors" type="{urn:partner.soap.sforce.com}Error" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickActionTemplateResult", propOrder = {
    "defaultValueFormulas",
    "defaultValues",
    "errors",
    "success"
})
public class QuickActionTemplateResult {

    @XmlElement(required = true, nillable = true)
    protected SObject defaultValueFormulas;
    @XmlElement(required = true, nillable = true)
    protected SObject defaultValues;
    protected List<Error> errors;
    protected boolean success;

    /**
     * Gets the value of the defaultValueFormulas property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getDefaultValueFormulas() {
        return defaultValueFormulas;
    }

    /**
     * Sets the value of the defaultValueFormulas property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setDefaultValueFormulas(SObject value) {
        this.defaultValueFormulas = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getDefaultValues() {
        return defaultValues;
    }

    /**
     * Sets the value of the defaultValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setDefaultValues(SObject value) {
        this.defaultValues = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getErrors() {
        if (errors == null) {
            errors = new ArrayList<Error>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
