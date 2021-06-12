package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ResumeEducation;

public interface ResumeEducationDao extends JpaRepository<ResumeEducation, Integer>{

	ResumeEducation getById(int id);
	List<ResumeEducation> getAllByJobseeker_UserIdOrderByEndedDateDesc(int id);
	List<ResumeEducation> getAllByJobseeker_UserId(int id);
}
