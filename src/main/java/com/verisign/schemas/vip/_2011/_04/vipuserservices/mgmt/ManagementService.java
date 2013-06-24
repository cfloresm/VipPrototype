
/*
 * 
 */

package com.verisign.schemas.vip._2011._04.vipuserservices.mgmt;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Jun 13 20:13:21 CDT 2013
 * Generated source version: 2.2.3
 * 
 */


@WebServiceClient(name = "ManagementService", 
                  wsdlLocation =  "classpath:wsdl/vipuserservices-mgmt-1.1.wsdl",
                  targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices/mgmt") 
public class ManagementService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://schemas.verisign.com/vip/2011/04/vipuserservices/mgmt", "ManagementService");
    public final static QName ManagementServicePort = new QName("http://schemas.verisign.com/vip/2011/04/vipuserservices/mgmt", "ManagementServicePort");
    static {
        URL url = null;
        url = ManagementService.class.getClassLoader().getResource("vipuserservices-mgmt-1.1.wsdl");
		WSDL_LOCATION = url;
    }

    public ManagementService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ManagementService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns ManagementServicePort
     */
    @WebEndpoint(name = "ManagementServicePort")
    public ManagementServicePort getManagementServicePort() {
        return super.getPort(ManagementServicePort, ManagementServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ManagementServicePort
     */
    @WebEndpoint(name = "ManagementServicePort")
    public ManagementServicePort getManagementServicePort(WebServiceFeature... features) {
        return super.getPort(ManagementServicePort, ManagementServicePort.class, features);
    }

}