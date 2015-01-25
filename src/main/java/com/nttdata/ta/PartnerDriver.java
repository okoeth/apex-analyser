/**
 * 
 */
package com.nttdata.ta;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.MessageContext;

import com.nttdata.sf.partner.CallOptions;
import com.nttdata.sf.partner.InvalidIdFault_Exception;
import com.nttdata.sf.partner.LoginFault_Exception;
import com.nttdata.sf.partner.LoginResult;
import com.nttdata.sf.partner.SessionHeader;
import com.nttdata.sf.partner.SforceService;
import com.nttdata.sf.partner.Soap;
import com.nttdata.sf.partner.UnexpectedErrorFault_Exception;
import com.sun.xml.bind.api.JAXBRIContext;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;

/**
 * @author oliverkoeth
 *
 */
public class PartnerDriver {
	// Not thread safe!!!
    private static CallOptions callOptions = null;
    public static CallOptions getCallOptions() {
		if (callOptions != null) {
			return callOptions;
		}
		
		// Initial create
        callOptions = new CallOptions();
        return callOptions;
    }
        

	
	// Not thread safe!!!
    private static JAXBContext jaxbContext = null;
    public static JAXBContext getJAXBContext() throws Exception {
		if (jaxbContext != null) {
			return jaxbContext;
		}
		
		// Initital create    	
        try {
            // use the package you created your stub classes in
        	jaxbContext = JAXBContext.newInstance("com.nttdata.sf.partner");
        } catch (JAXBException e) {
            throw new Exception(
                "Could not get the JAXB context for the stub package", e);
        }
        
        return jaxbContext;
    }

	// Not thread safe!!!
	private static WSBindingProvider wsBindingProvider = null;
	public static WSBindingProvider getWSBindingProvider() throws Exception {
		if (wsBindingProvider != null) {
			return wsBindingProvider;
		}
		
		// Initital create
		String wsdlFileName = "sf_cn_partner.wsdl";
        URL url = PartnerDriver.class.getResource(wsdlFileName);
        if (url == null) {
            throw new Exception("Couldn't find sf partner wsdl for path " + wsdlFileName);
        }
        SforceService service = new SforceService(url,
            new QName("urn:partner.soap.sforce.com", "SforceService"));
        Soap port = service.getSoap();        

        wsBindingProvider = (WSBindingProvider) port;
        wsBindingProvider.setOutboundHeaders(
            Headers.create((JAXBRIContext) getJAXBContext(), getCallOptions()));

        return wsBindingProvider;
	}
		
	public static String loginForSessionId(String username, String password) throws Exception {
        Soap portPartner = (Soap) getWSBindingProvider();
        LoginResult result;
        try {
            result = portPartner.login(username, password);
        } catch (InvalidIdFault_Exception e) {
            throw new Exception("Invalid Id" + e.getFaultInfo());
        } catch (LoginFault_Exception e) {
            throw new Exception("Bad credentials for user" + e.getFaultInfo());
        } catch (UnexpectedErrorFault_Exception e) {
            throw new Exception("Unexpected error" + e.getFaultInfo());
        } catch (WebServiceException e) {
            throw new Exception("Web Service exception", e);
        }
        
        // Set pod for further interaction
        Map<String, Object> reqContext = getWSBindingProvider().getRequestContext();
        reqContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, result.getServerUrl());
        
        // Set zip for further interaction
        Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
        httpHeaders.put("Content-Encoding", Collections.singletonList("gzip"));
        httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
        reqContext.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);

        // Set session id for further interaction
        String sessionId = result.getSessionId();
        System.out.println(result.getServerUrl());
        SessionHeader sessionHeader = new SessionHeader();
        sessionHeader.setSessionId(sessionId);        
        List<Header> headersPartner = new ArrayList<Header>();	        
        headersPartner.add(Headers.create((JAXBRIContext) getJAXBContext(), sessionHeader));
        headersPartner.add(Headers.create((JAXBRIContext) getJAXBContext(), getCallOptions()));
        getWSBindingProvider().setOutboundHeaders(headersPartner);
        
        return sessionId;
	}	
}
