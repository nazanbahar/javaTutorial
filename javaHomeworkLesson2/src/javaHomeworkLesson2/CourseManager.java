package javaHomeworkLesson2;

public class CourseManager {
	public void add(Course course) {
		System.out.println( course.courseName + ": Course Added.");
	}

	public void update(Course course) {
		System.out.println( course.courseName + ": Course Updated.");
	}

	public void delete(Course course) {
		System.out.println( course.courseName + ": Course Deleted.");
	}
	
	public void getall(Course course) {
		System.out.println( course.courseName + ": Course Listed.");
	}
}
