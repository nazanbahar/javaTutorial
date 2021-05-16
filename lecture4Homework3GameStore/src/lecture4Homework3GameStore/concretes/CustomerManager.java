package lecture4Homework3GameStore.concretes;

import lecture4Homework3GameStore.abstracts.CustomerService;
import lecture4Homework3GameStore.entities.Customer;

public class CustomerManager implements CustomerService {
	/*
	 * private Campaign[] campaigns;
	 * 
	 * public CustomerManager(Campaign[] entities) { this.campaigns = entities; }
	 */

	@Override
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi: " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müşteri güncellendi: " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi:" + customer.getFirstName());
		
	}

	@Override
	public void save(Customer customer) {
		
		
	}

}
