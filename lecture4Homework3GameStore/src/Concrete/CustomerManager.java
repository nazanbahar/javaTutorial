package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

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

}
