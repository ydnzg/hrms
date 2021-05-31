package kodlamaio.hrms.core.concretes;

import kodlamaio.hrms.core.abstracts.CompanyConfirmationService;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessResult;

public class CompanyConfirmationManager implements CompanyConfirmationService {

	@Override
	public Result confirmCompany(int companyId) {
		
		return new SuccessResult("company registration approved");
	}

}
