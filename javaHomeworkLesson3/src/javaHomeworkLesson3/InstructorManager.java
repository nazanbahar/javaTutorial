package javaHomeworkLesson3;


public class InstructorManager extends UserManager {

	public InstructorManager(Logger logger) {
		super(logger);
		// TODO Auto-generated constructor stub
	}

	//super class - base
	@Override
	public void add (User  user) {
		System.out.println(user.getId()+ user.getEmail() +  " instructor kaydedildi");
	}
	
	//Bulk Insert : Array ile Eklemek
		public void addMultiple(User[] users) {
			//for loop
			for(User user: users) {
				add(user);
			}
		}
}
