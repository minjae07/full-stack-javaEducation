package kr.or.shi.staticmathod;

public class MemberTest {
	public static void main(String[] args) {
		
		//클래스명.정적메서드()
		//static은 static만 호출이 가는함.
		Member.sMethod();
		Member.cv = 500;
		Member.sMethod();
		
		Member member = new Member();
		member.iMethod();
		member.iv = 999;
		member.iMethod();
		
		
		
		
	}

}
