
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoqlConditionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoqlConditionGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:partner.soap.sforce.com}SoqlWhereCondition">
 *       &lt;sequence>
 *         &lt;element name="conditions" type="{urn:partner.soap.sforce.com}SoqlWhereCondition" maxOccurs="unbounded"/>
 *         &lt;element name="conjunction" type="{urn:partner.soap.sforce.com}soqlConjunction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoqlConditionGroup", propOrder = {
    "conditions",
    "conjunction"
})
public class SoqlConditionGroup
    extends SoqlWhereCondition
{

    @XmlElement(required = true)
    protected List<SoqlWhereCondition> conditions;
    @XmlElement(required = true)
    protected SoqlConjunction conjunction;

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoqlWhereCondition }
     * 
     * 
     */
    public List<SoqlWhereCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<SoqlWhereCondition>();
        }
        return this.conditions;
    }

    /**
     * Gets the value of the conjunction property.
     * 
     * @return
     *     possible object is
     *     {@link SoqlConjunction }
     *     
     */
    public SoqlConjunction getConjunction() {
        return conjunction;
    }

    /**
     * Sets the value of the conjunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoqlConjunction }
     *     
     */
    public void setConjunction(SoqlConjunction value) {
        this.conjunction = value;
    }

}
