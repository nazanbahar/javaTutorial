package businnes.abstracts;

import entities.concretes.User;
import entities.concretes.dToS.UserLoginForDto;

public interface AuthService {
	void register(User user);
	void login(UserLoginForDto userLoginForDto); 
	boolean userExists(String email);
	void verify(User user, String token);
	
}
