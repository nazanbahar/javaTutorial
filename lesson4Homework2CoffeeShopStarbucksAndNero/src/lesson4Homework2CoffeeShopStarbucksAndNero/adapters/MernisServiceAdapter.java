package lesson4Homework2CoffeeShopStarbucksAndNero.adapters;

import java.rmi.RemoteException;


import lesson4Homework2CoffeeShopStarbucksAndNero.abstracts.CustomerCheckService;
import lesson4Homework2CoffeeShopStarbucksAndNero.entities.Customer;
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