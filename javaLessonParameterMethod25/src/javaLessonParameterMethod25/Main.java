package javaLessonParameterMethod25;

/**
 * @author User
 * Operation - Method 
 * INTENTION: Don't Repeat YourSelf
 * VOID OPERATION - EMIR KIPI - DO IT!: add | update | delete
 * Eklenen Datayı Geri istemek: 
 * Writing on the screen : System.out.println("Eklendi.."); 
 * Ekrana Yazı Yazmak, bir şey döndürmek demek değildir!
 * VOID: Değer döndürmez!
 * DEGISKEN: Değer döndürür! for ex. newMessages
 */
public class Main {

	public static void main(String[] args) {
		String messages = "Bugün hava çok güzel";
		String newMessage = getCity();
		System.out.println(newMessage);
		int number = sum(5,7);
		
		System.out.println(number);
		
		//messages.substring(0,2);
		String newMessages = messages.substring(0,2);
		//print variable
		System.out.println("substring- print variable : " + newMessages);
	}
	//VOID
	public static void add(){
		System.out.println("Eklendi...");
	}
	
	public static void update(){
		System.out.println("Güncellendi...");
	}

	public static void delete(){
		System.out.println("Silindi...");
		return; //sadece bitir.
	}
	
	//INT: void yerine int yazalım.
	public static int sum(int number1, int number2) {
		//return 5; //bitir ve deger döndür.
		return number1 + number2;
	} 
	
	//STRING
	public static String getCity() {
		return "Ankara";
	
	}
	
}
