
package com.telstra.payments.payment.v4.paymentresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopUpResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopUpResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creditExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopUpResults", propOrder = {
    "currentBalance",
    "creditExpiryDate"
})
public class TopUpResults {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer currentBalance;
    @XmlElement(required = true, nillable = true)
    protected String creditExpiryDate;

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentBalance(Integer value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the creditExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditExpiryDate() {
        return creditExpiryDate;
    }

    /**
     * Sets the value of the creditExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditExpiryDate(String value) {
        this.creditExpiryDate = value;
    }

}
