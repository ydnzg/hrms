package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companies")
public class Company {
	
	@Id
	@Column(name="user_id",nullable=false)
	private int userId;
	
	@Column(name="company_name",nullable=false)
	private String companyName;
	
	@Column(name="web_adress",nullable=false)
	private String webAdress;
	
	@Column(name="phone_number",nullable=false)
	private String phoneNumber;
	
	public Company() {
		
	}

	public Company(int userId, String companyName, String webAdress, String phoneNumber) {
		super();
		this.userId = userId;
		this.companyName = companyName;
		this.webAdress = webAdress;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebAdress() {
		return webAdress;
	}

	public void setWebAdress(String webAdress) {
		this.webAdress = webAdress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
