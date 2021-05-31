package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemEmployeeService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemEmployeeDao;
import kodlamaio.hrms.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService{

	private SystemEmployeeDao systemEmployeeDao;
	
	@Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		super();
		this.systemEmployeeDao = systemEmployeeDao;
	}

	@Override
	public DataResult<List<SystemEmployee>> getAll() {
		
		return new SuccessDataResult<List<SystemEmployee>>(this.systemEmployeeDao.findAll(), "System Employee's informations listed");
	}

	@Override
	public Result add(SystemEmployee systemEmployee) {
		this.systemEmployeeDao.save(systemEmployee);
		return new SuccessResult("New System Employee's informations saved"); 
	}



}