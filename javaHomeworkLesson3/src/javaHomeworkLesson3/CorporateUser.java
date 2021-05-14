package javaHomeworkLesson3;


public class CorporateUser extends User {

	private int id;
	private int userId;
	private String firstName;
	private String lastName;
	private String corporationName;
	private String departmentName;
	private String title;
	
	
	public CorporateUser() {
		
	}


	public CorporateUser(int id, int userId, String firstName, String lastName, String corporationName,
			String departmentName, String title) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.corporationName = corporationName;
		this.departmentName = departmentName;
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCorporationName() {
		return corporationName;
	}


	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	
	
	
	
}
