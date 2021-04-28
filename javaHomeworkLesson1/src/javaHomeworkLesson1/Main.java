package javaHomeworkLesson1;


public class Main {

	public static void main(String[] args) {
		// IDE - IntelliSense
		// Code End :semicolon
		// Build: Run CTRL + F11
		// Debug: F11
		// Ctrl + Shift + F : Code format
		System.out.println("Merhaba Java");

		// VARAIBLES//
		// case sensitive - big-small character emotional
		// re-usability
		// Variable-Saving memory
		int ogrencisayisi = 11;
		String mesaj = "Öğrenci sayısı : ";

		System.out.println("Öğrenci sayısı : " + ogrencisayisi);
		System.out.println("Öğrenci sayısı : 9");
		System.out.println("Öğrenci sayım : 9");
		System.out.println("Öğrenci sayım : 9");

		// message + ogrenciSayisi
		System.out.println(mesaj + ogrencisayisi);
		System.out.println(mesaj + ogrencisayisi);

		// WORKING WITH BASIC DATA TYPES//
		// Primitive Types - boolean | char | byte | short | int | long | float |
		// double|
		// Bellekte tutulan alana gore sayinin sinirlari var.
		// default decimal number :double
		// generally preferred : double, int and In the range of 0-100:byte, short
		// ---1 byte---
		// byte(integer) * -128 to 127 | boolean(true or false) -not
		// applicable -using if conditional
		// ---2 bytes---
		// char(single character - Unicode -all Unicode characters) | short(integer)
		// char aslinda sayisal bir karakterdir.

		// ---4 bytes---
		// int(integer) | float(floating-point number)
		// ---8 bytes---
		// long(integer) | double(floating-point number)
		//int sayi1 = 12;
		//sayi1 = 1234567890;
		// byte sayi2 = 12;
		int sayi2 = 127;
		//boolean dogruMu = false;

		//String sehirString = "ANKARA"; // char array
		//char karakter = 'A'; // Not compiled double quotes - "A" ,single quotes : 'A'
		// sayi = 135555555555555; -Not Compiled:The literal -- of type int is
		// out of range
		// sayi = "Ankara"; -Not Compiled:Type mismatch: Cannot convert from
		// String to int

		// CONDITIONALS//
		// Decision Structures
		// Hangi durumda nasıl karar vermeliyiz?
		// How should we decide in which situation?
		// = Assign Value , only equals is to assign a value to the number.
		// == Operator, double equals is to assign a value to the number.

		int sayi = 19;

		if (sayi < 20) {
			// in the conditional block {}
			System.out.println("Sayi 20 den küçüktür.");
		} else if (sayi == 20) {
			System.out.println("Sayi 20'ye eşittir");
		} else {
			// out the conditional block
			System.out.println("Sayi 20 den büyüktür.");

		}

		// RECAP DEMO 1: WHICH IS THE LARGEST NUMBER//
		int sayi01 = 266;
		int sayi02 = 25;
		int sayi03 = 2;
		int enBuyuk = sayi01;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi02;
		}
		if (enBuyuk < sayi03) {
			enBuyuk = sayi03;

		}
		System.out.println("En büyük = " + enBuyuk);

		// SWITCH - WORKING WITH SWITCH BLOCKS//
		// Branching
		// If two case outputs are the same - case 'B': and case 'C':
		//
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

		// LOOPS//
		// Repeating similar processes
		// for loop - i underlined red - we need to give the type : integer -int
		// i++ increase one by one
		// i+=2 : odd numbers (1,3,5,7,9) - Adds the specified number to the variable.
		// first: counter definition , second: condition , third:counter increment

		// FOR LOOP//
		// It is the most preferred for loop in programs.
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");

		// WHILE LOOP//
		// infinite loop - i will always be 1. Increase the value of i in the counter to
		// break the loop.
		// Since we are not incrementing the value of i in the while loop
		// The i value will always be less than 10. It enters an endless loop and must
		// be manually stopped.
		// We need to increase it in the counter.
		// In the While Loop; If the condition is not met, it will not loop.
		// int i=20; if there was, it wouldn't loop.
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü Bitti - şart sağlanmazsa döngü çalışmaz.");

		// DO-WHILE LOOP//
		// it is not used much.
		// It works line by line.
		// It works once even if the requirement is not met.
		//
		int j = 100;
		do {
			System.out.println(j);
			System.out.println("Gerçek Hayatta Loglama: operasyon loglandı");
			j += 2;
		} while (j < 10);
		System.out.println("Do-While Döngüsü Bitti - Gereksinim karşılanmasa bile bir kez çalışır.");

		// ARRAYS - ARRAYSDEMO-1//
		// arrays - index start:0
		// We get an error when we cross the Array boundaries.
		// ErrorCode: java.lang.ArrayIndexOutOfBoundsException
		// Reverse engineering - (Reverse Code Engineering,RCE)
		// Best Practices
		// manuel-list
		String ogrenci1 = "Firuzan";
		String ogrenci2 = "Canan";
		String ogrenci3 = "Duru";
		String ogrenci4 = "Onur";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		// String -arrays
		// index element: [0],[1],[2]
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Firuzan";
		ogrenciler[1] = "Canan";
		ogrenciler[2] = "Duru";
		ogrenciler[3] = "Onur";

		System.out.println("---Array sınırlarını aştığımızda hata alırız.---");

		// for version-1: Counter Guided Loop
		for (i = 0; i < ogrenciler.length; i++) {
			// It works as long as it is less than 3.
			System.out.println(ogrenciler[i]);
		}
		System.out.println("String -array sonu - for-ver1: - Counter Guided Loop ");

		// for version-2 - preferred method
		// alias:ogrenci
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("String -array sonu - for-ver2: - preferred method");

		// ARRAY-RECAP DEMO-2//
		// s1. adding decimals
		// s2. print the largest number

		//double[] myList1 = new double[4]; // ver1
		double[] myList2 = { 1.2, 6.3, 4.3, 5.6 }; // ver2
		double total = 0;
		double max = myList2[0];

		for (double number : myList2) {
			if (max < number) {
				max = number;
			}

			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("double - for dongusu sonu - adding decimals");
		System.out.println("En Büyük = " + max);

		// WORKING WITH MULTIDIMENSIONAL ARRAYS//
		// matrix driven solution
		// checker board sample
		// Multidimensional ArrayDemo
		// single line = String[] , row and column = String[][]
		// 3 x3 matrix : 9 elements
		// Loop, should work for 9 elements.
		// Nested Loop
		// Let's write a loop inside while navigating the rows.
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Eskişehir";
		sehirler[1][2] = "Nevşehir";
		sehirler[2][0] = "Muğla";
		sehirler[2][1] = "Antalya";
		sehirler[2][2] = "Aydın";

		// navigating the rows
		for (int t = 0; t <= 2; t++) {
			System.out.println("-----------------------");
			// navigating the column
			for (int z = 0; z <= 2; z++) {
				System.out.println(sehirler[t][z]);
			}
		}

		// WORKING WITH STRINGS -1 //
		// Strings are a string of characters.
		// char[] - char array.
		// To capture the value of a certain character in a text.
		// Combining two texts.
		// Space is also a character.
		// We must assign the message to a variable if we want to use it!
		// Concat() Method - Used to combine string values.
		// charAt() Method - string ifadede belirtilen indisteki değeri bize verir .
		// startsWith() Method - Checks whether the string object starts with the
		// specified character.
		// endsWith() Method - Checks if the string object ends with the specified
		// character.
		// Java case sensitive - big-small character emotional. so "B" and "b" return
		// different values.
		// "B" - true "b" returns false.
		// getChars() Method - String nesnesi içindeki belli sayidaki karakteri diziye
		// aktarmamizi saglar.
		// IndexOf() Method - Returns the rank of any character in a string. Starts
		// counting from zero.
		// gives the first element it finds.
		// lastIndexOf() Method - starts searching from the right.
		// Warning: the index number is the same, but the search point is different.
		String message = "Bugün hava çok güzel.";

		System.out.println(message);
		System.out.println("Eleman sayısı : " + message.length());
		System.out.println("5. eleman : " + message.charAt(4));
		System.out.println(message.concat(" Yaşasın!"));
		System.out.println(message);
		System.out.println(message.startsWith("A"));
		System.out.println(message.endsWith("."));

		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);

		System.out.println(message.indexOf('a'));
		System.out.println(message.indexOf("av"));
		System.out.println("---ilk bulduğu elemanı verir.---");
		System.out.println(message.lastIndexOf("a"));
		System.out.println("---aramaya sağdan başlar---");
		System.out.println("---uyarı: index nosu aynıdır fakat arama noktası farklıdır.---");

		// WORKING WITH STRINGS -2//
		// REPLACE() Methodu : String içerisinde karakter-karakter gruplarını
		// değiştirmeyi sağlar.
		// Yeniden kullanmak için bir degiskene atayip kullanmalısın.
		// new output -amaç yeni bir çıktı üretmek
		// used a lot in programming.
		// SUBSTRING() Methodu :
		// bir metnin içerisinden parça almak
		// substring metodu başlangıç ve bitiş dizinleri arasında kalan karakterleri bir
		// String olarak döndürür.
		// v1: başlangıç değeri vermek , v2:başlangıç ve bitiş değeri vermek
		// SPLIT() Methodu();
		// split stringleri dizi olarak bölmeye yarar, hangi karakter ile bölünceği
		// belirlenir.
		// toLowarCase() Methodu : Converts string to lowercase.
		// toUpperCase() Methodu : Converts string to uppercase.
		// USING: We use it when we submit search expressions to databases.
		// frequently used in searches.
		// TRIM() Methodu :
		System.out.println(message.replace(' ', '-'));
		System.out.println("---boşluklara - karakter eklemek---");

		System.out.println(message);

		String newMessage = "Bugün hava çok çok güzel.";
		System.out.println(newMessage);

		// substring() - message 2. index den itibaren parcala
		System.out.println(message.substring(2));
		System.out.println(message.substring(2, 5));

		// split
		for (String kelime : message.split(" ")) {
			System.out.println(kelime);
		}

		// toLowarCase
		System.out.println(message.toLowerCase());

		// toUpperCase
		System.out.println(message.toUpperCase());

		// trim
		String messageTrim = "     Bugün hava çok güzel.- (Trim)";
		System.out.println(messageTrim.trim());
		System.out.println(messageTrim);

		// MINI PROJECT-1 - IS NUMBER PRIME?//
		// calculate a prime number
		// ilk başta sayiyi asal kabul ediyoruz.
		// bug: logical errors , "1" is not a prime number
		// exceptions: Defensive Programming
		// Gözden kaçması kolay bazı özel durumlarda ortaya çıkacağı için
		// bulunması ve düzeltilmesi zor olacak bug’lar ile uğraşmamak için dikkat
		// edilmelidir.
		// return : finish code

		int number = 25;
		int remainder = number % 2;
		System.out.println(remainder + ": remainder");
		boolean isPrime = true; // once asal sayi oldugunu kabul ediyoruz.

		// bug - system error for one. rules: for one.
		// exceptions: Defensive Programming - özel kurallar
		if (number == 1) {
			System.out.println(number + " : Sayı asal değildir");
			return; // kural gerçekleşti ise method sonlandır.

		} else if (number < 1) {
			System.out.println(number + ": Geçersiz sayi");
		} else {
			System.out.println(number + ": Sayi asaldir.");
		}

		for (int v = 2; v < number; v++) {

			if (number % v == 0) {
				isPrime = false;
			}

		}

		
		
		// MINI PROJECT-2 - BOLD VOWELS AND THIN VOWELS//
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}

		// PERFECT NUMBER -MUKEMMEL SAYI//
		// Mükemmel sayı kendisi haricindeki tüm çarpanlarının toplamı kendisini veren
		// sayıdır.
		// Diğer bir ifadeyle, mükemmel sayı, bütün pozitif tam bölenlerinin toplamının
		// yarısına eşit olan sayıdır.
		// Örneğin 6 bir mükemmel sayıdır çünkü kendisi haricindeki çarpanları yani 1, 2
		// ve 3 toplanınca kendisini verir.
		// 1 + 2 + 3 = 6 = Perfect Number.
		// 1 + 2 + 4 + 7 + 14 = Perfect Number.
		// ex. 6 -- 1,2,3 :
		// ex.28 --1,2,4,7,14

		int perfectNumber = 6;
		int totalPerfect = 0;

		for (int z = 1; z < perfectNumber; z++) { // Döngüye 1 den başla.
			if (perfectNumber % z == 0) {
				totalPerfect = totalPerfect + z; // toplam değişkenine k değerini ata.
			}
		}
		// eğer girilen sayı döngüdeki bölümlerin toplamına eşitse
		if (totalPerfect == perfectNumber) {
			System.out.println(perfectNumber + " : The number is Perfect");
		} else {
			System.out.println(perfectNumber + " : The number is not Perfect");
		}

		// FRIENDS NUMBER - ARKADAS SAYILAR//
		// En Kucuk Arkadaş sayı: 220-284
		// İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara
		// arkadaş sayılar denir.
		// Other: (220, 284), (1184, 1210), (2620, 2924) (5020, 5564), (6232, 6368),
		// (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084)
		// first: define numbers
		// second: sum the divisors
		// for loop
		// and operator && : and pipe || : or
		int friendnumber1 = 220;
		int friendnumber2 = 284;
		int toplamFriend1 = 0;
		int toplamFriend2 = 0;

		// iki sayınin tüm bolenlerini bulmaktır...
		for (int f = 1; f < friendnumber1; f++) {
			if (friendnumber1 % f == 0) {
				toplamFriend1 = toplamFriend1 + f;
			}
		}

		for (int f = 1; f < friendnumber2; f++) {
			if (friendnumber2 % f == 0) {
				toplamFriend2 = toplamFriend2 + f;
			}
		}

		if (friendnumber1 == toplamFriend1 && friendnumber2 == toplamFriend2) {
			System.out.println(friendnumber1 + "-" + friendnumber2 + " bu iki sayı arkadaştır.");
		} else {
			System.out.println(friendnumber1 + "-" + friendnumber2 + " bu iki sayı arkadaş değildir.");
		}

		
		// FIND THE NUMBER - SAYI BULMA//
		//number arrays
		int[] findNumbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int search = 7;
		boolean isThere = false; // Thinking there is no number.

		for (int findNumber : findNumbers) {
			if (findNumber == search) {
				isThere = true;
				break;
			}

		}
		if (isThere) {
			System.out.println("Sayi mevcuttur.");
		} else {
			System.out.println("Sayi mevcuttur değildir.");
		}
	}

}
