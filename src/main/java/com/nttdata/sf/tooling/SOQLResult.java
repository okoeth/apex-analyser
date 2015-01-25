
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOQLResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOQLResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryMetadata" type="{urn:tooling.soap.sforce.com}QueryResultMetadata"/>
 *         &lt;element name="queryResult" type="{urn:tooling.soap.sforce.com}MapValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOQLResult", propOrder = {
    "queryError",
    "queryMetadata",
    "queryResult"
})
public class SOQLResult {

    @XmlElement(required = true)
    protected String queryError;
    @XmlElement(required = true)
    protected QueryResultMetadata queryMetadata;
    protected List<MapValue> queryResult;

    /**
     * Gets the value of the queryError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryError() {
        return queryError;
    }

    /**
     * Sets the value of the queryError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryError(String value) {
        this.queryError = value;
    }

    /**
     * Gets the value of the queryMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultMetadata }
     *     
     */
    public QueryResultMetadata getQueryMetadata() {
        return queryMetadata;
    }

    /**
     * Sets the value of the queryMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultMetadata }
     *     
     */
    public void setQueryMetadata(QueryResultMetadata value) {
        this.queryMetadata = value;
    }

    /**
     * Gets the value of the queryResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapValue }
     * 
     * 
     */
    public List<MapValue> getQueryResult() {
        if (queryResult == null) {
            queryResult = new ArrayList<MapValue>();
        }
        return this.queryResult;
    }

}
