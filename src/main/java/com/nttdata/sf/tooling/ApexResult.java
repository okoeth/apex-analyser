
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApexResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApexResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apexError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apexExecutionResult" type="{urn:tooling.soap.sforce.com}ExecuteAnonymousResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApexResult", propOrder = {
    "apexError",
    "apexExecutionResult"
})
public class ApexResult {

    @XmlElement(required = true)
    protected String apexError;
    @XmlElement(required = true)
    protected ExecuteAnonymousResult apexExecutionResult;

    /**
     * Gets the value of the apexError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApexError() {
        return apexError;
    }

    /**
     * Sets the value of the apexError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApexError(String value) {
        this.apexError = value;
    }

    /**
     * Gets the value of the apexExecutionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteAnonymousResult }
     *     
     */
    public ExecuteAnonymousResult getApexExecutionResult() {
        return apexExecutionResult;
    }

    /**
     * Sets the value of the apexExecutionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteAnonymousResult }
     *     
     */
    public void setApexExecutionResult(ExecuteAnonymousResult value) {
        this.apexExecutionResult = value;
    }

}
