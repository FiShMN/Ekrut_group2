package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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

}
