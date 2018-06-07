package controller;

import org.datacontract.schemas._2004._07.webshopservice.Customer;
import org.tempuri.IWebshopService;
import org.tempuri.WebshopService;

public class Controller {
	private Customer currentCustomer;
	private IWebshopService webservice;	
	
	public Controller() {
		webservice = new WebshopService().getBasicHttpBindingIWebshopService();		
	}
	
	
	public void setCustomer(Customer c) {
		this.currentCustomer = c;
	}
	
	public Customer getCustomer() {
		Customer c = webservice.getCustomer(currentCustomer.getUsername().getValue(), currentCustomer.getPassword().getValue());
		return c;
	}
}
