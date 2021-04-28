package javaLessonWorkingGetterSetter33;


/**
 * @author User
 * 1) GETTER
 * s1. Deger Okumak
 * s2. GetId() : Urun Id'sini Okumak example: product.getId();
 * 
 * 2) SETTER
 * s1. Kurmak, Değer Atamak
 * 
 * 3) CODE REFACTORING ile otomatik olarak setProductName ve digerleri geldi.
 * s1. product.setProductName("TV-2"); (product. setList gelecektir.
 * s2. AUTO: GET-SET: auto selected attribute(get | set)
 * example:	  product.setProductName("TV-2");
 *example:  product.getProductName();
 */
public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		 
		 //SETID: Set Etmek 
		 product.setId(1);
		  //CODE REFACTORING ile otomatik olarak setProductName ve digerleri geldi.
		  //product.productID=1;
		  product.setProductName("Samsung"); 
		  product.setPrice(5010);
		  product.setStockAmount(3); 
		  //ENCAPSULATION - yeni ozellik ekledik.
		  product.setYeniOzellik("yeni Ozellik"); 
		  product.setDescription("Samsung N20 - Akıllı Telefon");
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
