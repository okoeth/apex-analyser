
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTimeTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowTimeTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actions" type="{urn:tooling.soap.sforce.com}WorkflowActionReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offsetFromField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowTimeTriggerUnit" type="{urn:tooling.soap.sforce.com}WorkflowTimeUnits"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowTimeTrigger", propOrder = {
    "actions",
    "offsetFromField",
    "timeLength",
    "workflowTimeTriggerUnit"
})
public class WorkflowTimeTrigger {

    protected List<WorkflowActionReference> actions;
    protected String offsetFromField;
    protected String timeLength;
    @XmlElement(required = true)
    protected WorkflowTimeUnits workflowTimeTriggerUnit;

    /**
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowActionReference }
     * 
     * 
     */
    public List<WorkflowActionReference> getActions() {
        if (actions == null) {
            actions = new ArrayList<WorkflowActionReference>();
        }
        return this.actions;
    }

    /**
     * Gets the value of the offsetFromField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetFromField() {
        return offsetFromField;
    }

    /**
     * Sets the value of the offsetFromField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetFromField(String value) {
        this.offsetFromField = value;
    }

    /**
     * Gets the value of the timeLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLength() {
        return timeLength;
    }

    /**
     * Sets the value of the timeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLength(String value) {
        this.timeLength = value;
    }

    /**
     * Gets the value of the workflowTimeTriggerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowTimeUnits }
     *     
     */
    public WorkflowTimeUnits getWorkflowTimeTriggerUnit() {
        return workflowTimeTriggerUnit;
    }

    /**
     * Sets the value of the workflowTimeTriggerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowTimeUnits }
     *     
     */
    public void setWorkflowTimeTriggerUnit(WorkflowTimeUnits value) {
        this.workflowTimeTriggerUnit = value;
    }

}
