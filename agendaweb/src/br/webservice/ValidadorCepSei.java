package br.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://webservice.br/", name = "ValidadorCepSei")
@XmlSeeAlso({ ObjectFactory.class })
public interface ValidadorCepSei {

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "validarCep", targetNamespace = "http://webservice.br/", className = "br.webservice.ValidarCep")
	@WebMethod
	@ResponseWrapper(localName = "validarCepResponse", targetNamespace = "http://webservice.br/", className = "br.webservice.ValidarCepResponse")
	public java.lang.String validarCep(
			@WebParam(name = "arg0", targetNamespace = "") java.lang.String arg0);
}
