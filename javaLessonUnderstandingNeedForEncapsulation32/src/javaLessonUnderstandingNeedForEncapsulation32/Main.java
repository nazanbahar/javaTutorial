package javaLessonUnderstandingNeedForEncapsulation32;


/**
 * @author User
 * ENCAPSULATİON IHTIYACINI ANLAMAK
 * UnderstandingNeedForEncapsulation
 * 1) Encapsulation
 * s1. Kapsulleme Yontemi, herhangi bir alanın kullanımını kısıtlamayı ongorur.
 * s2. productManager.Add Methoduna product gonderdik.
		productManager.Add(product);
 * s3. OVerloading Yapmak 
 * 2) ADD BAD  VERSION: 
 * s1. add methodunda Bad version'da, yeni bir özellik eklemek istediğimizde, 
 * tek tek tüm ekranlarda güncellemek gerekir.
 * s2. UYARI: yeni bir ozellik eklendiginde tum ekranlar hata verir.
 * 
 * 3) ENCAPSULATION OZELLILERI
 * s1. yeni ozellik eklemek cok pratiktir.
 * s2. Default deger vermek gerektiginde, kural koymak gerektiğinde de encapsulation'dan yararlanılır.
 * s3. product.price = -20; (negatif) değer verilemez. 
 * Biz bunun kontrolünde de encapsulation'dan yararlanırız. 
 * 
 * 4) OZEL ERISIME SAHIP PRODUCT
 * s1. PRIVATE erisim bildirgeci ekledikten sonra(private int productID;) 
 * s2. main'de hata aldık. Error: 'productName' has private access in 'Product'
 *	
 */
public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		/* ERROR CODE
		 * product.productID=1; product.productName="Samsung"; product.price = 5010;
		 * product.stockAmount = 3; //ENCAPSULATION - yeni ozellik ekledik.
		 * product.yeniOzellik = "yeni Ozellik"; product.description =
		 * "Samsung N20 - Akıllı Telefon";
		 */
		
		//v2: ProductManager - Instance (create)
		ProductManager productManager = new ProductManager();

		System.out.println("v2: URUN EKLEMEK: Eklenen Urun - product attribute class");
		//productManager.Add Methodu
		productManager.Add(product);
		
		//add-bad version - uyarı: yeni bir ozellik eklendiginde tum ekranlar hata verir.
		productManager.AddBadVersion(1, "", 5010, 3, "","");
		productManager.AddBadVersion(1, "", 5010, 3, "","");
		productManager.AddBadVersion(1, "", 5010, 3, "","");
		
	}

}
