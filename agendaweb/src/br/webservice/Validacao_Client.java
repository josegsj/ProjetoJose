
package br.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

public final class Validacao_Client {

    private static final QName SERVICE_NAME = new QName("http://webservice.br/", "ValidadorCEPService");

    public Validacao_Client() {
    }

    public String validarCep(String cep) throws java.lang.Exception {
        URL wsdlURL = ValidadorCEPService.WSDL_LOCATION;
      
        ValidadorCEPService ss = new ValidadorCEPService(wsdlURL, SERVICE_NAME);
        ValidadorCepSei port = ss.getValidadorCEPPort();  
        
        System.out.println("Invoking validarCep...");
        
        String retorno = port.validarCep(cep);
        return retorno;
    }

}
