package javaLessonWorkingConstructor34;

/**
 * @author User
 *	1) SETTER BLOCK
	SET ETMEK: ID Set Etmek 
	set edilecek id parametre olarak verilir. setId kullanıcıdan alınır.
	UYARI: THIS: Bu class demektir.
	Icinde bulundugum Product Nesnesinin productID'sidir.
2) Constructor Turleri
s1. NonParameter Constructor
s2. Parameter Constructor 

3) OVERLOADING : Asırı Yukleme, aynı isimle farklı paramerelerle methodlarımızı kullanabiliriz.
 */
public class Product {
	
	//NonParameter Constructor
	/*
	 * public Product()) { System.out.println("Yapıcı blok calisti "); }
	 */
	
	//6 Parameters Constructor - parametreden gelen properties leri eslestirelim.
	public Product(int productID, String productName, double price, int stockAmount, String description, String yeniOzellik,String kod) {
		System.out.println("Yapıcı blok calisti ");
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.stockAmount = stockAmount;
		this.description = description;
		this.yeniOzellik = yeniOzellik;
		this.kod = kod;
		
		
	}
	
	public Product() {
		
	}
	
	//attribute | field  
	//private erisim bildirgeci
	private int productID; // this ile bu class demektir.
	private String productName;
	private double price;
	private int stockAmount;
	private String description;
	private String yeniOzellik;
	private String kod;
	
	
	
	//getter block -readonly: Id Okumak
	public int getId() {
		return productID;
	}

	//setter block
	public void setId(int id) {
		//id = id; // ver1.
		this.productID = id; // ver2.
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getYeniOzellik() {
		return yeniOzellik;
	}

	public void setYeniOzellik(String yeniOzellik) {
		this.yeniOzellik = yeniOzellik;
	}

	//CHANGED CODE
	public String getKod() {
		return this.productName.substring(0,1) + productID;
	}

}
