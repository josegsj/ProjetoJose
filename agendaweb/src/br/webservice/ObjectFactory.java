
package br.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidarCepResponse_QNAME = new QName("http://webservice.br/", "validarCepResponse");
    private final static QName _ValidarCep_QNAME = new QName("http://webservice.br/", "validarCep");

    
    public ObjectFactory() {
    }

  
    public ValidarCep createValidarCep() {
        return new ValidarCep();
    }

  
    public ValidarCepResponse createValidarCepResponse() {
        return new ValidarCepResponse();
    }

  
    @XmlElementDecl(namespace = "http://webservice.br/", name = "validarCepResponse")
    public JAXBElement<ValidarCepResponse> createValidarCepResponse(ValidarCepResponse value) {
        return new JAXBElement<ValidarCepResponse>(_ValidarCepResponse_QNAME, ValidarCepResponse.class, null, value);
    }

 
    @XmlElementDecl(namespace = "http://webservice.br/", name = "validarCep")
    public JAXBElement<ValidarCep> createValidarCep(ValidarCep value) {
        return new JAXBElement<ValidarCep>(_ValidarCep_QNAME, ValidarCep.class, null, value);
    }

}
