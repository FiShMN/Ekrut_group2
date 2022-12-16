package Entities;
import java.io.Serializable;
public class Costomer extends User{
	
	
	private int account;
	private int creditCard;
	
	
	public Costomer(String name, String lastName, int id, int phoneNumber, String email, String userName,
			String password, String permissions, int account, int creditCard) {
		super(name, lastName, id, phoneNumber, email, userName, password, permissions);
		this.account = account;
		this.creditCard = creditCard;
	}
	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

}
