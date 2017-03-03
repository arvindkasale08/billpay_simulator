
package com.telstra.payments.gimmi.setup.setupresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetUpRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetUpRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://telstra.com/payments/gimmi/setup/SetUpResponse}Header"/>
 *         &lt;element name="gimmiResult" type="{http://telstra.com/payments/gimmi/setup/SetUpResponse}GimmiResult"/>
 *         &lt;element name="gimmiSegment" type="{http://telstra.com/payments/gimmi/setup/SetUpResponse}GimmiSegment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetUpRes", propOrder = {
    "header",
    "gimmiResult",
    "gimmiSegment"
})
public class SetUpRes {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected GimmiResult gimmiResult;
    @XmlElement(required = true, nillable = true)
    protected GimmiSegment gimmiSegment;

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
     * Gets the value of the gimmiResult property.
     * 
     * @return
     *     possible object is
     *     {@link GimmiResult }
     *     
     */
    public GimmiResult getGimmiResult() {
        return gimmiResult;
    }

    /**
     * Sets the value of the gimmiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GimmiResult }
     *     
     */
    public void setGimmiResult(GimmiResult value) {
        this.gimmiResult = value;
    }

    /**
     * Gets the value of the gimmiSegment property.
     * 
     * @return
     *     possible object is
     *     {@link GimmiSegment }
     *     
     */
    public GimmiSegment getGimmiSegment() {
        return gimmiSegment;
    }

    /**
     * Sets the value of the gimmiSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GimmiSegment }
     *     
     */
    public void setGimmiSegment(GimmiSegment value) {
        this.gimmiSegment = value;
    }

}
