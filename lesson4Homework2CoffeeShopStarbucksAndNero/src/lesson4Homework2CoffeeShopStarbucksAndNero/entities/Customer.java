package lesson4Homework2CoffeeShopStarbucksAndNero.entities;


import java.time.LocalDate;
import java.util.Date;

import lesson4Homework2CoffeeShopStarbucksAndNero.abstracts.Entity;


public class Customer implements Entity {

	private int Id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	//constructor
	public Customer() {}
	
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth  = dateOfBirth;
		
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	
}
