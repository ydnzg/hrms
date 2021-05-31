package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.ErrorResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.RunRules;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}


	@Override
	public DataResult<List<Position>> getAll() {
		
		return new SuccessDataResult<List<Position>>(positionDao.findAll(), "Positions Listed") ;
	}


	@Override
	public Result add(Position position) {
		
		Result result = RunRules.run(nullControl(position), positionExist(position.getName()));
		
		if(result.isSuccess()) {
			
			positionDao.save(position);
			
		   return new SuccessResult("Position added");
		}
	return result;
	
	}





	//@Override
	//public Position getById(int id) {
		
	//	return this.positionDao.getById(id);
	//}
	
	
private Result nullControl(Position position) {
		if(position.getName() == null || position.getName().isBlank()) {
			return new ErrorResult("No blank space can be left!");
		}
		
		 return new SuccessResult();
	}


	
private Result positionExist(String name) {
		if((long) positionDao.findAllByName(name).size()!=0) {
			return new ErrorResult("Position  exist");
		}
		
		return new SuccessResult();
	}

}
