package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingDto;

@RestController
@RequestMapping("/api/job-postings")
@CrossOrigin
public class JobPostingsController {

	private JobPostingService jobPostingService;

	@Autowired
	public JobPostingsController(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}

	@PostMapping("/post")
	public Result post(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.post(jobPosting);
	}

	@PostMapping("/update")
	public Result update(@RequestBody int postingId, boolean activityStatus) {
		return this.jobPostingService.update(postingId, activityStatus);
	}

	@DeleteMapping("/delete")
	public Result delete(@RequestParam int postingId) {
		return this.jobPostingService.delete(postingId);
	}

	@GetMapping("/getAll")
	public DataResult<List<JobPostingDto>> findByActivityStatus() {
		return this.jobPostingService.getByActivityStatus();
	}

	@GetMapping("/getAllApplicationDeadline")
	public DataResult<List<JobPostingDto>> findByActivityStatusAndApplicationDeadline() {
		return this.jobPostingService.getByActivityStatusAndApplicationDeadline();
	}

	@GetMapping("/getAllCompanyName")
	public DataResult<List<JobPostingDto>> findByActivityStatusTrueAndCompanyName(@RequestParam int employerId) {
		return this.jobPostingService.getByActivityStatusAndEmployer(employerId);
	}

}