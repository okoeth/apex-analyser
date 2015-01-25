
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="RunTestsRequest" type="{urn:tooling.soap.sforce.com}RunTestsRequest"/>
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
    "runTestsRequest"
})
@XmlRootElement(name = "runTests")
public class RunTests {

    @XmlElement(name = "RunTestsRequest", required = true)
    protected RunTestsRequest runTestsRequest;

    /**
     * Gets the value of the runTestsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RunTestsRequest }
     *     
     */
    public RunTestsRequest getRunTestsRequest() {
        return runTestsRequest;
    }

    /**
     * Sets the value of the runTestsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunTestsRequest }
     *     
     */
    public void setRunTestsRequest(RunTestsRequest value) {
        this.runTestsRequest = value;
    }

}
