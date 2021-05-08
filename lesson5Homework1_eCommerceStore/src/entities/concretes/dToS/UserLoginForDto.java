package entities.concretes.dToS;

import entities.abstracts.Dto;

public class UserLoginForDto implements Dto {
	//attribute
	private String email;
	private String password;
	
	//constructor -non parameter
	public UserLoginForDto() {
		
	}

	//constructor - parameters
	public UserLoginForDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	//getter-setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
