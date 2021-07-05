package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;import kodlamaio.hrms.entities.concretes.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer>{
	
	 JobPosting getByPostingIdEquals(int postingId);
	 List<JobPosting> getByActivityStatus(boolean activityStatus);
	 List<JobPosting> getByActivityStatusOrderByApplicationDeadline(boolean activityStatus);
	 List<JobPosting> getByActivityStatusAndCompany_userId(boolean activityStatus, int employerId);

}
