package javaLessonInheritanceStructure36;

/**
 * @author User
 * * STEP1: DELETE
 * s1. Ortak codeları sildik. 
 * s2. Çünkü Base ClassManager'da artık.
 * s3. Biz artık Base'den inheritance(miras) alacağız. 
 * 
 *	//ortak method
	public void List() {
		System.out.println("Listelendi");
	}

	//ortak method
	public void Add() {
		System.out.println("Eklendi");
	}
 */
public class EmployeeManager extends PersonManager {
	
	
	//calısana ozel Ayın elemanı methodu ekledik.
	public void BestEmployee() {
		System.out.println("Ayın elemanı getirildi");
	}
}


