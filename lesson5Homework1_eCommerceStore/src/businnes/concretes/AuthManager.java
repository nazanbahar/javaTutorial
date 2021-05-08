package businnes.concretes;

import businnes.abstracts.AuthService;
import businnes.abstracts.UserService;
import core.utils.Utils;
import entities.concretes.User;
import entities.concretes.dToS.UserLoginForDto;

public class AuthManager implements AuthService {

	
	private UserService userService;
	
	
	public AuthManager(UserService userService) {
		this.userService = userService;
	}


	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.getEmail()) == false
				&& Utils.emailValidate(user.getEmail())) {

			userService.add(user);

		} else {
			System.out.println("Kayıt başarısız");
		}
		
	}


	@Override
	public void login(UserLoginForDto userLoginForDto) {
		User user = userService.getByEmail(userLoginForDto.getEmail());

		if (user != null && user.getPassword().equals(userLoginForDto.getPassword())) {
			
			System.out.println("Başarıyla giriş yaptınız");

		}else {
			System.out.println("Kullanıcı adı ve şifre yanlış");
		}
		
	}


	@Override
	public boolean userExists(String email) {
		
		User user = userService.getByEmail(email);

		if (user == null) {
			return false;
		} else {
			System.out.println("Email mevcut." + email);
			return true;
		}
	}


	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 20) {
			User exitsUser = userService.getByEmail(user.getEmail());
			exitsUser.setVerify(true);

			userService.update(exitsUser);
			System.out.println("Token: dogrulandi");
		} else {
			System.out.println("Token: dogrulanamadı");
		}
		
	}
	
	
	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean passwordValidate(String password) {

		if (password.length() >= 6) {
			return true;
		} else {
			System.out.println("Şifreniz en az 6 karakter olmalıdır.");
			return false;
		}
	}

}
