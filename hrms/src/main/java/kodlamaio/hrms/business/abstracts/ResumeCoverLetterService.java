package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.ResumeCoverLetter;

public interface ResumeCoverLetterService {

	Result add(ResumeCoverLetter coverLetter);
	Result update(ResumeCoverLetter coverLetter);
	Result delete(int id);
	DataResult<ResumeCoverLetter> getById(int id);
	DataResult<List<ResumeCoverLetter>> getALL();
}
