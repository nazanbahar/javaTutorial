package lecture4Homework3GameStore.concretes;

import lecture4Homework3GameStore.abstracts.UserService;
import lecture4Homework3GameStore.entities.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getEmail() + " User eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getEmail() + " User eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getEmail() + " User eklendi");
		
	}

}
