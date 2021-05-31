package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ActivationCode;

public interface ActivationCodeService {

	
	Result add(ActivationCode activationCode);
	
	List<ActivationCode> getAll();
}
