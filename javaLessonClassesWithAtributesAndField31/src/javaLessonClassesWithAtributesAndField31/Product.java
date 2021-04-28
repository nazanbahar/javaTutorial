package javaLessonClassesWithAtributesAndField31;

/**
 * @author User
 *1) className = ProductManager - Manage Etmek- Yonetme İslemleri (add|update|delete|getall)
 *2) className= Product - Urunun ozellikleri tanımlanır. 
 *Bir class aynı zamanda attribute barındırır.
 *C# Properties'a benzer.
 *ATTRIBUTE | FIELD
 *2.1. Urun Ait Bilgiler - (nesi var?)
 *s1. Urun tanımlayan benzersiz deger : id 
 *s1. Adı : Name
 *s2. Açıklama : description
 *s3. fiyatı : price
 *s4. stok adedi : stockAmount
 */
public class Product {
	//attribute | field
	int productID;
	String productName;
	double price;
	int stockAmount;
	String description;
}
