package javaLessonMethodOverLoading35;

/**
 * @author User
 *UYARI: Method isimleri aynı olsa da hata vermez. Çünkü, parametre satıları farklıdır.
 */
public class DortIslem {

	//iki sayi toplamak
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	//3 sayi toplamak
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2;
	}

}
