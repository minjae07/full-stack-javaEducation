package kr.or.shi.abstractreview01;

/*
 * 1. 추상클래스?
 * 		1) 구현 코드 없이 메스드의 선언만 있는 추상메서드(abstract method)를 포함한 클래스
 * 		2) 메서드 선언(declaration) : 반환타입, 메서드 이름, 매개변수로 구성
 * 		3) 메서드 정의(definition) : 메서드 구현(implementation)과 동일한 의미 구현부(body)를 가짐({})
 * 			예) int add(int x, int y);		//선언
 * 				int add(int x, int y) {}	//구현부가 있음. 추상메서드아님.
 * 		4) abstract 예약어를 사용
 * 		5) 추상클래스는 new 할 수 없음 (인스턴트화 할 수 없음)
 * 
 * 2. 추상클래스 구현하기
 * 		1) 메서드 구현 코드가 없으면 abstract로 선언
 * 		2) abstract로 선언된 메서드를 가진 클래스는 abstract로 선언.
 * 		3) 모든 메서드가 구현된 클래스라도 abstract로 선언되면 추상클래스로 인스턴스화 할 수 없음.
 * 		4) 추상 클래스의 추상 메서드는 하위 클래스가 상속하여 구현.
 * 		5) 추상 클래스의 추상메서드 : 하위 클래스가 구현해야 하는 메서드.
 * 		6) 추상 클래스 내의 구현된 메서드 : 하위 클래스가 공통으로 사용하는 메서드 (하위클래스에서 재정의 해야함)
 * 
 */
public abstract class Computer {
	
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
