package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeEducationService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeEducationDao;
import kodlamaio.hrms.entities.concretes.ResumeEducation;

@Service
public class ResumeEducationManager implements ResumeEducationService{

	
private ResumeEducationDao resumeEducationDao;
	
	@Autowired
	public ResumeEducationManager(ResumeEducationDao resumeEducationDao) {
		super();
		this.resumeEducationDao = resumeEducationDao;
	}
	
	
	@Override
	public Result add(ResumeEducation education) {
		this.resumeEducationDao.save(education);
		return new SuccessResult("Education's information is added");
	}

	@Override
	public Result update(ResumeEducation education) {
		this.resumeEducationDao.save(education);
		return new SuccessResult("Education's information is updated");
	}

	@Override
	public Result delete(int id) {
		this.resumeEducationDao.deleteById(id);
		return new SuccessResult("Education's information is updated");
	}

	@Override
	public DataResult<List<ResumeEducation>> getAll() {
		return new SuccessDataResult<List<ResumeEducation>>
		(this.resumeEducationDao.findAll(), "Education's information is listed");
	}

	@Override
	public DataResult<ResumeEducation> getById(int id) {
		return new SuccessDataResult<ResumeEducation>
		(this.resumeEducationDao.getById(id), "Education's information is listed by id");
	}

	@Override
	public DataResult<List<ResumeEducation>> getAllByJobseeker_UserIdOrderByEndedDateDesc(int id) {
		return new SuccessDataResult<List<ResumeEducation>>
		(this.resumeEducationDao.getAllByJobseeker_UserIdOrderByEndedDateDesc(id),
				"Education's information is listed by jobseeker id order by ended date");
	}

	@Override
	public DataResult<List<ResumeEducation>> getAllByJobseeker_UserId(int id) {
		return new SuccessDataResult<List<ResumeEducation>>
		(this.resumeEducationDao.getAllByJobseeker_UserId(id),"Education's information is listed by jobseeker id");
	}

}
