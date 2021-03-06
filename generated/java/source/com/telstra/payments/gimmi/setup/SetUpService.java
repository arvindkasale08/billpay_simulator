package com.telstra.payments.gimmi.setup;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-02-28T01:36:15.043+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "SetUp_Service", 
                  wsdlLocation = "file:/Users/arvindkasale/personal/appalgo/causecode-challenge/src/main/webapp/resources/wsdl/setup.wsdl",
                  targetNamespace = "http://telstra.com/payments/gimmi/setup") 
public class SetUpService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://telstra.com/payments/gimmi/setup", "SetUp_Service");
    public final static QName SetUpService = new QName("http://telstra.com/payments/gimmi/setup", "SetUp_Service");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/arvindkasale/personal/appalgo/causecode-challenge/src/main/webapp/resources/wsdl/setup.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SetUpService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/arvindkasale/personal/appalgo/causecode-challenge/src/main/webapp/resources/wsdl/setup.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SetUpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SetUpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SetUpService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SetUpService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SetUpService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SetUpService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns SetUp
     */
    @WebEndpoint(name = "SetUp_Service")
    public SetUp getSetUpService() {
        return super.getPort(SetUpService, SetUp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SetUp
     */
    @WebEndpoint(name = "SetUp_Service")
    public SetUp getSetUpService(WebServiceFeature... features) {
        return super.getPort(SetUpService, SetUp.class, features);
    }

}
