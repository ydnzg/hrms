package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="job_postings")

public class JobPosting {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="posting_id")
	private int postingId;
	
	@Column(name="job_definition")
	private String jobDefinition;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="open_position_number")
	private int openPositionNumber;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="posting_date")
	private LocalDateTime postingDate = LocalDateTime.now();
	
	@Column(name="activity_status")
	private boolean activityStatus;
	
	@Column(name="is_remote")
	private boolean isRemote;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Company company;

	@ManyToOne()
	@JoinColumn(name = "position_id")
	private Position position;

	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="working_time_id")
	private WorkingTime workingTime;
	
	@OneToOne(mappedBy="jobPosting")
	private PostingPersonnelConfirm postingPersonnelConfirm;

	
	public JobPosting() {
		super();
	}

	public JobPosting(int postingId, String jobDefinition, double minSalary, double maxSalary, int openPositionNumber,
			LocalDate applicationDeadline, LocalDateTime postingDate, boolean activityStatus, boolean isRemote,
			Company company, Position position, City city, WorkingTime workingTime,
			PostingPersonnelConfirm postingPersonnelConfirm) {
		super();
		this.postingId = postingId;
		this.jobDefinition = jobDefinition;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.openPositionNumber = openPositionNumber;
		this.applicationDeadline = applicationDeadline;
		this.postingDate = postingDate;
		this.activityStatus = activityStatus;
		this.isRemote = isRemote;
		this.company = company;
		this.position = position;
		this.city = city;
		this.workingTime = workingTime;
		this.postingPersonnelConfirm = postingPersonnelConfirm;
	}


	public int getPostingId() {
		return postingId;
	}


	public void setPostingId(int postingId) {
		this.postingId = postingId;
	}


	public String getJobDefinition() {
		return jobDefinition;
	}


	public void setJobDefinition(String jobDefinition) {
		this.jobDefinition = jobDefinition;
	}


	public double getMinSalary() {
		return minSalary;
	}


	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}


	public double getMaxSalary() {
		return maxSalary;
	}


	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}


	public int getOpenPositionNumber() {
		return openPositionNumber;
	}


	public void setOpenPositionNumber(int openPositionNumber) {
		this.openPositionNumber = openPositionNumber;
	}


	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}


	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}


	public LocalDateTime getPostingDate() {
		return postingDate;
	}


	public void setPostingDate(LocalDateTime postingDate) {
		this.postingDate = postingDate;
	}


	public boolean isActivityStatus() {
		return activityStatus;
	}


	public void setActivityStatus(boolean activityStatus) {
		this.activityStatus = activityStatus;
	}


	public boolean isRemote() {
		return isRemote;
	}


	public void setRemote(boolean isRemote) {
		this.isRemote = isRemote;
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


	public WorkingTime getWorkingTime() {
		return workingTime;
	}


	public void setWorkingTime(WorkingTime workingTime) {
		this.workingTime = workingTime;
	}


	public PostingPersonnelConfirm getPostingPersonnelConfirm() {
		return postingPersonnelConfirm;
	}


	public void setPostingPersonnelConfirm(PostingPersonnelConfirm postingPersonnelConfirm) {
		this.postingPersonnelConfirm = postingPersonnelConfirm;
	}

}
