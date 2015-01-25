
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTaskMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowTaskMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}WorkflowAction">
 *       &lt;sequence>
 *         &lt;element name="assignedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignedToType" type="{urn:tooling.soap.sforce.com}ActionTaskAssignedToTypes"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDateOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notifyAssignee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="offsetFromField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowTaskMetadata", propOrder = {
    "assignedTo",
    "assignedToType",
    "description",
    "dueDateOffset",
    "notifyAssignee",
    "offsetFromField",
    "priority",
    "_protected",
    "status",
    "subject"
})
public class WorkflowTaskMetadata
    extends WorkflowAction
{

    protected String assignedTo;
    @XmlElement(required = true)
    protected ActionTaskAssignedToTypes assignedToType;
    protected String description;
    protected int dueDateOffset;
    protected boolean notifyAssignee;
    protected String offsetFromField;
    @XmlElement(required = true)
    protected String priority;
    @XmlElement(name = "protected")
    protected boolean _protected;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String subject;

    /**
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedTo(String value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the assignedToType property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaskAssignedToTypes }
     *     
     */
    public ActionTaskAssignedToTypes getAssignedToType() {
        return assignedToType;
    }

    /**
     * Sets the value of the assignedToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaskAssignedToTypes }
     *     
     */
    public void setAssignedToType(ActionTaskAssignedToTypes value) {
        this.assignedToType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dueDateOffset property.
     * 
     */
    public int getDueDateOffset() {
        return dueDateOffset;
    }

    /**
     * Sets the value of the dueDateOffset property.
     * 
     */
    public void setDueDateOffset(int value) {
        this.dueDateOffset = value;
    }

    /**
     * Gets the value of the notifyAssignee property.
     * 
     */
    public boolean isNotifyAssignee() {
        return notifyAssignee;
    }

    /**
     * Sets the value of the notifyAssignee property.
     * 
     */
    public void setNotifyAssignee(boolean value) {
        this.notifyAssignee = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     */
    public boolean isProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     */
    public void setProtected(boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
