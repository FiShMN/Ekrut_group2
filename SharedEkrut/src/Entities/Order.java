package Entities;
import java.io.Serializable;
public class Order implements Serializable{
	private static final long serialVersionUID = -8005643298429981017L;
	private int orderNum;
	private String orderDate, orderStatus, customerID, vendingMachineLocation, vendingMachineID;
	private float totalPrice;
}
