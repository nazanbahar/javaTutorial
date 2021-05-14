package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(" Ürün eklendi: " + order.getId() + order.getOrderDate());
	}

	@Override
	public void update(Order order) {
		System.out.println(" Ürün güncellendi: " + order.getId() + order.getOrderDate());	
	}

	@Override
	public void delete(Order order) {
		System.out.println(" Ürün silindi: " + order.getId() + order.getOrderDate());
	}

	@Override
	public void buy(Customer customer, Campaign campaign, Game game) {
		System.out.println(
				customer.getFirstName() + customer.getEmail() + customer.getUserId() +
				campaign.getId() + campaign.getName() +
				game.getGameCode() + game.getName() + game.getUnitPrice() +" Ürün satın alındı " 
				);
		
	}

}
