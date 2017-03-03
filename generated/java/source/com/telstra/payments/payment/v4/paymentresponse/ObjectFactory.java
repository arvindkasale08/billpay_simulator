
package com.telstra.payments.payment.v4.paymentresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telstra.payments.payment.v4.paymentresponse package. 
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

    private final static QName _PaymentResponse_QNAME = new QName("http://telstra.com/payments/payment/v4/PaymentResponse", "PaymentResponse");
    private final static QName _TransactionResultsOriginalResponse_QNAME = new QName("http://telstra.com/payments/payment/v4/PaymentResponse", "originalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telstra.payments.payment.v4.paymentresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinancialResponse }
     * 
     */
    public FinancialResponse createFinancialResponse() {
        return new FinancialResponse();
    }

    /**
     * Create an instance of {@link TransactionResults }
     * 
     */
    public TransactionResults createTransactionResults() {
        return new TransactionResults();
    }

    /**
     * Create an instance of {@link TopUpResults }
     * 
     */
    public TopUpResults createTopUpResults() {
        return new TopUpResults();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link ResultStatus }
     * 
     */
    public ResultStatus createResultStatus() {
        return new ResultStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/payment/v4/PaymentResponse", name = "PaymentResponse")
    public JAXBElement<FinancialResponse> createPaymentResponse(FinancialResponse value) {
        return new JAXBElement<FinancialResponse>(_PaymentResponse_QNAME, FinancialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/payment/v4/PaymentResponse", name = "originalResponse", scope = TransactionResults.class)
    public JAXBElement<FinancialResponse> createTransactionResultsOriginalResponse(FinancialResponse value) {
        return new JAXBElement<FinancialResponse>(_TransactionResultsOriginalResponse_QNAME, FinancialResponse.class, TransactionResults.class, value);
    }

}
