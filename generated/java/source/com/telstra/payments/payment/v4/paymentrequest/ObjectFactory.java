
package com.telstra.payments.payment.v4.paymentrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telstra.payments.payment.v4.paymentrequest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PaymentRequest_QNAME = new QName("http://telstra.com/payments/payment/v4/PaymentRequest", "PaymentRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telstra.payments.payment.v4.paymentrequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinancialRequest }
     * 
     */
    public FinancialRequest createFinancialRequest() {
        return new FinancialRequest();
    }

    /**
     * Create an instance of {@link CreditCardDetails }
     * 
     */
    public CreditCardDetails createCreditCardDetails() {
        return new CreditCardDetails();
    }

    /**
     * Create an instance of {@link ServiceInfo }
     * 
     */
    public ServiceInfo createServiceInfo() {
        return new ServiceInfo();
    }

    /**
     * Create an instance of {@link PaymentSecurity }
     * 
     */
    public PaymentSecurity createPaymentSecurity() {
        return new PaymentSecurity();
    }

    /**
     * Create an instance of {@link FIMetaData }
     * 
     */
    public FIMetaData createFIMetaData() {
        return new FIMetaData();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link PaymentMetaData }
     * 
     */
    public PaymentMetaData createPaymentMetaData() {
        return new PaymentMetaData();
    }

    /**
     * Create an instance of {@link BankAccountDetails }
     * 
     */
    public BankAccountDetails createBankAccountDetails() {
        return new BankAccountDetails();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/payment/v4/PaymentRequest", name = "PaymentRequest")
    public JAXBElement<FinancialRequest> createPaymentRequest(FinancialRequest value) {
        return new JAXBElement<FinancialRequest>(_PaymentRequest_QNAME, FinancialRequest.class, null, value);
    }

}
