package lesson4Homework1Part44_interfaceDemoMultipleImplementation;

//EXAMPLE: MULTIPLE IMPLEMENTATION
//bizim calisanimiz : Workable + Eatable
public class Worker implements Workable, Eatable, Payable {

	//implemantation-1: 
	@Override
	public void work() {
		System.out.println("Şirket Çalışan Mesai Saatiniz: 09:00-17:00 ");
	}
	//implemantation-2: 
	@Override
	public void stayOverTime() {
		System.out.println("Şirket fazla Mesai Günleri: Pazartesi - Çarşamba - Cuma ");
	}
	
	//implemantation-3: 
	@Override
	public void eat() {
		System.out.println("Şirket personeli yemek verildi ");
	}
	
	//implemantation-4:
	@Override
	public void pay() {
		System.out.println("Şirket maaşınız hesabınıza yatmıştır. ");
		
	}
	
}
