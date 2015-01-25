
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowWaitEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowWaitEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowElement">
 *       &lt;sequence>
 *         &lt;element name="conditionLogic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditions" type="{urn:tooling.soap.sforce.com}FlowCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="connector" type="{urn:tooling.soap.sforce.com}FlowConnector"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputParameters" type="{urn:tooling.soap.sforce.com}FlowWaitEventInputParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputParameters" type="{urn:tooling.soap.sforce.com}FlowWaitEventOutputParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowWaitEvent", propOrder = {
    "conditionLogic",
    "conditions",
    "connector",
    "eventType",
    "inputParameters",
    "label",
    "outputParameters"
})
public class FlowWaitEvent
    extends FlowElement
{

    protected String conditionLogic;
    protected List<FlowCondition> conditions;
    @XmlElement(required = true)
    protected FlowConnector connector;
    @XmlElement(required = true)
    protected String eventType;
    protected List<FlowWaitEventInputParameter> inputParameters;
    @XmlElement(required = true)
    protected String label;
    protected List<FlowWaitEventOutputParameter> outputParameters;

    /**
     * Gets the value of the conditionLogic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionLogic() {
        return conditionLogic;
    }

    /**
     * Sets the value of the conditionLogic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionLogic(String value) {
        this.conditionLogic = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowCondition }
     * 
     * 
     */
    public List<FlowCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<FlowCondition>();
        }
        return this.conditions;
    }

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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowWaitEventInputParameter }
     * 
     * 
     */
    public List<FlowWaitEventInputParameter> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<FlowWaitEventInputParameter>();
        }
        return this.inputParameters;
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
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowWaitEventOutputParameter }
     * 
     * 
     */
    public List<FlowWaitEventOutputParameter> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<FlowWaitEventOutputParameter>();
        }
        return this.outputParameters;
    }

}
