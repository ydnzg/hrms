package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.entities.concretes.Company;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

	private CompanyService companyService;

	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@GetMapping("/getall")
	public List<Company> getAll(){
		return this.companyService.getAll();
	}
	
	@PostMapping("/add")
	Company add(Company company) {
		return this.companyService.add(company);
	}
	
	@GetMapping("/getbyuserid")
	  Company getByUserId(int userId){
		return this.companyService.getByUserId(userId);
	}
}
