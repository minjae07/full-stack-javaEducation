package kr.or.shi.generic;

//Person이라는 클래스를 제네릭 타입으로 설계함.
public class Person<T> {
	
	private T t;
	
	/*
	 * T라는 타입이 아직 정해지지 않았다.
	 * T는 개발코드에서 정해진다.
	 * => 변수선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형을
	 * 	  변환될 수 있도록 프로그래밍 하는 방식(제네릭)
	 * T는 개발코드에서 정해진다.
	 * =>실제 사용되는 참조 자료형으로의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 방식
	 */
	
	public Person() {
		
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
