package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeExperience;

public interface ResumeExperienceService {

	Result add(ResumeExperience resumeExperience);
	Result update(ResumeExperience resumeExperience);
	Result delete(int id);
	DataResult<ResumeExperience> getById(int id);
	DataResult<List<ResumeExperience>> getAll();
	DataResult<List<ResumeExperience>> getAllByJobseeker_UserIdOrderByEndedDateDesc(int id);
	DataResult<List<ResumeExperience>> getAllByJobseeker_UserId(int id);
}
