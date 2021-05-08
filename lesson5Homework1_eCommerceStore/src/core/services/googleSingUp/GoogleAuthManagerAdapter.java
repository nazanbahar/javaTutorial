package core.services.googleSingUp;

import businnes.abstracts.UserService;
import core.services.ExternalAuthService;
import entities.concretes.User;
import entities.concretes.dToS.UserLoginForDto;

public class GoogleAuthManagerAdapter implements ExternalAuthService {

	
	//attribute references
	private UserService userService;
	
		
	//constructor
	public GoogleAuthManagerAdapter(UserService userService) {
		this.userService = userService;
	}


	@Override
	public void register(String email) {
		
		if(userExists(email) == false) {
			userService.add(null);

		}else{
				User user = userService.getByEmail(email);
				
				UserLoginForDto userLoginForDto = new UserLoginForDto();
				userLoginForDto.setEmail(user.getEmail());
				userLoginForDto.setPassword(user.getPassword());
				
				login(userLoginForDto);
		}
		
	}


	@Override
	public boolean userExists(String email) {
		
		if(userService.getByEmail(email)!=null) {
			return true;
		}
		return false;
	}


	@Override
	public void login(UserLoginForDto userLoginForDto) {
		if(userLoginForDto != null && userLoginForDto.getPassword().equals(userLoginForDto.getPassword())) {
			System.out.println("you have successfully logged in");				
		}
		else {
			System.out.println("username or password is incorrect");
		}
	}

}
