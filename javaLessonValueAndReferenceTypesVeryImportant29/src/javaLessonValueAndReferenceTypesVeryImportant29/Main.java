package javaLessonValueAndReferenceTypesVeryImportant29;

/**
 * @author User
 * 1) References Type
 * 2) Value Type 
 * 2.1. Value Type
 * ONEMLI NOT: 
 * s1. VALUE TYPE'DE - tanımlanan sayi1 = 10; eşittir işareti (= eşittir işareti) STACK içinde yer alır. 
 * Oysa References Type'de eşittir işareti sağ tarafta(HEAP'de) yer alır.
 * s3. REFERENCE TYPE'DE - Sol tarafta(STACK) sadece Reference No(101) tutulur. 
 * Sağ tarafta(HEAP) ise; (= eşittir işareti)ve değerleri ={1,2,3} HEAP içinde yer alır.
 * 2.2. Değer tipleri nasıl okuruz?
 * sayi1 = 10; "sayi1 in değeri eşittir 10"
 * 1.1. References Type - Definition 
 * int[] sayilar = {1,2,3}; //ver1.
    int[] sayilar1 = new int [] {1,2,3}; //ver2. 
 * 1.2. Diziler, reference tiptir.
 * 1.3. Referans tipleri nasıl okuruz? 
 * "sayilar2 nin referans numarası eşittir sayilar1 in referans numarasıdır."
 	Bellekte bir(1) nesne var iki referasn numarası aynı nesneyi tutuyor. 
 	UYARI: Referansı tutulan, tek bir nesnemiz var, İki nesnemiz yok aslında.
 * P 
 */
public class Main {

	public static void main(String[] args) {

		//VALUE TYPE//
		//output: 10
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println("Sayi 2 nin değeri :" + sayi2);
		
		
		
		//REFERENCES TYPE//
		//definition
		//output:10 
		int[] sayilar = {1,2,3}; //ver1.
		int[] sayilar1 = new int [] {1,2,3}; //ver2. 
		int[] sayilar2 = new int [] {1,2,3}; 
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
	}

}
