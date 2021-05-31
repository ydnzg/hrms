package kodlamaio.hrms.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.abstracts.CheckEmailService;

@Primary
@Component
public class FakeMailCheckManager implements CheckEmailService{

	@Override
	public boolean mailCheck(String email) {
	
		return true;
	}

}
