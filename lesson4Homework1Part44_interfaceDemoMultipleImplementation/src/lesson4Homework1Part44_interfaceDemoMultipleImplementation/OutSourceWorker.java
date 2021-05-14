package lesson4Homework1Part44_interfaceDemoMultipleImplementation;
//firma personeli
public class OutSourceWorker implements Workable {

	@Override
	public void work() {
		System.out.println("Firma Çalışan Mesai Saatiniz: 10:00-15:00 ");	
	}

	@Override
	public void stayOverTime() {
		System.out.println("Firma fazla Mesai Günleri: Salı - Perşembe ");
	}
	
}
