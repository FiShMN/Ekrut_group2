package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PickUpFrameController {

    @FXML
    private TableColumn<?, ?> colMachineId;

    @FXML
    private TableColumn<?, ?> colMachineLocation;

    @FXML
    private TableView<?> tblMachine;

    @FXML
    void continueToOrder(ActionEvent event) {

    }

}
