package kr.or.shi.singleton;

/*
 * static 응용 - 싱글톤 패턴(singleton pattern)
 * 1) 싱글톤 패턴이란?
 * 		- 프로그램에서 인스턴스가 단 한 개만 생성 되어야 하는 경우 사용하는 디자인 패턴
 * 		- static 변수, 메서드 활용하여 구현할 수 있음.
 * 		- 생성자는 private 선언.
 * 		- 클래스 내부에 유일한  private 인스턴스 생성.
 * 		- 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공. 
 * 2) 싱글톤 패턴을 사용하는 이유?
 * 		- 단 하나의 인스턴스를 생성해서 서로 공유를 원하고자 할 때 사용.
 * 		- ex) 사용자 환경설정, 커넥션 풀, 스레드 풀, OS의 시간이나 날짜등.
 */

public class User {
	
	// 1)해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 객체를 생성함.
	private static User singleton = new User();
	
	// 2)해당 클래스를 외부에서 new 연산자로 인스턴스를 생성 못하게 막기.
	private User() {}
	
	// 3)해당 클래스 멤버의 주소를 넘겨주기(공유)위해 외부에서 호출할 수 있는 getter()메서드를 제공.
	public static User getInstance() {
		return User.singleton;
	}
	
	public static void add() {
		System.out.println("add() 메서드 호출");
	}
	
}
