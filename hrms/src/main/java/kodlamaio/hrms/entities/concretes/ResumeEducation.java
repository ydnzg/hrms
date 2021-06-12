package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="resume_educations")
public class ResumeEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;

	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "start_date")
	private LocalDate startedDate;
	
	@Column(name = "end_date")
	private LocalDate endedDate;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private Jobseeker jobseeker;
	
	public String getEndDate() {
		if (this.endedDate == null)
			return "Devam ediyor";
		return this.endedDate.toString();
	}

	public ResumeEducation() {
		super();
	}

	public ResumeEducation(int id, String schoolName, String department, LocalDate startedDate, LocalDate endedDate,
			Jobseeker jobseeker) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.department = department;
		this.startedDate = startedDate;
		this.endedDate = endedDate;
		this.jobseeker = jobseeker;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public LocalDate getEndedDate() {
		return endedDate;
	}

	public void setEndedDate(LocalDate endedDate) {
		this.endedDate = endedDate;
	}

	public Jobseeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}
}
