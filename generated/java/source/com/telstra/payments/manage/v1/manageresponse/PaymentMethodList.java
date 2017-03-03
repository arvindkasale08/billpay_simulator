
package com.telstra.payments.manage.v1.manageresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="banType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentInstance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentMethodStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonPMCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dayOfMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextPayDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechargeInterval" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodList", propOrder = {
    "banType",
    "ban",
    "type",
    "finInstrumentInstance",
    "paymentMethodStatus",
    "reasonPMCode",
    "amount",
    "dayOfMonth",
    "frequency",
    "startDate",
    "nextPayDate",
    "rechargeInterval"
})
public class PaymentMethodList {

    @XmlElement(required = true, nillable = true)
    protected String banType;
    @XmlElement(required = true, nillable = true)
    protected String ban;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentInstance;
    @XmlElement(required = true, nillable = true)
    protected String paymentMethodStatus;
    @XmlElement(required = true, nillable = true)
    protected String reasonPMCode;
    @XmlElement(required = true, nillable = true)
    protected String amount;
    @XmlElement(required = true, nillable = true)
    protected String dayOfMonth;
    @XmlElement(required = true, nillable = true)
    protected String frequency;
    @XmlElement(required = true, nillable = true)
    protected String startDate;
    @XmlElement(required = true, nillable = true)
    protected String nextPayDate;
    @XmlElement(required = true, nillable = true)
    protected String rechargeInterval;

    /**
     * Gets the value of the banType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanType() {
        return banType;
    }

    /**
     * Sets the value of the banType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanType(String value) {
        this.banType = value;
    }

    /**
     * Gets the value of the ban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBan(String value) {
        this.ban = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the paymentMethodStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodStatus() {
        return paymentMethodStatus;
    }

    /**
     * Sets the value of the paymentMethodStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodStatus(String value) {
        this.paymentMethodStatus = value;
    }

    /**
     * Gets the value of the reasonPMCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonPMCode() {
        return reasonPMCode;
    }

    /**
     * Sets the value of the reasonPMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonPMCode(String value) {
        this.reasonPMCode = value;
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
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfMonth(String value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the nextPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPayDate() {
        return nextPayDate;
    }

    /**
     * Sets the value of the nextPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPayDate(String value) {
        this.nextPayDate = value;
    }

    /**
     * Gets the value of the rechargeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeInterval() {
        return rechargeInterval;
    }

    /**
     * Sets the value of the rechargeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeInterval(String value) {
        this.rechargeInterval = value;
    }

}
