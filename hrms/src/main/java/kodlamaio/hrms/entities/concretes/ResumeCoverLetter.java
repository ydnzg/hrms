package kodlamaio.hrms.entities.concretes;

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
@Table(name="resume_cover_letter")
public class ResumeCoverLetter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name = "content")
	private String content;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private Jobseeker jobseeker;

	public ResumeCoverLetter() {
		super();
	}

	
	public ResumeCoverLetter(int id, String content, Jobseeker jobseeker) {
		super();
		this.id = id;
		this.content = content;
		this.jobseeker = jobseeker;
	}
	
	public ResumeCoverLetter(String content, int jobseekerId) {
		super();
		this.content = content;
		this.jobseeker.setUserId(jobseekerId);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Jobseeker getJobseeker() {
		return jobseeker;
	}


	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}
	
}
