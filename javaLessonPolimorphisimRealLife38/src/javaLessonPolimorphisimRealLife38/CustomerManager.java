package javaLessonPolimorphisimRealLife38;


/**
 * @author User
 * STEP1:
 * 	
	//add method
	public void Add() {
		System.out.println("Müşteri eklendi");
		DatabaseLogger logger = new DatabaseLogger();
		logger.Log("Logger mesajı");
	}
 */

public class CustomerManager {
	//private -attribute
	private BaseLogger logger;
	
	//private constructor oluşturuyoruz.
	public CustomerManager(BaseLogger logger){
		this.logger = logger;
		//constructor new lerken çalışır.
	}
	
	
	//add method
	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("log messages: with BaseLogger- private attribute");
	}
}
