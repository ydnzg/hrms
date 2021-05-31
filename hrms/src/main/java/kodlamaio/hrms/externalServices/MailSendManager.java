package kodlamaio.hrms.externalServices;

import org.springframework.stereotype.Service;

@Service
public class MailSendManager {
	
	public void verificationSend(String email) {
		System.out.println("Confirmation Email Sent: " + email);
	}

}
