package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="working_times")
public class WorkingTime {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="working_time_id")
	private int workingTimeId;
	
	@Column(name="working_time")
	private String workingTime;
	
	@OneToMany(mappedBy = "workingTime")
	@JsonIgnore
	private List<JobPosting> jobPosting;

	
	public WorkingTime() {
		super();
	}

	public WorkingTime(int workingTimeId, String workingTime, List<JobPosting> jobPosting) {
		super();
		this.workingTimeId = workingTimeId;
		this.workingTime = workingTime;
		this.jobPosting = jobPosting;
	}

	public int getWorkingTimeId() {
		return workingTimeId;
	}

	public void setWorkingTimeId(int workingTimeId) {
		this.workingTimeId = workingTimeId;
	}

	public String getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

	public List<JobPosting> getJobPosting() {
		return jobPosting;
	}

	public void setJobPosting(List<JobPosting> jobPosting) {
		this.jobPosting = jobPosting;
	}

}
