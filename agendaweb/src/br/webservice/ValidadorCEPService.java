package br.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

@WebServiceClient(name = "ValidadorCEPService", wsdlLocation = "file:/C:/workspace/ProjetoWS/WebContent/wsdl/validadorcep.wsdl", targetNamespace = "http://webservice.br/")
public class ValidadorCEPService extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName("http://webservice.br/",
			"ValidadorCEPService");
	public final static QName ValidadorCEPPort = new QName(
			"http://webservice.br/", "ValidadorCEPPort");
	static {
		URL url = null;
		try {
			url = new URL(
					"file:/C:/workspace/ProjetoWS/WebContent/wsdl/validadorcep.wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger
					.getLogger(ValidadorCEPService.class.getName())
					.log(java.util.logging.Level.INFO,
							"Can not initialize the default wsdl from {0}",
							"file:/C:/workspace/ProjetoWS/WebContent/wsdl/validadorcep.wsdl");
		}
		WSDL_LOCATION = url;
	}

	public ValidadorCEPService(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public ValidadorCEPService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ValidadorCEPService() {
		super(WSDL_LOCATION, SERVICE);
	}

	public ValidadorCEPService(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	public ValidadorCEPService(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	public ValidadorCEPService(URL wsdlLocation, QName serviceName,
			WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	@WebEndpoint(name = "ValidadorCEPPort")
	public ValidadorCepSei getValidadorCEPPort() {
		return super.getPort(ValidadorCEPPort, ValidadorCepSei.class);
	}

	@WebEndpoint(name = "ValidadorCEPPort")
	public ValidadorCepSei getValidadorCEPPort(WebServiceFeature... features) {
		return super.getPort(ValidadorCEPPort, ValidadorCepSei.class, features);
	}

}
