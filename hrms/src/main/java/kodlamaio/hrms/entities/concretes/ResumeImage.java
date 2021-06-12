package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="resume_images")
public class ResumeImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name = "image_url")
	private String urlAddress;
	
	@OneToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Jobseeker jobseeker;

	public ResumeImage() {
		super();
	}

	public ResumeImage(int id, String urlAddress, Jobseeker jobseeker) {
		super();
		this.id = id;
		this.urlAddress = urlAddress;
		this.jobseeker = jobseeker;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrlAddress() {
		return urlAddress;
	}

	public void setUrlAddress(String urlAddress) {
		this.urlAddress = urlAddress;
	}

	public Jobseeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}
}
