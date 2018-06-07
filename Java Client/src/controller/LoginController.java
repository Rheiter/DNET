package controller;

import org.datacontract.schemas._2004._07.webshopservice.Customer;
import org.tempuri.IWebshopService;
import org.tempuri.WebshopService;

public class LoginController {
	private IWebshopService webservice;	
	
	public LoginController() {
		webservice = new WebshopService().getBasicHttpBindingIWebshopService();		
	}
	
	
	public Customer login(String username, String password) {
		return webservice.getCustomer(username, password);		
	}
	
	public String register(String username) {
		String password = "";	
		for(int i = username.length() - 1; i > -1; i--) {
			password += username.charAt(i);
		}
		
		if(!webservice.insertCustomer(username, password)) {
			return "Could not register customer";
		}
		return "Your password is: " + password;
	}
}
