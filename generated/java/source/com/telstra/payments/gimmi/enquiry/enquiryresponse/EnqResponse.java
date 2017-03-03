
package com.telstra.payments.gimmi.enquiry.enquiryresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnqResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnqResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryResponse}Header"/>
 *         &lt;element name="gimmiResult" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryResponse}GimmiResult"/>
 *         &lt;element name="resultStatus" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryResponse}ResultStatus"/>
 *         &lt;element name="tranResults" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryResponse}TransactionResults"/>
 *         &lt;element name="topUpResults" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryResponse}TopUpResults"/>
 *         &lt;element name="regStatus" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryResponse}RegStatus"/>
 *         &lt;element name="panDetails" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryResponse}PANDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnqResponse", propOrder = {
    "header",
    "gimmiResult",
    "resultStatus",
    "tranResults",
    "topUpResults",
    "regStatus",
    "panDetails"
})
public class EnqResponse {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected GimmiResult gimmiResult;
    @XmlElement(required = true, nillable = true)
    protected ResultStatus resultStatus;
    @XmlElement(required = true, nillable = true)
    protected TransactionResults tranResults;
    @XmlElement(required = true, nillable = true)
    protected TopUpResults topUpResults;
    @XmlElement(required = true, nillable = true)
    protected RegStatus regStatus;
    @XmlElement(required = true, nillable = true)
    protected PANDetails panDetails;

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
     * Gets the value of the gimmiResult property.
     * 
     * @return
     *     possible object is
     *     {@link GimmiResult }
     *     
     */
    public GimmiResult getGimmiResult() {
        return gimmiResult;
    }

    /**
     * Sets the value of the gimmiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GimmiResult }
     *     
     */
    public void setGimmiResult(GimmiResult value) {
        this.gimmiResult = value;
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

    /**
     * Gets the value of the regStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegStatus }
     *     
     */
    public RegStatus getRegStatus() {
        return regStatus;
    }

    /**
     * Sets the value of the regStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegStatus }
     *     
     */
    public void setRegStatus(RegStatus value) {
        this.regStatus = value;
    }

    /**
     * Gets the value of the panDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PANDetails }
     *     
     */
    public PANDetails getPanDetails() {
        return panDetails;
    }

    /**
     * Sets the value of the panDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDetails }
     *     
     */
    public void setPanDetails(PANDetails value) {
        this.panDetails = value;
    }

}
