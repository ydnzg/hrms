package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="system_employees")
public class SystemEmployee {

	@Id
	@Column(name="user_id",nullable=false)
	private int userId;
	
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="position_id",nullable=false)
	private int positionId;
	
	public SystemEmployee() {
		
	}

	public SystemEmployee(int userId, String firstName, String lastName, int positionId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.positionId = positionId;
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

	public int getPositionId() {
		return positionId;
	}

	public void setPosition(int positionId) {
		this.positionId = positionId;
	}
}

