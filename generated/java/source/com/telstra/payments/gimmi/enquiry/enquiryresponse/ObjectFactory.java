
package com.telstra.payments.gimmi.enquiry.enquiryresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telstra.payments.gimmi.enquiry.enquiryresponse package. 
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

    private final static QName _EnquiryResponse_QNAME = new QName("http://telstra.com/payments/gimmi/enquiry/EnquiryResponse", "EnquiryResponse");
    private final static QName _TransactionResultsOriginalResponse_QNAME = new QName("http://telstra.com/payments/gimmi/enquiry/EnquiryResponse", "originalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telstra.payments.gimmi.enquiry.enquiryresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnqResponse }
     * 
     */
    public EnqResponse createEnqResponse() {
        return new EnqResponse();
    }

    /**
     * Create an instance of {@link RegStatus }
     * 
     */
    public RegStatus createRegStatus() {
        return new RegStatus();
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
     * Create an instance of {@link GimmiResult }
     * 
     */
    public GimmiResult createGimmiResult() {
        return new GimmiResult();
    }

    /**
     * Create an instance of {@link ResultStatus }
     * 
     */
    public ResultStatus createResultStatus() {
        return new ResultStatus();
    }

    /**
     * Create an instance of {@link PANDetails }
     * 
     */
    public PANDetails createPANDetails() {
        return new PANDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnqResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/gimmi/enquiry/EnquiryResponse", name = "EnquiryResponse")
    public JAXBElement<EnqResponse> createEnquiryResponse(EnqResponse value) {
        return new JAXBElement<EnqResponse>(_EnquiryResponse_QNAME, EnqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnqResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/gimmi/enquiry/EnquiryResponse", name = "originalResponse", scope = TransactionResults.class)
    public JAXBElement<EnqResponse> createTransactionResultsOriginalResponse(EnqResponse value) {
        return new JAXBElement<EnqResponse>(_TransactionResultsOriginalResponse_QNAME, EnqResponse.class, TransactionResults.class, value);
    }

}
