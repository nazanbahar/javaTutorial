package javaLessonPolimorphisimRealLife38;

public class ConsoleLogger extends BaseLogger{
	//Signature - void operation : @Override
			@Override
			public void log(String message) {
				//console e loglamak
				System.out.println("Logged to console: " + message);
			}
	}