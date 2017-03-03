
package com.telstra.payments.gimmi.enquiry.enquiryresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PANDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameOnCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardHolderFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardHolderLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PANDetails", propOrder = {
    "cardNo",
    "expiryMonth",
    "expiryYear",
    "nameOnCard",
    "creditCardHolderFirstName",
    "creditCardHolderLastName"
})
public class PANDetails {

    @XmlElement(required = true, nillable = true)
    protected String cardNo;
    @XmlElement(required = true, nillable = true)
    protected String expiryMonth;
    @XmlElement(required = true, nillable = true)
    protected String expiryYear;
    @XmlElement(required = true, nillable = true)
    protected String nameOnCard;
    @XmlElement(required = true, nillable = true)
    protected String creditCardHolderFirstName;
    @XmlElement(required = true, nillable = true)
    protected String creditCardHolderLastName;

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonth(String value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
    }

    /**
     * Gets the value of the creditCardHolderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardHolderFirstName() {
        return creditCardHolderFirstName;
    }

    /**
     * Sets the value of the creditCardHolderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardHolderFirstName(String value) {
        this.creditCardHolderFirstName = value;
    }

    /**
     * Gets the value of the creditCardHolderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardHolderLastName() {
        return creditCardHolderLastName;
    }

    /**
     * Sets the value of the creditCardHolderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardHolderLastName(String value) {
        this.creditCardHolderLastName = value;
    }

}
