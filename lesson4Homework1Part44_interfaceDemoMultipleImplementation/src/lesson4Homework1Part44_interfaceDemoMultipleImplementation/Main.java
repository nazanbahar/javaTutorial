package lesson4Homework1Part44_interfaceDemoMultipleImplementation;

/**
 * @author User
 * AMAC: Sirket otomasyonu yapmak
 */
public class Main {

	public static void main(String[] args) {

		Workable workable = new Worker();
		Workable[] workables = {new Worker(), new OutSourceWorker(), new Robot()};
		
						
	}

}
