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
@Table(name="resume_links")
public class ResumeLink {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name = "github_link")
	private String githubLink;

	@Column(name = "linkedin_link")
	private String linkedinLink;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private Jobseeker jobseeker;

	public ResumeLink() {
		super();
	}

	public ResumeLink(int id, String githubLink, String linkedinLink, Jobseeker jobseeker) {
		super();
		this.id = id;
		this.githubLink = githubLink;
		this.linkedinLink = linkedinLink;
		this.jobseeker = jobseeker;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getLinkedinLink() {
		return linkedinLink;
	}

	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}

	public Jobseeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}

}
