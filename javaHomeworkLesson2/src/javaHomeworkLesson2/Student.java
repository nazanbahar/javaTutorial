package javaHomeworkLesson2;

public class Student {
	int studentId;
	int organizationId;
	String firstName;
	String lastName;
	String email;
	String detail;
	Boolean active;

	// constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// assign
	public Student(int studentId, int organizationId, String firstName, String lastName, String email, String detail,
			Boolean active) {
		this.studentId = studentId;
		this.organizationId = organizationId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.detail = detail;
		this.active = active;
	}
}
