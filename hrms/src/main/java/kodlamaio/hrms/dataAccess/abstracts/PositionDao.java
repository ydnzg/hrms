package kodlamaio.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.Position;

@Repository
public interface PositionDao extends JpaRepository<Position, Integer>{

	//Position findBypositionNameEquals(String findJobName);
	
	List<Position>  findAllByName(String name);
	

	
}
