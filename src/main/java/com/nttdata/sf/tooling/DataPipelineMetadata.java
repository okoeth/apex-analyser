
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataPipelineMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataPipelineMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Metadata">
 *       &lt;sequence>
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scriptType" type="{urn:tooling.soap.sforce.com}DataPipelineType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataPipelineMetadata", propOrder = {
    "apiVersion",
    "label",
    "scriptType"
})
public class DataPipelineMetadata
    extends Metadata
{

    protected double apiVersion;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected DataPipelineType scriptType;

    /**
     * Gets the value of the apiVersion property.
     * 
     */
    public double getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     */
    public void setApiVersion(double value) {
        this.apiVersion = value;
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
     * Gets the value of the scriptType property.
     * 
     * @return
     *     possible object is
     *     {@link DataPipelineType }
     *     
     */
    public DataPipelineType getScriptType() {
        return scriptType;
    }

    /**
     * Sets the value of the scriptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPipelineType }
     *     
     */
    public void setScriptType(DataPipelineType value) {
        this.scriptType = value;
    }

}
