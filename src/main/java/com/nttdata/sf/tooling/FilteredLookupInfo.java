
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilteredLookupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilteredLookupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controllingFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dependent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="optionalFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilteredLookupInfo", propOrder = {
    "controllingFields",
    "dependent",
    "optionalFilter"
})
public class FilteredLookupInfo {

    protected List<String> controllingFields;
    protected boolean dependent;
    protected boolean optionalFilter;

    /**
     * Gets the value of the controllingFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controllingFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControllingFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getControllingFields() {
        if (controllingFields == null) {
            controllingFields = new ArrayList<String>();
        }
        return this.controllingFields;
    }

    /**
     * Gets the value of the dependent property.
     * 
     */
    public boolean isDependent() {
        return dependent;
    }

    /**
     * Sets the value of the dependent property.
     * 
     */
    public void setDependent(boolean value) {
        this.dependent = value;
    }

    /**
     * Gets the value of the optionalFilter property.
     * 
     */
    public boolean isOptionalFilter() {
        return optionalFilter;
    }

    /**
     * Sets the value of the optionalFilter property.
     * 
     */
    public void setOptionalFilter(boolean value) {
        this.optionalFilter = value;
    }

}
