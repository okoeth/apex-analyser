
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomConsoleComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomConsoleComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryTabComponents" type="{urn:tooling.soap.sforce.com}PrimaryTabComponents" minOccurs="0"/>
 *         &lt;element name="subtabComponents" type="{urn:tooling.soap.sforce.com}SubtabComponents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomConsoleComponents", propOrder = {
    "primaryTabComponents",
    "subtabComponents"
})
public class CustomConsoleComponents {

    protected PrimaryTabComponents primaryTabComponents;
    protected SubtabComponents subtabComponents;

    /**
     * Gets the value of the primaryTabComponents property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryTabComponents }
     *     
     */
    public PrimaryTabComponents getPrimaryTabComponents() {
        return primaryTabComponents;
    }

    /**
     * Sets the value of the primaryTabComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryTabComponents }
     *     
     */
    public void setPrimaryTabComponents(PrimaryTabComponents value) {
        this.primaryTabComponents = value;
    }

    /**
     * Gets the value of the subtabComponents property.
     * 
     * @return
     *     possible object is
     *     {@link SubtabComponents }
     *     
     */
    public SubtabComponents getSubtabComponents() {
        return subtabComponents;
    }

    /**
     * Sets the value of the subtabComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtabComponents }
     *     
     */
    public void setSubtabComponents(SubtabComponents value) {
        this.subtabComponents = value;
    }

}
