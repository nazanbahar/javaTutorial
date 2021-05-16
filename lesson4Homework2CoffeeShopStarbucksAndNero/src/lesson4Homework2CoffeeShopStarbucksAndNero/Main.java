package lesson4Homework2CoffeeShopStarbucksAndNero;

import java.time.LocalDate;
import lesson4Homework2CoffeeShopStarbucksAndNero.abstracts.BaseCustomerManager;
import lesson4Homework2CoffeeShopStarbucksAndNero.adapters.MernisServiceAdapter;
import lesson4Homework2CoffeeShopStarbucksAndNero.concretes.NeroCustomerManager;
import lesson4Homework2CoffeeShopStarbucksAndNero.concretes.StarbucksCustomerManager;
import lesson4Homework2CoffeeShopStarbucksAndNero.entities.Customer;

public class Main {

	public static void main(String[] args) {
	
		//example: 1 : microService Integration
		// NeroCustomer and StarbuksCustomer : save() methodu her iki firma içinde aynıdır.
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		//baseCustomerManager.save(new Customer());
		
		//customer
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("NAME");
		customer.setLastName("SURNAME");
		customer.setDateOfBirth(LocalDate.of(2000,02,07));  //uyarı: doğrulama, doğum yılı ile olmaktadır. Yıl değişmesi yeterlidir. 
		customer.setNationalityId("111111111111");
		
		
		baseCustomerManager.save(customer);  // all options definition
		starbucksCustomerManager.save(customer); //for starbucksCustomer with Mernis Validation
		neroCustomerManager.save(customer);   //for neroCustomer - NON-Mernis validation
			
		
	}

}


//StarbucksCustomer : mernis doğrulaması istenmektedir.
//BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
//baseCustomerManager.save(can);

//NeroCustomer :mernis doğrulaması istenmiyor.
//BaseCustomerManager baseCustomerManager = new NeroCustomerManager();



/**
 * @author User
 * STEP1: Senaryo gereği nesneleri çıkart. Nesneyi oluştur.
 * STEP2: Her nesneninin mutlaka bir interface i olmak zorundadır. ortak operasyonları yaz. ex. save()
 * STEP3: Nesnemize implement edelim. Interface implemenasyonu yapan herkes kullanmak zorundadır.
 * STEP4: Code implentasyonu varsa → abstract class yazarız. hem referansdan yararlanır hemde switch yaparız.
 * STEP5: Interface → referans olarak kullanırız. Ayrıca operasyon gruplandırması amacıyla kullanırız.
 * STEP6: Interface → REFERANS  + ORTAK OPERASYON
 * STEP7: Abstract Class → keywords→ abstract class , 
 * içi dolu method içerir. ex. save() methodu, starbucks ve nero içinde geçerlidir vb.
 * STEP8: StarbucksManager'da, Mernis doğrulması için; abstract class ortak save methodunu(@override) edelim.
 * STEP9: StarbucksManager'da, if (customerCheckService.CheckIfRealPerson(customer)) koşulu ile 
 *  dependency service injection ile doğrulamamızı yaptık.
 * STEP10: UYARI: StarbucksCustomerManager, doğrulamaya ihtiyacı var o yüzden save methodunu doğrulamak için override ediyor.
 *  NeroCustomerManager, doğrulamaya ihtiyacı yok o yüzden save methodunu doğrulamak için kullanmıyor.
 * STEP11: MERNIS BAĞLANMA: 
 * s1. Dış bir servis kullanırken adapters'a ihtiyacım vardır. Sisteme adapte ederken 
 * Adapter Design Pattern kullanılır.
 * s2. MernisServiceAdapter yazalım.
 * s3. MernisServiceAdapter →  implements CustomerCheckService edelim.
 * STEP16: Özetle, ortak operasyon → abstract classs, farklılıklar, Dependency Injection Initialization
// Service→ CustomerCheckService için injection yapılır. ex. StarbucsCustomerManager için Mernis doğrulaması vb.
 * 
 * STEP8: UYARI: doğrulama, doğum yılı ile olmaktadır. Yıl değişmesi yeterlidir.
 * 
 */

