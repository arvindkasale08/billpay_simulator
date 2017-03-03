
package com.telstra.payments.payment.v4.paymentrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAccountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agreedTAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fiBranch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bsb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountHolderFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountHolderLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tacAgreedDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccountDetails", propOrder = {
    "agreedTAC",
    "fiName",
    "fiBranch",
    "bsb",
    "bankAccountNumber",
    "bankAccountName",
    "accountHolderFirstName",
    "accountHolderLastName",
    "tacAgreedDateTime"
})
public class BankAccountDetails {

    @XmlElement(required = true, nillable = true)
    protected String agreedTAC;
    @XmlElement(required = true, nillable = true)
    protected String fiName;
    @XmlElement(required = true, nillable = true)
    protected String fiBranch;
    @XmlElement(required = true, nillable = true)
    protected String bsb;
    @XmlElement(required = true, nillable = true)
    protected String bankAccountNumber;
    @XmlElement(required = true, nillable = true)
    protected String bankAccountName;
    @XmlElement(required = true, nillable = true)
    protected String accountHolderFirstName;
    @XmlElement(required = true, nillable = true)
    protected String accountHolderLastName;
    @XmlElement(required = true, nillable = true)
    protected String tacAgreedDateTime;

    /**
     * Gets the value of the agreedTAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreedTAC() {
        return agreedTAC;
    }

    /**
     * Sets the value of the agreedTAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreedTAC(String value) {
        this.agreedTAC = value;
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
     * Gets the value of the tacAgreedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTacAgreedDateTime() {
        return tacAgreedDateTime;
    }

    /**
     * Sets the value of the tacAgreedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTacAgreedDateTime(String value) {
        this.tacAgreedDateTime = value;
    }

}
