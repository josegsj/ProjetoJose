/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package br.webservice;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@javax.jws.WebService(serviceName = "ValidadorCEPService", portName = "ValidadorCEPPort", targetNamespace = "http://webservice.br/", wsdlLocation = "file:/C:/workspace/ProjetoWS/WebContent/wsdl/validadorcep.wsdl", endpointInterface = "br.webservice.ValidadorCepSei")
public class ValidadorCepSeiImpl implements ValidadorCepSei {

	private static final Logger LOG = Logger
			.getLogger(ValidadorCepSeiImpl.class.getName());

	public java.lang.String validarCep(java.lang.String arg0) {
		LOG.info("Executing operation validarCep");
		System.out.println(arg0);
		try {
			java.lang.String _return = "_return-1416981460";
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
