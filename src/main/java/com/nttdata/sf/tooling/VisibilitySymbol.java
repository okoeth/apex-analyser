
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisibilitySymbol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisibilitySymbol">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}Symbol">
 *       &lt;sequence>
 *         &lt;element name="visibility" type="{urn:tooling.soap.sforce.com}SymbolVisibility"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisibilitySymbol", propOrder = {
    "visibility"
})
@XmlSeeAlso({
    Constructor.class
})
public class VisibilitySymbol
    extends Symbol
{

    @XmlElement(required = true)
    protected SymbolVisibility visibility;

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolVisibility }
     *     
     */
    public SymbolVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolVisibility }
     *     
     */
    public void setVisibility(SymbolVisibility value) {
        this.visibility = value;
    }

}
