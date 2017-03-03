
package com.telstra.payments.payment.v4.paymentresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tranStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultStatus", propOrder = {
    "tranStatus",
    "responseCode",
    "responseText"
})
public class ResultStatus {

    protected int tranStatus;
    @XmlElement(required = true, nillable = true)
    protected String responseCode;
    @XmlElement(required = true, nillable = true)
    protected String responseText;

    /**
     * Gets the value of the tranStatus property.
     * 
     */
    public int getTranStatus() {
        return tranStatus;
    }

    /**
     * Sets the value of the tranStatus property.
     * 
     */
    public void setTranStatus(int value) {
        this.tranStatus = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Sets the value of the responseText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

}
