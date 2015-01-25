
package com.nttdata.sf.tooling;

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
 *         &lt;element name="ignoreSaveWarnings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "ignoreSaveWarnings"
})
@XmlRootElement(name = "MetadataWarningsHeader")
public class MetadataWarningsHeader {

    protected boolean ignoreSaveWarnings;

    /**
     * Gets the value of the ignoreSaveWarnings property.
     * 
     */
    public boolean isIgnoreSaveWarnings() {
        return ignoreSaveWarnings;
    }

    /**
     * Sets the value of the ignoreSaveWarnings property.
     * 
     */
    public void setIgnoreSaveWarnings(boolean value) {
        this.ignoreSaveWarnings = value;
    }

}
