package core.services.githubSignUp;

public class GitHubMailManager implements GitHub  {
	public void send(String email, String message) {
		System.out.println("Github ile email gönderildi");
	}
	
}
