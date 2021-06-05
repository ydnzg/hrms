package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="positions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})

public class Position {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="position_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="position")
	private List<JobAdvertisement> jobAdvertisements;
	
	public Position() {
		super();
	}

	public Position(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		//this.jobAdvertisements=jobAdvertisements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//public List<JobAdvertisement> getJobAdvertisements() {
	//	return jobAdvertisements;
	//}

	//public void setJobAdvertisements(List<JobAdvertisement> jobAdvertisements) {
	//	this.jobAdvertisements = jobAdvertisements;
	//}
}
