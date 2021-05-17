package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Position;

public interface PositionService {

	List<Position> getAll();
	Position add(Position position);
	Position getById(int id);
}
