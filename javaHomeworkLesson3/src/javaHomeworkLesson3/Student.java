package javaHomeworkLesson3;


public class Student extends User {
	//attribute
	private int id;
	private int userId;
	private String firstName;
	private String lastName;
	private boolean checkout;


	//constructor
	public Student() {
		
	}


	public Student(int id, int userId, String firstName, String lastName, boolean checkout) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.checkout = checkout;
	}

	//getter-setter
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


	public boolean isCheckout() {
		return checkout;
	}


	public void setCheckout(boolean checkout) {
		this.checkout = checkout;
	}
	
}
