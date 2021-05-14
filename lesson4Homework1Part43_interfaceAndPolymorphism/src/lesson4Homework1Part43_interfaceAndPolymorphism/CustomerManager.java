package lesson4Homework1Part43_interfaceAndPolymorphism;

public class CustomerManager {
	
	//EXAMPLE-2: 
	//global attribute
	//private: dışardan erişim yoktur.
	private CustomerDal customerDal;
	
	//constructor
	public CustomerManager(CustomerDal customerDal) { //parameter
		this.customerDal = customerDal;
	}
	
	public void add() {
		//iş kodları
		customerDal.add();
	}
	
}

/****************************************************
 * 
EXAMPLE: 1: Yöntem 1- çok tercih edilmez.
public class CustomerManager {
	CustomerDal customerDal;
	
	public void add() {
		customerDal.add();
	}
}
-------------------------------------------------
 * */
 