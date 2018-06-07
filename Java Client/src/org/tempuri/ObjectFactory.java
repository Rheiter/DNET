
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.webshopservice.ArrayOfProduct;
import org.datacontract.schemas._2004._07.webshopservice.Customer;
import org.datacontract.schemas._2004._07.webshopservice.Product;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetProductsResponseGetProductsResult_QNAME = new QName("http://tempuri.org/", "GetProductsResult");
    private final static QName _InsertCustomerUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _InsertCustomerPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _GetCustomerResponseGetCustomerResult_QNAME = new QName("http://tempuri.org/", "GetCustomerResult");
    private final static QName _BuyProduct_QNAME = new QName("http://tempuri.org/", "product");
    private final static QName _BuyCustomer_QNAME = new QName("http://tempuri.org/", "customer");
    private final static QName _BuyResponseBuyResult_QNAME = new QName("http://tempuri.org/", "BuyResult");
    private final static QName _GetCartResponseGetCartResult_QNAME = new QName("http://tempuri.org/", "GetCartResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link InsertCustomer }
     * 
     */
    public InsertCustomer createInsertCustomer() {
        return new InsertCustomer();
    }

    /**
     * Create an instance of {@link InsertCustomerResponse }
     * 
     */
    public InsertCustomerResponse createInsertCustomerResponse() {
        return new InsertCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link Buy }
     * 
     */
    public Buy createBuy() {
        return new Buy();
    }

    /**
     * Create an instance of {@link BuyResponse }
     * 
     */
    public BuyResponse createBuyResponse() {
        return new BuyResponse();
    }

    /**
     * Create an instance of {@link GetQnty }
     * 
     */
    public GetQnty createGetQnty() {
        return new GetQnty();
    }

    /**
     * Create an instance of {@link GetQntyResponse }
     * 
     */
    public GetQntyResponse createGetQntyResponse() {
        return new GetQntyResponse();
    }

    /**
     * Create an instance of {@link GetCart }
     * 
     */
    public GetCart createGetCart() {
        return new GetCart();
    }

    /**
     * Create an instance of {@link GetCartResponse }
     * 
     */
    public GetCartResponse createGetCartResponse() {
        return new GetCartResponse();
    }

    /**
     * Create an instance of {@link GetCredit }
     * 
     */
    public GetCredit createGetCredit() {
        return new GetCredit();
    }

    /**
     * Create an instance of {@link GetCreditResponse }
     * 
     */
    public GetCreditResponse createGetCreditResponse() {
        return new GetCreditResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsResult", scope = GetProductsResponse.class)
    public JAXBElement<ArrayOfProduct> createGetProductsResponseGetProductsResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetProductsResponseGetProductsResult_QNAME, ArrayOfProduct.class, GetProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = InsertCustomer.class)
    public JAXBElement<String> createInsertCustomerUsername(String value) {
        return new JAXBElement<String>(_InsertCustomerUsername_QNAME, String.class, InsertCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = InsertCustomer.class)
    public JAXBElement<String> createInsertCustomerPassword(String value) {
        return new JAXBElement<String>(_InsertCustomerPassword_QNAME, String.class, InsertCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetCustomer.class)
    public JAXBElement<String> createGetCustomerUsername(String value) {
        return new JAXBElement<String>(_InsertCustomerUsername_QNAME, String.class, GetCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = GetCustomer.class)
    public JAXBElement<String> createGetCustomerPassword(String value) {
        return new JAXBElement<String>(_InsertCustomerPassword_QNAME, String.class, GetCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCustomerResult", scope = GetCustomerResponse.class)
    public JAXBElement<Customer> createGetCustomerResponseGetCustomerResult(Customer value) {
        return new JAXBElement<Customer>(_GetCustomerResponseGetCustomerResult_QNAME, Customer.class, GetCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "product", scope = Buy.class)
    public JAXBElement<Product> createBuyProduct(Product value) {
        return new JAXBElement<Product>(_BuyProduct_QNAME, Product.class, Buy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customer", scope = Buy.class)
    public JAXBElement<Customer> createBuyCustomer(Customer value) {
        return new JAXBElement<Customer>(_BuyCustomer_QNAME, Customer.class, Buy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BuyResult", scope = BuyResponse.class)
    public JAXBElement<String> createBuyResponseBuyResult(String value) {
        return new JAXBElement<String>(_BuyResponseBuyResult_QNAME, String.class, BuyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "product", scope = GetQnty.class)
    public JAXBElement<Product> createGetQntyProduct(Product value) {
        return new JAXBElement<Product>(_BuyProduct_QNAME, Product.class, GetQnty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customer", scope = GetCart.class)
    public JAXBElement<Customer> createGetCartCustomer(Customer value) {
        return new JAXBElement<Customer>(_BuyCustomer_QNAME, Customer.class, GetCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCartResult", scope = GetCartResponse.class)
    public JAXBElement<ArrayOfProduct> createGetCartResponseGetCartResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetCartResponseGetCartResult_QNAME, ArrayOfProduct.class, GetCartResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customer", scope = GetCredit.class)
    public JAXBElement<Customer> createGetCreditCustomer(Customer value) {
        return new JAXBElement<Customer>(_BuyCustomer_QNAME, Customer.class, GetCredit.class, value);
    }

}
