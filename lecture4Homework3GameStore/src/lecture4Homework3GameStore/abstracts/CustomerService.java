package lecture4Homework3GameStore.abstracts;

import lecture4Homework3GameStore.entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	void save(Customer customer);
}
