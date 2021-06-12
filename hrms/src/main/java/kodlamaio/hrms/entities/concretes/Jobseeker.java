package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name="jobseekers")

@PrimaryKeyJoinColumn(name="user_id") 

public  class Jobseeker extends User {


	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeEducation> educations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeSkill> programingSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeLink> links;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeLanguage> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeExperience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeCoverLetter> coverLetters;	

	@JsonIgnore
	@OneToOne(mappedBy = "jobseeker")
	private ResumeImage image;
	
	public Jobseeker() {
		super();
	}

	
	public Jobseeker(String firstName, String lastName, String identityNumber, Date birthDate) {
		super();
		
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	
		
	}
	


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public List<ResumeEducation> getEducations() {
		return educations;
	}


	public void setEducations(List<ResumeEducation> educations) {
		this.educations = educations;
	}


	public List<ResumeSkill> getProgramingSkills() {
		return programingSkills;
	}


	public void setProgramingSkills(List<ResumeSkill> programingSkills) {
		this.programingSkills = programingSkills;
	}


	public List<ResumeLink> getLinks() {
		return links;
	}


	public void setLinks(List<ResumeLink> links) {
		this.links = links;
	}


	public List<ResumeLanguage> getLanguages() {
		return languages;
	}


	public void setLanguages(List<ResumeLanguage> languages) {
		this.languages = languages;
	}


	public List<ResumeExperience> getExperiences() {
		return experiences;
	}


	public void setExperiences(List<ResumeExperience> experiences) {
		this.experiences = experiences;
	}


	public List<ResumeCoverLetter> getCoverLetters() {
		return coverLetters;
	}


	public void setCoverLetters(List<ResumeCoverLetter> coverLetters) {
		this.coverLetters = coverLetters;
	}


	public ResumeImage getImage() {
		return image;
	}


	public void setImage(ResumeImage image) {
		this.image = image;
	}


	

}