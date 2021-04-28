package javaLessonUnderstandingNeedForEncapsulation32;


/**
 * @author User
 * 1) PUBLIC ERISIM BILDIRGECI
 * s1. Heryerden erisim saglanır.
 * s2. Java'da public'dir. Csharp'da default, private'dır.
 * s3. default degeri: public dir.
 * 
 * 2) PRIVATE ERISIM BILDIRGECI
 * s1. UYARI: private sadece tanımlandığı blokta gecerlidir.
 * s2. if bloğunda - {} tanımlamış olsaydık, orda kullanabilirdik.
 * 
 * 3) READONLY-CODE YAZMAK
 * s1. getter ve setter yazarız. 
 */
public class Product {
	
	//ATTRIBUTE | FIELD 
	
	//PUBLIC
	//public int productID; //default public
	
	//PRIVATE erisim bildirgeci
	private int productID;
	private String productName;
	private double price;
	private int stockAmount;
	private String description;
	private String yeniOzellik;
	private String kod;
	
	public void metot() {
		//attribute'a erişebiliriz.
		//productID.
	}
	
	
}
