package core.services;

import entities.concretes.dToS.UserLoginForDto;

public interface ExternalAuthService {
	void register(String email);
	boolean userExists(String email);
	void login(UserLoginForDto dto);
}
