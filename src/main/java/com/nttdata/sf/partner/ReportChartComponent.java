
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportChartComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportChartComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:partner.soap.sforce.com}DescribeLayoutComponent">
 *       &lt;sequence>
 *         &lt;element name="cacheData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contextFilterableField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hideOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeContext" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showTitle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="size" type="{urn:partner.soap.sforce.com}ReportChartSize"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportChartComponent", propOrder = {
    "cacheData",
    "contextFilterableField",
    "error",
    "hideOnError",
    "includeContext",
    "showTitle",
    "size"
})
public class ReportChartComponent
    extends DescribeLayoutComponent
{

    protected boolean cacheData;
    @XmlElement(required = true)
    protected String contextFilterableField;
    @XmlElement(required = true)
    protected String error;
    protected boolean hideOnError;
    protected boolean includeContext;
    protected boolean showTitle;
    @XmlElement(required = true)
    protected ReportChartSize size;

    /**
     * Gets the value of the cacheData property.
     * 
     */
    public boolean isCacheData() {
        return cacheData;
    }

    /**
     * Sets the value of the cacheData property.
     * 
     */
    public void setCacheData(boolean value) {
        this.cacheData = value;
    }

    /**
     * Gets the value of the contextFilterableField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextFilterableField() {
        return contextFilterableField;
    }

    /**
     * Sets the value of the contextFilterableField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextFilterableField(String value) {
        this.contextFilterableField = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the hideOnError property.
     * 
     */
    public boolean isHideOnError() {
        return hideOnError;
    }

    /**
     * Sets the value of the hideOnError property.
     * 
     */
    public void setHideOnError(boolean value) {
        this.hideOnError = value;
    }

    /**
     * Gets the value of the includeContext property.
     * 
     */
    public boolean isIncludeContext() {
        return includeContext;
    }

    /**
     * Sets the value of the includeContext property.
     * 
     */
    public void setIncludeContext(boolean value) {
        this.includeContext = value;
    }

    /**
     * Gets the value of the showTitle property.
     * 
     */
    public boolean isShowTitle() {
        return showTitle;
    }

    /**
     * Sets the value of the showTitle property.
     * 
     */
    public void setShowTitle(boolean value) {
        this.showTitle = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link ReportChartSize }
     *     
     */
    public ReportChartSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportChartSize }
     *     
     */
    public void setSize(ReportChartSize value) {
        this.size = value;
    }

}
