package lecture4Homework3GameStore.concretes;

import lecture4Homework3GameStore.abstracts.BaseCustomerManager;
import lecture4Homework3GameStore.abstracts.CustomerCheckService;
import lecture4Homework3GameStore.entities.Customer;

public class StudentCustomerManager extends BaseCustomerManager {

	//dependency service
	private CustomerCheckService customerCheckService;

	//costructor - injection
	public StudentCustomerManager(CustomerCheckService customerCheckService) {
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
			System.out.println("Customer Validation: Not a valid person");
		}
		
	}


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


