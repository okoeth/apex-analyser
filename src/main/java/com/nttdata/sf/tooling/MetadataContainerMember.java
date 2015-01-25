
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MetadataContainerMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataContainerMember">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentEntity" type="{urn:tooling.soap.sforce.com}sObject" minOccurs="0"/>
 *         &lt;element name="ContentEntityId" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastSyncDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MetadataContainer" type="{urn:tooling.soap.sforce.com}MetadataContainer" minOccurs="0"/>
 *         &lt;element name="MetadataContainerId" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataContainerMember", propOrder = {
    "content",
    "contentEntity",
    "contentEntityId",
    "fullName",
    "lastSyncDate",
    "metadataContainer",
    "metadataContainerId"
})
public class MetadataContainerMember
    extends SObject
{

    @XmlElementRef(name = "Content", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> content;
    @XmlElementRef(name = "ContentEntity", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SObject> contentEntity;
    @XmlElementRef(name = "ContentEntityId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contentEntityId;
    @XmlElementRef(name = "FullName", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullName;
    @XmlElementRef(name = "LastSyncDate", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastSyncDate;
    @XmlElementRef(name = "MetadataContainer", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<MetadataContainer> metadataContainer;
    @XmlElementRef(name = "MetadataContainerId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> metadataContainerId;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContent(JAXBElement<String> value) {
        this.content = value;
    }

    /**
     * Gets the value of the contentEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SObject }{@code >}
     *     
     */
    public JAXBElement<SObject> getContentEntity() {
        return contentEntity;
    }

    /**
     * Sets the value of the contentEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SObject }{@code >}
     *     
     */
    public void setContentEntity(JAXBElement<SObject> value) {
        this.contentEntity = value;
    }

    /**
     * Gets the value of the contentEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentEntityId() {
        return contentEntityId;
    }

    /**
     * Sets the value of the contentEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentEntityId(JAXBElement<String> value) {
        this.contentEntityId = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullName(JAXBElement<String> value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the lastSyncDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastSyncDate() {
        return lastSyncDate;
    }

    /**
     * Sets the value of the lastSyncDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastSyncDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastSyncDate = value;
    }

    /**
     * Gets the value of the metadataContainer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}
     *     
     */
    public JAXBElement<MetadataContainer> getMetadataContainer() {
        return metadataContainer;
    }

    /**
     * Sets the value of the metadataContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}
     *     
     */
    public void setMetadataContainer(JAXBElement<MetadataContainer> value) {
        this.metadataContainer = value;
    }

    /**
     * Gets the value of the metadataContainerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMetadataContainerId() {
        return metadataContainerId;
    }

    /**
     * Sets the value of the metadataContainerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMetadataContainerId(JAXBElement<String> value) {
        this.metadataContainerId = value;
    }

}
