package lesson4Homework2CoffeeShopStarbucksAndNero.concretes;

import lesson4Homework2CoffeeShopStarbucksAndNero.abstracts.BaseCustomerManager;
import lesson4Homework2CoffeeShopStarbucksAndNero.abstracts.CustomerCheckService;
import lesson4Homework2CoffeeShopStarbucksAndNero.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	//dependency service
	private CustomerCheckService customerCheckService;

	//cosutructor - injection
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	
	//abstract class generic: ortak save methodunu(@override) ettik, ezdik.
	//dependency service injection ile doğrulamamızı yaptık.
	@Override
	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Starbucks Customer: Not a valid person");
		}
		
	}
}
//s1. Senaryo gereği; StarbucksCustomerManager için mernis doğrulaması istenmektedir.
//s2. Bu doğrulama NeroCustomer için istenmemektedir.
//s3. USING: FIRST WAY:
// public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService {
//@Override
//public void CheckIfRealPerson(Customer customer) {} }

//s4. USING: SECOND BEST WAY: Dependency Injection : Dependency Injection Initialization
// Service→ CustomerCheckService için injection yapılır.

//s5.  UYARI: StarbucksCustomerManager, doğrulamaya ihtiyacı var o yüzden save methodunu doğrulamak için override ediyor.
// NeroCustomerManager, doğrulamaya ihtiyacı yok o yüzden save methodunu doğrulamak için kullanmıyor.



