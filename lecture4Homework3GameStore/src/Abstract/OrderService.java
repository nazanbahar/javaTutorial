package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public interface OrderService {
	void add(Order order);
	void update(Order order);
	void delete(Order order);
	void buy(Customer customer, Campaign campaign, Game game);
	
}
