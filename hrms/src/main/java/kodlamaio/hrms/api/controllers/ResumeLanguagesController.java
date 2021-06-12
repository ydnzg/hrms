package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ResumeLanguageService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeLanguage;

@RestController
@RequestMapping("/api/resumelanguage")
public class ResumeLanguagesController {

	
	private ResumeLanguageService resumeLanguageService;
	
	@Autowired
	public ResumeLanguagesController(ResumeLanguageService resumeLanguageService) {
		super();
		this.resumeLanguageService = resumeLanguageService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody ResumeLanguage language){
		return this.resumeLanguageService.add(language);	
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeLanguage language){
		return this.resumeLanguageService.update(language);	
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.resumeLanguageService.delete(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeLanguage>> getAll(){
		return this.resumeLanguageService.getAll();
	}
	
	@GetMapping("/getallbyjobseekerid")
	public DataResult<List<ResumeLanguage>> getAllByJobseekerId(@RequestParam int id){
		return this.resumeLanguageService.getAllByJobseeker_UserId(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ResumeLanguage> getById(@RequestParam int id){
		return this.resumeLanguageService.getById(id);
	}
	
	
}
