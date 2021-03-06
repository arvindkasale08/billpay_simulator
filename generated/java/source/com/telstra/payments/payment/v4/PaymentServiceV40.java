package com.telstra.payments.payment.v4;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-03-06T13:44:02.442+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "PaymentService_v4_0", 
                  wsdlLocation = "file:/Users/arvindkasale/personal/appalgo/causecode-challenge/src/main/webapp/resources/wsdl/Payment_v4_0.wsdl",
                  targetNamespace = "http://telstra.com/payments/payment/v4") 
public class PaymentServiceV40 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://telstra.com/payments/payment/v4", "PaymentService_v4_0");
    public final static QName PaymentServiceV40 = new QName("http://telstra.com/payments/payment/v4", "PaymentService_v4_0");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/arvindkasale/personal/appalgo/causecode-challenge/src/main/webapp/resources/wsdl/Payment_v4_0.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PaymentServiceV40.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/arvindkasale/personal/appalgo/causecode-challenge/src/main/webapp/resources/wsdl/Payment_v4_0.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PaymentServiceV40(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PaymentServiceV40(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaymentServiceV40() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PaymentServiceV40(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PaymentServiceV40(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PaymentServiceV40(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns PaymentV40
     */
    @WebEndpoint(name = "PaymentService_v4_0")
    public PaymentV40 getPaymentServiceV40() {
        return super.getPort(PaymentServiceV40, PaymentV40.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PaymentV40
     */
    @WebEndpoint(name = "PaymentService_v4_0")
    public PaymentV40 getPaymentServiceV40(WebServiceFeature... features) {
        return super.getPort(PaymentServiceV40, PaymentV40.class, features);
    }

}
