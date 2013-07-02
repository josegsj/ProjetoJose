
package br.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidarCepResponse_QNAME = new QName("http://webservice.br/", "validarCepResponse");
    private final static QName _ValidarCep_QNAME = new QName("http://webservice.br/", "validarCep");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarCep }
     * 
     */
    public ValidarCep createValidarCep() {
        return new ValidarCep();
    }

    /**
     * Create an instance of {@link ValidarCepResponse }
     * 
     */
    public ValidarCepResponse createValidarCepResponse() {
        return new ValidarCepResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCepResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.br/", name = "validarCepResponse")
    public JAXBElement<ValidarCepResponse> createValidarCepResponse(ValidarCepResponse value) {
        return new JAXBElement<ValidarCepResponse>(_ValidarCepResponse_QNAME, ValidarCepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.br/", name = "validarCep")
    public JAXBElement<ValidarCep> createValidarCep(ValidarCep value) {
        return new JAXBElement<ValidarCep>(_ValidarCep_QNAME, ValidarCep.class, null, value);
    }

}
