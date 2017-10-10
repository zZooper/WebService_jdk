package com.zooper.ws.datatype;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.13
 * 2017-10-10T17:56:06.076+08:00
 * Generated source version: 3.1.13
 * 
 */
@WebServiceClient(name = "DataTypeWSImplService", 
                  wsdlLocation = "http://192.168.0.105:8989/ws/dataType?wsdl",
                  targetNamespace = "http://dataType.ws.zooper.com/") 
public class DataTypeWSImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dataType.ws.zooper.com/", "DataTypeWSImplService");
    public final static QName DataTypeWSImplPort = new QName("http://dataType.ws.zooper.com/", "DataTypeWSImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.0.105:8989/ws/dataType?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DataTypeWSImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.0.105:8989/ws/dataType?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DataTypeWSImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DataTypeWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DataTypeWSImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public DataTypeWSImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DataTypeWSImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DataTypeWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns DataTypeWS
     */
    @WebEndpoint(name = "DataTypeWSImplPort")
    public DataTypeWS getDataTypeWSImplPort() {
        return super.getPort(DataTypeWSImplPort, DataTypeWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataTypeWS
     */
    @WebEndpoint(name = "DataTypeWSImplPort")
    public DataTypeWS getDataTypeWSImplPort(WebServiceFeature... features) {
        return super.getPort(DataTypeWSImplPort, DataTypeWS.class, features);
    }

}