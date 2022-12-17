package Entities;
import java.io.Serializable;
public class Customer extends User implements Serializable{
	
	
	private static final long serialVersionUID = -8341341209307865291L;
	private int accountNum;
	private String creditCard;
	public Customer(String Fname, String lastName, String id, String phoneNumber, String email, String userName,
			String password, String permissions,boolean isLoggedIn, int accountNum, String creditCard ) {
		super(Fname, lastName, id, phoneNumber, email, userName, password, permissions,isLoggedIn);
		this.accountNum = accountNum;
		this.creditCard = creditCard;
	}
	public Customer(int accountNum) {
		super();
		this.accountNum=accountNum;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccount(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

}
