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
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisements"})
public class City {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="city_id")
	private int id;
	
	@Column(name="city_name")
	private String cityName;
	
	@OneToMany(mappedBy="city")
	private List<JobAdvertisement> jobAdvertisements;

	public City() {
		super();
	}

	public City(int id, String cityName) {
		super();
		this.id = id;
		this.cityName = cityName;
		//this.jobAdvertisements=jobAdvertisements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	//public List<JobAdvertisement> getJobAdvertisements() {
	//	return jobAdvertisements;
	//}

	//public void setJobAdvertisements(List<JobAdvertisement> jobAdvertisements) {
	//	this.jobAdvertisements = jobAdvertisements;
	//}
	
	
	
	
}
