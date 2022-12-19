package gui;

import java.io.IOException;

import controller.ChatClient;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginFrameController {
	public int num;
	ChatClient ch;

	 @FXML
	 private PasswordField txtPassword;
	 
    @FXML
    private Button btnEnter;

    @FXML
    private Label lblAlert;

    @FXML
    private ImageView loginImage;

    @FXML
    private TextField txtUserName;

    @FXML
    void pressEnter(ActionEvent event) {

    	StringBuilder str = new StringBuilder();
    	String password = txtPassword.getText();
    	String userName = txtUserName.getText();
    	int num2;
    	
    	if(password.isEmpty() || userName.isEmpty())
    		lblAlert.setText("Please fill both user name and password");
    
    	else {
    		//create data to server
    		str.append("login");
    		str.append("%"); //for division
    		str.append(userName);
    		str.append("#"); //for division
    		str.append(password);
    		System.out.println(str);
    		ClientMenuController.clientControl.accept(str.toString());
    	}
    	num2 = ChatClient.toWrite;
    	//num2 = this.num;
    	//System.out.println(this.num);
    	System.out.println(num2);
    	if(num2==1)
    	{
    		lblAlert.setText("Wrong user name or password!");
    	}
    	else if(num2==2)
    	{
    		lblAlert.setText("User already loggedIn");
    	}
		
    }
    
  /*  public void setAlertLbl(String str) {
    	//Observable msg = FXCollections.o
    	System.out.println("LoginFrame: "+ str);
    	lblAlert.setText(str);
    	
    }*/
    
    public void condition(int x) {
    	this.num=x;
    	System.out.println(this.num);
    	
	}
    
    
    public void openFrameByRole(String role) {
    	System.out.println("login o.k" + role);
    }

    public void start(Stage primaryStage) throws IOException{
    	Parent root = FXMLLoader.load(getClass().getResource("/gui/LoginFrame.fxml"));
		Scene home = new Scene(root);
		primaryStage.setScene(home);
		
		//On pressing X (close window) the client is disconnect from server.
		primaryStage.setOnCloseRequest(e -> { 
			ClientMenuController.clientControl.accept("disconnect");
		});
		primaryStage.show();
    }

		
    }


