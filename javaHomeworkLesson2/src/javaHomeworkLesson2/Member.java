package javaHomeworkLesson2;

public class Member {
	int memberId;
	int studentId;
	int classroomId;
	String memberName;
	double status;
	Boolean checkout;
	String detail;
	Boolean active;
	
	// constructor
		public Member() {
			// TODO Auto-generated constructor stub
		
		}

		// assign
		public Member(int memberId, int studentId, int classroomId, String memberName, Double status, Boolean checkout, String detail, boolean active) {
			this.memberId = memberId;
			this.studentId = studentId;
			this.classroomId = classroomId;
			this.memberName = memberName;
			this.status = status;
			this.checkout = checkout;
			this.detail = detail;
			this.active = active;
		}
	
}
