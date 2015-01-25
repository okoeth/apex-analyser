
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowWait complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowWait">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="defaultConnector" type="{urn:tooling.soap.sforce.com}FlowConnector" minOccurs="0"/>
 *         &lt;element name="defaultConnectorLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultConnector" type="{urn:tooling.soap.sforce.com}FlowConnector" minOccurs="0"/>
 *         &lt;element name="waitEvents" type="{urn:tooling.soap.sforce.com}FlowWaitEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowWait", propOrder = {
    "defaultConnector",
    "defaultConnectorLabel",
    "faultConnector",
    "waitEvents"
})
public class FlowWait
    extends FlowNode
{

    protected FlowConnector defaultConnector;
    @XmlElement(required = true)
    protected String defaultConnectorLabel;
    protected FlowConnector faultConnector;
    protected List<FlowWaitEvent> waitEvents;

    /**
     * Gets the value of the defaultConnector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getDefaultConnector() {
        return defaultConnector;
    }

    /**
     * Sets the value of the defaultConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setDefaultConnector(FlowConnector value) {
        this.defaultConnector = value;
    }

    /**
     * Gets the value of the defaultConnectorLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultConnectorLabel() {
        return defaultConnectorLabel;
    }

    /**
     * Sets the value of the defaultConnectorLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultConnectorLabel(String value) {
        this.defaultConnectorLabel = value;
    }

    /**
     * Gets the value of the faultConnector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getFaultConnector() {
        return faultConnector;
    }

    /**
     * Sets the value of the faultConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setFaultConnector(FlowConnector value) {
        this.faultConnector = value;
    }

    /**
     * Gets the value of the waitEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowWaitEvent }
     * 
     * 
     */
    public List<FlowWaitEvent> getWaitEvents() {
        if (waitEvents == null) {
            waitEvents = new ArrayList<FlowWaitEvent>();
        }
        return this.waitEvents;
    }

}
