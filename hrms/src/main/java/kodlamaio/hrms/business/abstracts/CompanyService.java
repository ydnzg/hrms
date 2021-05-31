package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.Company;

public interface CompanyService {

	DataResult<List<Company>> getAll();
	
	public Result add(Company company);
	
	//Company add(Company company);

}
