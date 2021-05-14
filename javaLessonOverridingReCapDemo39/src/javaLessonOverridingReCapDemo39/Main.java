package javaLessonOverridingReCapDemo39;

/**
 * @author User
 * STEP1: Base KrediManager : 
 * s1. Kredi hesapla
 * hesapla() methodu ekleyelim.
 * s2. void yerine parametremiz, double tutar olacak.
 * s3. parametre sonucunu return etmeliyiz.
 * STEP2: Kredi alternatiflerimizi yazalım
 * s1. OgretmenKrediManager | TarimKrediManager
 * s2. Extends edelim.
 * 
 * STEP3: BaseKrediManager array oluşturalım.
 * s1. Dizinin elemanlarını belirleyelim.
 * s2. array[]{0,1,2,} eleman
 * {new OgretmenKrediManager(), new TarimKrediManager()}
 * 
 * STEP4: For Döngüsü yazalım.
 * s1. 
 */
public class Main {

	public static void main(String[] args) {
		//Example-1: ogretmen icin kredi hesaplamak
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager.hesapla(1000));
		
		//Example-2: array [] - parametreler : ogretmen, tarım, 2 elemanlı bir dizi 
		//krediManagers: name callig:plural, because it's an array.
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {
				new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

		//for loop
		for(BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
		
	}

}
