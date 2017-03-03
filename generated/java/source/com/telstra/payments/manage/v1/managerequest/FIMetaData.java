
package com.telstra.payments.manage.v1.managerequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FIMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finInstrumentReferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentInstance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIMetaData", propOrder = {
    "finInstrumentReferenceType",
    "finInstrumentReference",
    "finInstrumentInstance",
    "reason"
})
public class FIMetaData {

    @XmlElement(required = true)
    protected String finInstrumentReferenceType;
    @XmlElement(required = true)
    protected String finInstrumentReference;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentInstance;
    @XmlElement(required = true, nillable = true)
    protected String reason;

    /**
     * Gets the value of the finInstrumentReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentReferenceType() {
        return finInstrumentReferenceType;
    }

    /**
     * Sets the value of the finInstrumentReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentReferenceType(String value) {
        this.finInstrumentReferenceType = value;
    }

    /**
     * Gets the value of the finInstrumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentReference() {
        return finInstrumentReference;
    }

    /**
     * Sets the value of the finInstrumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentReference(String value) {
        this.finInstrumentReference = value;
    }

    /**
     * Gets the value of the finInstrumentInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentInstance() {
        return finInstrumentInstance;
    }

    /**
     * Sets the value of the finInstrumentInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentInstance(String value) {
        this.finInstrumentInstance = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
