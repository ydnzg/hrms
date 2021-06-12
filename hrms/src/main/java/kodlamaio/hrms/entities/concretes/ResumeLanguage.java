package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Entity
@Table(name="resume_languages")
public class ResumeLanguage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Min(value = 1 )
	@Max(value = 5)	
	@Column(name="language_level")
	private int level;
	
	@Column(name="language_name")
	private String languageName;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private Jobseeker jobseeker;

	public ResumeLanguage() {
		super();
	}

	public ResumeLanguage(int id, @Min(1) @Max(5) int level, String languageName, Jobseeker jobseeker) {
		super();
		this.id = id;
		this.level = level;
		this.languageName = languageName;
		this.jobseeker = jobseeker;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public Jobseeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}
	
}
