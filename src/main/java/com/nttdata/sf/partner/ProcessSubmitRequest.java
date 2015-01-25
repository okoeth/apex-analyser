
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessSubmitRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessSubmitRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:partner.soap.sforce.com}ProcessRequest">
 *       &lt;sequence>
 *         &lt;element name="objectId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="submitterId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="processDefinitionNameOrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="skipEntryCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessSubmitRequest", propOrder = {
    "objectId",
    "submitterId",
    "processDefinitionNameOrId",
    "skipEntryCriteria"
})
public class ProcessSubmitRequest
    extends ProcessRequest
{

    @XmlElement(required = true)
    protected String objectId;
    @XmlElement(required = true, nillable = true)
    protected String submitterId;
    @XmlElement(required = true, nillable = true)
    protected String processDefinitionNameOrId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean skipEntryCriteria;

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the submitterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitterId() {
        return submitterId;
    }

    /**
     * Sets the value of the submitterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitterId(String value) {
        this.submitterId = value;
    }

    /**
     * Gets the value of the processDefinitionNameOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessDefinitionNameOrId() {
        return processDefinitionNameOrId;
    }

    /**
     * Sets the value of the processDefinitionNameOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessDefinitionNameOrId(String value) {
        this.processDefinitionNameOrId = value;
    }

    /**
     * Gets the value of the skipEntryCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipEntryCriteria() {
        return skipEntryCriteria;
    }

    /**
     * Sets the value of the skipEntryCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipEntryCriteria(Boolean value) {
        this.skipEntryCriteria = value;
    }

}
