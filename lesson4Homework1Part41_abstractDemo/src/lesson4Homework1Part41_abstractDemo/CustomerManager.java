package lesson4Homework1Part41_abstractDemo;

public class CustomerManager {

	BaseDatabaseManager databaseManager;
	public void getCustomers() {
		
		databaseManager.getData();
		
	}
}


/*****************************************************
 * EXAMPLE-1: HATALI CODE
 * 
package lesson4Homework1Part41_abstractDemo;

public class CustomerManager {

	public void getCustomers() {
		
		OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
		oracleDatabaseManager.getData();
		
	}
}

 * 
 * */
 