package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.SystemEmployee;

public interface SystemEmployeeService {

	List<SystemEmployee> getAll();
	SystemEmployee add(SystemEmployee systemEmployee);
	SystemEmployee getByUserId(int userId);
}
