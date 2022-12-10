package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class OnlineOrderFrameController implements Initializable {

    @FXML
    private TableColumn<?, ?> machineLocation;

    @FXML
    private TableColumn<?, ?> machineNumber;
    
    @FXML
    private MenuItem menuItemDelivery;

    @FXML
    private MenuItem menuItemPickUp;

    @FXML
    private TableView<?> vendingMachineTable;  //Create Vending Machine Entity

    @FXML
    void SelectVendingMachine(ActionEvent event) {
    }

    @FXML
    void SetDeliveryAddress(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		vendingMachineTable.setVisible(false);
		
		
	}
    
    

}
