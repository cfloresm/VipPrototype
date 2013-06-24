
/*
 * 
 */

package com.verisign.schemas.vip._2011._04.vipuserservices.query;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Jun 13 20:12:32 CDT 2013
 * Generated source version: 2.2.3
 * 
 */


@WebServiceClient(name = "QueryService", 
                  wsdlLocation = "classpath:wsdl/vipuserservices-query-1.1.wsdl",
                  targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices/query") 
public class QueryService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://schemas.verisign.com/vip/2011/04/vipuserservices/query", "QueryService");
    public final static QName QueryServicePort = new QName("http://schemas.verisign.com/vip/2011/04/vipuserservices/query", "QueryServicePort");
    static {
        URL url = null;
        url = QueryService.class.getClassLoader().getResource("vipuserservices-query-1.1.wsdl");
        WSDL_LOCATION = url;
    }

    public QueryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QueryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QueryService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns QueryServicePort
     */
    @WebEndpoint(name = "QueryServicePort")
    public QueryServicePort getQueryServicePort() {
        return super.getPort(QueryServicePort, QueryServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueryServicePort
     */
    @WebEndpoint(name = "QueryServicePort")
    public QueryServicePort getQueryServicePort(WebServiceFeature... features) {
        return super.getPort(QueryServicePort, QueryServicePort.class, features);
    }

}