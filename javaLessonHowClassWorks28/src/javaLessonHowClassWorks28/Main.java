package javaLessonHowClassWorks28;

/**
 * @author User
 * Main Class'ında herhangi bir methodda kullanabiliriz.
 * Class'lar genellikle birbirlerini kıullanırlar.
 * Type: customerManager bir türdür. example. int, double , String etc. 
 * Creating an example of type CustomerManager  
 * AMAÇ: Bellekte customerManager türünde bir nesne üretiriz ve kullanırız.(add|update|delete)
 * PUF: Bu sayede, yüzlerce nesne arasından gruplayarak işlem yapmış oluruz. example. CustomerManager, ProductManager, UserManager, CategoryManager
 * ONEMLI: "Class'lar Referans Tiptir."
 *  camelCase Definition : customerManager
 *  USING: "Bir Class kullanabilmek için onun new lenmesi gerekir!" 
 *  REFERANCES TYPE: Stack - Heap address
 *  Heap'de customer nesnesi oluşur.
 *  Step-2) Reference Type esitlemek - 101=102 - CM reference no:101 = CM2 reference no:102
 *  Step3) Java Memory Manager- Garbage Collector: The reference code is deleted by the Garbage Collector.
 *  UYARI1: Programmer, Class oluştururken dikkat etmelidir. Bellekte bir nesneyi new() lemek pahalıdır. 
 *  UYARI2: "Sadece ihtiyaç duyduğun nesneleri new() lemelisin!"   
 */
public class Main {

	public static void main(String[] args) {
		//CALLING  CLASS: CustomerManager
		//Classes - Reference Type
		// camelCasing
		//CustomerManager customerManager = new CustomerManager(); //CM reference no:101
		CustomerManager customerManager; //CM reference no:101 --UYARI: reference no tutuldudugu icin sorun cıkmaz.(Step-2)
		//Step-1) Stack - Heap address example
		CustomerManager customerManager2 = new CustomerManager(); //CM2 reference no:102
		//Step-2) reference type esitlemek - 101=102
		customerManager = customerManager2;
		//Step3) Java Memory Manager- Garbage Collector: The reference code is deleted by the Garbage Collector.
		
		customerManager.Add();
		customerManager.Update();
		customerManager.Delete();
		
		
	}

}
