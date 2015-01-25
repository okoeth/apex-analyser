
package com.nttdata.sf.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnowledgeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="knowledgeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="languages" type="{urn:partner.soap.sforce.com}KnowledgeLanguageItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowledgeSettings", propOrder = {
    "defaultLanguage",
    "knowledgeEnabled",
    "languages"
})
public class KnowledgeSettings {

    protected String defaultLanguage;
    protected boolean knowledgeEnabled;
    protected List<KnowledgeLanguageItem> languages;

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    /**
     * Gets the value of the knowledgeEnabled property.
     * 
     */
    public boolean isKnowledgeEnabled() {
        return knowledgeEnabled;
    }

    /**
     * Sets the value of the knowledgeEnabled property.
     * 
     */
    public void setKnowledgeEnabled(boolean value) {
        this.knowledgeEnabled = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KnowledgeLanguageItem }
     * 
     * 
     */
    public List<KnowledgeLanguageItem> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<KnowledgeLanguageItem>();
        }
        return this.languages;
    }

}
