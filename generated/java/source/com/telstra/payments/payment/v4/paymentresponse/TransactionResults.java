
package com.telstra.payments.payment.v4.paymentresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="settlementDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="translatedPan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalResponse" type="{http://telstra.com/payments/payment/v4/PaymentResponse}FinancialResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResults", propOrder = {
    "brn",
    "authId",
    "settlementDate",
    "translatedPan",
    "originalResponse"
})
public class TransactionResults {

    @XmlElement(required = true, nillable = true)
    protected String brn;
    @XmlElement(required = true, nillable = true)
    protected String authId;
    @XmlElement(required = true, nillable = true)
    protected String settlementDate;
    @XmlElement(required = true, nillable = true)
    protected String translatedPan;
    @XmlElementRef(name = "originalResponse", namespace = "http://telstra.com/payments/payment/v4/PaymentResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<FinancialResponse> originalResponse;

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrn() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrn(String value) {
        this.brn = value;
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

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementDate(String value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the translatedPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslatedPan() {
        return translatedPan;
    }

    /**
     * Sets the value of the translatedPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslatedPan(String value) {
        this.translatedPan = value;
    }

    /**
     * Gets the value of the originalResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinancialResponse }{@code >}
     *     
     */
    public JAXBElement<FinancialResponse> getOriginalResponse() {
        return originalResponse;
    }

    /**
     * Sets the value of the originalResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinancialResponse }{@code >}
     *     
     */
    public void setOriginalResponse(JAXBElement<FinancialResponse> value) {
        this.originalResponse = value;
    }

}
