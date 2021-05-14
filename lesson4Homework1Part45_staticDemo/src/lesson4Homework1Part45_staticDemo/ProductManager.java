package lesson4Homework1Part45_staticDemo;

public class ProductManager {
	public void add(Product product) {
		//STEP1:DOGRULAMA: eklenmeden önce ProductValidator Çalışsın
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir");
		}

		
		//STEP2: VERİTABANINA EKLEME: veritabanına göndersin.
		System.out.println("Veritabanına Eklendi");
		
	};
}
