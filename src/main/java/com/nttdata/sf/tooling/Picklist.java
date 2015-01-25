
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Picklist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Picklist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controllingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="picklistValues" type="{urn:tooling.soap.sforce.com}PicklistValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sorted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Picklist", propOrder = {
    "controllingField",
    "picklistValues",
    "sorted"
})
public class Picklist {

    protected String controllingField;
    protected List<PicklistValue> picklistValues;
    protected boolean sorted;

    /**
     * Gets the value of the controllingField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllingField() {
        return controllingField;
    }

    /**
     * Sets the value of the controllingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllingField(String value) {
        this.controllingField = value;
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
     * {@link PicklistValue }
     * 
     * 
     */
    public List<PicklistValue> getPicklistValues() {
        if (picklistValues == null) {
            picklistValues = new ArrayList<PicklistValue>();
        }
        return this.picklistValues;
    }

    /**
     * Gets the value of the sorted property.
     * 
     */
    public boolean isSorted() {
        return sorted;
    }

    /**
     * Sets the value of the sorted property.
     * 
     */
    public void setSorted(boolean value) {
        this.sorted = value;
    }

}
