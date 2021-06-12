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
@Table(name="resume_experiences")
public class ResumeExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;

	@Column(name = "end_date")
	private LocalDate endedDate;
	
	@Column(name= "start_date")
	private LocalDate startedDate;
	
	@Column(name= "workspace_name")
	private String workspaceName;
	
	@Column(name= "position")
	private String position;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private Jobseeker jobseeker;
		
	public String getEndDate() {
		if (this.endedDate == null)
			return "Devam ediyor";
		return this.endedDate.toString();
	}

	
	public ResumeExperience() {
		super();
	}

	public ResumeExperience(int id, LocalDate endedDate, LocalDate startedDate, String workspaceName, String position,
			Jobseeker jobseeker) {
		super();
		this.id = id;
		this.endedDate = endedDate;
		this.startedDate = startedDate;
		this.workspaceName = workspaceName;
		this.position = position;
		this.jobseeker = jobseeker;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getEndedDate() {
		return endedDate;
	}


	public void setEndedDate(LocalDate endedDate) {
		this.endedDate = endedDate;
	}


	public LocalDate getStartedDate() {
		return startedDate;
	}


	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}


	public String getWorkspaceName() {
		return workspaceName;
	}


	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public Jobseeker getJobseeker() {
		return jobseeker;
	}


	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}
	
}
