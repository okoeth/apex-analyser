
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApexTestResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApexTestResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ApexClass" type="{urn:tooling.soap.sforce.com}ApexClass" minOccurs="0"/>
 *         &lt;element name="ApexClassId" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ApexLog" type="{urn:tooling.soap.sforce.com}ApexLog" minOccurs="0"/>
 *         &lt;element name="ApexLogId" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="AsyncApexJob" type="{urn:tooling.soap.sforce.com}AsyncApexJob" minOccurs="0"/>
 *         &lt;element name="AsyncApexJobId" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueueItem" type="{urn:tooling.soap.sforce.com}ApexTestQueueItem" minOccurs="0"/>
 *         &lt;element name="QueueItemId" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="StackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TestTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApexTestResult", propOrder = {
    "apexClass",
    "apexClassId",
    "apexLog",
    "apexLogId",
    "asyncApexJob",
    "asyncApexJobId",
    "message",
    "methodName",
    "outcome",
    "queueItem",
    "queueItemId",
    "stackTrace",
    "systemModstamp",
    "testTimestamp"
})
public class ApexTestResult
    extends SObject
{

    @XmlElementRef(name = "ApexClass", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ApexClass> apexClass;
    @XmlElementRef(name = "ApexClassId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apexClassId;
    @XmlElementRef(name = "ApexLog", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ApexLog> apexLog;
    @XmlElementRef(name = "ApexLogId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apexLogId;
    @XmlElementRef(name = "AsyncApexJob", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AsyncApexJob> asyncApexJob;
    @XmlElementRef(name = "AsyncApexJobId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asyncApexJobId;
    @XmlElementRef(name = "Message", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "MethodName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> methodName;
    @XmlElementRef(name = "Outcome", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outcome;
    @XmlElementRef(name = "QueueItem", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ApexTestQueueItem> queueItem;
    @XmlElementRef(name = "QueueItemId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queueItemId;
    @XmlElementRef(name = "StackTrace", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stackTrace;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "TestTimestamp", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> testTimestamp;

    /**
     * Gets the value of the apexClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApexClass }{@code >}
     *     
     */
    public JAXBElement<ApexClass> getApexClass() {
        return apexClass;
    }

    /**
     * Sets the value of the apexClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApexClass }{@code >}
     *     
     */
    public void setApexClass(JAXBElement<ApexClass> value) {
        this.apexClass = value;
    }

    /**
     * Gets the value of the apexClassId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApexClassId() {
        return apexClassId;
    }

    /**
     * Sets the value of the apexClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApexClassId(JAXBElement<String> value) {
        this.apexClassId = value;
    }

    /**
     * Gets the value of the apexLog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApexLog }{@code >}
     *     
     */
    public JAXBElement<ApexLog> getApexLog() {
        return apexLog;
    }

    /**
     * Sets the value of the apexLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApexLog }{@code >}
     *     
     */
    public void setApexLog(JAXBElement<ApexLog> value) {
        this.apexLog = value;
    }

    /**
     * Gets the value of the apexLogId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApexLogId() {
        return apexLogId;
    }

    /**
     * Sets the value of the apexLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApexLogId(JAXBElement<String> value) {
        this.apexLogId = value;
    }

    /**
     * Gets the value of the asyncApexJob property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AsyncApexJob }{@code >}
     *     
     */
    public JAXBElement<AsyncApexJob> getAsyncApexJob() {
        return asyncApexJob;
    }

    /**
     * Sets the value of the asyncApexJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AsyncApexJob }{@code >}
     *     
     */
    public void setAsyncApexJob(JAXBElement<AsyncApexJob> value) {
        this.asyncApexJob = value;
    }

    /**
     * Gets the value of the asyncApexJobId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAsyncApexJobId() {
        return asyncApexJobId;
    }

    /**
     * Sets the value of the asyncApexJobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAsyncApexJobId(JAXBElement<String> value) {
        this.asyncApexJobId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMethodName(JAXBElement<String> value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutcome(JAXBElement<String> value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the queueItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApexTestQueueItem }{@code >}
     *     
     */
    public JAXBElement<ApexTestQueueItem> getQueueItem() {
        return queueItem;
    }

    /**
     * Sets the value of the queueItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApexTestQueueItem }{@code >}
     *     
     */
    public void setQueueItem(JAXBElement<ApexTestQueueItem> value) {
        this.queueItem = value;
    }

    /**
     * Gets the value of the queueItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueueItemId() {
        return queueItemId;
    }

    /**
     * Sets the value of the queueItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueueItemId(JAXBElement<String> value) {
        this.queueItemId = value;
    }

    /**
     * Gets the value of the stackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStackTrace(JAXBElement<String> value) {
        this.stackTrace = value;
    }

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSystemModstamp(JAXBElement<XMLGregorianCalendar> value) {
        this.systemModstamp = value;
    }

    /**
     * Gets the value of the testTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTestTimestamp() {
        return testTimestamp;
    }

    /**
     * Sets the value of the testTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTestTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.testTimestamp = value;
    }

}
