package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;

public interface PostingPersonnelConfirmService {

	void createConfirm(JobPosting jobPosting);

	Result isConfirmedByPersonnel(int postingId);
}

