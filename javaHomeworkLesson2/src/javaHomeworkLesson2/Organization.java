package javaHomeworkLesson2;

public class Organization {
	int organizationId;
	String organizationName;
	String detail;
	Boolean active;
	
	// constructor
		public Organization() {
			// TODO Auto-generated constructor stub
		}
			// assign
			public Organization(int organizationId, String organizationName, String detail, Boolean active) {
				this.organizationId = organizationId;
				this.organizationName = organizationName;
				this.detail = detail;
				this.active = active;
			}
	}
