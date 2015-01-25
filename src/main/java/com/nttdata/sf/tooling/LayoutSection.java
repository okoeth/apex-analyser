
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutSection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="detailHeading" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="editHeading" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="layoutColumns" type="{urn:tooling.soap.sforce.com}LayoutColumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="style" type="{urn:tooling.soap.sforce.com}LayoutSectionStyle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutSection", propOrder = {
    "customLabel",
    "detailHeading",
    "editHeading",
    "label",
    "layoutColumns",
    "style"
})
public class LayoutSection {

    protected Boolean customLabel;
    protected Boolean detailHeading;
    protected Boolean editHeading;
    protected String label;
    protected List<LayoutColumn> layoutColumns;
    @XmlElement(required = true)
    protected LayoutSectionStyle style;

    /**
     * Gets the value of the customLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomLabel() {
        return customLabel;
    }

    /**
     * Sets the value of the customLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomLabel(Boolean value) {
        this.customLabel = value;
    }

    /**
     * Gets the value of the detailHeading property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailHeading() {
        return detailHeading;
    }

    /**
     * Sets the value of the detailHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailHeading(Boolean value) {
        this.detailHeading = value;
    }

    /**
     * Gets the value of the editHeading property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditHeading() {
        return editHeading;
    }

    /**
     * Sets the value of the editHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditHeading(Boolean value) {
        this.editHeading = value;
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
     * Gets the value of the layoutColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutColumn }
     * 
     * 
     */
    public List<LayoutColumn> getLayoutColumns() {
        if (layoutColumns == null) {
            layoutColumns = new ArrayList<LayoutColumn>();
        }
        return this.layoutColumns;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link LayoutSectionStyle }
     *     
     */
    public LayoutSectionStyle getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutSectionStyle }
     *     
     */
    public void setStyle(LayoutSectionStyle value) {
        this.style = value;
    }

}
