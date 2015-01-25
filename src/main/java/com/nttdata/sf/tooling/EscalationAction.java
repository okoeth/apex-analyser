
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EscalationAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscalationAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignedToTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignedToType" type="{urn:tooling.soap.sforce.com}AssignToLookupValueType" minOccurs="0"/>
 *         &lt;element name="minutesToEscalation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="notifyCaseOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyEmail" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notifyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyToTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EscalationAction", propOrder = {
    "assignedTo",
    "assignedToTemplate",
    "assignedToType",
    "minutesToEscalation",
    "notifyCaseOwner",
    "notifyEmail",
    "notifyTo",
    "notifyToTemplate"
})
public class EscalationAction {

    protected String assignedTo;
    protected String assignedToTemplate;
    protected AssignToLookupValueType assignedToType;
    protected Integer minutesToEscalation;
    protected Boolean notifyCaseOwner;
    protected List<String> notifyEmail;
    protected String notifyTo;
    protected String notifyToTemplate;

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
     * Gets the value of the assignedToTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedToTemplate() {
        return assignedToTemplate;
    }

    /**
     * Sets the value of the assignedToTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedToTemplate(String value) {
        this.assignedToTemplate = value;
    }

    /**
     * Gets the value of the assignedToType property.
     * 
     * @return
     *     possible object is
     *     {@link AssignToLookupValueType }
     *     
     */
    public AssignToLookupValueType getAssignedToType() {
        return assignedToType;
    }

    /**
     * Sets the value of the assignedToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignToLookupValueType }
     *     
     */
    public void setAssignedToType(AssignToLookupValueType value) {
        this.assignedToType = value;
    }

    /**
     * Gets the value of the minutesToEscalation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutesToEscalation() {
        return minutesToEscalation;
    }

    /**
     * Sets the value of the minutesToEscalation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutesToEscalation(Integer value) {
        this.minutesToEscalation = value;
    }

    /**
     * Gets the value of the notifyCaseOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyCaseOwner() {
        return notifyCaseOwner;
    }

    /**
     * Sets the value of the notifyCaseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyCaseOwner(Boolean value) {
        this.notifyCaseOwner = value;
    }

    /**
     * Gets the value of the notifyEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotifyEmail() {
        if (notifyEmail == null) {
            notifyEmail = new ArrayList<String>();
        }
        return this.notifyEmail;
    }

    /**
     * Gets the value of the notifyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyTo() {
        return notifyTo;
    }

    /**
     * Sets the value of the notifyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyTo(String value) {
        this.notifyTo = value;
    }

    /**
     * Gets the value of the notifyToTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyToTemplate() {
        return notifyToTemplate;
    }

    /**
     * Sets the value of the notifyToTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyToTemplate(String value) {
        this.notifyToTemplate = value;
    }

}
