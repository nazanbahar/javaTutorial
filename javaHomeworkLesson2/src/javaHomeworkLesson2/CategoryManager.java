package javaHomeworkLesson2;

public class CategoryManager {

	public void add(Category category) {
		System.out.println( category.categoryName + ": Category Added.");
	}

	public void update(Category category) {
		System.out.println( category.categoryName  + ": Category Updated.");
	}

	public void delete(Category category) {
		System.out.println( category.categoryName  + ": Category Deleted.");
	}
	
	public void getall(Category category) {
		System.out.println( category.categoryName  + ": Category Listed.");
	}
	
	
}
