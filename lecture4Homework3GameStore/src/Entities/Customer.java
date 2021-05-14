package Entities;


import java.time.LocalDate;

public class Customer extends User {
	private int id;
	private int userId;
	private String nationalIdentityId; 
	private String firstName;
	private String lastName;
	private int dateOfBirthYear;
	
	public Customer() {
		
	}

	public Customer(int id, int userId, String nationalIdentityId, String firstName, String lastName,
			int dateOfBirthYear) {
		this.id = id;
		this.userId = userId;
		this.nationalIdentityId = nationalIdentityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthYear = dateOfBirthYear;
		
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

	public String getNationalIdentityId() {
		return nationalIdentityId;
	}

	public void setNationalIdentityId(String nationalIdentityId) {
		this.nationalIdentityId = nationalIdentityId;
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

	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}

		
}
