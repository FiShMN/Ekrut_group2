package gui;

import java.awt.Button;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.MenuButton;

public class StockStatusReportController {

    @FXML
    private LineChart<?, ?> LineDiagramForStockByCategory;

    @FXML
    private MenuButton BntChooseFoodCategory;

    @FXML
    private BarChart<?, ?> BarChartStockByMachine;

    @FXML
    private MenuButton BntChooseMachine;

    @FXML
    private PieChart PaiChartForStockByRegion;

    @FXML
    private MenuButton BntToChooseRegion;
    
    @FXML
    private Button BntBack;
    
    @FXML
    void BackToPreviosePage(ActionEvent event) {

    }

    @FXML
    void ChooseRegion(ActionEvent event) {

    }

    @FXML
    void chooseFoodCategory(ActionEvent event) {

    }

    @FXML
    void chooseMachine(ActionEvent event) {

    }

}
