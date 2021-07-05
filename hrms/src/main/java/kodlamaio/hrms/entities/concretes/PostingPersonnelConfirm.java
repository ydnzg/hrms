package kodlamaio.hrms.entities.concretes;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="posting_personnel_confirms")
@PrimaryKeyJoinColumn(name = "personnel_id", referencedColumnName = "user_id")

public class PostingPersonnelConfirm {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="confirm_id")
	private int confirmId;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="personnel_id")
	private int personnelId;
	
	@Column(name="confirm_date")
	private LocalDateTime confirmDate = LocalDateTime.now();
	
	@OneToOne()
	@JoinColumn(name="job_posting_id")
	private JobPosting jobPosting;


	public PostingPersonnelConfirm() {
		super();
		
	}


	public PostingPersonnelConfirm(int confirmId, boolean isConfirmed, int personnelId, LocalDateTime confirmDate,
			JobPosting jobPosting) {
		super();
		this.confirmId = confirmId;
		this.isConfirmed = isConfirmed;
		this.personnelId = personnelId;
		this.confirmDate = confirmDate;
		this.jobPosting = jobPosting;
	}


	public int getConfirmId() {
		return confirmId;
	}


	public void setConfirmId(int confirmId) {
		this.confirmId = confirmId;
	}


	public boolean isConfirmed() {
		return isConfirmed;
	}


	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}


	public int getPersonnelId() {
		return personnelId;
	}


	public void setPersonnelId(int personnelId) {
		this.personnelId = personnelId;
	}


	public LocalDateTime getConfirmDate() {
		return confirmDate;
	}


	public void setConfirmDate(LocalDateTime confirmDate) {
		this.confirmDate = confirmDate;
	}


	public JobPosting getJobPosting() {
		return jobPosting;
	}


	public void setJobPosting(JobPosting jobPosting) {
		this.jobPosting = jobPosting;
	}
	
}
