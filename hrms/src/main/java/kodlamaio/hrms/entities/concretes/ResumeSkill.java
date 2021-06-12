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
@Table(name="resume_skills")
public class ResumeSkill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name = "skill_name")
	private String skillsName;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private Jobseeker jobseeker;

	public ResumeSkill() {
		super();
	}

	public ResumeSkill(int id, String skillsName, Jobseeker jobseeker) {
		super();
		this.id = id;
		this.skillsName = skillsName;
		this.jobseeker = jobseeker;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillsName() {
		return skillsName;
	}

	public void setSkillsName(String skillsName) {
		this.skillsName = skillsName;
	}

	public Jobseeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}
}
