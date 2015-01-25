
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoqlSubQueryCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoqlSubQueryCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:partner.soap.sforce.com}SoqlWhereCondition">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{urn:partner.soap.sforce.com}soqlOperator"/>
 *         &lt;element name="subQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoqlSubQueryCondition", propOrder = {
    "field",
    "operator",
    "subQuery"
})
public class SoqlSubQueryCondition
    extends SoqlWhereCondition
{

    @XmlElement(required = true)
    protected String field;
    @XmlElement(required = true)
    protected SoqlOperator operator;
    @XmlElement(required = true)
    protected String subQuery;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SoqlOperator }
     *     
     */
    public SoqlOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoqlOperator }
     *     
     */
    public void setOperator(SoqlOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the subQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubQuery() {
        return subQuery;
    }

    /**
     * Sets the value of the subQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubQuery(String value) {
        this.subQuery = value;
    }

}
