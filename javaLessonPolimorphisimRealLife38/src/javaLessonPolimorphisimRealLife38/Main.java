package javaLessonPolimorphisimRealLife38;


/**
 * @author User
*POLIMORPHISIM - DEMO
STEP1: Example: Loglama Yöntemi
s1. Options: veritabanı, Dosya, Email'e loglama yapılabilir. 
s2. Loglamanın çok fazla alternatifi vardır. 
s3. Using: Classic Polymorphism Pattern

STEP2: BaseLogger Oluştur.
STEP3: Parent: FileLoger | EmailLogger | FileLogger olustur.
STEP4: Extends: BaseLogger
STEP5: EmailLoger, extends ettiği için onun operasyonlarına da sahiptir.
STEP6: Override Etmek
s1. EmailLogger | FileLoger|DatabaseLogger
STEP7: USING
s1. CustomerManager içinde kullanalım.
s2. Array Oluşturalım. ex. int[] , int BaseLogger[]
s3. UYARI: 
ex.1 : int[] numbers = new int[] {1,2,3,"string yaz- hata alırsın"}; //error
ex2: BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(), new DatabaseLogger()}; //compiled
BaseLogger arrayinde farklı tiplerde yazmamıza izin vermesini sebebi base class'dan extends etmemizdir.
Inheritance - Referance Type dır. BaseClass tarafında referans numarası tutulur. O nedenle atama yapabiliriz.
s4. For Loop ile loggerları gezelim.
for loop - (for baseLogger) için oluşturalım. Referans numaralarını tutukları için. 

STEP8: ADD NEW LOGGER
s1. Add: ConsoleLogger
s2. extends BaseLogger
s3. signature - void operation : @Override
s4. Main : Add loggers array(ONLY) : new ConsoleLogger()
s5. Finish: Add new Logger
s6. Plug And Play: 
Tak Çalıştır, istemediğimizi sistemden (loggers arary'den) çıkartabiliriz.
ex. Artık, EmailLogger tutmak istemek vb. 
s7. Bu bir Polimorphisim, ÇokBiçimliliktir.
s8. ONEMLI NOT: Polimorphisim, biz Base Sınıflarla yaparız. Ayrıca, Interface'lerle de yapabiliriz.

STEP9: USING: CustmomerManager 
s1. Add methodu ekleyelim.
s2.Müşterinin eklendiğine dair loglama yapmak 
s3. 

 */
public class Main {

	public static void main(String[] args) {
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("log message - manuel");
		
		
		//Example:1 : loggers array + For Loop
		//array
		//int[] numbers = new int[] {1,2,3,"string"}; //error
		BaseLogger[] loggers = new BaseLogger[] {
				new FileLogger(),new EmailLogger(), 
				new DatabaseLogger(), new ConsoleLogger()};
		
		//for loop - (for baseLogger)
		for(BaseLogger logger: loggers) {
			logger.log("Log mesajı");
		}
		
		//Example2: CustomerManager + loggers : add new () : Polimorphisim
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}
	
}
