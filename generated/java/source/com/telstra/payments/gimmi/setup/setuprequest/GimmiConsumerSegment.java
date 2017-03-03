
package com.telstra.payments.gimmi.setup.setuprequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GimmiConsumerSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GimmiConsumerSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consumerReturnURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerReferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerInfoMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gimmiProxyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userInteractionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GimmiConsumerSegment", propOrder = {
    "consumerReturnURL",
    "consumerReferenceType",
    "consumerReferenceID",
    "consumerInfoMessage",
    "transactionDescription",
    "gimmiProxyType",
    "userInteractionType"
})
public class GimmiConsumerSegment {

    @XmlElement(required = true)
    protected String consumerReturnURL;
    @XmlElement(required = true)
    protected String consumerReferenceType;
    @XmlElement(required = true, nillable = true)
    protected String consumerReferenceID;
    @XmlElement(required = true, nillable = true)
    protected String consumerInfoMessage;
    @XmlElement(required = true, nillable = true)
    protected String transactionDescription;
    @XmlElement(required = true)
    protected String gimmiProxyType;
    @XmlElement(required = true)
    protected String userInteractionType;

    /**
     * Gets the value of the consumerReturnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerReturnURL() {
        return consumerReturnURL;
    }

    /**
     * Sets the value of the consumerReturnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerReturnURL(String value) {
        this.consumerReturnURL = value;
    }

    /**
     * Gets the value of the consumerReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerReferenceType() {
        return consumerReferenceType;
    }

    /**
     * Sets the value of the consumerReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerReferenceType(String value) {
        this.consumerReferenceType = value;
    }

    /**
     * Gets the value of the consumerReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerReferenceID() {
        return consumerReferenceID;
    }

    /**
     * Sets the value of the consumerReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerReferenceID(String value) {
        this.consumerReferenceID = value;
    }

    /**
     * Gets the value of the consumerInfoMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerInfoMessage() {
        return consumerInfoMessage;
    }

    /**
     * Sets the value of the consumerInfoMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerInfoMessage(String value) {
        this.consumerInfoMessage = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the gimmiProxyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGimmiProxyType() {
        return gimmiProxyType;
    }

    /**
     * Sets the value of the gimmiProxyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGimmiProxyType(String value) {
        this.gimmiProxyType = value;
    }

    /**
     * Gets the value of the userInteractionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInteractionType() {
        return userInteractionType;
    }

    /**
     * Sets the value of the userInteractionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInteractionType(String value) {
        this.userInteractionType = value;
    }

}
