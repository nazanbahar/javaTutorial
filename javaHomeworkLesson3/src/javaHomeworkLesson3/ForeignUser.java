package javaHomeworkLesson3;


public class ForeignUser extends User{
	private int id;
	private int userId;
	private String passportSerialNumber;
	private String nationality;
	private boolean workPermit;

	public ForeignUser() {
		
	}

	public ForeignUser(int id, int userId, String passportSerialNumber, String nationality, boolean workPermit) {
		super();
		this.id = id;
		this.userId = userId;
		this.passportSerialNumber = passportSerialNumber;
		this.nationality = nationality;
		this.workPermit = workPermit;
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

	public String getPassportSerialNumber() {
		return passportSerialNumber;
	}

	public void setPassportSerialNumber(String passportSerialNumber) {
		this.passportSerialNumber = passportSerialNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public boolean isWorkPermit() {
		return workPermit;
	}

	public void setWorkPermit(boolean workPermit) {
		this.workPermit = workPermit;
	}
	
	
}
