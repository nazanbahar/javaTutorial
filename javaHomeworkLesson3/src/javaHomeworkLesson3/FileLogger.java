package javaHomeworkLesson3;

public class FileLogger extends Logger {
	@Override
	public void log(String message) {
		System.out.println("File loglandı " + message);
	}
}
