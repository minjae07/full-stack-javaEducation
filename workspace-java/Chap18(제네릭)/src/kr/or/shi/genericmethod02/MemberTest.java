package kr.or.shi.genericmethod02;

public class MemberTest {
	
	//제너릭 메서드 생성 -- 제네릭 클래스인 Member를 리턴함.
	public <T> Member<T> boxing(T t){
		Member<T> member = new Member<>();
		member.setT(t);
		return member;
		
	}
	
	public static void main(String[] args) {
		MemberTest memberTest = new MemberTest();
		Member<Integer> member = memberTest.boxing(100); //auto boxing
		System.out.println("Member클래스의 값 : " +member.getT());
		
	}

}
