package javaHomeworkLesson2;

public class MemberManager {
	public void add(Member member) {
		System.out.println( member.memberName + ": Member Added.");
	}

	public void update(Member member) {
		System.out.println( member.memberName + ": Member Updated.");
	}

	public void delete(Member member) {
		System.out.println( member.memberName + ": Member Deleted.");
	}
	
	public void getall(Member member) {
		System.out.println( member.memberName + ": Member Listed.");
	}
}
