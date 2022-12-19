package Entities;
import java.io.Serializable;
public class Worker extends User implements Serializable{
	
	private static final long serialVersionUID = 7813368042717409702L;
	private String jobType;
	private String region;

	public Worker(String Fname, String lastName, String id, String phoneNumber, String email, String userName, String password,
			String role,boolean isLoggedIn, String jobType, String region) {
		super(Fname, lastName, id, phoneNumber, email, userName, password, role,isLoggedIn);
		this.jobType = jobType;
		this.region = region;	
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
