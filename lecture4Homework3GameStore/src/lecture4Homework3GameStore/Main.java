package lecture4Homework3GameStore;

import java.time.LocalDate;

import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.KidsCampaign;
import Entities.Order;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		//local date
		LocalDate date = LocalDate.now();  
		LocalDate yesterday = date.minusDays(1);  
	    LocalDate tomorrow = yesterday.plusDays(2);  
	    System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+yesterday);  
	    System.out.println("Tommorow date: "+tomorrow);  
	    System.out.println("____________________________________");

	    //campaign
		Campaign kids = new Campaign(1, "Technofest Campaign: ", 10.00,true);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(kids);
		campaignManager.update(kids);
		campaignManager.delete(kids);
		System.out.println("____________________________________");
		
		
		//customer
		Customer can = new Customer();
		can.setId(1);
		can.setUserId(0001);
		can.setNationalIdentityId("3423433");
		can.setFirstName("Can");
		can.setLastName("Bahar");
		can.setEmail("can@can");
		can.setDateOfBirthYear(2001);
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(can);
		customerManager.update(can);
		customerManager.delete(can);
		System.out.println("____________________________________");
		
		//game
		Game game = new Game(1,2021," Best-Game : " , 754.00);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		System.out.println("____________________________________");
		
		//user
		User susan = new User(1," susan@susan ");
		UserManager userManager = new UserManager();
		userManager.add(susan);
		userManager.update(susan);
		userManager.delete(susan);
		System.out.println("____________________________________");

		//order
		Order order = new Order(1,1,1,1,date);
		OrderManager orderManager = new OrderManager();
		orderManager.add(order);
		orderManager.update(order);
		orderManager.delete(order);
		System.out.println("____________________________________");
		orderManager.buy(can, kids, game);
		System.out.println("____________________________________");
		
		
		
	}

}
