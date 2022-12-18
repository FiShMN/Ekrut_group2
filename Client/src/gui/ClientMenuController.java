package gui;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;

import controller.ClientController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClientMenuController {
	
	public static ClientController clientControl;
	
	public  static SubscriberFrameController subFrame; //?
	
	public  static LoginFrameController loginFrame;

	public static Stage clientStage;
	
    @FXML
    private TextField txtIp;

    @FXML
    private TextField txtPort;

    /**
     * Creates new frame LoginFrameController and connect to server. 
     * @param event (Click on connect button)
     * @throws UnknownHostException
     */
    @FXML
    void connectClient(ActionEvent event) throws UnknownHostException {
    	
    	String Ip = txtIp.getText();
    	
    	int Port = Integer.parseInt(txtPort.getText()); // need To test if the arguments are empty
    	
		clientControl = new ClientController(Ip, Port);
		//subFrame = new SubscriberFrameController();
		loginFrame = new LoginFrameController();
		ClientMenuController.clientControl.accept(("connectToServer%"+(Inet4Address.getLocalHost().getHostAddress())));
		try {
			//subFrame.start(clientStage); //Changing primary stage to subFrame
			loginFrame.start(clientStage);
		} catch (IOException e) {
			
			e.printStackTrace();
		} //send to UI
		
    }
    
    public void start(Stage primaryStage) throws IOException{
    	clientStage = primaryStage;
    	primaryStage.setTitle("Ekrut - Client");
		Parent root = FXMLLoader.load(getClass().getResource("/gui/ClientMenu.fxml"));
		Scene home = new Scene(root);
		primaryStage.setScene(home);
		primaryStage.show(); 
    }

}
