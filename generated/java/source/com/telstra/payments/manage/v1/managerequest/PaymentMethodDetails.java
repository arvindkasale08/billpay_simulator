
package com.telstra.payments.manage.v1.managerequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="banType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dayOfMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="futureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PaymentMethodDetails", propOrder = {
    "banType",
    "ban",
    "type",
    "amount",
    "dayOfMonth",
    "futureDate",
    "frequency",
    "rechargeInterval"
})
public class PaymentMethodDetails {

    @XmlElement(required = true, nillable = true)
    protected String banType;
    @XmlElement(required = true, nillable = true)
    protected String ban;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String amount;
    @XmlElement(required = true, nillable = true)
    protected String dayOfMonth;
    @XmlElement(required = true, nillable = true)
    protected String futureDate;
    @XmlElement(required = true, nillable = true)
    protected String frequency;
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
     * Gets the value of the futureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureDate() {
        return futureDate;
    }

    /**
     * Sets the value of the futureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureDate(String value) {
        this.futureDate = value;
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
