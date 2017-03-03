
package com.telstra.payments.gimmi.setup.setupresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GimmiSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GimmiSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billPayTokenID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billPayRedirectURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GimmiSegment", propOrder = {
    "billPayTokenID",
    "billPayRedirectURL"
})
public class GimmiSegment {

    @XmlElement(required = true, nillable = true)
    protected String billPayTokenID;
    @XmlElement(required = true, nillable = true)
    protected String billPayRedirectURL;

    /**
     * Gets the value of the billPayTokenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPayTokenID() {
        return billPayTokenID;
    }

    /**
     * Sets the value of the billPayTokenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPayTokenID(String value) {
        this.billPayTokenID = value;
    }

    /**
     * Gets the value of the billPayRedirectURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPayRedirectURL() {
        return billPayRedirectURL;
    }

    /**
     * Sets the value of the billPayRedirectURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPayRedirectURL(String value) {
        this.billPayRedirectURL = value;
    }

}
