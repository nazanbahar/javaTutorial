package javaHomeworkLesson2;

//attribute
public class Category {
	int categoryId;
	String categoryName;
	String detail;
	Boolean active;

	// constructor
	public Category() {
	}

	// assign
	public Category(int categoryId, String categoryName, String detail, boolean active) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.detail = detail;
		this.active = active;

	}
}
