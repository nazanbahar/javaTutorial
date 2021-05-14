package javaHomeworkLesson3;


public class ForeignUserManager extends UserManager {
	public ForeignUserManager(Logger logger) {
		super(logger);
		// TODO Auto-generated constructor stub
	}

			//super class - base
			public void add (User  user) {
				System.out.println(user.getId()+user.getEmail() +  " Yabancı Uyruklu kaydedildi");
			}
			
			//Bulk Insert : Array ile Eklemek
			public void addMultiple(User[] users) {
				//for loop
				for(User user: users) {
					add(user);
				}
			}
}
