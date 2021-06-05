package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService{

	@Override
	public DataResult<List<City>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
