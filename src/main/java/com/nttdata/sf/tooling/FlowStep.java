
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowStep">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="connectors" type="{urn:tooling.soap.sforce.com}FlowConnector" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowStep", propOrder = {
    "connectors"
})
public class FlowStep
    extends FlowNode
{

    protected List<FlowConnector> connectors;

    /**
     * Gets the value of the connectors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowConnector }
     * 
     * 
     */
    public List<FlowConnector> getConnectors() {
        if (connectors == null) {
            connectors = new ArrayList<FlowConnector>();
        }
        return this.connectors;
    }

}
