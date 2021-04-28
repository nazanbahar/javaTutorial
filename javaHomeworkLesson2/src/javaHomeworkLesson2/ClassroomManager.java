package javaHomeworkLesson2;

public class ClassroomManager {
	
	public void add(Classroom classroom) {
		System.out.println( classroom.classroomName + ": Classroom Added.");
	}

	public void update(Classroom classroom) {
		System.out.println( classroom.classroomName + ": Classroom Updated.");
	}

	public void delete(Classroom classroom) {
		System.out.println( classroom.classroomName + ": Classroom Deleted.");
	}
	
	public void getall(Classroom classroom) {
		System.out.println( classroom.classroomName + ": CourClassroom Listed.");
	}
}
