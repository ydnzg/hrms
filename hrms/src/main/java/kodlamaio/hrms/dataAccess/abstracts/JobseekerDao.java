package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Jobseeker;


@Repository
public interface JobseekerDao extends JpaRepository<Jobseeker, Integer>{

	Jobseeker findJobseekerByIdentityNumber(String identityNumber);
	Jobseeker getByUserId(int id );
	Jobseeker findJobseekerByEmailAndPassword(String email, String password);

}
