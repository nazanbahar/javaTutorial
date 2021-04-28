package javaHomeworkLesson2;
/**
 * @author User
 *
 */
public class Main {

	public static void main(String[] args) {
		
		//course - attribute
		//course-1
		Course course1 = new Course();
		course1.courseId =1;
		course1.categoryId = 1;
		course1.courseName = " Java & React Course ";
		course1.price = 0;
		course1.detail = " Java And React Course Camping ";
		course1.active =true;
		
		//course-2
		Course course2 = new Course();
		course2.courseId =2;
		course2.categoryId = 2;
		course2.courseName = " C# & Angular Course ";
		course2.price = 0;
		course2.detail = " C# And Angular Course Camping ";
		course2.active =false;
		
		System.out.println("============ Course ===============");	
		//course - manager
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.update(course2);
		courseManager.delete(course2);
		courseManager.getall(course1);
		System.out.println("========================================");	
		
		//array
		Course[] courses = {course1, course2};
		
		//foreach
		for (Course course : courses) {
			System.out.println("Course Name : " + course.courseName + " Course Detail : " + course.detail);
		}
		System.out.println("========================================");		
		
		/////////////////////////////////////////////////////////////////////

		//1) attribute - instance
		//Category category = new Category();
		//Classroom classroom = new Classroom();
		//Course course = new Course();
		//Member member = new Member();
		//Organization organization = new Organization();
		//Student student = new Student();
		//Teacher teacher = new Teacher();
		
		
		//2) attribute - instance
		//category
		Category category1 = new Category();
		category1.categoryId= 1;
		category1.categoryName = "Software Developer";
		category1.detail = "Java OOP";
		category1.active = true;
		
		//classrom
		Classroom classroom1 = new Classroom();
		classroom1.classroomId = 1;
		classroom1.teacherId = 1;
		classroom1.classroomName = "kodlama.io";
		classroom1.detail = "Online Eğitim";
		classroom1.active = true;
		
		//course
		Course course3 = new Course();
		course3.courseId =3;
		course3.categoryId = 3;
		course3.courseName = " DevArchitecture ";
		course3.price = 3000;
		course3.detail = " DevArchitecture CQRS (Command Query Responsibility Segregation) ve AOP (Aspect Oriented Programming)  ";
		course3.active =true;

		//member
		Member member1 = new Member();
		member1.memberId = 1;
		member1.studentId = 1;
		member1.classroomId = 1;
		member1.memberName = "developerMan";
		member1.status = 15;
		member1.checkout = true;
		member1.detail= "Kodlama.io FullStack Developer";
		member1.active = true;
		
		//organization
		Organization organization1 = new Organization();
		organization1.organizationId = 1;
		organization1.organizationName = "DevArchitecture -Sofware 2021 ";
		organization1.detail = "Sofware Camping: DevArchitecture AOP (Aspect Oriented Programming)";
		organization1.active = true;
		
		//student
		Student student1 = new Student();
		student1.studentId = 1;
		student1.organizationId = 1;
		student1.firstName = "Can";
		student1.lastName = "Bahar";
		student1.email = "can@can";
		student1.detail = "https://github.com/canbahar";
		student1.active = true;
		
		//teacher
		Teacher teacher1 = new Teacher();
		teacher1.teacherId = 1;
		teacher1.firstName= "Engin";
		teacher1.lastName = "Demiroğ";;
		teacher1.email= "engin@engin";
		teacher1.address ="address";
		teacher1.detail = "MCT - PMP ITIL Certifiations";
		teacher1.active = true;
		
		
		
		//array
		Category[] categories = {category1};
		Classroom[] classrooms = {classroom1};
		//Course[] courses = {course, course1, course2};
		Member[] members = {member1};
		Organization[] organizations = {organization1};
		Student[] students = {student1};
		Teacher[] teachers = {teacher1};

		
		//3) foreach
		//category
		for (Category category : categories) {
			System.out.println("Category Id : " + category.categoryId + " Category Name : " + category.categoryName);
		}
		System.out.println("========================================");		

		
		
		//classroom
		for (Classroom classroom : classrooms) {
			System.out.println("Classroom Name : " + classroom.classroomName + classroom.teacherId + " Classroom Detail : " + classroom.detail );
		}
		System.out.println("========================================");		
		
		
		
		//course
		for (Course course : courses) {
			System.out.println("Course Name : " + course.courseName + course.categoryId +" Course Detail : " + course.detail );
		}
		System.out.println("========================================");		

		
		
		//member
		for (Member member : members) {
			System.out.println("Member Name : " + member.memberName + " Member Detail : " + member.detail);
		}
		System.out.println("========================================");		

		
		
		//organization
		for (Organization organization : organizations) {
			System.out.println("Organization Name : " + organization.organizationName + " Organization Detail : " + organization.detail);
		}
		System.out.println("========================================");		

		
		
		//student
		for (Student student : students) {
			System.out.println("Student Name : " + student.firstName + student.lastName +" Student Detail : " + student.detail);
		}
		System.out.println("========================================");		

		
		
		//teacher
		for (Teacher teacher : teachers) {
			System.out.println("Teacher Name : " + teacher.firstName + teacher.lastName +" Teacher Detail : " + teacher.detail);
		}
		System.out.println("========================================");		
		
		
		
		//4) manager
		CategoryManager categoryManager = new CategoryManager();
		ClassroomManager classroomManager = new ClassroomManager();
		//CourseManager courseManager = new CourseManager();
		MemberManager memberManager = new MemberManager();
		OrganizationManager organizationManager = new OrganizationManager();
		StudentManager studentManager = new StudentManager();
		TeacherManager teacherManager = new TeacherManager();
		
		
		//5) methods
		//category
		System.out.println("==========Category==================");	
		categoryManager.add(category1);
		categoryManager.update(category1);
		categoryManager.delete(category1);
		categoryManager.getall(category1);
		System.out.println("========================================");	
		
		//classroom
		System.out.println("==========Classroom==================");	
		classroomManager.add(classroom1);
		classroomManager.update(classroom1);
		classroomManager.delete(classroom1);
		classroomManager.getall(classroom1);
		System.out.println("========================================");	

		//course
		System.out.println("==========Course==================");	
		courseManager.add(course3);
		courseManager.update(course3);
		courseManager.delete(course3);
		courseManager.getall(course3);
		System.out.println("========================================");	

		
		//member
		System.out.println("==========Member==================");	
		memberManager.add(member1);
		memberManager.update(member1);
		memberManager.delete(member1);
		memberManager.getall(member1);
		System.out.println("========================================");	
		
		//organization
		System.out.println("==========Organization==================");	
		organizationManager.add(organization1);
		organizationManager.update(organization1);
		organizationManager.delete(organization1);
		organizationManager.getall(organization1);
		System.out.println("========================================");	
		
		//student
		System.out.println("==========Student==================");	
		studentManager.add(student1);
		studentManager.update(student1);
		studentManager.delete(student1);
		studentManager.getall(student1);
		System.out.println("========================================");	
		
		//teacher
		System.out.println("==========Teacher==================");	
		teacherManager.add(teacher1);
		teacherManager.update(teacher1);
		teacherManager.delete(teacher1);
		teacherManager.getall(teacher1);
		System.out.println("========================================");	
		
	
		
		
	}
}
