package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeLanguageService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeLanguageDao;
import kodlamaio.hrms.entities.concretes.ResumeLanguage;

@Service
public class ResumeLanguageManager implements ResumeLanguageService{

	ResumeLanguageDao resumeLanguageDao;
	
	public ResumeLanguageManager(ResumeLanguageDao resumeLanguageDao) {
		super();
		this.resumeLanguageDao = resumeLanguageDao;
	}

	@Override
	public Result add(ResumeLanguage language) {
		this.resumeLanguageDao.save(language);
		return new SuccessResult("Language's information is added");
	}

	@Override
	public Result update(ResumeLanguage language) {
		this.resumeLanguageDao.save(language);
		return new SuccessResult("Language's information is updated");
	}

	@Override
	public Result delete(int id) {
		this.resumeLanguageDao.deleteById(id);
		return new SuccessResult("Language's information is deleted");
	}

	@Override
	public DataResult<ResumeLanguage> getById(int id) {
		return new SuccessDataResult<ResumeLanguage>
		(this.resumeLanguageDao.getById(id),"Language's information is finded by id");
	}

	@Override
	public DataResult<List<ResumeLanguage>> getAll() {
		return new SuccessDataResult<List<ResumeLanguage>>
		(this.resumeLanguageDao.findAll(),"Language's information are listed");
	}

	@Override
	public DataResult<List<ResumeLanguage>> getAllByJobseeker_UserId(int id) {
		return new SuccessDataResult<List<ResumeLanguage>>
		(this.resumeLanguageDao.getAllByJobseeker_UserId(id),"Language's information are listed by user id");
	}

}
