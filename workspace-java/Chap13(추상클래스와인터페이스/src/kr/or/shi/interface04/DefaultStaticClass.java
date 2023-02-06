package kr.or.shi.interface04;

public class DefaultStaticClass implements MyInterface{

	@Override
	public void method() {
		System.out.println("MyInterface를 구현한 DefaultStaticClass의 메서드 호출");
	}
	@Override
	public void dMethod() {
		
		System.out.println("MyInterface의 디폴트 메서드 오버라이딩한 메서드 호출");
	}

}
