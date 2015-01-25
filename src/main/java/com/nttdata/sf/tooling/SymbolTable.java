
package com.nttdata.sf.tooling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SymbolTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SymbolTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructors" type="{urn:tooling.soap.sforce.com}Constructor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalReferences" type="{urn:tooling.soap.sforce.com}ExternalReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="innerClasses" type="{urn:tooling.soap.sforce.com}SymbolTable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interfaces" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="methods" type="{urn:tooling.soap.sforce.com}Method" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="properties" type="{urn:tooling.soap.sforce.com}VisibilitySymbol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tableDeclaration" type="{urn:tooling.soap.sforce.com}Symbol"/>
 *         &lt;element name="variables" type="{urn:tooling.soap.sforce.com}Symbol" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymbolTable", propOrder = {
    "constructors",
    "externalReferences",
    "id",
    "innerClasses",
    "interfaces",
    "methods",
    "name",
    "namespace",
    "properties",
    "tableDeclaration",
    "variables"
})
public class SymbolTable {

    protected List<Constructor> constructors;
    protected List<ExternalReference> externalReferences;
    @XmlElement(required = true)
    protected String id;
    protected List<SymbolTable> innerClasses;
    protected List<String> interfaces;
    protected List<Method> methods;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String namespace;
    protected List<VisibilitySymbol> properties;
    @XmlElement(required = true)
    protected Symbol tableDeclaration;
    protected List<Symbol> variables;

    /**
     * Gets the value of the constructors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Constructor }
     * 
     * 
     */
    public List<Constructor> getConstructors() {
        if (constructors == null) {
            constructors = new ArrayList<Constructor>();
        }
        return this.constructors;
    }

    /**
     * Gets the value of the externalReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReference }
     * 
     * 
     */
    public List<ExternalReference> getExternalReferences() {
        if (externalReferences == null) {
            externalReferences = new ArrayList<ExternalReference>();
        }
        return this.externalReferences;
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
     * Gets the value of the innerClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innerClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnerClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymbolTable }
     * 
     * 
     */
    public List<SymbolTable> getInnerClasses() {
        if (innerClasses == null) {
            innerClasses = new ArrayList<SymbolTable>();
        }
        return this.innerClasses;
    }

    /**
     * Gets the value of the interfaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInterfaces() {
        if (interfaces == null) {
            interfaces = new ArrayList<String>();
        }
        return this.interfaces;
    }

    /**
     * Gets the value of the methods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Method }
     * 
     * 
     */
    public List<Method> getMethods() {
        if (methods == null) {
            methods = new ArrayList<Method>();
        }
        return this.methods;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisibilitySymbol }
     * 
     * 
     */
    public List<VisibilitySymbol> getProperties() {
        if (properties == null) {
            properties = new ArrayList<VisibilitySymbol>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the tableDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link Symbol }
     *     
     */
    public Symbol getTableDeclaration() {
        return tableDeclaration;
    }

    /**
     * Sets the value of the tableDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Symbol }
     *     
     */
    public void setTableDeclaration(Symbol value) {
        this.tableDeclaration = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Symbol }
     * 
     * 
     */
    public List<Symbol> getVariables() {
        if (variables == null) {
            variables = new ArrayList<Symbol>();
        }
        return this.variables;
    }

}
