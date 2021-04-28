package javaLessonWhatsClass27;

/**
 * @author User
 * CLASS NEDIR?
 *  Onceki konular, Algoritmik Yapilardır. ex.if,loop vb.
 *  Sustainable Software - Sürdürülebilir.
 *  Sürdürülebilir olabilmesi için, yeni istek ve ihtiyaclara cevap verebilmelidir. 
 * Design Patterns 
 * "Everything in Java is class."
 *  Product, add, update, delete, getall, getbyid
 *  E-ticaret amaç; Ürün listelemek, detayını görüntülemek, ürün eklemek, silmek, güncellemek 
 * The main feature of classes is to group them.
 * Classların temel özelliği gruplama yapmaktır.
 * MANAGER: Operasyon bazlı işlemlerdir. Blok içinde ilgili methodlar yazılır.
 * CustomerManager'ın daha kolay kullanımı için, ayrıca Class oluşturalım.
 * USING: Calling CustomerManager
 * 
 */
public class Main {

	public static void main(String[] args) {

		//CALLING CustomerManager
		//In order to be sustainable, it must be able to respond to new requests and needs.
		//The main feature of classes is to group them.
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Update();
		customerManager.Delete();
	}

}










