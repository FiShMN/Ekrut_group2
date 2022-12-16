package Entities;
import java.io.Serializable;
public class Worker extends User{
	private String jobType;
	private String region;

	public Worker(String name, String lastName, int id, int phoneNumber, String email, String userName, String password,
			String permissions, String jobType, String region) {
		super(name, lastName, id, phoneNumber, email, userName, password, permissions);
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
