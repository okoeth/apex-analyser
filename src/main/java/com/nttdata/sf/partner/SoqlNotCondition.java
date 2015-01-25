
package com.nttdata.sf.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoqlNotCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoqlNotCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:partner.soap.sforce.com}SoqlWhereCondition">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{urn:partner.soap.sforce.com}SoqlWhereCondition"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoqlNotCondition", propOrder = {
    "condition"
})
public class SoqlNotCondition
    extends SoqlWhereCondition
{

    @XmlElement(required = true)
    protected SoqlWhereCondition condition;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link SoqlWhereCondition }
     *     
     */
    public SoqlWhereCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoqlWhereCondition }
     *     
     */
    public void setCondition(SoqlWhereCondition value) {
        this.condition = value;
    }

}
