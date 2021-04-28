package javaLessonClassesWithAtributesAndField31;

/**
 * @author User
 * 1) CLASSES PROPERTIES
 * s1. Class'lar birinci özelliği; ortak operasyonları tutar.(ProductManager) 
 * s2. Class'ların ikinci özelliği; Özellik(Properties) tutar.(Product) 
 * s3. "Class'lar ilgili operasyon ve özellikleri tutarlar."
 * s4. "Bir classın içinde başka bir classı kullanabiliriz." ex. ProductManager'da Product Class'ını kullanmak.
 * Field or Attribute olarak isimlendirilir. NE? Sorusunun cevabını verir. Eklenecek nesne Urun.
 
 * 2) USING: Gerçek Hayat Kullanımı
 * s1. Kullanıcıya bir ekran verelim.
 * s2. Id otomatik olarak veritabanında oluşturulur.
 * s3. productName için textbox yaz.
 * s4. Ürün Açıklaması textbox
 * s5. Ürün Fiyatı textbox
 * s6. Ürün stok adedi açılır kutu
 * s7. Son olarak Button ekliyoruz. 
 * s8. BUTTONA BASMAK:(VERİ EŞİTLEMEK) 
 * Butona bastığımızda textbox ve diğer alanları, 
 * kullanıcının yazdıkları verilerle eşitliyoruz.
 * product.productName = textbox.text  şeklinde eşitleme yapıyoruz.
 * 
 * 3) ATTRIBUTE-CLASS KIM KULLANACAK?
 * s1. ProductManager tarafından kullanılacaktır.(bkz. ProductManager) 
 * s2. "Bir classın içinde başka bir classı kullanabiliriz."
 * example1.ProductManager'da Product Class'ını kullanmak. 
 * example2.Main.java'da Product Class(Attribute) ve ProductManager Class(Operation) Classlarında olduğu gibi.
 * 
 * 4) STEPS
 * s1. Once ürünü oluştur.(Product)
 * s2. ProductManager (add methodu) ile product nesnesini ekle!
 * 
 * 5) COK ONEMLI BILGI
 * s1. En Buyuk Hata: Attribute Class içinde, OperationClass 
 * (add|update|delete|getall) methodlarını yazmaktır.  
 * s2. SOLID : Tek Sorumluluk ilkesi gereği, hatalı bir kullanımdır. 
 * s3. Bir class sadece bir iş yapar.
 * s4. Bir method sadece bir işi yapmalıdır.
 * s5. "Bir Product Class'ı hem attribute hem de methodları içermez."
 * s6. Mutlaka; AttributeClass(Product) ile OperationClass(ProductManager)'ları birbirinden ayırmalıyız.
 */
public class Main {

	public static void main(String[] args) {
		//USING PRODUCT-ATTRIBUTE-CLASS
		// Eklenecek Urun - product attribute class
		Product product = new Product();
		//product.productName="Laptop";
		
		product.productID=1;
		product.productName="Samsung";
		product.price = 5010;
		product.stockAmount = 3;
		product.description = "Samsung N20 - Akıllı Telefon";
		
		
		//v1: Listing And Added Product Information Manually
		System.out.println( "v1: AttributeClass Manuel Urun Bilgisi Print Etmek : " +
				" productId: "+ product.productID + 
				" productName: "+ product.productName +
				" productPrice: "+ product.price + 
				" StockAmount: "+ product.stockAmount + 
				" Description: "+ product.description);
		
		
		//v2: ProductManager - Instance (create)
		ProductManager productManager = new ProductManager();

		System.out.println("v2: URUN EKLEMEK: Eklenen Urun - product attribute class");
		//productManager.Add Methodu
		productManager.Add(product);
	}

}
