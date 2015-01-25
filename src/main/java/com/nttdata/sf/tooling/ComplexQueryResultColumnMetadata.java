
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplexQueryResultColumnMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexQueryResultColumnMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}QueryResultColumnMetadata">
 *       &lt;sequence>
 *         &lt;element name="joinColumns" type="{urn:tooling.soap.sforce.com}QueryResultColumnMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexQueryResultColumnMetadata", propOrder = {
    "joinColumns"
})
@XmlSeeAlso({
    AggregateQueryResultColumnMetadata.class
})
public class ComplexQueryResultColumnMetadata
    extends QueryResultColumnMetadata
{

    protected List<QueryResultColumnMetadata> joinColumns;

    /**
     * Gets the value of the joinColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the joinColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoinColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryResultColumnMetadata }
     * 
     * 
     */
    public List<QueryResultColumnMetadata> getJoinColumns() {
        if (joinColumns == null) {
            joinColumns = new ArrayList<QueryResultColumnMetadata>();
        }
        return this.joinColumns;
    }

}
