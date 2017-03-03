
package com.telstra.payments.manage.v1.manageresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentMethodList" type="{http://telstra.com/payments/manage/v1/ManageResponse}PaymentMethodList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodResults", propOrder = {
    "transCount",
    "paymentMethodList"
})
public class PaymentMethodResults {

    @XmlElement(required = true, nillable = true)
    protected String transCount;
    @XmlElement(nillable = true)
    protected List<PaymentMethodList> paymentMethodList;

    /**
     * Gets the value of the transCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransCount() {
        return transCount;
    }

    /**
     * Sets the value of the transCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransCount(String value) {
        this.transCount = value;
    }

    /**
     * Gets the value of the paymentMethodList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethodList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodList }
     * 
     * 
     */
    public List<PaymentMethodList> getPaymentMethodList() {
        if (paymentMethodList == null) {
            paymentMethodList = new ArrayList<PaymentMethodList>();
        }
        return this.paymentMethodList;
    }

}
