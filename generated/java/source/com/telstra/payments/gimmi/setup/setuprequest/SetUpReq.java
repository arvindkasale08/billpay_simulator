
package com.telstra.payments.gimmi.setup.setuprequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetUpReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetUpReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://telstra.com/payments/gimmi/setup/SetUpRequest}Header"/>
 *         &lt;element name="gimmiConsumerSegment" type="{http://telstra.com/payments/gimmi/setup/SetUpRequest}GimmiConsumerSegment"/>
 *         &lt;element name="fiMetaData" type="{http://telstra.com/payments/gimmi/setup/SetUpRequest}FiMetaData"/>
 *         &lt;element name="paymentData" type="{http://telstra.com/payments/gimmi/setup/SetUpRequest}PaymentMetaData"/>
 *         &lt;element name="custDetails" type="{http://telstra.com/payments/gimmi/setup/SetUpRequest}CustomerDetails"/>
 *         &lt;element name="serviceInfo" type="{http://telstra.com/payments/gimmi/setup/SetUpRequest}ServiceInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetUpReq", propOrder = {
    "header",
    "gimmiConsumerSegment",
    "fiMetaData",
    "paymentData",
    "custDetails",
    "serviceInfo"
})
public class SetUpReq {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected GimmiConsumerSegment gimmiConsumerSegment;
    @XmlElement(required = true, nillable = true)
    protected FiMetaData fiMetaData;
    @XmlElement(required = true, nillable = true)
    protected PaymentMetaData paymentData;
    @XmlElement(required = true, nillable = true)
    protected CustomerDetails custDetails;
    @XmlElement(required = true, nillable = true)
    protected ServiceInfo serviceInfo;

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
     * Gets the value of the gimmiConsumerSegment property.
     * 
     * @return
     *     possible object is
     *     {@link GimmiConsumerSegment }
     *     
     */
    public GimmiConsumerSegment getGimmiConsumerSegment() {
        return gimmiConsumerSegment;
    }

    /**
     * Sets the value of the gimmiConsumerSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GimmiConsumerSegment }
     *     
     */
    public void setGimmiConsumerSegment(GimmiConsumerSegment value) {
        this.gimmiConsumerSegment = value;
    }

    /**
     * Gets the value of the fiMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link FiMetaData }
     *     
     */
    public FiMetaData getFiMetaData() {
        return fiMetaData;
    }

    /**
     * Sets the value of the fiMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiMetaData }
     *     
     */
    public void setFiMetaData(FiMetaData value) {
        this.fiMetaData = value;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMetaData }
     *     
     */
    public PaymentMetaData getPaymentData() {
        return paymentData;
    }

    /**
     * Sets the value of the paymentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMetaData }
     *     
     */
    public void setPaymentData(PaymentMetaData value) {
        this.paymentData = value;
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
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfo }
     *     
     */
    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfo }
     *     
     */
    public void setServiceInfo(ServiceInfo value) {
        this.serviceInfo = value;
    }

}
