
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="DelegatedUsers" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ManagedUsers" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserPreferences" type="{urn:tooling.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkspaceId" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "delegatedUsers",
    "managedUsers",
    "userPreferences",
    "username",
    "workspaceId"
})
public class User
    extends SObject
{

    @XmlElementRef(name = "DelegatedUsers", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> delegatedUsers;
    @XmlElementRef(name = "ManagedUsers", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> managedUsers;
    @XmlElementRef(name = "UserPreferences", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResult> userPreferences;
    @XmlElementRef(name = "Username", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "WorkspaceId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workspaceId;

    /**
     * Gets the value of the delegatedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getDelegatedUsers() {
        return delegatedUsers;
    }

    /**
     * Sets the value of the delegatedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setDelegatedUsers(JAXBElement<QueryResult> value) {
        this.delegatedUsers = value;
    }

    /**
     * Gets the value of the managedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getManagedUsers() {
        return managedUsers;
    }

    /**
     * Sets the value of the managedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setManagedUsers(JAXBElement<QueryResult> value) {
        this.managedUsers = value;
    }

    /**
     * Gets the value of the userPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public JAXBElement<QueryResult> getUserPreferences() {
        return userPreferences;
    }

    /**
     * Sets the value of the userPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResult }{@code >}
     *     
     */
    public void setUserPreferences(JAXBElement<QueryResult> value) {
        this.userPreferences = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

    /**
     * Gets the value of the workspaceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkspaceId() {
        return workspaceId;
    }

    /**
     * Sets the value of the workspaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkspaceId(JAXBElement<String> value) {
        this.workspaceId = value;
    }

}
