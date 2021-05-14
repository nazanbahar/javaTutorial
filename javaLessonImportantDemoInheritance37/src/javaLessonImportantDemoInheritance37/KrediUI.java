package javaLessonImportantDemoInheritance37;

/**
 * @author User
 * STEP1: Single Print with Parent Parameter  
 * v1. Tek Tek KrediUI Yazdırmak
 * public class KrediUI {
	public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {
		ogretmenKrediManager.Hesapla();
	}
}

* STEP2: Multiple Options Print with Base Parameter (ex. calculation method)
 * v2. Multiple Options KrediUI Yazdırmak 
 * public class KrediUI {
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();
	}
}
 */

//v2. Multiple Options - Base Parameter
public class KrediUI {
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();
	}
}
