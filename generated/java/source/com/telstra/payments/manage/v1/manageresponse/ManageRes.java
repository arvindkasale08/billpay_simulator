
package com.telstra.payments.manage.v1.manageresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://telstra.com/payments/manage/v1/ManageResponse}Header"/>
 *         &lt;element name="resultStatus" type="{http://telstra.com/payments/manage/v1/ManageResponse}ResultStatus"/>
 *         &lt;element name="paymentInstrumentsResults" type="{http://telstra.com/payments/manage/v1/ManageResponse}PaymentInstrumentsResults"/>
 *         &lt;element name="custDetails" type="{http://telstra.com/payments/manage/v1/ManageResponse}CustomerDetails"/>
 *         &lt;element name="paymentMethodResults" type="{http://telstra.com/payments/manage/v1/ManageResponse}PaymentMethodResults"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageRes", propOrder = {
    "header",
    "resultStatus",
    "paymentInstrumentsResults",
    "custDetails",
    "paymentMethodResults"
})
public class ManageRes {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected ResultStatus resultStatus;
    @XmlElement(required = true, nillable = true)
    protected PaymentInstrumentsResults paymentInstrumentsResults;
    @XmlElement(required = true, nillable = true)
    protected CustomerDetails custDetails;
    @XmlElement(required = true, nillable = true)
    protected PaymentMethodResults paymentMethodResults;

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
     * Gets the value of the resultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatus }
     *     
     */
    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    /**
     * Sets the value of the resultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatus }
     *     
     */
    public void setResultStatus(ResultStatus value) {
        this.resultStatus = value;
    }

    /**
     * Gets the value of the paymentInstrumentsResults property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentsResults }
     *     
     */
    public PaymentInstrumentsResults getPaymentInstrumentsResults() {
        return paymentInstrumentsResults;
    }

    /**
     * Sets the value of the paymentInstrumentsResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentsResults }
     *     
     */
    public void setPaymentInstrumentsResults(PaymentInstrumentsResults value) {
        this.paymentInstrumentsResults = value;
    }

    /**
     * Gets the value of the custDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetails }
     *     
     */
    public CustomerDetails getCustDetails() {
        return custDetails;
    }

    /**
     * Sets the value of the custDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetails }
     *     
     */
    public void setCustDetails(CustomerDetails value) {
        this.custDetails = value;
    }

    /**
     * Gets the value of the paymentMethodResults property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodResults }
     *     
     */
    public PaymentMethodResults getPaymentMethodResults() {
        return paymentMethodResults;
    }

    /**
     * Sets the value of the paymentMethodResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodResults }
     *     
     */
    public void setPaymentMethodResults(PaymentMethodResults value) {
        this.paymentMethodResults = value;
    }

}
