package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.Position;

public interface PositionService {

	DataResult<List<Position>> getAll();
	
	public Result add(Position position);
	
	
	//Position getById(int id);
}
