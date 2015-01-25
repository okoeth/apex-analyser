
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferOpenActivities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transferAttachments",
    "transferOpenActivities"
})
@XmlRootElement(name = "OwnerChangeOptions")
public class OwnerChangeOptions {

    protected boolean transferAttachments;
    protected boolean transferOpenActivities;

    /**
     * Gets the value of the transferAttachments property.
     * 
     */
    public boolean isTransferAttachments() {
        return transferAttachments;
    }

    /**
     * Sets the value of the transferAttachments property.
     * 
     */
    public void setTransferAttachments(boolean value) {
        this.transferAttachments = value;
    }

    /**
     * Gets the value of the transferOpenActivities property.
     * 
     */
    public boolean isTransferOpenActivities() {
        return transferOpenActivities;
    }

    /**
     * Sets the value of the transferOpenActivities property.
     * 
     */
    public void setTransferOpenActivities(boolean value) {
        this.transferOpenActivities = value;
    }

}
