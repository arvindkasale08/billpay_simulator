
package com.telstra.payments.gimmi.setup.setuprequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDetails", propOrder = {
    "firstName",
    "surName",
    "businessName",
    "abn",
    "billingAddress1",
    "billingAddress2",
    "state",
    "postCode",
    "contactPhone",
    "emailAddress"
})
public class CustomerDetails {

    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String surName;
    @XmlElement(required = true, nillable = true)
    protected String businessName;
    @XmlElement(required = true, nillable = true)
    protected String abn;
    @XmlElement(required = true, nillable = true)
    protected String billingAddress1;
    @XmlElement(required = true, nillable = true)
    protected String billingAddress2;
    @XmlElement(required = true, nillable = true)
    protected String state;
    @XmlElement(required = true, nillable = true)
    protected String postCode;
    @XmlElement(required = true, nillable = true)
    protected String contactPhone;
    @XmlElement(required = true, nillable = true)
    protected String emailAddress;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the surName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the abn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbn() {
        return abn;
    }

    /**
     * Sets the value of the abn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbn(String value) {
        this.abn = value;
    }

    /**
     * Gets the value of the billingAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress1() {
        return billingAddress1;
    }

    /**
     * Sets the value of the billingAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress1(String value) {
        this.billingAddress1 = value;
    }

    /**
     * Gets the value of the billingAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress2() {
        return billingAddress2;
    }

    /**
     * Sets the value of the billingAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress2(String value) {
        this.billingAddress2 = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
