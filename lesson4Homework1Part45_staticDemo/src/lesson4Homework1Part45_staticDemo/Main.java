package lesson4Homework1Part45_staticDemo;

/**
 * @author User
 * Composition  - Inner Class ve Static
 * Erişim: Main.main ile erişiriz.
 */
public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "Teleskop";
		
		manager.add(product);
		
	}

}
