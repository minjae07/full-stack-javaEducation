package kr.or.shi.interface04;

public interface MyInterface {
	int MAX_NUM = 100;					//static final 상수
	public void method();				//추상메서드 선언 (본질)
	
	default void dMethod() {
		System.out.println("MyInterface의 디폴트 메서드 호출");
	}
	static void sMethod() {
		System.out.println("MyInterface의 정적 메서드 호출");
	}
	
	
	
}
