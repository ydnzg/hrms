package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao=jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Job advertisement added");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActivated() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findByIsActiveTrue(),"Active job advertisements listed");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActivatedOrderByReleaseDateAsc() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findByIsActiveTrueOrderByReleaseDateAsc(),"Job advertisements are listed by Release Date");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActivatedOrderByDeadlineDateAsc() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findByIsActiveTrueOrderByDeadlineDateAsc(),"Job advertisements are listed by application deadline");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActivatedAndCompanyId(Integer id) {
	     return new SuccessDataResult<List<JobAdvertisement>>
	     (this.jobAdvertisementDao.findByIsActiveTrueAndCompany_UserId(id),"Copmany's active job advertisements are listed");
	}

	@Override
	public Result deactivateJobAdvertisement(Integer id) {
		JobAdvertisement j = this.jobAdvertisementDao.findById(id).get();
		j.setActive(false);
		this.jobAdvertisementDao.save(j);
		return new SuccessResult("Job advertisement is deactivated");
	}

}
