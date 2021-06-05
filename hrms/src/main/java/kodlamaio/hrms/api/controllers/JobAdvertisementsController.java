package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService=jobAdvertisementService;
	}
	
	@GetMapping("/getActive")  
	public DataResult<List<JobAdvertisement>> getActive(){
		return this.jobAdvertisementService.getByActivated();
	}
	
	@PostMapping("/add")    
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getByRelease")    
	public DataResult<List<JobAdvertisement>> getByRelease(){
		return this.jobAdvertisementService.getByActivatedOrderByReleaseDateAsc();
	}
	
	@GetMapping("/getByDeadline")   
	public DataResult<List<JobAdvertisement>> getByDeadline(){
		return this.jobAdvertisementService.getByActivatedOrderByDeadlineDateAsc();
	}
	
	@PostMapping("/getActiveAndByCompany")
	public DataResult<List<JobAdvertisement>>  getActiveAndByCompany(@RequestParam int id) {
		return this.jobAdvertisementService.getByActivatedAndCompanyId(id);
	}
	
	@GetMapping("/deactivateAdvertisement")   
	public Result deactivateAdvertisement(@RequestParam Integer id) {
		return this.jobAdvertisementService.deactivateJobAdvertisement(id);
	}

}
