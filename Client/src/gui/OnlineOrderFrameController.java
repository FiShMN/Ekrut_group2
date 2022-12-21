package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class OnlineOrderFrameController {

    @FXML
    private MenuButton menuBtnSelectOnlineOrder;

    @FXML
    private Pane paneOrderType;

    @FXML
    void SelectDeliveryAddress(ActionEvent event) {

    }

    @FXML
    void SelectVendingMachine(ActionEvent event) {

    }

    @FXML
    void backToHomePage(ActionEvent event) {

    }

	public void start(Stage onlineStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/gui/CustomerFrame.fxml"));
		Scene home = new Scene(root);
		onlineStage.setScene(home);

		// On pressing X (close window) the client is disconnect from server.
		onlineStage.setOnCloseRequest(e -> {
			ClientMenuController.clientControl.accept("disconnect");
		});
		onlineStage.show();
		
	}

}
