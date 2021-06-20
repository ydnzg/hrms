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

import kodlamaio.hrms.business.abstracts.ResumeCoverLetterService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeCoverLetter;

@RestController
@RequestMapping("/api/resumecoverletter")
@CrossOrigin
public class ResumeCoverLetterController {
	
	private ResumeCoverLetterService resumeCoverLetterService;
	
	@Autowired
    public ResumeCoverLetterController(ResumeCoverLetterService resumeCoverLetterService) {
		super();
		this.resumeCoverLetterService = resumeCoverLetterService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody ResumeCoverLetter coverLetter){
		return this.resumeCoverLetterService.add(coverLetter);	
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeCoverLetter coverLetter){
		return this.resumeCoverLetterService.update(coverLetter);
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int letterId){
		return this.resumeCoverLetterService.delete(letterId);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeCoverLetter>> getAll(){
		return this.resumeCoverLetterService.getALL();
	}
	
	@GetMapping("/getbyid")
	public DataResult<ResumeCoverLetter> getById(@RequestParam int letterId){
		return this.resumeCoverLetterService.getById(letterId);
	}
}
