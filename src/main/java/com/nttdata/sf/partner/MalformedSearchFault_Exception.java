
package com.nttdata.sf.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MalformedSearchFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class MalformedSearchFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MalformedSearchFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public MalformedSearchFault_Exception(String message, MalformedSearchFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public MalformedSearchFault_Exception(String message, MalformedSearchFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.nttdata.sf.partner.MalformedSearchFault
     */
    public MalformedSearchFault getFaultInfo() {
        return faultInfo;
    }

}