package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.business.abstracts.ResumeEducationService;
import kodlamaio.hrms.business.abstracts.ResumeExperienceService;
import kodlamaio.hrms.business.abstracts.ResumeImageService;
import kodlamaio.hrms.business.abstracts.ResumeLanguageService;
import kodlamaio.hrms.business.abstracts.ResumeLinkService;
import kodlamaio.hrms.business.abstracts.ResumeSkillService;
import kodlamaio.hrms.core.abstracts.CheckEmailService;
import kodlamaio.hrms.core.abstracts.EmailSendService;
import kodlamaio.hrms.core.abstracts.MernisCheckService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.ErrorDataResult;
import kodlamaio.hrms.core.utlities.results.ErrorResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.dtos.JobSeekerResumeDto;

@Service
public class JobseekerManager implements JobseekerService{

	private JobseekerDao jobseekerDao;
	private CheckEmailService checkEmailService;
	private MernisCheckService mernisCheckService;
	private EmailSendService emailSendService;
	private List<String> emails = new ArrayList<>();
	private List<String> identificationNumbers = new ArrayList<>();
	
	private ResumeEducationService educationService;
	private ResumeImageService resumeImageService;
	private ResumeLinkService resumeLinkService;
	private ResumeLanguageService languageService;
	private ResumeExperienceService jobExperienceService;
	private ResumeSkillService resumeSkillService;
	
	private ModelMapper modelMapper;
	
	
	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao, CheckEmailService checkEmailService,
			                MernisCheckService mernisCheckService,EmailSendService emailSendService,
			                ResumeEducationService educationService,ResumeImageService resumeImageService,
			                ResumeLinkService resumeLinkService,ResumeLanguageService languageService,
			                ResumeExperienceService jobExperienceService,ResumeSkillService resumeSkillService,ModelMapper modelMapper) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.checkEmailService=checkEmailService;
		this.mernisCheckService=mernisCheckService;
		this.emailSendService=emailSendService;
		this.educationService=educationService;
		this.resumeImageService=resumeImageService;
		this.resumeLinkService=resumeLinkService;
		this.languageService=languageService;
		this.jobExperienceService=jobExperienceService;
		this.resumeSkillService=resumeSkillService;
		this.modelMapper = modelMapper;
	}


	@Override
	public List<Jobseeker> getAll() {
	
		return this.jobseekerDao.findAll();
	}


	//@Override
	//public Result login(String email,String password) {
	
	//	Jobseeker jobseeker = new Jobseeker();
		
	//	if((jobseeker.getEmail() == email) && (jobseeker.getPassword()==password)) {
	//	return new SuccessResult("Login successful");
		
	//	}
		
	//	else {
	//		return   new ErrorResult("Login failed");
	//	}	
		
	//}
	
	//30062021
	@Override
	public Result login(String email,String password) {
	
		
		if((this.jobseekerDao.findJobseekerByEmailAndPassword(email, password) != null)) {
		return new SuccessResult("Login successful");
	
		}
		
		else {
			return   new ErrorResult("Login failed");
			
		}	
		
	}



	@Override
	public Result register(Jobseeker jobseeker) {
		Result result = new ErrorResult("Registration Failed");
		
		if(checkEmailService.mailCheck(jobseeker.getEmail()) && emailIsUsed(jobseeker.getEmail()) && 
				identityNumberIsUsed(jobseeker.getIdentityNumber()) 
				)
				//&& mernisCheckService.checkIfRealPerson(jobseeker))
		{
			emailSendService.emailSend(jobseeker.getEmail());
			this.jobseekerDao.save(jobseeker);
			result = new SuccessResult("Registration Successful");
		}
		return result;
	}


	@Override
	public List<String> getAllEmails() {
		for(int i = 0; i < getAll().size(); i++) {
			emails.add(getAll().get(i).getEmail());
		}
		return emails;
	}


	@Override
	public List<String> getAllIdentityNumber() {
		for(int i = 0; i < getAll().size(); i++) {
			identificationNumbers.add(getAll().get(i).getIdentityNumber());
		}
		return identificationNumbers;
	}


	private boolean emailIsUsed(String email) {
		boolean result = true;
		if(getAllEmails().contains(email)) {
			result = false;
		}
		return result;
	}
	
	private boolean identityNumberIsUsed(String nationalIdentity) {
		boolean result = true;
		if (getAllIdentityNumber().contains(nationalIdentity)) {
			result = false;
		}
		return result;
	}


	@Override
	public DataResult<Jobseeker> getByUserId(int id) {
		return new SuccessDataResult<Jobseeker>
		(this.jobseekerDao.getByUserId(id));
	}


	@Override
	public DataResult<Jobseeker> findJobseekerByIdentityNumber(String identityNumber) {
		return new SuccessDataResult<Jobseeker>
		(this.jobseekerDao.findJobseekerByIdentityNumber(identityNumber));
	}


	@Override
	public DataResult<JobSeekerResumeDto> getJobseekerCVById(int id) {
		JobSeekerResumeDto resume = new JobSeekerResumeDto();
		resume.jobExperiences = this.jobExperienceService.getAllByJobseeker_UserId(id).getData();
		resume.languages = this.languageService.getAllByJobseeker_UserId(id).getData();
		resume.image = this.resumeImageService.getByJobseeker_UserId(id).getData();
		resume.resumeLinks = this.resumeLinkService.getAllByJobseeker_UserId(id).getData();
		resume.educations = this.educationService.getAllByJobseeker_UserId(id).getData();
		resume.resumeSkills = this.resumeSkillService.getAllByJobseeker_UserId(id).getData();
		return new SuccessDataResult<JobSeekerResumeDto>(resume);
	}
	
	


	

}