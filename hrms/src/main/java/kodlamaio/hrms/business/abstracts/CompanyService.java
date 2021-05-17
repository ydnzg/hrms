package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Company;

public interface CompanyService {

	List<Company> getAll();
	Company add(Company company);
	Company getByUserId(int userId);
}
