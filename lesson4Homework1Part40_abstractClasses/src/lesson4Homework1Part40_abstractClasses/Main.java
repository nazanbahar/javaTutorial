package lesson4Homework1Part40_abstractClasses;

/**
 * @author User
 * Java Dersi 40 : Abstract Sınıflarla Çalışmak
 * 
 */
public class Main {

	public static void main(String[] args) {
	
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();

	
	
		
		//Using: Hatalı Kullanım - abstract sınıflar, asla newlenemez. 
		GameCalculator gameCalculatorErrorCompile = new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};
	
	
		// Using: Doğru Kullanım - kural:abstract sınıflar, asla newlenemez. 
		// GameCalculator = Base abstract class tır. Base burada sadece bir referans tutucudur. 
		//single 
		GameCalculator gameCalculatorSingle = new WomenGameCalculator(); //referans tutar.
		//array [] options = {option1, option2, option3}
		GameCalculator[] gameCalculators = { 
				new KidsGameCalculator(),
				new ManGameCalculator(), 
				new WomenGameCalculator(), 
				new OlderGameCalculator() };
				}
	
}

