
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowAssignment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="assignmentItems" type="{urn:tooling.soap.sforce.com}FlowAssignmentItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="connector" type="{urn:tooling.soap.sforce.com}FlowConnector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowAssignment", propOrder = {
    "assignmentItems",
    "connector"
})
public class FlowAssignment
    extends FlowNode
{

    protected List<FlowAssignmentItem> assignmentItems;
    protected FlowConnector connector;

    /**
     * Gets the value of the assignmentItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignmentItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignmentItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowAssignmentItem }
     * 
     * 
     */
    public List<FlowAssignmentItem> getAssignmentItems() {
        if (assignmentItems == null) {
            assignmentItems = new ArrayList<FlowAssignmentItem>();
        }
        return this.assignmentItems;
    }

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setConnector(FlowConnector value) {
        this.connector = value;
    }

}
