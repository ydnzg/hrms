package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.dtos.JobSeekerResumeDto;

@RestController
@RequestMapping("/api/jobseekers")
@CrossOrigin
public class JobseekersController {

	private JobseekerService jobseekerService;

	@Autowired
	public JobseekersController(JobseekerService jobseekerService) {
		super();
		this.jobseekerService = jobseekerService;
	}
	
	@GetMapping("/getall")
	public List<Jobseeker> getAll(){
		return this.jobseekerService.getAll();
	}
	
	@PostMapping("/login")
	 public Result login(@RequestParam("email") String email, @RequestParam("password") String password) {
		return this.jobseekerService.login(email,password);
		}
	
	@PostMapping("/register")
	public Result register(@RequestBody Jobseeker jobseeker) {
		return this.jobseekerService.register(jobseeker);
			
	}
	
	@GetMapping("/getJobseekerCVById")
	public DataResult<JobSeekerResumeDto> getCandidateCVById(@RequestParam int id){
		return this.jobseekerService.getJobseekerCVById(id);
	}
	
	
	//@PostMapping("/add")
	//Result add(@RequestBody Jobseeker jobseeker) {
	//	return this.jobseekerService.add(jobseeker);
	//}
	
	

}
