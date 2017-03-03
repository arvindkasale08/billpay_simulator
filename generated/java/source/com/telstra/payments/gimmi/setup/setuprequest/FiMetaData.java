
package com.telstra.payments.gimmi.setup.setuprequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FiMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finInstrumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentReferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finInstrumentInstance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiMetaData", propOrder = {
    "finInstrumentType",
    "finInstrumentReferenceType",
    "finInstrumentReference",
    "finInstrumentInstance"
})
public class FiMetaData {

    @XmlElement(required = true, nillable = true)
    protected String finInstrumentType;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentReferenceType;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentReference;
    @XmlElement(required = true, nillable = true)
    protected String finInstrumentInstance;

    /**
     * Gets the value of the finInstrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrumentType() {
        return finInstrumentType;
    }

    /**
     * Sets the value of the finInstrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrumentType(String value) {
        this.finInstrumentType = value;
    }

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

}
