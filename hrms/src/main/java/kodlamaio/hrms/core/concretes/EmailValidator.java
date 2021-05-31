package kodlamaio.hrms.core.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.abstracts.EmailService;
import kodlamaio.hrms.externalServices.EmailSender;

@Service
public class EmailValidator implements EmailService{

	EmailSender emailSender = new EmailSender();
	
	@Override
	public boolean emailSend(String email) {

		return emailSender.emailVerification(email);
	}

}
