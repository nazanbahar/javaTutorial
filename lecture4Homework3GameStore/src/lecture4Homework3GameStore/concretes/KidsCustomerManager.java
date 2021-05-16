package lecture4Homework3GameStore.concretes;

import lecture4Homework3GameStore.abstracts.BaseCustomerManager;
import lecture4Homework3GameStore.entities.Customer;

public class KidsCustomerManager extends BaseCustomerManager {

	@Override
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi" + customer.getFirstName() + customer.getLastName());
		
	}


	@Override
	public void update(Customer customer) {
		System.out.println("Müşteri güncellendi" + customer.getFirstName() + customer.getLastName());
		
	}


	@Override
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi" + customer.getFirstName() + customer.getLastName());
		
	}

	
}
//s1. KidsCustomerManager, doğrulamaya ihtiyacı yoktur.