package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ResumeEducationService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeEducation;

@RestController
@RequestMapping("/api/resumeeducation")
public class ResumeEducationsController {

	private ResumeEducationService resumeEducationService;
	
	@Autowired
	public ResumeEducationsController(ResumeEducationService resumeEducationService) {
		super();
		this.resumeEducationService = resumeEducationService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody ResumeEducation schoolForCV){
		return this.resumeEducationService.add(schoolForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ResumeEducation schoolForCV){
		return this.resumeEducationService.update(schoolForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.resumeEducationService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ResumeEducation> getById(@RequestParam int id){
		return this.resumeEducationService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeEducation>> getAll(){
		return this.resumeEducationService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerIdOrderByEndDescd")
	public DataResult<List<ResumeEducation>> getAllByJobseekerIdOrderByEndedDateDesc(@RequestParam int id){
		return this.resumeEducationService.getAllByJobseeker_UserIdOrderByEndedDateDesc(id);
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<ResumeEducation>> getAllByJobseekerId(@RequestParam int id){
		return this.resumeEducationService.getAllByJobseeker_UserId(id);
	}
}
