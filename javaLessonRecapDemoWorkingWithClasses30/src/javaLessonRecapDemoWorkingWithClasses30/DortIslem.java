package javaLessonRecapDemoWorkingWithClasses30;

/**
 * @author User
 * temel 4 operasyonu gerçekleştirdik.
 * burada add, update, delete olmaz.
 * Return: operasyon sonucunu donduruyor.
 */
public class DortIslem {
	
	//int sayi1 = 12; --değer vermedik çünkü method içinde (int sayi1, int sayi2) değişken olarak alacağız.
	//int sayi2 = 5;
	
	public int Topla(int sayi1, int sayi2) {
		return sayi1+sayi2; // sonuc donduruyor.
	}
	
	
	public int Cıkar(int sayi1, int sayi2) {
		return sayi1-sayi2;
	}
	
	
	public int Carp(int sayi1, int sayi2) {
		return sayi1*sayi2;
	}
	
	
	public int Bol(int sayi1, int sayi2) {
		return sayi1/sayi2;
	}
}
