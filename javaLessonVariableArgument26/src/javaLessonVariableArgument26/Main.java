package javaLessonVariableArgument26;

/**
 * @author User
 * Variable Arguments
 * args : argument
 * example: Calculator, 
 * Amac: Birden fazla integer göndermek
 * integer array : int...
 * syntax: public static int sum2(int... numbers){}
 *  Variable Arguments, çok tercih edilmiyor cunku test edilebilirligi zordur. 
 *  Gönderilen datayı takip etmek zordur. 
 *  Nesneler için, Collections'lar iyi bir alternatiftir.
 *  
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		
		//System.out.println(number);
		//USING INTEGER ARRAY : Arka planda diziye cevirir.
		//int sum = sumIntegerArray();
		int number = sum(15,7);
		System.out.println("Sum - two integers: "+ number);
		int sum = sumIntegerArray(2,3,4,5,6,10);
		System.out.println("Variable Arguments - Integer Array: " + sum);
	
	}

	//INT: void yerine int yazalım.
		public static int sum(int number1, int number2) {
			//return 5; //bitir ve deger döndür.
			return number1 + number2;
			
		} 
		
		
	//INT: INTEGER ARRAY , numbers:bir dizidir.
		public static int sumIntegerArray(int... numbers) {
			//for döngüsü ile toplama islemi yapalim.
			int sum = 0;
			for(int number:numbers) {
				sum+= number;
			}
			return sum;
		} 
		
}
