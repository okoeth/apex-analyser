
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowSubflow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowSubflow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="connector" type="{urn:tooling.soap.sforce.com}FlowConnector" minOccurs="0"/>
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputAssignments" type="{urn:tooling.soap.sforce.com}FlowSubflowInputAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputAssignments" type="{urn:tooling.soap.sforce.com}FlowSubflowOutputAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowSubflow", propOrder = {
    "connector",
    "flowName",
    "inputAssignments",
    "outputAssignments"
})
public class FlowSubflow
    extends FlowNode
{

    protected FlowConnector connector;
    @XmlElement(required = true)
    protected String flowName;
    protected List<FlowSubflowInputAssignment> inputAssignments;
    protected List<FlowSubflowOutputAssignment> outputAssignments;

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setConnector(FlowConnector value) {
        this.connector = value;
    }

    /**
     * Gets the value of the flowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowName() {
        return flowName;
    }

    /**
     * Sets the value of the flowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowName(String value) {
        this.flowName = value;
    }

    /**
     * Gets the value of the inputAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowSubflowInputAssignment }
     * 
     * 
     */
    public List<FlowSubflowInputAssignment> getInputAssignments() {
        if (inputAssignments == null) {
            inputAssignments = new ArrayList<FlowSubflowInputAssignment>();
        }
        return this.inputAssignments;
    }

    /**
     * Gets the value of the outputAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowSubflowOutputAssignment }
     * 
     * 
     */
    public List<FlowSubflowOutputAssignment> getOutputAssignments() {
        if (outputAssignments == null) {
            outputAssignments = new ArrayList<FlowSubflowOutputAssignment>();
        }
        return this.outputAssignments;
    }

}
