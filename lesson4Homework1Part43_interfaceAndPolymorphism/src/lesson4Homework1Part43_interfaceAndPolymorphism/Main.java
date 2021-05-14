package lesson4Homework1Part43_interfaceAndPolymorphism;


/**
 * @author User
 * Polimorphisim Interface'ler ile Uygulanma Versiyonu
 */
public class Main {

	public static void main(String[] args) {
		
		//EXAMPLE-2: Calling Database Options 
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal() ); //must parameter options 
		customerManager.add();
		
	}
}


/**************************************************
 * //EXAMPLE-1: java.lang.NullPointerException Hatası
 * KURAL:CustomerManager, CustomerDal customerDal ı çağırır. Interfaceler newlenemez. 
 *  	CustomerManager customerManager = new CustomerManager();
		customerManager.add();
--------------------------------------------------------		
	//EXAMPLE-2: Calling Database Options
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new OracleCustomerDal();
		customerDal.add();
		
 *****************************************************/
 