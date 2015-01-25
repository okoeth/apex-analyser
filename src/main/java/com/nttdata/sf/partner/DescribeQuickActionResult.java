
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeQuickActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeQuickActionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessLevelRequired" type="{urn:partner.soap.sforce.com}ShareAccessLevel"/>
 *         &lt;element name="canvasApplicationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colors" type="{urn:partner.soap.sforce.com}DescribeColor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contextSobjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultValues" type="{urn:partner.soap.sforce.com}DescribeQuickActionDefaultValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iconName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="icons" type="{urn:partner.soap.sforce.com}DescribeIcon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="layout" type="{urn:partner.soap.sforce.com}DescribeLayoutSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="miniIconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetParentField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetRecordTypeId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="targetSobjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visualforcePageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeQuickActionResult", propOrder = {
    "accessLevelRequired",
    "canvasApplicationName",
    "colors",
    "contextSobjectType",
    "defaultValues",
    "height",
    "iconName",
    "iconUrl",
    "icons",
    "label",
    "layout",
    "miniIconUrl",
    "name",
    "targetParentField",
    "targetRecordTypeId",
    "targetSobjectType",
    "type",
    "visualforcePageName",
    "width"
})
public class DescribeQuickActionResult {

    @XmlElement(required = true, nillable = true)
    protected ShareAccessLevel accessLevelRequired;
    @XmlElement(required = true, nillable = true)
    protected String canvasApplicationName;
    protected List<DescribeColor> colors;
    @XmlElement(required = true, nillable = true)
    protected String contextSobjectType;
    @XmlElement(nillable = true)
    protected List<DescribeQuickActionDefaultValue> defaultValues;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer height;
    @XmlElement(required = true, nillable = true)
    protected String iconName;
    @XmlElement(required = true, nillable = true)
    protected String iconUrl;
    protected List<DescribeIcon> icons;
    @XmlElement(required = true)
    protected String label;
    protected List<DescribeLayoutSection> layout;
    @XmlElement(required = true, nillable = true)
    protected String miniIconUrl;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String targetParentField;
    @XmlElement(required = true, nillable = true)
    protected String targetRecordTypeId;
    @XmlElement(required = true, nillable = true)
    protected String targetSobjectType;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String visualforcePageName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer width;

    /**
     * Gets the value of the accessLevelRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevel }
     *     
     */
    public ShareAccessLevel getAccessLevelRequired() {
        return accessLevelRequired;
    }

    /**
     * Sets the value of the accessLevelRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevel }
     *     
     */
    public void setAccessLevelRequired(ShareAccessLevel value) {
        this.accessLevelRequired = value;
    }

    /**
     * Gets the value of the canvasApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvasApplicationName() {
        return canvasApplicationName;
    }

    /**
     * Sets the value of the canvasApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvasApplicationName(String value) {
        this.canvasApplicationName = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeColor }
     * 
     * 
     */
    public List<DescribeColor> getColors() {
        if (colors == null) {
            colors = new ArrayList<DescribeColor>();
        }
        return this.colors;
    }

    /**
     * Gets the value of the contextSobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextSobjectType() {
        return contextSobjectType;
    }

    /**
     * Sets the value of the contextSobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextSobjectType(String value) {
        this.contextSobjectType = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeQuickActionDefaultValue }
     * 
     * 
     */
    public List<DescribeQuickActionDefaultValue> getDefaultValues() {
        if (defaultValues == null) {
            defaultValues = new ArrayList<DescribeQuickActionDefaultValue>();
        }
        return this.defaultValues;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the iconName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconName() {
        return iconName;
    }

    /**
     * Sets the value of the iconName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconName(String value) {
        this.iconName = value;
    }

    /**
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrl(String value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the icons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeIcon }
     * 
     * 
     */
    public List<DescribeIcon> getIcons() {
        if (icons == null) {
            icons = new ArrayList<DescribeIcon>();
        }
        return this.icons;
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
     * Gets the value of the layout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutSection }
     * 
     * 
     */
    public List<DescribeLayoutSection> getLayout() {
        if (layout == null) {
            layout = new ArrayList<DescribeLayoutSection>();
        }
        return this.layout;
    }

    /**
     * Gets the value of the miniIconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiniIconUrl() {
        return miniIconUrl;
    }

    /**
     * Sets the value of the miniIconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiniIconUrl(String value) {
        this.miniIconUrl = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the targetParentField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetParentField() {
        return targetParentField;
    }

    /**
     * Sets the value of the targetParentField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetParentField(String value) {
        this.targetParentField = value;
    }

    /**
     * Gets the value of the targetRecordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRecordTypeId() {
        return targetRecordTypeId;
    }

    /**
     * Sets the value of the targetRecordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetRecordTypeId(String value) {
        this.targetRecordTypeId = value;
    }

    /**
     * Gets the value of the targetSobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSobjectType() {
        return targetSobjectType;
    }

    /**
     * Sets the value of the targetSobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSobjectType(String value) {
        this.targetSobjectType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the visualforcePageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualforcePageName() {
        return visualforcePageName;
    }

    /**
     * Sets the value of the visualforcePageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualforcePageName(String value) {
        this.visualforcePageName = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

}
