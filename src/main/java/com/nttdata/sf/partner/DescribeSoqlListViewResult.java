
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeSoqlListViewResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoqlListViewResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="describeSoqlListViews" type="{urn:partner.soap.sforce.com}DescribeSoqlListView" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoqlListViewResult", propOrder = {
    "describeSoqlListViews"
})
public class DescribeSoqlListViewResult {

    @XmlElement(required = true)
    protected List<DescribeSoqlListView> describeSoqlListViews;

    /**
     * Gets the value of the describeSoqlListViews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the describeSoqlListViews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescribeSoqlListViews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeSoqlListView }
     * 
     * 
     */
    public List<DescribeSoqlListView> getDescribeSoqlListViews() {
        if (describeSoqlListViews == null) {
            describeSoqlListViews = new ArrayList<DescribeSoqlListView>();
        }
        return this.describeSoqlListViews;
    }

}
