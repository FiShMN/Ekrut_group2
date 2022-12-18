package Entities;
import java.io.Serializable;
public class Customer extends User implements Serializable{
	
	
	private static final long serialVersionUID = -8341341209307865291L;
	private String accountNum;
	private String creditCard;
	public Customer(String Fname, String lastName, String id, String phoneNumber, String email, String userName,
			String password, String role,boolean isLoggedIn, String accountNum, String creditCard ) {
		super(Fname, lastName, id, phoneNumber, email, userName, password, role,isLoggedIn);
		this.accountNum = accountNum;
		this.creditCard = creditCard;
	}
	public Customer(String accountNum) {
		super();
		this.accountNum=accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccount(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

}
