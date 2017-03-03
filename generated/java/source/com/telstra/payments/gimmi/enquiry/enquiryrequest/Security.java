
package com.telstra.payments.gimmi.enquiry.enquiryrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Security complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Security">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemSecurityToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userSecurityToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security", propOrder = {
    "serverId",
    "systemSecurityToken",
    "userSecurityToken"
})
public class Security {

    @XmlElement(required = true, nillable = true)
    protected String serverId;
    @XmlElement(required = true, nillable = true)
    protected String systemSecurityToken;
    @XmlElement(required = true, nillable = true)
    protected String userSecurityToken;

    /**
     * Gets the value of the serverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the systemSecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemSecurityToken() {
        return systemSecurityToken;
    }

    /**
     * Sets the value of the systemSecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemSecurityToken(String value) {
        this.systemSecurityToken = value;
    }

    /**
     * Gets the value of the userSecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSecurityToken() {
        return userSecurityToken;
    }

    /**
     * Sets the value of the userSecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSecurityToken(String value) {
        this.userSecurityToken = value;
    }

}
