
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeSoqlListView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoqlListView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columns" type="{urn:partner.soap.sforce.com}ListViewColumn" maxOccurs="unbounded"/>
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="orderBy" type="{urn:partner.soap.sforce.com}ListViewOrderBy" maxOccurs="unbounded"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sobjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="whereCondition" type="{urn:partner.soap.sforce.com}SoqlWhereCondition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoqlListView", propOrder = {
    "columns",
    "id",
    "orderBy",
    "query",
    "scope",
    "sobjectType",
    "whereCondition"
})
public class DescribeSoqlListView {

    @XmlElement(required = true)
    protected List<ListViewColumn> columns;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected List<ListViewOrderBy> orderBy;
    @XmlElement(required = true)
    protected String query;
    @XmlElement(required = true, nillable = true)
    protected String scope;
    @XmlElement(required = true)
    protected String sobjectType;
    protected SoqlWhereCondition whereCondition;

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListViewColumn }
     * 
     * 
     */
    public List<ListViewColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<ListViewColumn>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListViewOrderBy }
     * 
     * 
     */
    public List<ListViewOrderBy> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<ListViewOrderBy>();
        }
        return this.orderBy;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the sobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobjectType() {
        return sobjectType;
    }

    /**
     * Sets the value of the sobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobjectType(String value) {
        this.sobjectType = value;
    }

    /**
     * Gets the value of the whereCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SoqlWhereCondition }
     *     
     */
    public SoqlWhereCondition getWhereCondition() {
        return whereCondition;
    }

    /**
     * Sets the value of the whereCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoqlWhereCondition }
     *     
     */
    public void setWhereCondition(SoqlWhereCondition value) {
        this.whereCondition = value;
    }

}
