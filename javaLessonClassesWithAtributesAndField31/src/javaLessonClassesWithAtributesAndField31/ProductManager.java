package javaLessonClassesWithAtributesAndField31;

/**
 * @author User
 *1) Operasyon Class : add|update|delete|getall|
 *s1. Parametre veriyoruz. (int, string, double degil artık class)
 
 2) Urunu Veritabanına Eklemek
s1.  Bunun için Main Java'ya gitmemiz lazım ve ProductManager'ı da new'lememiz lazım.
 3) JDBC
 3) Bir class içinde başka bir class kullanılabilir. Ex. ProductManager'da Product Class'ını kullanmak gibi.
 */

public class ProductManager {
	public void Add(Product product) {
	//JDBC	
		System.out.println("Ürün eklendi: " + product.productName);
	}
}
