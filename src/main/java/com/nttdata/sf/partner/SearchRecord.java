
package com.nttdata.sf.partner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record" type="{urn:sobject.partner.soap.sforce.com}sObject"/>
 *         &lt;element name="snippet" type="{urn:partner.soap.sforce.com}SearchSnippet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRecord", propOrder = {
    "record",
    "snippet"
})
public class SearchRecord {

    @XmlElement(required = true)
    protected SObject record;
    @XmlElementRef(name = "snippet", namespace = "urn:partner.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchSnippet> snippet;

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setRecord(SObject value) {
        this.record = value;
    }

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchSnippet }{@code >}
     *     
     */
    public JAXBElement<SearchSnippet> getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchSnippet }{@code >}
     *     
     */
    public void setSnippet(JAXBElement<SearchSnippet> value) {
        this.snippet = value;
    }

}
