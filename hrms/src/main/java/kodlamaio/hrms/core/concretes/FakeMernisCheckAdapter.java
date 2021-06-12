package kodlamaio.hrms.core.concretes;

import java.rmi.RemoteException;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.abstracts.MernisCheckService;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Primary
@Component
public class FakeMernisCheckAdapter implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(Jobseeker jobseeker) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			
			result=client.TCKimlikNoDogrula(
						Long.valueOf(jobseeker.getIdentityNumber()), 
						jobseeker.getFirstName(), 
						jobseeker.getLastName(), 
						jobseeker.getBirthDate().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
