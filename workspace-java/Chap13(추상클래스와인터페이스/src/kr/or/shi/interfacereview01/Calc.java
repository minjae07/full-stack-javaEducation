package kr.or.shi.interfacereview01;

/*
 * 1. 인터페이스는 왜 쓰는가? (인터페이스가 하는 일)
 * 		1) 클래스나 프로그램이 제공하는 기능을 명시적으로 선언
 * 		2) 일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제공하는 명세(specification)
 * 		3) 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있음.
 * 		4) 어떤 객체가 하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미임.
 * 		5) 인터페이스를 구현한 다양한 객체를 사용 -- 다형성
 * 			예) JDBC(Java DataBase Connectivity) 인터페이스
 * 
 * 2. 인터페이스(interface)란?
 * 		1) 모든 메서드가 추상 메서드로 선언됨 (모든 선언된 메서드는 추상 메서드) : public abstract
 * 		2) 모든 변수는 상수로 선언됨 (모든 변수는 상수로 변환 됨) : public static final
 *   	3) 자바 8부터 디폴트 메서드(default method)와 정적 메서드 (static method) 기능의 제공으로 일부 구현 코드가 있음.
 *   		- 디폴트 메서드 : (1) 구현을 가지는 메서드
 *   					  (2) default 키워드 사용
 *   					  (3) 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
 *   		- 정적 메서드 : 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있는 메서드
 *   		-private 메서드 (자바9이후) : (1) 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음.
 *   								 (2) 인터페이스 내부에서만 사용하기 위해 구현하는 메서드.
 *   								 (3) default 메서드나 static 메서드에서 사용함.
 */

public interface Calc {

	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1 , int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
