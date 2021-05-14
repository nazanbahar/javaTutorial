package javaHomeworkLesson3;


public class User  {
	private int id;
	private String email;
	
	
	//constructor
		public User() {
			
		}


		//getter-setter
		public User(int id, String email) {
			this.id = id;
			this.email = email;
		}


		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}
	
}
