package javaHomeworkLesson3;

public class EmailLogger extends Logger {
	@Override
	public void log(String message) {
		System.out.println("Email loglandı " + message);
	}
}
