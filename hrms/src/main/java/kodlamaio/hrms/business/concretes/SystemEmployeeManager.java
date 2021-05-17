package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemEmployeeService;
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
	public List<SystemEmployee> getAll() {
		
		return this.systemEmployeeDao.findAll();
	}

	@Override
	public SystemEmployee add(SystemEmployee systemEmployee) {
		
		return this.systemEmployeeDao.save(systemEmployee);
	}

	@Override
	public SystemEmployee getByUserId(int userId) {
		
		return this.systemEmployeeDao.getByUserId(userId);
	}

}
