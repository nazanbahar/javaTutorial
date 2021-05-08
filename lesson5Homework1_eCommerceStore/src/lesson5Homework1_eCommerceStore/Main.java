package lesson5Homework1_eCommerceStore;

import businnes.concretes.AuthManager;
import businnes.concretes.UserManager;
import core.services.githubSignUp.GitHubMailManagerAdapter;
import core.services.googleSingUp.GoogleMailManagerAdapter;
import dataAccess.concretes.inmemory.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		
		AuthManager authManager=new AuthManager(new UserManager(inMemoryUserDao, 
				new GoogleMailManagerAdapter()));
		
		
		User baris = new User(4,"Barıs","Manço","barismanco@gmail.com","123456",true);
		User sezen = new User(5,"Sezen","Aksu","sezenaksu@gmail.com","654321",true);
		
		authManager.register(baris);
		
		
		UserManager userManager = new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter());
	
		
		userManager.update(baris);
		userManager.getAll();
	
	}

}
