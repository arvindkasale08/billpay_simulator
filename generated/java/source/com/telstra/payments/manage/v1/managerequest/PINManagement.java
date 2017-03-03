
package com.telstra.payments.manage.v1.managerequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PINManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newPin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PINManagement", propOrder = {
    "newPin"
})
public class PINManagement {

    @XmlElement(required = true, nillable = true)
    protected String newPin;

    /**
     * Gets the value of the newPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPin() {
        return newPin;
    }

    /**
     * Sets the value of the newPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPin(String value) {
        this.newPin = value;
    }

}
