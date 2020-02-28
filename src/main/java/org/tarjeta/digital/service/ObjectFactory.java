
package org.tarjeta.digital.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tarjeta.digital.service package. 
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

    private final static QName _EliminarTarjetaResponse_QNAME = new QName("http://service.digital.tarjeta.org/", "eliminarTarjetaResponse");
    private final static QName _ObtenerTodas_QNAME = new QName("http://service.digital.tarjeta.org/", "obtenerTodas");
    private final static QName _ObtenerTarjeta_QNAME = new QName("http://service.digital.tarjeta.org/", "obtenerTarjeta");
    private final static QName _Creartargeta_QNAME = new QName("http://service.digital.tarjeta.org/", "creartargeta");
    private final static QName _EliminarTarjeta_QNAME = new QName("http://service.digital.tarjeta.org/", "eliminarTarjeta");
    private final static QName _ObtenerTodasResponse_QNAME = new QName("http://service.digital.tarjeta.org/", "obtenerTodasResponse");
    private final static QName _CreartargetaResponse_QNAME = new QName("http://service.digital.tarjeta.org/", "creartargetaResponse");
    private final static QName _ObtenerTarjetaResponse_QNAME = new QName("http://service.digital.tarjeta.org/", "obtenerTarjetaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tarjeta.digital.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarTarjeta }
     * 
     */
    public EliminarTarjeta createEliminarTarjeta() {
        return new EliminarTarjeta();
    }

    /**
     * Create an instance of {@link ObtenerTodasResponse }
     * 
     */
    public ObtenerTodasResponse createObtenerTodasResponse() {
        return new ObtenerTodasResponse();
    }

    /**
     * Create an instance of {@link CreartargetaResponse }
     * 
     */
    public CreartargetaResponse createCreartargetaResponse() {
        return new CreartargetaResponse();
    }

    /**
     * Create an instance of {@link ObtenerTarjetaResponse }
     * 
     */
    public ObtenerTarjetaResponse createObtenerTarjetaResponse() {
        return new ObtenerTarjetaResponse();
    }

    /**
     * Create an instance of {@link EliminarTarjetaResponse }
     * 
     */
    public EliminarTarjetaResponse createEliminarTarjetaResponse() {
        return new EliminarTarjetaResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodas }
     * 
     */
    public ObtenerTodas createObtenerTodas() {
        return new ObtenerTodas();
    }

    /**
     * Create an instance of {@link ObtenerTarjeta }
     * 
     */
    public ObtenerTarjeta createObtenerTarjeta() {
        return new ObtenerTarjeta();
    }

    /**
     * Create an instance of {@link Creartargeta }
     * 
     */
    public Creartargeta createCreartargeta() {
        return new Creartargeta();
    }

    /**
     * Create an instance of {@link Tarjeta }
     * 
     */
    public Tarjeta createTarjeta() {
        return new Tarjeta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTarjetaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.digital.tarjeta.org/", name = "eliminarTarjetaResponse")
    public JAXBElement<EliminarTarjetaResponse> createEliminarTarjetaResponse(EliminarTarjetaResponse value) {
        return new JAXBElement<EliminarTarjetaResponse>(_EliminarTarjetaResponse_QNAME, EliminarTarjetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.digital.tarjeta.org/", name = "obtenerTodas")
    public JAXBElement<ObtenerTodas> createObtenerTodas(ObtenerTodas value) {
        return new JAXBElement<ObtenerTodas>(_ObtenerTodas_QNAME, ObtenerTodas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTarjeta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.digital.tarjeta.org/", name = "obtenerTarjeta")
    public JAXBElement<ObtenerTarjeta> createObtenerTarjeta(ObtenerTarjeta value) {
        return new JAXBElement<ObtenerTarjeta>(_ObtenerTarjeta_QNAME, ObtenerTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Creartargeta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.digital.tarjeta.org/", name = "creartargeta")
    public JAXBElement<Creartargeta> createCreartargeta(Creartargeta value) {
        return new JAXBElement<Creartargeta>(_Creartargeta_QNAME, Creartargeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTarjeta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.digital.tarjeta.org/", name = "eliminarTarjeta")
    public JAXBElement<EliminarTarjeta> createEliminarTarjeta(EliminarTarjeta value) {
        return new JAXBElement<EliminarTarjeta>(_EliminarTarjeta_QNAME, EliminarTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.digital.tarjeta.org/", name = "obtenerTodasResponse")
    public JAXBElement<ObtenerTodasResponse> createObtenerTodasResponse(ObtenerTodasResponse value) {
        return new JAXBElement<ObtenerTodasResponse>(_ObtenerTodasResponse_QNAME, ObtenerTodasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreartargetaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.digital.tarjeta.org/", name = "creartargetaResponse")
    public JAXBElement<CreartargetaResponse> createCreartargetaResponse(CreartargetaResponse value) {
        return new JAXBElement<CreartargetaResponse>(_CreartargetaResponse_QNAME, CreartargetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTarjetaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.digital.tarjeta.org/", name = "obtenerTarjetaResponse")
    public JAXBElement<ObtenerTarjetaResponse> createObtenerTarjetaResponse(ObtenerTarjetaResponse value) {
        return new JAXBElement<ObtenerTarjetaResponse>(_ObtenerTarjetaResponse_QNAME, ObtenerTarjetaResponse.class, null, value);
    }

}
