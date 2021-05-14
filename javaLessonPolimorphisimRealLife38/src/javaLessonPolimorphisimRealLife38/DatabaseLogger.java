package javaLessonPolimorphisimRealLife38;

public class DatabaseLogger extends BaseLogger {
	//Signature - void operation : @Override
		@Override
		public void log(String message) {
			//database e loglamak
			System.out.println("Logged to database: " + message);
		}
}
