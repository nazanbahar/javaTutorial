package javaHomeworkLesson2;

public class OrganizationManager {
	public void add(Organization organization) {
		System.out.println( organization.organizationName + ": Organization Added.");
	}

	public void update(Organization organization) {
		System.out.println( organization.organizationName + ": Organization Updated.");
	}

	public void delete(Organization organization) {
		System.out.println( organization.organizationName + ": Organization Deleted.");
	}
	
	public void getall(Organization organization) {
		System.out.println( organization.organizationName + ": Organization Listed.");
	}
}
