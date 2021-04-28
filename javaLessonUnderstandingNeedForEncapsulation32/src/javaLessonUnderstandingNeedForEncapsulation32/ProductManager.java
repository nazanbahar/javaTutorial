package javaLessonUnderstandingNeedForEncapsulation32;


/**
 * @author User
 * 1) ADD BAD  VERSION: 
 * add methodunda Bad version'da, yeni bir özellik eklemek istediğimizde, 
 * tek tek tüm ekranlarda güncellemek gerekir.
 */
public class ProductManager {
	//add
	public void Add(Product product) {
		//JDBC	
			// System.out.println("Ürün eklendi: " + product.productName); -- ERROR CODE
		}

	//add-bad version
	public void AddBadVersion(int productID, String productName, double price, int stockAmount, String description, String yeniOzellik ) {
		System.out.println("Ürün eklendi: ");
	}
}
