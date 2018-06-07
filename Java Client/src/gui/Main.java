package gui;

import org.datacontract.schemas._2004._07.webshopservice.Customer;

import controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {	
	private Controller controller = new Controller();
	private Store store = new Store(controller);
	
	public static void main(String[] args) {			
		startLogin();
	}	
	
	private static void startLogin() {		
		Application.launch(Login.class, (java.lang.String[]) null);
	}
	
	/*
	 * Starts the store window ands sets the customer
	 */
	public void startStore(Customer c) {
		controller.setCustomer(c);		
		Scene storeScene = store.getScene();       
        Stage storeWindow = new Stage();
        storeWindow.setScene(storeScene);
        storeWindow.show();
	}
}