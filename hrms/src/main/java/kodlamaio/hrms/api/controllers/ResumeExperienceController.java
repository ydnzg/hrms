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

import kodlamaio.hrms.business.abstracts.ResumeExperienceService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeExperience;

@RestController
@RequestMapping("/api/resumeexperience")
@CrossOrigin
public class ResumeExperienceController {

private ResumeExperienceService resumeExperienceService;
	
	@Autowired
	public ResumeExperienceController(ResumeExperienceService resumeExperienceService) {
		super();
		this.resumeExperienceService = resumeExperienceService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody ResumeExperience jobExperience){
		return this.resumeExperienceService.add(jobExperience);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeExperience jobExperience){
		return this.resumeExperienceService.update(jobExperience);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.resumeExperienceService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeExperience>> getAll(){
		return this.resumeExperienceService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<ResumeExperience>> getAllByJobseekerId(@RequestParam int id){
		return this.resumeExperienceService.getAllByJobseeker_UserId(id);
	}
	
	@GetMapping("/getById")
	public DataResult<ResumeExperience> getById(@RequestParam int id){
		return this.resumeExperienceService.getById(id);
	}
	
	@GetMapping("/getAllByJobseekerIdOrderByEndedDate")
	public DataResult<List<ResumeExperience>> getAllByJobseekerIdOrderByEndedDate(@RequestParam int id){
		return this.resumeExperienceService.getAllByJobseeker_UserIdOrderByEndedDateDesc(id);
	}
}
