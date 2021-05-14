package lesson4Homework1Part45_staticDemo;


public class ProductValidator {
	
	//STATIC YAPICI BLOK
	static {
		System.out.println("Static Yapıcı blok çalıştı");	
	}
	
	
	//YAPICI BLOK
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	//STEP1: DOĞRULAMAK: Product nesnesini doğrula!
	public static boolean isValid(Product product) {
		//return bekliyor.
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
//CALLING METHOD:	
 public void someThing() {
	 //cağırmak için ProductValidator'u new() lememiz lazım.
 }
 
 
 //ANA CLASS ICINDE BAŞKA BİR CLASS OLUŞTUR : static tanımlanır.
 public static class BaskaBirClass {
	 public static void sil() {
		 
	 }
 }
 
 
}


//STATIC CLASS - Utils- Araçlar
//s1. operasyonu static yap, örnek oluşur ancak bir kez oluşur.
//s2. ProductValidator'u birkez oluştur. Tüm kullanıcılar kullansın.
//s3. Araç amacıyla kullanılır. Çok yaygın değildir.
//s4. static tanımlanınca uygulama sıfırlanıncaya kadar bellekten atılmaz.
//s5. Web uygulmasını durdurana kadar bellekten atılmıyor.
//s6. UYARI: Manager sınıfları asla static yapılmaz.
//s7. Yardımcı araçlar, kullan-at araçlar static yapılabiliyor.
//s8. SUMMARY: Bir methodu static yaptığımızda, class ismiyle direkt çağrılır.
//s9. CALLING: ProductValidator.isValid şeklinde çağrılır. 
//s10. Example: Validator, Loglama vb. yaygın olarak kullanılmaz.
//s11. Gerçek Hayat Örneği önemli syntax değil.
//s12. STATIC ler direkt Class ismiyle çağrılır. Çağrıldığında bellekte oluşturulur.
//s13. Yapıcı bloklar new() leyince çalışır.
//s14. Birden fazla static yapıcı blok çalıştırabiliriz. Hepside çalışır.
//s15. Ana class static olamıyor. 




