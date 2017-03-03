
package com.telstra.payments.manage.v1.manageresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrumentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInstrumentList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finInstrumentInstance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentInstrumentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonPICode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maskedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountHolderFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountHolderLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bsb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fiBranch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrumentList", propOrder = {
    "finInstrumentInstance",
    "finInstrumentType",
    "paymentInstrumentStatus",
    "reasonPICode",
    "maskedCardNumber",
    "expiryMonth",
    "expiryYear",
    "accountHolderFirstName",
    "accountHolderLastName",
    "bsb",
    "bankAccountNumber",
    "fiName",
    "fiBranch",
    "bankAccountName"
})
public class PaymentInstrumentList {

    @XmlElement(required = true, nillable = true)
    protected String finInstrumentInstance;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentType;
    @XmlElement(required = true, nillable = true)
    protected String paymentInstrumentStatus;
    @XmlElement(required = true, nillable = true)
    protected String reasonPICode;
    @XmlElement(required = true, nillable = true)
    protected String maskedCardNumber;
    @XmlElement(required = true, nillable = true)
    protected String expiryMonth;
    @XmlElement(required = true, nillable = true)
    protected String expiryYear;
    @XmlElement(required = true, nillable = true)
    protected String accountHolderFirstName;
    @XmlElement(required = true, nillable = true)
    protected String accountHolderLastName;
    @XmlElement(required = true, nillable = true)
    protected String bsb;
    @XmlElement(required = true, nillable = true)
    protected String bankAccountNumber;
    @XmlElement(required = true, nillable = true)
    protected String fiName;
    @XmlElement(required = true, nillable = true)
    protected String fiBranch;
    @XmlElement(required = true, nillable = true)
    protected String bankAccountName;

    /**
     * Gets the value of the finInstrumentInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentInstance() {
        return finInstrumentInstance;
    }

    /**
     * Sets the value of the finInstrumentInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentInstance(String value) {
        this.finInstrumentInstance = value;
    }

    /**
     * Gets the value of the finInstrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentType() {
        return finInstrumentType;
    }

    /**
     * Sets the value of the finInstrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentType(String value) {
        this.finInstrumentType = value;
    }

    /**
     * Gets the value of the paymentInstrumentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstrumentStatus() {
        return paymentInstrumentStatus;
    }

    /**
     * Sets the value of the paymentInstrumentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstrumentStatus(String value) {
        this.paymentInstrumentStatus = value;
    }

    /**
     * Gets the value of the reasonPICode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonPICode() {
        return reasonPICode;
    }

    /**
     * Sets the value of the reasonPICode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonPICode(String value) {
        this.reasonPICode = value;
    }

    /**
     * Gets the value of the maskedCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * Sets the value of the maskedCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCardNumber(String value) {
        this.maskedCardNumber = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonth(String value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the accountHolderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderFirstName() {
        return accountHolderFirstName;
    }

    /**
     * Sets the value of the accountHolderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderFirstName(String value) {
        this.accountHolderFirstName = value;
    }

    /**
     * Gets the value of the accountHolderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderLastName() {
        return accountHolderLastName;
    }

    /**
     * Sets the value of the accountHolderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderLastName(String value) {
        this.accountHolderLastName = value;
    }

    /**
     * Gets the value of the bsb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsb() {
        return bsb;
    }

    /**
     * Sets the value of the bsb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsb(String value) {
        this.bsb = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the fiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiName() {
        return fiName;
    }

    /**
     * Sets the value of the fiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiName(String value) {
        this.fiName = value;
    }

    /**
     * Gets the value of the fiBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiBranch() {
        return fiBranch;
    }

    /**
     * Sets the value of the fiBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiBranch(String value) {
        this.fiBranch = value;
    }

    /**
     * Gets the value of the bankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Sets the value of the bankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountName(String value) {
        this.bankAccountName = value;
    }

}
