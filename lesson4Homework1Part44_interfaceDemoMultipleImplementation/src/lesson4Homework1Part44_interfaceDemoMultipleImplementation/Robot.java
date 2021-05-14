package lesson4Homework1Part44_interfaceDemoMultipleImplementation;

public class Robot implements Workable , Maintable {
	//yemek + maas yok
	// robotun bakımı var.
	@Override
	public void work() {
		System.out.println("Robot Çalışan Mesai Saatiniz: 09:00-22:00 ");
	}

	@Override
	public void stayOverTime() {
		System.out.println("Robot fazla Mesai Günleri: Hergün Çalışma Var ");
		
	}

	@Override
	public void repairRobot() {
		System.out.println("Robot bakımı yapılmıştır. ");
		
	}
}
