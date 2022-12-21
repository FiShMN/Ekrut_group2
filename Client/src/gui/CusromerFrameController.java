package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CusromerFrameController{ 
	  public  static OnlineOrderFrameController onlineOrderFrame;//instead of loginFrame
	  public static Stage olineOrderStage;//instead of clientCtage
	  public static Stage onlineStage;//was clientStage

    @FXML
    private Label lblHelloUser;

    @FXML
    private Button btnLocalOrder;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnOnlineOrder;

    @FXML
    void exit(ActionEvent event) {

    }
  

    @FXML
    void newLocalOrder(ActionEvent event) throws IOException {
    	onlineOrderFrame = new OnlineOrderFrameController();
    	onlineOrderFrame.start(onlineStage);
    }

    @FXML
    void newOnlineOrder(ActionEvent event) {

    }
 
}
