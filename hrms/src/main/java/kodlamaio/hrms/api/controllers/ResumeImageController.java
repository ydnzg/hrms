package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.business.abstracts.ResumeImageService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.concretes.ResumeImage;

@RestController
@RequestMapping("/api/images")
public class ResumeImageController {

	private ResumeImageService resumeImageService;
	private JobseekerService jobseekerService;
	
	@Autowired
	public ResumeImageController(ResumeImageService resumeImageService,JobseekerService jobseekerService) {
		super();
		this.resumeImageService = resumeImageService;
		this.jobseekerService = jobseekerService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "user_id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		Jobseeker jobseeker = this.jobseekerService.getByUserId(id).getData();
		ResumeImage resumeImage = new ResumeImage();
		resumeImage.setJobseeker(jobseeker);
		return this.resumeImageService.add(resumeImage, imageFile);
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeImage resumeImage){
		return this.resumeImageService.update(resumeImage);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.resumeImageService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeImage>> getAll(){
		return this.resumeImageService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<ResumeImage> getByJobseekerId(@RequestParam int id){
		return this.resumeImageService.getByJobseeker_UserId(id);
	}
	
	@GetMapping("/getById")
	public DataResult<ResumeImage> getById(@RequestParam int id){
		return this.resumeImageService.getById(id);
	}
}
