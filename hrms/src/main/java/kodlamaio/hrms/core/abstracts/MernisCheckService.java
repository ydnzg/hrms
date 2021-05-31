package kodlamaio.hrms.core.abstracts;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Jobseeker;

@Service
public interface MernisCheckService {

	public boolean checkIfRealPerson(Jobseeker jobseeker);
}
