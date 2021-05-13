package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobseekers")

public class Jobseeker {

	@Id
	@Column(name="user_id",nullable=false)
	private int userId;
	
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="identity_number",nullable=false)
	private String identityNumber;
	
	@Column(name="birth_date",nullable=false)
	private Date birthDate;
	
	public Jobseeker() {
		
	}

	public Jobseeker(int userId, String firstName, String lastName, String identityNumber, Date birthDate) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
