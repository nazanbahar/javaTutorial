package lecture4Homework3GameStore.adapters;

import java.rmi.RemoteException;

import lecture4Homework3GameStore.abstracts.CustomerCheckService;
import lecture4Homework3GameStore.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		boolean result;
		
		//adapter
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
				result = kpsPublicSoapProxy.TCKimlikNoDogrula(
						Long.parseLong(customer.getNationalityId()), 
						customer.getFirstName().toUpperCase(), 
						customer.getLastName().toUpperCase(),
						customer.getDateOfBirth().getYear()); 
			
		} catch (RemoteException e) {
			result = false;
			e.printStackTrace();
		}
		
		return result;
		
	}

}




//s1. "Sen bir CustomerCheckService sın."
//s2. firtname ve lastname için toUpperCase() → Büyük harf ister.
//s3. long → TCNO log istemektedir.