
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowBaseElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowBaseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processMetadataValues" type="{urn:tooling.soap.sforce.com}FlowMetadataValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowBaseElement", propOrder = {
    "processMetadataValues"
})
@XmlSeeAlso({
    FlowInputFieldAssignment.class,
    FlowActionCallInputParameter.class,
    FlowSubflowInputAssignment.class,
    FlowApexPluginCallInputParameter.class,
    FlowActionCallOutputParameter.class,
    FlowOutputFieldAssignment.class,
    FlowWaitEventOutputParameter.class,
    FlowSubflowOutputAssignment.class,
    FlowConnector.class,
    FlowApexPluginCallOutputParameter.class,
    FlowRecordFilter.class,
    FlowWaitEventInputParameter.class,
    FlowCondition.class,
    FlowAssignmentItem.class,
    FlowChoiceUserInput.class,
    FlowElement.class
})
public class FlowBaseElement {

    protected List<FlowMetadataValue> processMetadataValues;

    /**
     * Gets the value of the processMetadataValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processMetadataValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessMetadataValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowMetadataValue }
     * 
     * 
     */
    public List<FlowMetadataValue> getProcessMetadataValues() {
        if (processMetadataValues == null) {
            processMetadataValues = new ArrayList<FlowMetadataValue>();
        }
        return this.processMetadataValues;
    }

}
