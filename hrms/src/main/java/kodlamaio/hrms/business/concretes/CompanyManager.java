package kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CompanyService;

import kodlamaio.hrms.core.abstracts.EmailService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.ErrorResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.RunRules;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrms.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService{

	private CompanyDao companyDao;
	private EmailService emailService;

	
	@Autowired
	public CompanyManager(CompanyDao companyDao,  EmailService emailService) {
		super();
		this.companyDao = companyDao;
	    this.emailService=emailService;
	}
	
	

	@Override
	public DataResult<List<Company>> getAll() {
	
		return new SuccessDataResult<List<Company>> (companyDao.findAll(), "Employer's informations Listed");
	}


	@Override
	public Result add(Company company) {
		
		Result result= RunRules.run(emailExist(company.getEmail()), nullControl(company),isRealCompany(company));
		
		if(result.isSuccess()) {
		 
			companyDao.save(company);
			result = new SuccessResult("Registration Successful");
		}
		return result;
	}



private Result emailExist(String email) {
	if((long) companyDao.findAllByEmail(email).size()!=0) {
		return new ErrorResult("Email exist");
	}
	
	return new SuccessResult();
}

private Result nullControl(Company company) {
	if(company.getEmail() ==null || company.getEmail().isBlank() ||
	   company.getPassword() == null || company.getPassword().isBlank() ||
	   company.getCompanyName() == null || company.getCompanyName().isBlank() ||
	   company.getWebAdress() == null || company.getWebAdress().isBlank()) {
		
		return new ErrorResult("fields cannot be left blank!");
	}
	
	return new SuccessResult();
}

private Result isRealCompany(Company company) {
	
	if(!emailService.emailSend(company.getEmail())) {
		return new ErrorResult("Please , Write an e-mail address in accordance with the e-mail format");
	}
	
	else if(!company.getWebAdress().contains(company.getEmail().split("@")[0])) {
		return new ErrorResult("web address and e-mail address domains are different");
	}
	
	return new SuccessResult();
}
	








}