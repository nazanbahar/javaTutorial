package javaHomeworkLesson3;

public class StudentManager extends UserManager {
	//super class - base
	
	  public StudentManager(Logger logger) {
		super(logger);
		// TODO Auto-generated constructor stub
	}


	@Override public void add (User user) {
	  System.out.println(user.getId()+user.getEmail() + " student kaydedildi");
	  
	  }
	 
	
	//Bulk Insert : Array ile Eklemek
	public void addMultiple(User[] users) {
		//for loop
		for(User user: users) {
			add(user);
		}
	}
	
}
