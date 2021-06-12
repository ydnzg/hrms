package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeCoverLetterService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeCoverLetterDao;
import kodlamaio.hrms.entities.concretes.ResumeCoverLetter;

@Service
public class ResumeCoverLetterManager implements ResumeCoverLetterService{

	ResumeCoverLetterDao resumeCoverLetterDao;
	
	@Autowired
	 public ResumeCoverLetterManager(ResumeCoverLetterDao resumeCoverLetterDao) {
		super();
		this.resumeCoverLetterDao=resumeCoverLetterDao;
	}
	
	@Override
	public Result add(ResumeCoverLetter coverLetter) {
		this.resumeCoverLetterDao.save(coverLetter);
		return new SuccessResult("Cover Letter is added");
	}

	@Override
	public Result update(ResumeCoverLetter coverLetter) {
		this.resumeCoverLetterDao.save(coverLetter);
		return new SuccessResult("Cover Letter is updated");
	}

	@Override
	public Result delete(int id) {
		this.resumeCoverLetterDao.deleteById(id);
		return new SuccessResult("Cover Letter is deleted");
	}

	@Override
	public DataResult<ResumeCoverLetter> getById(int id) {
		return new SuccessDataResult<ResumeCoverLetter>
		(this.resumeCoverLetterDao.findById(id).get(), "Cover Letters are listed by id");
	}

	@Override
	public DataResult<List<ResumeCoverLetter>> getALL() {
		return new SuccessDataResult<List<ResumeCoverLetter>>
		(this.resumeCoverLetterDao.findAll(), "Cover Letters are listed");
	}

}
