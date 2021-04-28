package javaLessonRecapDemoWorkingWithClasses30;

/**
 * @author User
 *CLASSES PROPERTIES
 * 1. Joint Operation
 * 2. References Type
 * 
 * HESAP MAKINASI UYGULAMASI
 * s1. USING: methodları kullanırken, Referansı Oluştur.
 * s2. RETURN:  Operasyon Sonucunu Değişkene Atamak
 * DortIslem Class'ında, "return: operasyon sonucunu donduruyor."
 * SONUC: Dolayısıyla biz de islem sonucunu bir degiskene atayabiliriz.
 * PRINT: Ekrana Yazdırmak, Değişkene atadığımız Operasyonu sonucunu istediğimiz yerde kullanabiliriz.
 */
public class Main {

	public static void main(String[] args) {
		// CALCULATOR APPLICATION
		// First, create the reference of your Class.
		DortIslem dortIslem = new DortIslem();
		int sonuc= dortIslem.Topla(1, 4);
		System.out.println("Dort Islem Sonucu: " +sonuc);
	}
}
