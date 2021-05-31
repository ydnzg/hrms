package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface JobseekerService {

	public Result login(String email, String password);
	public Result register(Jobseeker jobseeker);
    public List<Jobseeker>	getAll();
    public List<String> getAllEmails();
    public List<String> getAllIdentityNumber();
    
    //Result add(Jobseeker jobseeker);
	
}
