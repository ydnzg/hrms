package kodlamaio.hrms.core.concretes;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;


import kodlamaio.hrms.core.abstracts.CheckEmailService;

@Component
public class CheckMailManager implements CheckEmailService{

	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	
	@Override
	public boolean mailCheck(String email) {
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, java.util.regex.Pattern.CASE_INSENSITIVE);
		
		return pattern.matcher(email).find();
	}

}
