package javaLessonImportantDemoInheritance37;

/**
 * @author User
 * STEP1: 
 * s1. Yazılımda en önemli olgu değişimdir. 
 * s2. Amaç Değişime direnmeyen program yazmaktır.
 * s3. Bir Class sadece bir BaseClass ı extends edebilir.
 * s4. Multiple Class extends edilemez. 
 * 
 *  STEP2:
 *  s1. Arayüzde yazdıralım. Bir çok operasyon olduğunda ne yapmalıyız?
 *  
 */
public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla(); //base kredi
		
		//USING - OOP - Polymorphism
		//Multiple Options Print with Base Parameter.
		//Options : new OgretmenKrediManager() | new TarimKrediManager() | new AskerKrediManager() , etc.
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
		
		///////////////////////////////////////////////////////////////////
		//Example:1 v1: Arayüz : Single Print with Parent Parameter 
		KrediUI krediUISingle = new KrediUI();
		krediUISingle.KrediHesapla(new OgretmenKrediManager()); //ver1
		//krediUI.KrediHesapla(ogretmenKrediManager);
		
		
		//Example:2 v2. Arayüz : Multiple Options Print with Base Parameter. 
		//ex.  new OgretmenKrediManager() | new TarimKrediManager() | plus AskerKrediManager()
		KrediUI krediUIMultiple = new KrediUI();
		krediUIMultiple.KrediHesapla(new TarimKrediManager()); //ver2
		
		//Example:3 Arayüz : Yeni Özellik Ekledik :Asker Kredisi 
		//ex.  new OgretmenKrediManager() | new TarimKrediManager() | ++ AskerKrediManager()
		KrediUI krediUINewOption = new KrediUI();
		krediUINewOption.KrediHesapla(new AskerKrediManager()); //plus
		//////////////////////////////////////////////////////////////////////
	}
}
