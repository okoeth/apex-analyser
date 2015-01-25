
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeValueTypeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeValueTypeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueTypeFields" type="{urn:tooling.soap.sforce.com}ValueTypeField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeValueTypeResult", propOrder = {
    "valueTypeFields"
})
public class DescribeValueTypeResult {

    protected List<ValueTypeField> valueTypeFields;

    /**
     * Gets the value of the valueTypeFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueTypeFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueTypeFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueTypeField }
     * 
     * 
     */
    public List<ValueTypeField> getValueTypeFields() {
        if (valueTypeFields == null) {
            valueTypeFields = new ArrayList<ValueTypeField>();
        }
        return this.valueTypeFields;
    }

}
