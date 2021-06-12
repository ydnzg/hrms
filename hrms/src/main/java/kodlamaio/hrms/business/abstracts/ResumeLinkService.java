package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeLink;

public interface ResumeLinkService {

	Result add(ResumeLink resumeLink);
	Result update(ResumeLink resumeLink);
	Result delete(int id);
    DataResult<ResumeLink> getById(int id);	
	DataResult<List<ResumeLink>> getAll();
	DataResult<List<ResumeLink>> getAllByJobseeker_UserId(int id);
}
