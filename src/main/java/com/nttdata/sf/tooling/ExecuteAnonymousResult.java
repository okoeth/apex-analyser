
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecuteAnonymousResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteAnonymousResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="compileProblem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="compiled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exceptionStackTrace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteAnonymousResult", propOrder = {
    "column",
    "compileProblem",
    "compiled",
    "exceptionMessage",
    "exceptionStackTrace",
    "line",
    "success"
})
public class ExecuteAnonymousResult {

    protected int column;
    @XmlElement(required = true, nillable = true)
    protected String compileProblem;
    protected boolean compiled;
    @XmlElement(required = true, nillable = true)
    protected String exceptionMessage;
    @XmlElement(required = true, nillable = true)
    protected String exceptionStackTrace;
    protected int line;
    protected boolean success;

    /**
     * Gets the value of the column property.
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     */
    public void setColumn(int value) {
        this.column = value;
    }

    /**
     * Gets the value of the compileProblem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompileProblem() {
        return compileProblem;
    }

    /**
     * Sets the value of the compileProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompileProblem(String value) {
        this.compileProblem = value;
    }

    /**
     * Gets the value of the compiled property.
     * 
     */
    public boolean isCompiled() {
        return compiled;
    }

    /**
     * Sets the value of the compiled property.
     * 
     */
    public void setCompiled(boolean value) {
        this.compiled = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the exceptionStackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionStackTrace() {
        return exceptionStackTrace;
    }

    /**
     * Sets the value of the exceptionStackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionStackTrace(String value) {
        this.exceptionStackTrace = value;
    }

    /**
     * Gets the value of the line property.
     * 
     */
    public int getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     */
    public void setLine(int value) {
        this.line = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
