package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.Company;

@RestController
@RequestMapping("/api/companies")
@CrossOrigin
public class CompaniesController {

	private CompanyService companyService;

	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Company>> getAll(){
		return this.companyService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Company company) {
		return this.companyService.add(company);
	}
	
	//@PostMapping("/add")
	//Company add(@RequestBody Company company) {
	//	return this.companyService.add(company);
	//}
	
	
}
