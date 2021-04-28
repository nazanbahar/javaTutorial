package javaHomeworkLesson2;

public class TeacherManager {
	public void add(Teacher teacher) {
		System.out.println( "TeacherName  " + teacher.firstName + teacher.lastName + " Email: " + teacher.email + " : Teacher Added.");
	}

	public void update(Teacher teacher) {
		System.out.println( teacher.firstName + teacher.lastName + ": Teacher Updated.");
	}

	public void delete(Teacher teacher) {
		System.out.println( teacher.firstName + teacher.lastName + ": Teacher Deleted.");
	}
	
	public void getall(Teacher teacher) {
		System.out.println( teacher.firstName + teacher.lastName + ": Teacher Listed.");
	}
}
