
package com.telstra.payments.gimmi.enquiry.enquiryrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnqRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnqRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryRequest}Header"/>
 *         &lt;element name="enquirySegment" type="{http://telstra.com/payments/gimmi/enquiry/EnquiryRequest}EnquirySegment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnqRequest", propOrder = {
    "header",
    "enquirySegment"
})
public class EnqRequest {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected EnquirySegment enquirySegment;

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
     * Gets the value of the enquirySegment property.
     * 
     * @return
     *     possible object is
     *     {@link EnquirySegment }
     *     
     */
    public EnquirySegment getEnquirySegment() {
        return enquirySegment;
    }

    /**
     * Sets the value of the enquirySegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquirySegment }
     *     
     */
    public void setEnquirySegment(EnquirySegment value) {
        this.enquirySegment = value;
    }

}
