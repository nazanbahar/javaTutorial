package businnes.concretes;

import java.util.List;

import businnes.abstracts.UserService;
import core.services.EmailService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.inmemory.InMemoryUserDao;
import entities.concretes.User;
import entities.concretes.dToS.UserLoginForDto;

public class UserManager implements UserService {

	
	private InMemoryUserDao inMemoryUserDao;
	private EmailService emailService;
	
	
		
	public UserManager(InMemoryUserDao inMemoryUserDao, EmailService emailService) {
		this.inMemoryUserDao = inMemoryUserDao;
		this.emailService = emailService;
	}

		
	@Override
	public void add(User user) {
		if(userValidate(user)) {
			inMemoryUserDao.add(user);
			
			emailService.send(user.getEmail(), "Kayit Olundu");
		}
		
	}

	@Override
	public void update(User user) {
		if(userValidate(user)) {
			inMemoryUserDao.update(user);
		}
		
	}

	@Override
	public void delete(User userId) {
		inMemoryUserDao.delete(userId);
		
	}

	@Override
	public User getByEmail(String email) {
		
		return inMemoryUserDao.getByEmail(email);
	}

	
	@Override
	public List<User> getAll() {
		for(User user : inMemoryUserDao.getAll()){
			System.out.println(user.getFirstName() + " "+ user.getLastName() + " "+ user.getEmail());
		}
		return inMemoryUserDao.getAll();
	}

	
	public boolean userValidate(User user) {
		if(user.getFirstName().length()>2 && user.getLastName().length()>2) {
			return true;
		}
		System.out.println("Ad ve Soyad en az 2 karakter");
		
		return false;
	}
	
	
}
