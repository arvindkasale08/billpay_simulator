
package com.telstra.payments.manage.v1.managerequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://telstra.com/payments/manage/v1/ManageRequest}Header"/>
 *         &lt;element name="requestData" type="{http://telstra.com/payments/manage/v1/ManageRequest}FIMetaData"/>
 *         &lt;element name="paymentMethodDetails" type="{http://telstra.com/payments/manage/v1/ManageRequest}PaymentMethodDetails"/>
 *         &lt;element name="pins" type="{http://telstra.com/payments/manage/v1/ManageRequest}PINManagement"/>
 *         &lt;element name="emailAddress" type="{http://telstra.com/payments/manage/v1/ManageRequest}EmailAddress"/>
 *         &lt;element name="authenticationDetails" type="{http://telstra.com/payments/manage/v1/ManageRequest}AuthenticationDetails"/>
 *         &lt;element name="brnDetails" type="{http://telstra.com/payments/manage/v1/ManageRequest}BRNDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageReq", propOrder = {
    "header",
    "requestData",
    "paymentMethodDetails",
    "pins",
    "emailAddress",
    "authenticationDetails",
    "brnDetails"
})
public class ManageReq {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected FIMetaData requestData;
    @XmlElement(required = true, nillable = true)
    protected PaymentMethodDetails paymentMethodDetails;
    @XmlElement(required = true, nillable = true)
    protected PINManagement pins;
    @XmlElement(required = true, nillable = true)
    protected EmailAddress emailAddress;
    @XmlElement(required = true, nillable = true)
    protected AuthenticationDetails authenticationDetails;
    @XmlElement(required = true, nillable = true)
    protected BRNDetails brnDetails;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the requestData property.
     * 
     * @return
     *     possible object is
     *     {@link FIMetaData }
     *     
     */
    public FIMetaData getRequestData() {
        return requestData;
    }

    /**
     * Sets the value of the requestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIMetaData }
     *     
     */
    public void setRequestData(FIMetaData value) {
        this.requestData = value;
    }

    /**
     * Gets the value of the paymentMethodDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodDetails }
     *     
     */
    public PaymentMethodDetails getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    /**
     * Sets the value of the paymentMethodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodDetails }
     *     
     */
    public void setPaymentMethodDetails(PaymentMethodDetails value) {
        this.paymentMethodDetails = value;
    }

    /**
     * Gets the value of the pins property.
     * 
     * @return
     *     possible object is
     *     {@link PINManagement }
     *     
     */
    public PINManagement getPins() {
        return pins;
    }

    /**
     * Sets the value of the pins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINManagement }
     *     
     */
    public void setPins(PINManagement value) {
        this.pins = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setEmailAddress(EmailAddress value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the authenticationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationDetails }
     *     
     */
    public AuthenticationDetails getAuthenticationDetails() {
        return authenticationDetails;
    }

    /**
     * Sets the value of the authenticationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationDetails }
     *     
     */
    public void setAuthenticationDetails(AuthenticationDetails value) {
        this.authenticationDetails = value;
    }

    /**
     * Gets the value of the brnDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BRNDetails }
     *     
     */
    public BRNDetails getBrnDetails() {
        return brnDetails;
    }

    /**
     * Sets the value of the brnDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRNDetails }
     *     
     */
    public void setBrnDetails(BRNDetails value) {
        this.brnDetails = value;
    }

}
