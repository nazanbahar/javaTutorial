package javaLessonInheritanceStructure36;

/**
 * @author User
 * STEP1: Inheritance = Miras
 * s1. İki nesne arasındaki miras olayıdır. 
 * s2. Gerçek hayat ile özdeşleştirilir.
 * s3. Kişi Nesnelerimiz; Customer, Employee
 * s4. Ortak ve farklı özellikleri var. 
 * s5. Base Class: Person
 * s6. Kişi Nesnelerimizi, Person'a Extends edelim.(Miras alır.)
 * s7. Böyle Miras alacağı Base Class'ı tanımlamış olduk.
 * 
 *   STEP2: VOID
 *   s1. CustomerManager'da void yazdık. 
 *   Veritabanı ile çalışırken; gerçek Müşteri bilgini döndürürüz. 
 *   public void List() {}
 *   
 *   STEP3: Operasyon Class : Manager Oluşturmak
 *   s1.EmployeeManager ve CustomerManager Oluşturalım.
 *   s2. List() ve Add() Methodları döndürelim.
 *   s3. Ancak bu iki method iki managerımızda da aynı.
 *   s4. O yüzden ayrıca bir PersonManager daha oluşturalım.
 *   s5. Ortak methodları oraya atarak. Farklı olanları ilgili classlarda tanımlayalım.
 *   s6. Base Class ımızı diğer employee ve customer class larımızda extends edelim.
 *    
 *    STEP4: DELETE Manager Ortak Codelar 
 * s1. Ortak codeları sildik. 
 * s2. Çünkü Base ClassManager'da artık.(PersonManager)
 * s3. Biz artık Base'den inheritance(miras) alacağız. 
 */
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.email = "customer@customer";
		employee.salary = 978540;
		
		//manager - inheritance(miras) PersonManager
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.List();
		//difference -employee
		employeeManager.BestEmployee();
	}

}
