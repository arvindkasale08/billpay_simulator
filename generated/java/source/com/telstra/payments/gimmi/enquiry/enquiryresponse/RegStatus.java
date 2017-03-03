
package com.telstra.payments.gimmi.enquiry.enquiryresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regCleanUpDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegStatus", propOrder = {
    "regExpiryDate",
    "regCleanUpDate"
})
public class RegStatus {

    @XmlElement(required = true, nillable = true)
    protected String regExpiryDate;
    @XmlElement(required = true, nillable = true)
    protected String regCleanUpDate;

    /**
     * Gets the value of the regExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExpiryDate() {
        return regExpiryDate;
    }

    /**
     * Sets the value of the regExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExpiryDate(String value) {
        this.regExpiryDate = value;
    }

    /**
     * Gets the value of the regCleanUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegCleanUpDate() {
        return regCleanUpDate;
    }

    /**
     * Sets the value of the regCleanUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegCleanUpDate(String value) {
        this.regCleanUpDate = value;
    }

}
