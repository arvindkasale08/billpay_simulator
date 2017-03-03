
package com.telstra.payments.payment.v4.paymentresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://telstra.com/payments/payment/v4/PaymentResponse}Header"/>
 *         &lt;element name="resultStatus" type="{http://telstra.com/payments/payment/v4/PaymentResponse}ResultStatus"/>
 *         &lt;element name="tranResults" type="{http://telstra.com/payments/payment/v4/PaymentResponse}TransactionResults"/>
 *         &lt;element name="topUpResults" type="{http://telstra.com/payments/payment/v4/PaymentResponse}TopUpResults"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialResponse", propOrder = {
    "header",
    "resultStatus",
    "tranResults",
    "topUpResults"
})
public class FinancialResponse {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected ResultStatus resultStatus;
    @XmlElement(required = true, nillable = true)
    protected TransactionResults tranResults;
    @XmlElement(required = true, nillable = true)
    protected TopUpResults topUpResults;

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
     * Gets the value of the tranResults property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionResults }
     *     
     */
    public TransactionResults getTranResults() {
        return tranResults;
    }

    /**
     * Sets the value of the tranResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionResults }
     *     
     */
    public void setTranResults(TransactionResults value) {
        this.tranResults = value;
    }

    /**
     * Gets the value of the topUpResults property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpResults }
     *     
     */
    public TopUpResults getTopUpResults() {
        return topUpResults;
    }

    /**
     * Sets the value of the topUpResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpResults }
     *     
     */
    public void setTopUpResults(TopUpResults value) {
        this.topUpResults = value;
    }

}
