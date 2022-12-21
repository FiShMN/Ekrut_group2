package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ConfirmOrderFrameController {

    @FXML
    private TableColumn<?, ?> colAmount;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableColumn<?, ?> colProductName;

    @FXML
    private Label lblCustomerName;

    @FXML
    private Label lblCustomerNumber;

    @FXML
    private Label lblTotalPrice;

    @FXML
    private TableView<?> tblInvoice;

    @FXML
    void cancelOrder(ActionEvent event) {

    }

    @FXML
    void confirmOrder(ActionEvent event) {

    }

    @FXML
    void go_Back(ActionEvent event) {

    }

	public void start(Stage orderStage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/gui/OrderFrame.fxml"));
		Scene home = new Scene(root);
		orderStage.setScene(home);

		// On pressing X (close window) the client is disconnect from server.
		orderStage.setOnCloseRequest(e -> {
			ClientMenuController.clientControl.accept("disconnect");
		});
		orderStage.show();
		// TODO Auto-generated method stub
		
	}

}
