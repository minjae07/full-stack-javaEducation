package kr.or.shi.callstack;

public class CallStackTest {
	
	public static void main(String[] args) {
		System.out.println("main() 실행됨");

		CallStackTest.first();
		System.out.println("main() 종료됨");
	
	}
	
	public static void first() {
		System.out.println("first() 실행됨");
		second();			//같은 클래스 내에 메서드라면 클래스명은 생략해도 무방함.
		System.out.println("first() 종료됨");
	}
	public static void second() {
		System.out.println("second() 실행됨");

		third();
		System.out.println("second() 종료됨");
	}
	
	public static void third() {
		System.out.println("third() 실행됨");
		System.out.println("third() 종료됨");
	}
	
	
}