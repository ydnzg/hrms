package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.dtos.JobSeekerResumeDto;

public interface JobseekerService {

	public Result login(String email, String password);
	public Result register(Jobseeker jobseeker);
	 
    public List<String> getAllEmails();
    public List<String> getAllIdentityNumber();
    
    public List<Jobseeker> getAll();
    
    DataResult<Jobseeker> getByUserId(int id);
    DataResult<Jobseeker> findJobseekerByIdentityNumber(String identityNumber);
    DataResult<JobSeekerResumeDto> getJobseekerCVById(int id );
  
    
    //Result add(Jobseeker jobseeker);
	
}
