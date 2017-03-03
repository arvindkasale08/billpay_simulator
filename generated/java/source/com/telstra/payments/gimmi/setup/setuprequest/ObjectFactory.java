
package com.telstra.payments.gimmi.setup.setuprequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telstra.payments.gimmi.setup.setuprequest package. 
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

    private final static QName _SetUpRequest_QNAME = new QName("http://telstra.com/payments/gimmi/setup/SetUpRequest", "SetUpRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telstra.payments.gimmi.setup.setuprequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetUpReq }
     * 
     */
    public SetUpReq createSetUpReq() {
        return new SetUpReq();
    }

    /**
     * Create an instance of {@link ServiceInfo }
     * 
     */
    public ServiceInfo createServiceInfo() {
        return new ServiceInfo();
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
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link FiMetaData }
     * 
     */
    public FiMetaData createFiMetaData() {
        return new FiMetaData();
    }

    /**
     * Create an instance of {@link CustomerDetails }
     * 
     */
    public CustomerDetails createCustomerDetails() {
        return new CustomerDetails();
    }

    /**
     * Create an instance of {@link GimmiConsumerSegment }
     * 
     */
    public GimmiConsumerSegment createGimmiConsumerSegment() {
        return new GimmiConsumerSegment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUpReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/gimmi/setup/SetUpRequest", name = "SetUpRequest")
    public JAXBElement<SetUpReq> createSetUpRequest(SetUpReq value) {
        return new JAXBElement<SetUpReq>(_SetUpRequest_QNAME, SetUpReq.class, null, value);
    }

}
