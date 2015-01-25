
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeLayoutItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="editableForNew" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="editableForUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="layoutComponents" type="{urn:partner.soap.sforce.com}DescribeLayoutComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="placeholder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutItem", propOrder = {
    "editableForNew",
    "editableForUpdate",
    "label",
    "layoutComponents",
    "placeholder",
    "required"
})
public class DescribeLayoutItem {

    protected boolean editableForNew;
    protected boolean editableForUpdate;
    @XmlElement(required = true, nillable = true)
    protected String label;
    protected List<DescribeLayoutComponent> layoutComponents;
    protected boolean placeholder;
    protected boolean required;

    /**
     * Gets the value of the editableForNew property.
     * 
     */
    public boolean isEditableForNew() {
        return editableForNew;
    }

    /**
     * Sets the value of the editableForNew property.
     * 
     */
    public void setEditableForNew(boolean value) {
        this.editableForNew = value;
    }

    /**
     * Gets the value of the editableForUpdate property.
     * 
     */
    public boolean isEditableForUpdate() {
        return editableForUpdate;
    }

    /**
     * Sets the value of the editableForUpdate property.
     * 
     */
    public void setEditableForUpdate(boolean value) {
        this.editableForUpdate = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the layoutComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutComponent }
     * 
     * 
     */
    public List<DescribeLayoutComponent> getLayoutComponents() {
        if (layoutComponents == null) {
            layoutComponents = new ArrayList<DescribeLayoutComponent>();
        }
        return this.layoutComponents;
    }

    /**
     * Gets the value of the placeholder property.
     * 
     */
    public boolean isPlaceholder() {
        return placeholder;
    }

    /**
     * Sets the value of the placeholder property.
     * 
     */
    public void setPlaceholder(boolean value) {
        this.placeholder = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

}
