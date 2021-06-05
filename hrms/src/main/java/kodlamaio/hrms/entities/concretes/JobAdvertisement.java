package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="job_advertisements")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","company","position","city"})
public class JobAdvertisement {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "total_open_positions")
	private int totalOpenPositions;
	
	@Column(name = "deadline_date")
	private String deadlineDate;
	
	@Column(name = "release_date")
	private String releaseDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	
	@ManyToOne
	@JoinColumn(name = "position_id")
	private Position position;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	
	public JobAdvertisement() {
		super();
		
	}

	public JobAdvertisement(int id, String jobDescription, int totalOpenPositions, String deadlineDate,
			String releaseDate, boolean isActive, int minSalary, int maxSalary, Company company, Position position,
			City city) {
		super();
		this.id = id;
		this.jobDescription = jobDescription;
		this.totalOpenPositions = totalOpenPositions;
		this.deadlineDate = deadlineDate;
		this.releaseDate = releaseDate;
		this.isActive = isActive;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.company = company;
		this.position = position;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getTotalOpenPositions() {
		return totalOpenPositions;
	}

	public void setTotalOpenPositions(int totalOpenPositions) {
		this.totalOpenPositions = totalOpenPositions;
	}

	public String getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(String deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
