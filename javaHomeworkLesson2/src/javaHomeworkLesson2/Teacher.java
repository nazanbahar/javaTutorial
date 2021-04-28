package javaHomeworkLesson2;

public class Teacher {
	int teacherId;
	String firstName;
	String lastName;
	String email;
	String address;
	String detail;
	Boolean active;
	
	// constructor
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	// assign
	public Teacher(int teacherId, String firstName, String lastName, String email, String detail,
			Boolean active) {
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.detail = detail;
		this.active = active;
	}
}


