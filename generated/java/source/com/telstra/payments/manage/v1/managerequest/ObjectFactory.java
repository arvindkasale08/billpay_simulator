
package com.telstra.payments.manage.v1.managerequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telstra.payments.manage.v1.managerequest package. 
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

    private final static QName _ManageRequest_QNAME = new QName("http://telstra.com/payments/manage/v1/ManageRequest", "ManageRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telstra.payments.manage.v1.managerequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManageReq }
     * 
     */
    public ManageReq createManageReq() {
        return new ManageReq();
    }

    /**
     * Create an instance of {@link FIMetaData }
     * 
     */
    public FIMetaData createFIMetaData() {
        return new FIMetaData();
    }

    /**
     * Create an instance of {@link BRNDetails }
     * 
     */
    public BRNDetails createBRNDetails() {
        return new BRNDetails();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link PINManagement }
     * 
     */
    public PINManagement createPINManagement() {
        return new PINManagement();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link PaymentMethodDetails }
     * 
     */
    public PaymentMethodDetails createPaymentMethodDetails() {
        return new PaymentMethodDetails();
    }

    /**
     * Create an instance of {@link EmailAddress }
     * 
     */
    public EmailAddress createEmailAddress() {
        return new EmailAddress();
    }

    /**
     * Create an instance of {@link AuthenticationDetails }
     * 
     */
    public AuthenticationDetails createAuthenticationDetails() {
        return new AuthenticationDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://telstra.com/payments/manage/v1/ManageRequest", name = "ManageRequest")
    public JAXBElement<ManageReq> createManageRequest(ManageReq value) {
        return new JAXBElement<ManageReq>(_ManageRequest_QNAME, ManageReq.class, null, value);
    }

}
