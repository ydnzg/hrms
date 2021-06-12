package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.concretes.ResumeEducation;
import kodlamaio.hrms.entities.concretes.ResumeExperience;
import kodlamaio.hrms.entities.concretes.ResumeImage;
import kodlamaio.hrms.entities.concretes.ResumeLanguage;
import kodlamaio.hrms.entities.concretes.ResumeLink;
import kodlamaio.hrms.entities.concretes.ResumeSkill;

public class JobSeekerResumeDto {

	public Jobseeker jobseeker;
	public List<ResumeEducation> educations;
	public List<ResumeSkill> resumeSkills;
	public List<ResumeLink> resumeLinks;
	public List<ResumeExperience> jobExperiences;
	public List<ResumeLanguage> languages;
	public ResumeImage image;
}
