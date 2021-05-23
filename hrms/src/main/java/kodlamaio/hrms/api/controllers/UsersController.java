package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}



	@GetMapping("/getall")
	public List<User> getAll(){
		return this.userService.getAll();
	}
	
	@PostMapping("/add")
	User add(User user) {
		return this.userService.add(user);
		}
	
	@GetMapping("/getbyid")
	public User getById(int id) {
		
	return this.userService.getById(id);
		
	}
	
	
}