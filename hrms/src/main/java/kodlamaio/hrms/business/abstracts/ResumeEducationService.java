package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeEducation;

public interface ResumeEducationService {

	Result add (ResumeEducation education);	
	Result update(ResumeEducation education);
	Result delete(int id);
	DataResult<List<ResumeEducation>> getAll();
	DataResult<ResumeEducation> getById(int id);
	DataResult<List<ResumeEducation>> getAllByJobseeker_UserIdOrderByEndedDateDesc(int id);
	DataResult<List<ResumeEducation>> getAllByJobseeker_UserId(int id);
	
}
