package javaHomeworkLesson3;

public class UserManager {
	//super class - base
		
	//private attribute
	private Logger logger;
	
	//constructor
	public UserManager(Logger logger) {
		this.logger = logger;
	}
	
	
	  public void add (User user) { 
		  System.out.println(user.getId()+user.getEmail() + " user kaydedildi"); 
		  this.logger.log("log messages: with Logger - private attribute");
		  
		  }
	 
		
		//Bulk Insert : Array ile EklemekS
		public void addMultiple(User[] users) {
			//for loop
			for(User user: users) {
				add(user);
			}
			
		}
  }		

