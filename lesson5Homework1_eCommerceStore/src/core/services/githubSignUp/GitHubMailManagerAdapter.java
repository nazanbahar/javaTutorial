package core.services.githubSignUp;

import core.services.EmailService;

public class GitHubMailManagerAdapter implements EmailService {

	//attribute
	private GitHubMailManager gitHubMailManager; 
	
	
	//constructor
	public GitHubMailManagerAdapter() {
		this.gitHubMailManager = new GitHubMailManager();
	}
	
	//message
	@Override
	public void send(String email, String message) {
		gitHubMailManager.send(email, message);
		
	}

}
