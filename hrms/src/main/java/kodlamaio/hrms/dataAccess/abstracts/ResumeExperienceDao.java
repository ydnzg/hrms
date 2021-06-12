package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ResumeExperience;

public interface ResumeExperienceDao extends JpaRepository<ResumeExperience, Integer>{

	ResumeExperience getById(int id);
	List<ResumeExperience> getAllByJobseeker_UserIdOrderByEndedDateDesc(int id);
	List<ResumeExperience> getAllByJobseeker_UserId(int id);
}
