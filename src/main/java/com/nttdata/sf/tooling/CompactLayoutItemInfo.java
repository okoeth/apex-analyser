
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompactLayoutItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompactLayoutItemInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CompactLayoutInfo" type="{urn:tooling.soap.sforce.com}CompactLayoutInfo" minOccurs="0"/>
 *         &lt;element name="CompactLayoutInfoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldDefinition" type="{urn:tooling.soap.sforce.com}FieldDefinition" minOccurs="0"/>
 *         &lt;element name="FieldDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompactLayoutItemInfo", propOrder = {
    "compactLayoutInfo",
    "compactLayoutInfoId",
    "durableId",
    "fieldDefinition",
    "fieldDefinitionId",
    "sortOrder"
})
public class CompactLayoutItemInfo
    extends SObject
{

    @XmlElementRef(name = "CompactLayoutInfo", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CompactLayoutInfo> compactLayoutInfo;
    @XmlElementRef(name = "CompactLayoutInfoId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compactLayoutInfoId;
    @XmlElementRef(name = "DurableId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> durableId;
    @XmlElementRef(name = "FieldDefinition", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<FieldDefinition> fieldDefinition;
    @XmlElementRef(name = "FieldDefinitionId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldDefinitionId;
    @XmlElementRef(name = "SortOrder", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sortOrder;

    /**
     * Gets the value of the compactLayoutInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompactLayoutInfo }{@code >}
     *     
     */
    public JAXBElement<CompactLayoutInfo> getCompactLayoutInfo() {
        return compactLayoutInfo;
    }

    /**
     * Sets the value of the compactLayoutInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompactLayoutInfo }{@code >}
     *     
     */
    public void setCompactLayoutInfo(JAXBElement<CompactLayoutInfo> value) {
        this.compactLayoutInfo = value;
    }

    /**
     * Gets the value of the compactLayoutInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompactLayoutInfoId() {
        return compactLayoutInfoId;
    }

    /**
     * Sets the value of the compactLayoutInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompactLayoutInfoId(JAXBElement<String> value) {
        this.compactLayoutInfoId = value;
    }

    /**
     * Gets the value of the durableId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDurableId() {
        return durableId;
    }

    /**
     * Sets the value of the durableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDurableId(JAXBElement<String> value) {
        this.durableId = value;
    }

    /**
     * Gets the value of the fieldDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FieldDefinition }{@code >}
     *     
     */
    public JAXBElement<FieldDefinition> getFieldDefinition() {
        return fieldDefinition;
    }

    /**
     * Sets the value of the fieldDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FieldDefinition }{@code >}
     *     
     */
    public void setFieldDefinition(JAXBElement<FieldDefinition> value) {
        this.fieldDefinition = value;
    }

    /**
     * Gets the value of the fieldDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldDefinitionId() {
        return fieldDefinitionId;
    }

    /**
     * Sets the value of the fieldDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldDefinitionId(JAXBElement<String> value) {
        this.fieldDefinitionId = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSortOrder(JAXBElement<Integer> value) {
        this.sortOrder = value;
    }

}
