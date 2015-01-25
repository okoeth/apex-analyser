
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowScreenField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowScreenField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowElement">
 *       &lt;sequence>
 *         &lt;element name="choiceReferences" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataType" type="{urn:tooling.soap.sforce.com}FlowDataType" minOccurs="0"/>
 *         &lt;element name="defaultSelectedChoiceReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{urn:tooling.soap.sforce.com}FlowElementReferenceOrValue" minOccurs="0"/>
 *         &lt;element name="fieldText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldType" type="{urn:tooling.soap.sforce.com}FlowScreenFieldType"/>
 *         &lt;element name="helpText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="validationRule" type="{urn:tooling.soap.sforce.com}FlowInputValidationRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowScreenField", propOrder = {
    "choiceReferences",
    "dataType",
    "defaultSelectedChoiceReference",
    "defaultValue",
    "fieldText",
    "fieldType",
    "helpText",
    "isRequired",
    "scale",
    "validationRule"
})
public class FlowScreenField
    extends FlowElement
{

    protected List<String> choiceReferences;
    protected FlowDataType dataType;
    protected String defaultSelectedChoiceReference;
    protected FlowElementReferenceOrValue defaultValue;
    protected String fieldText;
    @XmlElement(required = true)
    protected FlowScreenFieldType fieldType;
    protected String helpText;
    protected Boolean isRequired;
    protected Integer scale;
    protected FlowInputValidationRule validationRule;

    /**
     * Gets the value of the choiceReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choiceReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoiceReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChoiceReferences() {
        if (choiceReferences == null) {
            choiceReferences = new ArrayList<String>();
        }
        return this.choiceReferences;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowDataType }
     *     
     */
    public FlowDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowDataType }
     *     
     */
    public void setDataType(FlowDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the defaultSelectedChoiceReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSelectedChoiceReference() {
        return defaultSelectedChoiceReference;
    }

    /**
     * Sets the value of the defaultSelectedChoiceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSelectedChoiceReference(String value) {
        this.defaultSelectedChoiceReference = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public FlowElementReferenceOrValue getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public void setDefaultValue(FlowElementReferenceOrValue value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the fieldText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldText() {
        return fieldText;
    }

    /**
     * Sets the value of the fieldText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldText(String value) {
        this.fieldText = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowScreenFieldType }
     *     
     */
    public FlowScreenFieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowScreenFieldType }
     *     
     */
    public void setFieldType(FlowScreenFieldType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * Gets the value of the validationRule property.
     * 
     * @return
     *     possible object is
     *     {@link FlowInputValidationRule }
     *     
     */
    public FlowInputValidationRule getValidationRule() {
        return validationRule;
    }

    /**
     * Sets the value of the validationRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowInputValidationRule }
     *     
     */
    public void setValidationRule(FlowInputValidationRule value) {
        this.validationRule = value;
    }

}
