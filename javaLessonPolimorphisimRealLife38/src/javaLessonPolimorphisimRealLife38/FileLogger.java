package javaLessonPolimorphisimRealLife38;

public class FileLogger extends BaseLogger{
	//Signature - void operation : @Override
	@Override
	public void log(String message) {
		//file a loglamak
		System.out.println("Logged to file: " + message);
	}
}
