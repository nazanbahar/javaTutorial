package javaLessonWorkingConstructor34;


/**
 * @author User
 * 1) CONSTRUCTOR İLE CALIŞMAK : YAPICI
 * s1. Default Contructor 
 * s2. Changed Constructor
 * s3. Her bir Class'ın kendi ismiyle baslayan bir Constructor u vardır.
 * s4. Using: public + className(){*}
 * 2) Getter-Setter Block 
 * s1. Getter-Setter Block manuel Refacatoring ile olusturduk.
 * s2. Ancak bunları hızlıca oluşturmak istediğimizde Cosntructor ile yapabiliriz.
 * s3. 
 */
public class Main {

	public static void main(String[] args) {
		//CONSTRUCTOR - NEW'leyince otomatik calisir.
		//Constructor-v1:
		Product product = new Product(1, "Laptop", 3000, 2, "Asus Laptop", "Yeni Ozellik:Renk:Mor", "Code");
		
		//Constructor-v2:
		 //Product product = new Product();
		//product.setId(1);
		 //product.setProductName("Samsung"); 
		 //product.setPrice(5010);
		 //product.setStockAmount(3); 
		 //product.setYeniOzellik("yeni Ozellik"); 
		 //product.setDescription("Samsung N20 - Akıllı Telefon");
		  
		 
		
		
		 //SETID: Set Etmek 
		  //CODE REFACTORING ile otomatik olarak setProductName ve digerleri geldi.
		  //product.productID=1;
		  //ENCAPSULATION - yeni ozellik ekledik.
		  //URUN IDSINI OKUMAK
		  product.getId();
		  //AUTO: GET-SET: auto selected attribute(get | set)
		  product.setProductName("TV-2");
		  System.out.println("GETTER getKod() substring (productName.substring(0,1) : "  + product.getKod());
		  product.getProductName();
		
		  
		  
		//v2: ProductManager - Instance (create)
		ProductManager productManager = new ProductManager();

		System.out.println("v2: URUN EKLEMEK: Eklenen Urun - product attribute class");
		//productManager.Add Methodu
		productManager.Add(product);
		
		  
		  
	}

}
