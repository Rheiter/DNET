
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.webshopservice.ArrayOfProduct;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCartResult" type="{http://schemas.datacontract.org/2004/07/WebshopService}ArrayOfProduct" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCartResult"
})
@XmlRootElement(name = "GetCartResponse")
public class GetCartResponse {

    @XmlElementRef(name = "GetCartResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProduct> getCartResult;

    /**
     * Gets the value of the getCartResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProduct> getGetCartResult() {
        return getCartResult;
    }

    /**
     * Sets the value of the getCartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *     
     */
    public void setGetCartResult(JAXBElement<ArrayOfProduct> value) {
        this.getCartResult = value;
    }

}
