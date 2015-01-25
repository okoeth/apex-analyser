
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeCompactLayoutsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeCompactLayoutsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compactLayouts" type="{urn:partner.soap.sforce.com}DescribeCompactLayout" maxOccurs="unbounded"/>
 *         &lt;element name="defaultCompactLayoutId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="recordTypeCompactLayoutMappings" type="{urn:partner.soap.sforce.com}RecordTypeCompactLayoutMapping" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeCompactLayoutsResult", propOrder = {
    "compactLayouts",
    "defaultCompactLayoutId",
    "recordTypeCompactLayoutMappings"
})
public class DescribeCompactLayoutsResult {

    @XmlElement(required = true)
    protected List<DescribeCompactLayout> compactLayouts;
    @XmlElement(required = true)
    protected String defaultCompactLayoutId;
    @XmlElement(required = true)
    protected List<RecordTypeCompactLayoutMapping> recordTypeCompactLayoutMappings;

    /**
     * Gets the value of the compactLayouts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compactLayouts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompactLayouts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeCompactLayout }
     * 
     * 
     */
    public List<DescribeCompactLayout> getCompactLayouts() {
        if (compactLayouts == null) {
            compactLayouts = new ArrayList<DescribeCompactLayout>();
        }
        return this.compactLayouts;
    }

    /**
     * Gets the value of the defaultCompactLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCompactLayoutId() {
        return defaultCompactLayoutId;
    }

    /**
     * Sets the value of the defaultCompactLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCompactLayoutId(String value) {
        this.defaultCompactLayoutId = value;
    }

    /**
     * Gets the value of the recordTypeCompactLayoutMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTypeCompactLayoutMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTypeCompactLayoutMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordTypeCompactLayoutMapping }
     * 
     * 
     */
    public List<RecordTypeCompactLayoutMapping> getRecordTypeCompactLayoutMappings() {
        if (recordTypeCompactLayoutMappings == null) {
            recordTypeCompactLayoutMappings = new ArrayList<RecordTypeCompactLayoutMapping>();
        }
        return this.recordTypeCompactLayoutMappings;
    }

}
