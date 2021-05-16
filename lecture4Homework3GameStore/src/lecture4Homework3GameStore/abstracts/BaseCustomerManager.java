package lecture4Homework3GameStore.abstracts;

import lecture4Homework3GameStore.entities.Customer;

/**
 * @author User
 * s1. BaseCustomerManager →  Abstract Class
 * s2. keywords→ abstract class
 * s3. "Sen bir CustomerService'sin."
 * s4. implements →  CustomerService 
 * s5. void operasyonu, ortak save methodunu otomatik olarak eklenecektir.
 * s6. NeroCustomerManager ve StarbuksCustomerManager'da BaseCustomerManager'ı extends edeceğiz.
 */
public abstract class BaseCustomerManager implements CustomerService  {

	@Override
	public void save(Customer customer) {
		
		System.out.println("save to db : " +  customer.getFirstName()+ " "+ customer.getLastName());
	}

}
