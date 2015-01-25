
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowedWorkitemAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowedWorkitemAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commentsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextOwnerRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="versionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowedWorkitemAction", propOrder = {
    "commentsRequired",
    "label",
    "name",
    "nextOwnerRequired",
    "versionRequired"
})
public class AllowedWorkitemAction {

    protected boolean commentsRequired;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    protected boolean nextOwnerRequired;
    protected boolean versionRequired;

    /**
     * Gets the value of the commentsRequired property.
     * 
     */
    public boolean isCommentsRequired() {
        return commentsRequired;
    }

    /**
     * Sets the value of the commentsRequired property.
     * 
     */
    public void setCommentsRequired(boolean value) {
        this.commentsRequired = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nextOwnerRequired property.
     * 
     */
    public boolean isNextOwnerRequired() {
        return nextOwnerRequired;
    }

    /**
     * Sets the value of the nextOwnerRequired property.
     * 
     */
    public void setNextOwnerRequired(boolean value) {
        this.nextOwnerRequired = value;
    }

    /**
     * Gets the value of the versionRequired property.
     * 
     */
    public boolean isVersionRequired() {
        return versionRequired;
    }

    /**
     * Sets the value of the versionRequired property.
     * 
     */
    public void setVersionRequired(boolean value) {
        this.versionRequired = value;
    }

}
