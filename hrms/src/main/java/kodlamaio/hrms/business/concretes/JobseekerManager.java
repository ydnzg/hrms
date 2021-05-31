package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.abstracts.CheckEmailService;
import kodlamaio.hrms.core.abstracts.EmailSendService;
import kodlamaio.hrms.core.abstracts.MernisCheckService;

import kodlamaio.hrms.core.utlities.results.ErrorResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@Service
public class JobseekerManager implements JobseekerService{

	private JobseekerDao jobseekerDao;
	private CheckEmailService checkEmailService;
	private MernisCheckService mernisCheckService;
	private EmailSendService emailSendService;
	private List<String> emails = new ArrayList<>();
	private List<String> identificationNumbers = new ArrayList<>();
	
	
	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao, CheckEmailService checkEmailService,
			                MernisCheckService mernisCheckService,EmailSendService emailSendService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.checkEmailService=checkEmailService;
		this.mernisCheckService=mernisCheckService;
		this.emailSendService=emailSendService;
	}


	@Override
	public List<Jobseeker> getAll() {
	
		return this.jobseekerDao.findAll();
	}


	@Override
	public Result login(String email,String password) {
		
		Jobseeker jobseeker = new Jobseeker();
		
		if((jobseeker.getEmail() == email) && (jobseeker.getPassword()==password)) {
		return new SuccessResult("Loggin successful");
		}
		
		else {
			return   new ErrorResult("Login failed");
		}
			
		
		
	}


	@Override
	public Result register(Jobseeker jobseeker) {
		Result result = new ErrorResult("Registration Failed");
		
		if(checkEmailService.mailCheck(jobseeker.getEmail()) && emailIsUsed(jobseeker.getEmail()) && 
				identityNumberIsUsed(jobseeker.getIdentityNumber()) && mernisCheckService.checkIfRealPerson(jobseeker)){
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
	
	


	

}