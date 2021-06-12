package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeExperienceService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeExperienceDao;
import kodlamaio.hrms.entities.concretes.ResumeExperience;

@Service
public class ResumeExperienceManager implements ResumeExperienceService{

private ResumeExperienceDao resumeExperienceDao;
	
	@Autowired
	public ResumeExperienceManager(ResumeExperienceDao resumeExperienceDao) {
		super();
		this.resumeExperienceDao = resumeExperienceDao;
	}
	
	@Override
	public Result add(ResumeExperience resumeExperience) {
		this.resumeExperienceDao.save(resumeExperience);
		return new SuccessResult("Experience is added");
	}

	@Override
	public Result update(ResumeExperience resumeExperience) {
		this.resumeExperienceDao.save(resumeExperience);
		return new SuccessResult("Experience is updated");
	}

	@Override
	public Result delete(int id) {
		this.resumeExperienceDao.deleteById(id);
		return new SuccessResult("Experience is deleted");
	}

	@Override
	public DataResult<ResumeExperience> getById(int id) {
		return new SuccessDataResult<ResumeExperience>
		(this.resumeExperienceDao.getById(id),"Experiences are listed by id");
	}

	@Override
	public DataResult<List<ResumeExperience>> getAll() {
		return new SuccessDataResult<List<ResumeExperience>>
		(this.resumeExperienceDao.findAll(),"Experiences are listed");
	}

	@Override
	public DataResult<List<ResumeExperience>> getAllByJobseeker_UserIdOrderByEndedDateDesc(int id) {
		return new SuccessDataResult<List<ResumeExperience>>
		(this.resumeExperienceDao.getAllByJobseeker_UserIdOrderByEndedDateDesc(id),
				"Experiences are listed by jobseeker id order by ended date");
	}

	@Override
	public DataResult<List<ResumeExperience>> getAllByJobseeker_UserId(int id) {
		return new SuccessDataResult<List<ResumeExperience>>
		(this.resumeExperienceDao.getAllByJobseeker_UserId(id),"Experiences are listed by jobseeker id");
	}

}
