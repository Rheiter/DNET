
package org.datacontract.schemas._2004._07.webshopservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.webshopservice package. 
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

    private final static QName _ArrayOfProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "ArrayOfProduct");
    private final static QName _Product_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Product");
    private final static QName _Customer_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Customer");
    private final static QName _ProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Name");
    private final static QName _CustomerPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Password");
    private final static QName _CustomerUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Username");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.webshopservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfProduct }
     * 
     */
    public ArrayOfProduct createArrayOfProduct() {
        return new ArrayOfProduct();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "ArrayOfProduct")
    public JAXBElement<ArrayOfProduct> createArrayOfProduct(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_ArrayOfProduct_QNAME, ArrayOfProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Name", scope = Product.class)
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductName_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Password", scope = Customer.class)
    public JAXBElement<String> createCustomerPassword(String value) {
        return new JAXBElement<String>(_CustomerPassword_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Username", scope = Customer.class)
    public JAXBElement<String> createCustomerUsername(String value) {
        return new JAXBElement<String>(_CustomerUsername_QNAME, String.class, Customer.class, value);
    }

}
