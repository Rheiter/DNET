
package org.tempuri;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.webshopservice.ArrayOfProduct;
import org.datacontract.schemas._2004._07.webshopservice.Customer;
import org.datacontract.schemas._2004._07.webshopservice.Product;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IWebshopService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.webshopservice.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IWebshopService {


    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.webshopservice.ArrayOfProduct
     */
    @WebMethod(operationName = "GetProducts", action = "http://tempuri.org/IWebshopService/GetProducts")
    @WebResult(name = "GetProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProducts", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProducts")
    @ResponseWrapper(localName = "GetProductsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetProductsResponse")
    public ArrayOfProduct getProducts();

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "InsertCustomer", action = "http://tempuri.org/IWebshopService/InsertCustomer")
    @WebResult(name = "InsertCustomerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "InsertCustomer", targetNamespace = "http://tempuri.org/", className = "org.tempuri.InsertCustomer")
    @ResponseWrapper(localName = "InsertCustomerResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.InsertCustomerResponse")
    public Boolean insertCustomer(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns org.datacontract.schemas._2004._07.webshopservice.Customer
     */
    @WebMethod(operationName = "GetCustomer", action = "http://tempuri.org/IWebshopService/GetCustomer")
    @WebResult(name = "GetCustomerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCustomer", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCustomer")
    @ResponseWrapper(localName = "GetCustomerResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCustomerResponse")
    public Customer getCustomer(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param product
     * @param customer
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Buy", action = "http://tempuri.org/IWebshopService/Buy")
    @WebResult(name = "BuyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Buy", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Buy")
    @ResponseWrapper(localName = "BuyResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuyResponse")
    public String buy(
        @WebParam(name = "product", targetNamespace = "http://tempuri.org/")
        Product product,
        @WebParam(name = "customer", targetNamespace = "http://tempuri.org/")
        Customer customer);

    /**
     * 
     * @param product
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "GetQnty", action = "http://tempuri.org/IWebshopService/GetQnty")
    @WebResult(name = "GetQntyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetQnty", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetQnty")
    @ResponseWrapper(localName = "GetQntyResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetQntyResponse")
    public Integer getQnty(
        @WebParam(name = "product", targetNamespace = "http://tempuri.org/")
        Product product);

    /**
     * 
     * @param customer
     * @return
     *     returns org.datacontract.schemas._2004._07.webshopservice.ArrayOfProduct
     */
    @WebMethod(operationName = "GetCart", action = "http://tempuri.org/IWebshopService/GetCart")
    @WebResult(name = "GetCartResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCart", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCart")
    @ResponseWrapper(localName = "GetCartResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCartResponse")
    public ArrayOfProduct getCart(
        @WebParam(name = "customer", targetNamespace = "http://tempuri.org/")
        Customer customer);

    /**
     * 
     * @param customer
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(operationName = "GetCredit", action = "http://tempuri.org/IWebshopService/GetCredit")
    @WebResult(name = "GetCreditResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCredit", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCredit")
    @ResponseWrapper(localName = "GetCreditResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCreditResponse")
    public BigDecimal getCredit(
        @WebParam(name = "customer", targetNamespace = "http://tempuri.org/")
        Customer customer);

}