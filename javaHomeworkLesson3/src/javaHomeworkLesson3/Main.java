package javaHomeworkLesson3;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//student
		Student can = new Student();
		can.setId(1);
		can.setUserId(0001);
		can.setFirstName("Can");
		can.setLastName("Bahar");
		can.setEmail("can@can");
		can.setCheckout(false);

		
		Student firuzan = new Student();
		firuzan.setId(2);
		firuzan.setUserId(0002);
		firuzan.setFirstName("Firuzan");
		firuzan.setLastName("Can");
		firuzan.setEmail("firuzan@can");
		firuzan.setCheckout(true);
		
		
		Student duru = new Student();
		duru.setId(3);
		duru.setUserId(0003);
		duru.setFirstName("Duru");
		duru.setLastName("Can");
		duru.setEmail("duru@can");
		duru.setCheckout(true);
		
		
		//Instructor
		Instructor engin = new Instructor();
		engin.setId(1);
		engin.setUserId(0004);
		engin.setFirstName("Engin");
		engin.setLastName("Demiroğ");
		engin.setEmail("engin@engin");
		engin.setDepartmentName("Consultant and Instructor");
		engin.setTitle("Microsoft Certified Trainer (MCT), PMP and ITIL Certificates");

			
		CorporateUser ezgi = new CorporateUser();
		ezgi.setId(1);
		engin.setUserId(0005);
		ezgi.setFirstName("Ezgi");
		ezgi.setLastName("Can");
		ezgi.setEmail("ezgi@can");
		ezgi.setCorporationName("TUBITAK");
		ezgi.setDepartmentName("Bilgi İşlem - ARGE");
		ezgi.setTitle("softwareDeveloper");
		
		
		ForeignUser susan = new ForeignUser();
		susan.setId(1);
		susan.setUserId(0006);
		ezgi.setFirstName("Ezgi");
		ezgi.setLastName("Can");
		susan.setEmail("susan@can");
		susan.setPassportSerialNumber("XX-YY-90457826466-NN");
		susan.setNationality("Kanada");
		susan.setWorkPermit(true);

		
	
		//loggers array + For Loop
		Logger[] loggers = new Logger[] {new FileLogger(),new EmailLogger()};
		
		//for loop - (for baseLogger)
		for(Logger logger: loggers) {
			logger.log("Log mesajı");
		}
		
		
		//single
		System.out.println("============================");
		System.out.println("SINGLE ADD");
		UserManager userManager = new UserManager(new EmailLogger());
		userManager.add(susan);
		userManager.add(ezgi);
		userManager.add(engin);
		userManager.add(duru);
		userManager.add(firuzan);
		System.out.println("============================");
		//multiple
		//User[] users = new User[] {new Student(), new Instructor(), new ForeignUser(), new CorparateUser()};
		System.out.println("MULTIPLE ADD");
		User[] users = new User[] {susan,ezgi,engin,duru,firuzan,can};
		userManager.addMultiple(users);	
		
		for (User user : users) {
			
			System.out.println(user.getId() + user.getEmail());
			
		}
		//important
		System.out.println("============================");
		System.out.println(engin.getId() + engin.getEmail());
		
		
		System.out.println("============================");
	
	}
	
}
