package javaLessonWorkingGetterSetter33;


/**
 * @author User
 * 1) getId() : READONLY: ID Okumak -Sadece okur.
 * 
 * 2) SET ETMEK: ID Set Etmek 
 * s1. set edilecek id parametre olarak verilir. setId kullanıcıdan alınır.
* s2. UYARI: THIS: Bu class demektir.
* s3. Icinde bulundugum Product Nesnesinin productID'sidir.
* s4. BEST PRACTICE: Fieldların, _cizgi ile verilmesi tavsiye edilir.
 3) REFACTOR - OTOMATIK GET VE SET BLOKLARI OLUSTURMAK
 s1. _productName >sag tıkla > Refactor>Encapsulate Field seçilir. İlgili pencere onaylanır. 
 */
public class Product { //this ile isaret  edilen Product class'ı demektir.
	//ATTRIBUTE | FIELD 
	//PUBLIC
	//public int productID; //default public
	//PRIVATE erisim bildirgeci
	private int productID; // this ile bu class demektir.
	private String productName;
	private double price;
	private int stockAmount;
	private String description;
	private String yeniOzellik;
	private String kod;
	
	
	/* CHANGED CODE : private(x) 
	 * private String _productName; private double _price; private int _stockAmount;
	 * private String _description; private String _yeniOzellik; private String
	 * _kod;
	 */
	
	
	//GETTER BLOCK
	//READONLY: ID Okumak -sadece okur.
	public int getId() {
		return productID;
	}

	//SETTER BLOCK
	//SET ETMEK: ID Set Etmek 
	//set edilecek id parametre olarak verilir. setId kullanıcıdan alınır.
	//UYARI: THIS: Bu class demektir.
	//Icinde bulundugum Product Nesnesinin productID'sidir.
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

	//Kod yazılamasın istersen silebilirsin!
	/*
	 * public void setKod(String kod) { this.kod = kod; }
	 */





	
	
	/*
	 * private String get_productName() { return _productName; }
	 * 
	 * private void set_productName(String _productName) { this._productName =
	 * _productName; }
	 * 
	 * private double get_price() { return _price; }
	 * 
	 * private void set_price(double _price) { this._price = _price; }
	 * 
	 * private int get_stockAmount() { return _stockAmount; }
	 * 
	 * private void set_stockAmount(int _stockAmount) { this._stockAmount =
	 * _stockAmount; }
	 * 
	 * private String get_description() { return _description; }
	 * 
	 * private void set_description(String _description) { this._description =
	 * _description; }
	 * 
	 * private String get_yeniOzellik() { return _yeniOzellik; }
	 * 
	 * private void set_yeniOzellik(String _yeniOzellik) { this._yeniOzellik =
	 * _yeniOzellik; }
	 * 
	 * private String get_kod() { return _kod; }
	 * 
	 * private void set_kod(String _kod) { this._kod = _kod; }
	 */
	
	
}
