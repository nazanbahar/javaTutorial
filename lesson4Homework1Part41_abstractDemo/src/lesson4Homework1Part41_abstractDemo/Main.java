package lesson4Homework1Part41_abstractDemo;

/**
 * @author User
 * Java Dersi 41 : Demo Abstract Sınıfları Pekiştirmek
 */
public class Main {

	public static void main(String[] args) {
		// EXAMPLE: Müşterinin Veritabanına kayıt etme alternatifleri 
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.getCustomers(); // direkt database için hatalı kullanım.
		//Oracle a göre çalışır.
		customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.getCustomers();
	}

}
