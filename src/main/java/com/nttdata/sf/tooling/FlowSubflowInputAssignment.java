
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowSubflowInputAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowSubflowInputAssignment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowBaseElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{urn:tooling.soap.sforce.com}FlowElementReferenceOrValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowSubflowInputAssignment", propOrder = {
    "name",
    "value"
})
public class FlowSubflowInputAssignment
    extends FlowBaseElement
{

    @XmlElement(required = true)
    protected String name;
    protected FlowElementReferenceOrValue value;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public FlowElementReferenceOrValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public void setValue(FlowElementReferenceOrValue value) {
        this.value = value;
    }

}
