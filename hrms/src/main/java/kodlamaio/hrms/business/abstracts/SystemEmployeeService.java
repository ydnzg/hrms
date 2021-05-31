package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemEmployee;

public interface SystemEmployeeService {

	DataResult<List<SystemEmployee>>  getAll();
	public Result add(SystemEmployee systemEmployee);
	
}
