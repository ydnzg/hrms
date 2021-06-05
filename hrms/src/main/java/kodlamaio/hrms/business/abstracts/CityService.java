package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.entities.concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();
}
