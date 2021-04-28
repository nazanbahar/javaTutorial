package javaHomeworkLesson2;

public class StudentManager {
	public void add(Student student) {
		System.out.println( "StudentName " + student.firstName + student.lastName + " OrganizationId: " + student.organizationId + " Email :" + student.email+": Student Added.");
	}

	public void update(Student student) {
		System.out.println( student.firstName + student.lastName + ": Student Updated.");
	}

	public void delete(Student student) {
		System.out.println( student.firstName + student.lastName + ": Student Deleted.");
	}
	
	public void getall(Student student) {
		System.out.println( student.firstName + student.lastName + ": Student Listed.");
	}
}
