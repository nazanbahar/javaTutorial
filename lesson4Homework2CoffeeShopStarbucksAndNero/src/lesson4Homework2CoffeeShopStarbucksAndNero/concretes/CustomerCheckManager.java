package lesson4Homework2CoffeeShopStarbucksAndNero.concretes;

import lesson4Homework2CoffeeShopStarbucksAndNero.abstracts.CustomerCheckService;
import lesson4Homework2CoffeeShopStarbucksAndNero.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}

//s1. return true ile doğrulanmış varsayıyoruz.