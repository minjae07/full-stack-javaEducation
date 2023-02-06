package kr.or.shi.string02;

public class EqualsTest {
	
	public static void main(String[] args) {
		
		String str1 = new String("양현종");
		String str2 = "양현종";
		String str3 = "양현종";
		
		// == 연산자 : 값 비교
		if(str1 == str2) {
			System.out.println("같은 번지의 인스턴스");
		}
		else {
			System.out.println("다른 번지의 인스턴스");
		}
		if(str2 == str3) {
			System.out.println("같은 번지의 인스턴스");
		}
		else {
			System.out.println("다른 번지의 인스턴스");
		}
		
		//String의 equals() : 값비교함(Object클래스의 equal()오버라이딩)
		if(str1.equals(str2)) {
			System.out.println("같은 문자열 입니다.");
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
		if(str2.equals(str3)) {
			System.out.println("같은 문자열 입니다.");
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
	}
}
