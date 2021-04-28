package javaHomeworkLesson2;

public class Course {
	int courseId;
	int categoryId;
	String courseName;
	double price;
	String detail;
	Boolean active;
	
	// constructor
	public Course() {
		// TODO Auto-generated constructor stub
	}
		// assign
		public Course(int courseId, int categoryId, String courseName, Double price, String detail, Boolean active) {
			this.courseId = courseId;
			this.categoryId = categoryId;
			this.courseName = courseName;
			this.price = price;
			this.detail = detail;
			this.active = active;
		}
}
