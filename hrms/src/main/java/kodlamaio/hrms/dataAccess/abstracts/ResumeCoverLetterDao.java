package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ResumeCoverLetter;

public interface ResumeCoverLetterDao extends JpaRepository<ResumeCoverLetter, Integer>{
	
	ResumeCoverLetter getById(int id);

}
