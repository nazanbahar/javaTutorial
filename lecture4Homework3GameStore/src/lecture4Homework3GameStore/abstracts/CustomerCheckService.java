package lecture4Homework3GameStore.abstracts;

import lecture4Homework3GameStore.entities.Customer;

public interface CustomerCheckService {

	//generic ortak operasyon
	boolean CheckIfRealPerson(Customer customer);
}

//s1. kullanıcı kişi ile ilgili kontrolllerni yapmak isteriz.
//s2. Bir method yazarken diğer müşterilerin de isteyebileceği düşünülerek, 
//interface de ortak operasyon olarka tanımlanabilir.
//s3. CheckIfRealPerson()→ Kişi kimlik doğrulaması
