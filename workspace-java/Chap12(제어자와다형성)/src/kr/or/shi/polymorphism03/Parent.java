package kr.or.shi.polymorphism03;

public class Parent {
	
	int x = 100;
	
	/*
	 * 매개변수 타입이 Object라는 것은 어떠한 클래스도 다 받아주겠다는 것.
	 * instanceOf사용해서 캐스팅여부 확인해줘야 한다.
	 */
	public void type(Object obj) {
		if(obj instanceof Parent) {						//매개변수의 다형성 적용
			Parent parent = (Parent)obj;
		}
		else {
			System.out.println("Parent타입의 객체가 아님. 상속관계에 있지 않은 클래스임.");
		}
	}
	
	public void method() {
		System.out.println("조상메서드 호출");
	}
	
}	




