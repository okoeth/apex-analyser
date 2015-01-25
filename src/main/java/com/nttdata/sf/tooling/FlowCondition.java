
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowBaseElement">
 *       &lt;sequence>
 *         &lt;element name="leftValueReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{urn:tooling.soap.sforce.com}FlowComparisonOperator"/>
 *         &lt;element name="rightValue" type="{urn:tooling.soap.sforce.com}FlowElementReferenceOrValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowCondition", propOrder = {
    "leftValueReference",
    "operator",
    "rightValue"
})
public class FlowCondition
    extends FlowBaseElement
{

    @XmlElement(required = true)
    protected String leftValueReference;
    @XmlElement(required = true)
    protected FlowComparisonOperator operator;
    protected FlowElementReferenceOrValue rightValue;

    /**
     * Gets the value of the leftValueReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftValueReference() {
        return leftValueReference;
    }

    /**
     * Sets the value of the leftValueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftValueReference(String value) {
        this.leftValueReference = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link FlowComparisonOperator }
     *     
     */
    public FlowComparisonOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowComparisonOperator }
     *     
     */
    public void setOperator(FlowComparisonOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the rightValue property.
     * 
     * @return
     *     possible object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public FlowElementReferenceOrValue getRightValue() {
        return rightValue;
    }

    /**
     * Sets the value of the rightValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public void setRightValue(FlowElementReferenceOrValue value) {
        this.rightValue = value;
    }

}
