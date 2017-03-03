
package com.telstra.payments.payment.v4.paymentrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://telstra.com/payments/payment/v4/PaymentRequest}Header"/>
 *         &lt;element name="fiMetaData" type="{http://telstra.com/payments/payment/v4/PaymentRequest}FIMetaData"/>
 *         &lt;element name="paymentData" type="{http://telstra.com/payments/payment/v4/PaymentRequest}PaymentMetaData"/>
 *         &lt;element name="creditCard" type="{http://telstra.com/payments/payment/v4/PaymentRequest}CreditCardDetails"/>
 *         &lt;element name="serviceInfo" type="{http://telstra.com/payments/payment/v4/PaymentRequest}ServiceInfo"/>
 *         &lt;element name="paymentSecurity" type="{http://telstra.com/payments/payment/v4/PaymentRequest}PaymentSecurity"/>
 *         &lt;element name="bankAccountDetails" type="{http://telstra.com/payments/payment/v4/PaymentRequest}BankAccountDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRequest", propOrder = {
    "header",
    "fiMetaData",
    "paymentData",
    "creditCard",
    "serviceInfo",
    "paymentSecurity",
    "bankAccountDetails"
})
public class FinancialRequest {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected FIMetaData fiMetaData;
    @XmlElement(required = true)
    protected PaymentMetaData paymentData;
    @XmlElement(required = true, nillable = true)
    protected CreditCardDetails creditCard;
    @XmlElement(required = true)
    protected ServiceInfo serviceInfo;
    @XmlElement(required = true, nillable = true)
    protected PaymentSecurity paymentSecurity;
    @XmlElement(required = true, nillable = true)
    protected BankAccountDetails bankAccountDetails;

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
     * Gets the value of the fiMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link FIMetaData }
     *     
     */
    public FIMetaData getFiMetaData() {
        return fiMetaData;
    }

    /**
     * Sets the value of the fiMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIMetaData }
     *     
     */
    public void setFiMetaData(FIMetaData value) {
        this.fiMetaData = value;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMetaData }
     *     
     */
    public PaymentMetaData getPaymentData() {
        return paymentData;
    }

    /**
     * Sets the value of the paymentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMetaData }
     *     
     */
    public void setPaymentData(PaymentMetaData value) {
        this.paymentData = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDetails }
     *     
     */
    public CreditCardDetails getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDetails }
     *     
     */
    public void setCreditCard(CreditCardDetails value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfo }
     *     
     */
    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfo }
     *     
     */
    public void setServiceInfo(ServiceInfo value) {
        this.serviceInfo = value;
    }

    /**
     * Gets the value of the paymentSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSecurity }
     *     
     */
    public PaymentSecurity getPaymentSecurity() {
        return paymentSecurity;
    }

    /**
     * Sets the value of the paymentSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSecurity }
     *     
     */
    public void setPaymentSecurity(PaymentSecurity value) {
        this.paymentSecurity = value;
    }

    /**
     * Gets the value of the bankAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountDetails }
     *     
     */
    public BankAccountDetails getBankAccountDetails() {
        return bankAccountDetails;
    }

    /**
     * Sets the value of the bankAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountDetails }
     *     
     */
    public void setBankAccountDetails(BankAccountDetails value) {
        this.bankAccountDetails = value;
    }

}
