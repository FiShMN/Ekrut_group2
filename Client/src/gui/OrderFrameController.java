package gui;

import java.io.IOException;
import java.util.ArrayList;

import Entities.Order;
import Entities.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OrderFrameController {
	
	Order order;
	Product product;
	ArrayList<Product> productsList;
	public  static LoginFrameController loginFrame;
	public static Stage clientStage;
	public  static ConfirmOrderFrameController confirmOrderFrame;

    @FXML
    private ListView<?> lstViewCart;

    @FXML
    private VBox vBoxCart;

    @FXML
    private Pane paneLineCart;

    @FXML
    private ImageView imgProductCart;

    @FXML
    private Label lblProductNameCart;

    @FXML
    private Label lblProductPriceCart;

    @FXML
    private MenuButton menuBtnQuantityCart;

    @FXML
    private Button btnCheckOutOrder;

    @FXML
    private Label lblTotalPrice;

    @FXML
    private Button btnCancelOrder;

    @FXML
    private ListView<?> lstViewProduct;

    @FXML
    private VBox vBoxProduct;

    @FXML
    private Pane paneLineProduct;

    @FXML
    private ImageView imgProduct;

    @FXML
    private Label lblProductDetails;

    @FXML
    private Label lblProductPrice;

    @FXML
    private MenuButton menuBtnQuantityProduct;

    @FXML
    private Button btnAddToCart;

    @FXML
    void addToCart(ActionEvent event) {
    	
    	String str;
    	float num;
    	str = lblProductDetails.getText();
    	product.setProductName(str);
    	str = lblProductPrice.getText();
    	num = convertStringToFloat(str);
    	product.setPrice(num);
    	productsList.add(product);
    	float totalPrice = 0;
    	for(int i=0; i<productsList.size();i++)
    	{
    		totalPrice = totalPrice+ productsList.get(i).getPrice();
    	}
		order.setTotalPrice(totalPrice );

    }

    @FXML
    void cancelOrder(ActionEvent event) {
    	
    	loginFrame = new LoginFrameController();
    	try {
			loginFrame.start(clientStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void checkOutOrder(ActionEvent event) {
    	
    	confirmOrderFrame = new ConfirmOrderFrameController();
    	try {
			confirmOrderFrame.start(clientStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
 // Function to convert String to Float
    public static float convertStringToFloat(String str)
    {
  
        // Convert string to float
        // using valueOf() method
        return Float.valueOf(str);
    }
    
    public void start(Stage clientStage) {
		// TODO Auto-generated method stub
		
	}

}
