package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemEmployeeService;
import kodlamaio.hrms.entities.concretes.SystemEmployee;

@RestController
@RequestMapping("/api/systemEmployees")
public class SystemEmployeesController {

	private SystemEmployeeService systemEmployeeService;

	@Autowired
	public SystemEmployeesController(SystemEmployeeService systemEmployeeService) {
		super();
		this.systemEmployeeService = systemEmployeeService;
	}
	
	@GetMapping("/getall")
	public List<SystemEmployee> getAll(){
		return this.systemEmployeeService.getAll();
	}
	
}
