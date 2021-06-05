package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService{

	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getByActivated();
	DataResult<List<JobAdvertisement>> getByActivatedOrderByReleaseDateAsc();
	DataResult<List<JobAdvertisement>> getByActivatedOrderByDeadlineDateAsc();
	DataResult<List<JobAdvertisement>> getByActivatedAndCompanyId(Integer id);
	Result deactivateJobAdvertisement(Integer id);
	
}
