package lesson4Homework1Part40_abstractClasses;

//example-3: method for abstract class
public abstract class GameCalculator {
	//ABSTRACT METHOD()  - keyword: abstract default method is empty(X) and behaviours: @overrideable
	public abstract void hesapla();
	
	
	//FINAL METHOD()- keyword: final - behaviours: @Override edilmesin!
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
}

/**********************************************
 * example1: Spaghetti code
 * public class GameCalculator { //example: method for abstract class public
 * void hesapla(int tip) { //eklenecek algoritma
 * System.out.println("Puanınız : 100"); } }
 * 
 * 
 * ********************************************
 * example2: Override method code
 * package lesson4Homework1Part40_abstractClasses;

	public class GameCalculator {
	//example: method for abstract class
	//default method1:
	public void hesapla() {
		//eklenecek algoritma
		System.out.println("Puanınız : 100");
	}
	
	
	//default method2:
	public void gameOver() {
		System.out.println("Oyun bitti");
	}
	
}

**************************************************
* example3: abstract class code
* 
* package lesson4Homework1Part40_abstractClasses;

//example-3: method for abstract class
public abstract class GameCalculator {
	//ABSTRACT METHOD()  - keyword: abstract default method is empty(X) and behaviours: @overrideable
	public abstract void hesapla();
	
	
	//FINAL METHOD()- keyword: final - behaviours: @Override edilmesin!
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
}
 
* ************************************************
* //Notes: 
example-3: method for abstract class
//ABSTRACT CLASS AND METHOD//
//STEP1: Abstract Class 
//s1. For abstract class Definition: keyword: abstract class
//s2. syntax code
//public abstract class GameCalculator {}

//STEP2: Abstract Default Method
//s1. default method is empty(X) and keyword: abstract  and behaviours: @overrideable
//s2. code synax
//public abstract void hesapla();
 

//FINAL METHOD() --tamamlanmış//
//s1. keyword: final - Method, @Override edilmesin!, point: void den önce.
//GameCalculator u kullanan, olduğu gibi kullanmak zorundadır.

//@OVERRIDE//
//s5. keyword is empty : (x) - Method, @Override edilsin! 
///GameCalculator u kullanan, değitirebilir.

//ABSTRACT METHOD() --tamamlanmamış//
//public abstract void hesapla();

 */