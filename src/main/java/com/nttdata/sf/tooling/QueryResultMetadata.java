
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResultMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResultMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnMetadata" type="{urn:tooling.soap.sforce.com}QueryResultColumnMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupBy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="idSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="keyPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResultMetadata", propOrder = {
    "columnMetadata",
    "entityName",
    "groupBy",
    "idSelected",
    "keyPrefix"
})
public class QueryResultMetadata {

    protected List<QueryResultColumnMetadata> columnMetadata;
    @XmlElement(required = true)
    protected String entityName;
    protected boolean groupBy;
    protected boolean idSelected;
    @XmlElement(required = true)
    protected String keyPrefix;

    /**
     * Gets the value of the columnMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryResultColumnMetadata }
     * 
     * 
     */
    public List<QueryResultColumnMetadata> getColumnMetadata() {
        if (columnMetadata == null) {
            columnMetadata = new ArrayList<QueryResultColumnMetadata>();
        }
        return this.columnMetadata;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the groupBy property.
     * 
     */
    public boolean isGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     */
    public void setGroupBy(boolean value) {
        this.groupBy = value;
    }

    /**
     * Gets the value of the idSelected property.
     * 
     */
    public boolean isIdSelected() {
        return idSelected;
    }

    /**
     * Sets the value of the idSelected property.
     * 
     */
    public void setIdSelected(boolean value) {
        this.idSelected = value;
    }

    /**
     * Gets the value of the keyPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPrefix() {
        return keyPrefix;
    }

    /**
     * Sets the value of the keyPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPrefix(String value) {
        this.keyPrefix = value;
    }

}
