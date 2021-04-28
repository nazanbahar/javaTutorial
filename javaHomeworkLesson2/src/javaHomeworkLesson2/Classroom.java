package javaHomeworkLesson2;

public class Classroom {
	int classroomId;
	int teacherId;
	String classroomName;
	String detail;
	Boolean active;

	// constructor
	public Classroom() {
		// TODO Auto-generated constructor stub
	}

	// assign
	public Classroom(int classroomId, int teacherId, String classroomName, String detail, boolean active) {
		this.classroomId = classroomId;
		this.teacherId = teacherId;
		this.classroomName = classroomName;
		this.detail = detail;
		this.active = active;
	}

}