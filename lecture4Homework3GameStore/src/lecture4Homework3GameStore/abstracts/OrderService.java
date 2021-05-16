package lecture4Homework3GameStore.abstracts;

import lecture4Homework3GameStore.entities.Campaign;
import lecture4Homework3GameStore.entities.Customer;
import lecture4Homework3GameStore.entities.Game;
import lecture4Homework3GameStore.entities.Order;

public interface OrderService {
	void add(Order order);
	void update(Order order);
	void delete(Order order);
	void buy(Customer customer, Campaign campaign, Game game);
	
}
