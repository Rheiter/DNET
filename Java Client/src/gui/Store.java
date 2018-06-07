package gui;

import java.util.ArrayList;
import org.datacontract.schemas._2004._07.webshopservice.Customer;
import org.datacontract.schemas._2004._07.webshopservice.Product;

import controller.Controller;
import controller.StoreController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Store {
	private Stage primaryStage;	
	private StoreController storeController;
	private Controller controller;
	private ListView<Product> productsList;
	private ListView<String> ownedProductsList;
	private Text moneyLeftLabel;
	private Text responseText;
	
	public Store(Controller c) {
		this.controller = c;
		this.storeController = new StoreController(this.controller);
	}
	
     
    public Scene getScene() {
    	Group root = new Group();
        Scene scene = new Scene(root, 700, 450, Color.WHITE);
   
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        // Left Column
        Text shopInventory = new Text("Shop Inventory");
        grid.add(shopInventory, 0, 0);
              
        productsList = new ListView<Product>();
        productsList.setPrefSize(200, 250);
        grid.add(productsList, 0, 1);
        
        
        moneyLeftLabel = new Text("Money Left:");
        grid.add(moneyLeftLabel, 0, 2);
        
        
        responseText = new Text("");
        grid.add(responseText, 0, 3);        
        
        HBox buttonBox = new HBox();
        
        Button buyButton = new Button("Buy");
        buttonBox.getChildren().add(buyButton);
        buyButton.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent e) {
            	buy();
            }
        });
        
        Button refreshButton = new Button("Refresh");
        buttonBox.getChildren().add(refreshButton);    
        refreshButton.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent e) {
            	refresh();
            }
        });
   
        grid.add(buttonBox, 0, 4);
     
        
        // Right Column
        Text ownInventory = new Text("Own Inventory");
        grid.add(ownInventory, 1, 0);
        
        ownedProductsList = new ListView<>();
        ownedProductsList.setPrefSize(200, 250);
        grid.add(ownedProductsList, 1, 1);
        
        
        refresh();
        
        root.getChildren().add(grid);
        return scene;
    }
    
    
    
    /*
     * Buys a selected product
     */
    public void buy() {
    	Customer currentCustomer = this.controller.getCustomer();
    	Product product = productsList.getSelectionModel().getSelectedItem();
    	if (product != null) {
    		this.responseText.setText(storeController.buy(currentCustomer, product));
    	} else {
    		this.responseText.setText("No product is selected");
    	}
    	refresh();
    }
    
    
    
    /*
     * Fills all the data in the store window
     */
    public void refresh() {
    	responseText.setText("");
    	ArrayList<Product> products = storeController.getProducts();
        ObservableList<Product> items = FXCollections.observableArrayList (products);
        productsList.setItems(items);
        
        productsList.setCellFactory(new Callback<ListView<Product>, ListCell<Product>>(){
        	 
            @Override
            public ListCell<Product> call(ListView<Product> p) {
                 
                ListCell<Product> cell = new ListCell<Product>(){
 
                    @Override
                    protected void updateItem(Product pr, boolean bln) {
                        super.updateItem(pr, bln);
                        if (pr != null) {
                            setText(pr.getName().getValue() + ": €" + pr.getPrice()+ " - " + pr.getQnty() + " in stock");
                        }
                    }
 
                };
                 
                return cell;
            }
        });
        
        moneyLeftLabel.setText("Money Left: €" + controller.getCustomer().getCredit());
        
        ArrayList<Product> products_ = storeController.getOwnedProducts(); 
        ArrayList<String> ownedProducts = new ArrayList<String>();
        for(Product pr : products_) {
        	ownedProducts.add(pr.getName().getValue() + ", owned: " + pr.getQnty());
        }
        ObservableList<String> items_ = FXCollections.observableArrayList (ownedProducts);
        ownedProductsList.setItems(items_);        
    }

    
    
    /*
     * Returns the layout for the register tab
     */
    public GridPane getRegisterContent() {
    	GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Register");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Username:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);      
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 3);

        Button btn = new Button("Register");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        
        // Onclick eventlistener
        btn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent e) {
           	 // Send requerst
           	 
           	 // Return message
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });
        return grid;
    }
}
