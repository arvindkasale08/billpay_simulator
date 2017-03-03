
package com.telstra.payments.gimmi.enquiry.enquiryrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telstra.payments.gimmi.enquiry.enquiryrequest package. 
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

    private final static QName _EnquiryRequest_QNAME = new QName("http://telstra.com/payments/gimmi/enquiry/EnquiryRequest", "EnquiryRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telstra.payments.gimmi.enquiry.enquiryrequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnqRequest }
     * 
     */
    public EnqRequest createEnqRequest() {
        return new EnqRequest();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link EnquirySegment }
     * 
     */
    public EnquirySegment createEnquirySegment() {
        return new EnquirySegment();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnqRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/gimmi/enquiry/EnquiryRequest", name = "EnquiryRequest")
    public JAXBElement<EnqRequest> createEnquiryRequest(EnqRequest value) {
        return new JAXBElement<EnqRequest>(_EnquiryRequest_QNAME, EnqRequest.class, null, value);
    }

}
