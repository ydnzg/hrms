package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeLanguage;

public interface ResumeLanguageService {

	Result add(ResumeLanguage language);
	Result update(ResumeLanguage language);
	Result delete(int id);
	DataResult<ResumeLanguage> getById(int id);
	DataResult<List<ResumeLanguage>> getAll();
	DataResult<List<ResumeLanguage>> getAllByJobseeker_UserId(int id);
	
}
