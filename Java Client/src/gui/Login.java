package gui;

import org.datacontract.schemas._2004._07.webshopservice.Customer;

import controller.Controller;
import controller.LoginController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {
	private LoginController loginController = new LoginController();
	private Stage primaryStage;	
	
	public Login() { }
			
    @Override
    public void start(Stage ps) {
    	this.primaryStage = ps;
    	this.primaryStage.setTitle("Login");
    	Group root = new Group();
        Scene scene = new Scene(root, 400, 250, Color.WHITE);

        TabPane tabPane = new TabPane();
        BorderPane borderPane = new BorderPane();
        
        // Login Tab
        Tab loginTab = new Tab();
        loginTab.setText("Login");
        loginTab.setContent(this.getLoginContent());
        tabPane.getTabs().add(loginTab);
        
        // Register Tab        
        Tab registerTab = new Tab();
        registerTab.setText("Register");        
        registerTab.setContent(this.getRegisterContent());
        tabPane.getTabs().add(registerTab);
       
        borderPane.prefHeightProperty().bind(scene.heightProperty());
        borderPane.prefWidthProperty().bind(scene.widthProperty());
        
        borderPane.setCenter(tabPane);
        root.getChildren().add(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    /*
     * Returns the layout for the login tab
     */
    public GridPane getLoginContent() {
    	 GridPane grid = new GridPane();
         grid.setAlignment(Pos.CENTER);
         grid.setHgap(10);
         grid.setVgap(10);
         grid.setPadding(new Insets(25, 25, 25, 25));
 
         Text scenetitle = new Text("Welcome");
         scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
         grid.add(scenetitle, 0, 0, 2, 1);
 
         Label userName = new Label("Username:");
         grid.add(userName, 0, 1);
 
         TextField userTextField = new TextField();
         grid.add(userTextField, 1, 1);
 
         Label pw = new Label("Password:");
         grid.add(pw, 0, 2);
 
         PasswordField pwBox = new PasswordField();
         grid.add(pwBox, 1, 2);
         
         final Text actiontarget = new Text();
         grid.add(actiontarget, 1, 3);
 
         Button btn = new Button("Sign in");
         HBox hbBtn = new HBox(10);
         hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
         hbBtn.getChildren().add(btn);
         grid.add(hbBtn, 1, 4);
 
         
         // Onclick eventlistener
         btn.setOnAction(new EventHandler<ActionEvent>() { 
             @Override
             public void handle(ActionEvent e) {
            	 // Log in
            	 Customer customer = loginController.login(userTextField.getText(), pwBox.getText());
            	 if(customer == null) {
                     actiontarget.setFill(Color.FIREBRICK);
                     actiontarget.setText("Invalid username/password");
            	 } else {
            		 loginSucces(customer);
            	 }
             }
         });
         
         return grid;
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
        
        Text actiontarget = new Text();
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
            	actiontarget.setText(loginController.register(userTextField.getText()));           
            }
        });
        return grid;
    }
    
    /*
     * Sets the current customer and opens the store
     */
    private void loginSucces(Customer c) {
    	new Main().startStore(c);
    }
}
