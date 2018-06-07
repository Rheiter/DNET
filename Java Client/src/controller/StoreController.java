package controller;


import java.util.ArrayList;

import org.datacontract.schemas._2004._07.webshopservice.Customer;
import org.datacontract.schemas._2004._07.webshopservice.Product;
import org.tempuri.IWebshopService;
import org.tempuri.WebshopService;

public class StoreController {
	private IWebshopService webservice;	
	private Controller controller;
	
	
	public StoreController(Controller c) {
		this.controller = c;
		this.webservice = new WebshopService().getBasicHttpBindingIWebshopService();		
	}
	
	public ArrayList<Product> getProducts() {		
		ArrayList<Product> products = new ArrayList<Product>();
		for(Product i : webservice.getProducts().getProduct()) {
			products.add(i);
		}
		
		return products;
	}
	
	
	public ArrayList getOwnedProducts() {
		ArrayList<Product> ownedProducts = new ArrayList<Product>();
		Customer currentCustomer = this.controller.getCustomer();
		for(Product i : webservice.getCart(currentCustomer).getProduct()) {
			ownedProducts.add(i);
		}
		return ownedProducts;
	}
	
	
	public String buy(Customer customer, Product product) {
		String returner = this.webservice.buy(product, customer);
		if(returner == "Thank you for your purchase!") {
			customer.setCredit(customer.getCredit().min(product.getPrice()));
		}
		return returner;
	}
}
