package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.entities.concretes.Position;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {

	private PositionService positionService;

	@Autowired
	public PositionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@GetMapping("/getall")
	public List<Position> getAll(){
		return this.positionService.getAll();
		}
	
	@PostMapping("/add")
	 Position add(Position position) {
		return this.positionService.add(position);
	}
	
	@GetMapping("/getbyid")
	Position getById(int id){
		return this.positionService.getById(id);
		}
}