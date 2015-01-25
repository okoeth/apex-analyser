
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListViewColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListViewColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ascendingLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descendingLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldNameOrPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectListItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sortDirection" type="{urn:partner.soap.sforce.com}orderByDirection"/>
 *         &lt;element name="sortIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sortable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="type" type="{urn:partner.soap.sforce.com}fieldType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListViewColumn", propOrder = {
    "ascendingLabel",
    "descendingLabel",
    "fieldNameOrPath",
    "hidden",
    "label",
    "selectListItem",
    "sortDirection",
    "sortIndex",
    "sortable",
    "type"
})
public class ListViewColumn {

    @XmlElement(required = true, nillable = true)
    protected String ascendingLabel;
    @XmlElement(required = true, nillable = true)
    protected String descendingLabel;
    @XmlElement(required = true)
    protected String fieldNameOrPath;
    protected boolean hidden;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String selectListItem;
    @XmlElement(required = true, nillable = true)
    protected OrderByDirection sortDirection;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sortIndex;
    protected boolean sortable;
    @XmlElement(required = true)
    protected FieldType type;

    /**
     * Gets the value of the ascendingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAscendingLabel() {
        return ascendingLabel;
    }

    /**
     * Sets the value of the ascendingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAscendingLabel(String value) {
        this.ascendingLabel = value;
    }

    /**
     * Gets the value of the descendingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescendingLabel() {
        return descendingLabel;
    }

    /**
     * Sets the value of the descendingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescendingLabel(String value) {
        this.descendingLabel = value;
    }

    /**
     * Gets the value of the fieldNameOrPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldNameOrPath() {
        return fieldNameOrPath;
    }

    /**
     * Sets the value of the fieldNameOrPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldNameOrPath(String value) {
        this.fieldNameOrPath = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
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
     * Gets the value of the selectListItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectListItem() {
        return selectListItem;
    }

    /**
     * Sets the value of the selectListItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectListItem(String value) {
        this.selectListItem = value;
    }

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByDirection }
     *     
     */
    public OrderByDirection getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByDirection }
     *     
     */
    public void setSortDirection(OrderByDirection value) {
        this.sortDirection = value;
    }

    /**
     * Gets the value of the sortIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortIndex() {
        return sortIndex;
    }

    /**
     * Sets the value of the sortIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortIndex(Integer value) {
        this.sortIndex = value;
    }

    /**
     * Gets the value of the sortable property.
     * 
     */
    public boolean isSortable() {
        return sortable;
    }

    /**
     * Sets the value of the sortable property.
     * 
     */
    public void setSortable(boolean value) {
        this.sortable = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setType(FieldType value) {
        this.type = value;
    }

}
