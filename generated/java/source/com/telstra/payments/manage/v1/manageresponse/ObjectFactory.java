
package com.telstra.payments.manage.v1.manageresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telstra.payments.manage.v1.manageresponse package. 
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

    private final static QName _ManageResponse_QNAME = new QName("http://telstra.com/payments/manage/v1/ManageResponse", "ManageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telstra.payments.manage.v1.manageresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManageRes }
     * 
     */
    public ManageRes createManageRes() {
        return new ManageRes();
    }

    /**
     * Create an instance of {@link PaymentInstrumentsResults }
     * 
     */
    public PaymentInstrumentsResults createPaymentInstrumentsResults() {
        return new PaymentInstrumentsResults();
    }

    /**
     * Create an instance of {@link PaymentInstrumentList }
     * 
     */
    public PaymentInstrumentList createPaymentInstrumentList() {
        return new PaymentInstrumentList();
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
     * Create an instance of {@link PaymentMethodResults }
     * 
     */
    public PaymentMethodResults createPaymentMethodResults() {
        return new PaymentMethodResults();
    }

    /**
     * Create an instance of {@link PaymentMethodList }
     * 
     */
    public PaymentMethodList createPaymentMethodList() {
        return new PaymentMethodList();
    }

    /**
     * Create an instance of {@link CustomerDetails }
     * 
     */
    public CustomerDetails createCustomerDetails() {
        return new CustomerDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/manage/v1/ManageResponse", name = "ManageResponse")
    public JAXBElement<ManageRes> createManageResponse(ManageRes value) {
        return new JAXBElement<ManageRes>(_ManageResponse_QNAME, ManageRes.class, null, value);
    }

}
