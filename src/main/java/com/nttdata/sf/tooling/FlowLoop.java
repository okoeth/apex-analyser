
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowLoop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowLoop">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="assignNextValueToReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="collectionReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iterationOrder" type="{urn:tooling.soap.sforce.com}IterationOrder" minOccurs="0"/>
 *         &lt;element name="nextValueConnector" type="{urn:tooling.soap.sforce.com}FlowConnector" minOccurs="0"/>
 *         &lt;element name="noMoreValuesConnector" type="{urn:tooling.soap.sforce.com}FlowConnector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowLoop", propOrder = {
    "assignNextValueToReference",
    "collectionReference",
    "iterationOrder",
    "nextValueConnector",
    "noMoreValuesConnector"
})
public class FlowLoop
    extends FlowNode
{

    @XmlElement(required = true)
    protected String assignNextValueToReference;
    @XmlElement(required = true)
    protected String collectionReference;
    protected IterationOrder iterationOrder;
    protected FlowConnector nextValueConnector;
    protected FlowConnector noMoreValuesConnector;

    /**
     * Gets the value of the assignNextValueToReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignNextValueToReference() {
        return assignNextValueToReference;
    }

    /**
     * Sets the value of the assignNextValueToReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignNextValueToReference(String value) {
        this.assignNextValueToReference = value;
    }

    /**
     * Gets the value of the collectionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionReference() {
        return collectionReference;
    }

    /**
     * Sets the value of the collectionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionReference(String value) {
        this.collectionReference = value;
    }

    /**
     * Gets the value of the iterationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link IterationOrder }
     *     
     */
    public IterationOrder getIterationOrder() {
        return iterationOrder;
    }

    /**
     * Sets the value of the iterationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link IterationOrder }
     *     
     */
    public void setIterationOrder(IterationOrder value) {
        this.iterationOrder = value;
    }

    /**
     * Gets the value of the nextValueConnector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getNextValueConnector() {
        return nextValueConnector;
    }

    /**
     * Sets the value of the nextValueConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setNextValueConnector(FlowConnector value) {
        this.nextValueConnector = value;
    }

    /**
     * Gets the value of the noMoreValuesConnector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getNoMoreValuesConnector() {
        return noMoreValuesConnector;
    }

    /**
     * Sets the value of the noMoreValuesConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setNoMoreValuesConnector(FlowConnector value) {
        this.noMoreValuesConnector = value;
    }

}
