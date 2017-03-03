
package com.telstra.payments.gimmi.setup.setuprequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentPresence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentReferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentInstance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doDuplicateCheck" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rrn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMetaData", propOrder = {
    "paymentType",
    "finInstrumentPresence",
    "finInstrumentReferenceType",
    "finInstrumentReference",
    "finInstrumentInstance",
    "amount",
    "doDuplicateCheck",
    "priority",
    "rrn",
    "statement",
    "authId"
})
public class PaymentMetaData {

    @XmlElement(required = true, nillable = true)
    protected String paymentType;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentPresence;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentReferenceType;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentReference;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentInstance;
    @XmlElement(required = true, nillable = true)
    protected String amount;
    @XmlElement(required = true, nillable = true)
    protected String doDuplicateCheck;
    @XmlElement(required = true, nillable = true)
    protected String priority;
    @XmlElement(required = true, nillable = true)
    protected String rrn;
    @XmlElement(required = true, nillable = true)
    protected String statement;
    @XmlElement(required = true, nillable = true)
    protected String authId;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the finInstrumentPresence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentPresence() {
        return finInstrumentPresence;
    }

    /**
     * Sets the value of the finInstrumentPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentPresence(String value) {
        this.finInstrumentPresence = value;
    }

    /**
     * Gets the value of the finInstrumentReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentReferenceType() {
        return finInstrumentReferenceType;
    }

    /**
     * Sets the value of the finInstrumentReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentReferenceType(String value) {
        this.finInstrumentReferenceType = value;
    }

    /**
     * Gets the value of the finInstrumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentReference() {
        return finInstrumentReference;
    }

    /**
     * Sets the value of the finInstrumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentReference(String value) {
        this.finInstrumentReference = value;
    }

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the doDuplicateCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoDuplicateCheck() {
        return doDuplicateCheck;
    }

    /**
     * Sets the value of the doDuplicateCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoDuplicateCheck(String value) {
        this.doDuplicateCheck = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the rrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrn() {
        return rrn;
    }

    /**
     * Sets the value of the rrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrn(String value) {
        this.rrn = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatement(String value) {
        this.statement = value;
    }

    /**
     * Gets the value of the authId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthId() {
        return authId;
    }

    /**
     * Sets the value of the authId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthId(String value) {
        this.authId = value;
    }

}
