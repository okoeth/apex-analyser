
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowAction">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowAction")
@XmlSeeAlso({
    WorkflowFlowAction.class,
    WorkflowTaskMetadata.class,
    WorkflowKnowledgePublish.class,
    WorkflowOutboundMessageMetadata.class,
    WorkflowAlertMetadata.class,
    WorkflowFieldUpdateMetadata.class,
    WorkflowSend.class
})
public class WorkflowAction
    extends Metadata
{


}
