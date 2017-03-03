
package com.telstra.payments.gimmi.setup.setupresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GimmiResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GimmiResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GimmiResult", propOrder = {
    "resultState",
    "reasonCode",
    "reasonText"
})
public class GimmiResult {

    @XmlElement(required = true)
    protected String resultState;
    @XmlElement(required = true)
    protected String reasonCode;
    @XmlElement(required = true)
    protected String reasonText;

    /**
     * Gets the value of the resultState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultState() {
        return resultState;
    }

    /**
     * Sets the value of the resultState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultState(String value) {
        this.resultState = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonText() {
        return reasonText;
    }

    /**
     * Sets the value of the reasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonText(String value) {
        this.reasonText = value;
    }

}
