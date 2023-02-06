package kr.or.shi.finalconstant;

public class Person {
	
	/*
	 * final 초기화 방법
	 * 1)선언과 동시에 초기화
	 * 2)생성자에서 단 한 번 초기화
	 */
	final String NATION = "KOREA";
	final int AGE;
	
	/*
	 * 정적 상수
	 * 무조건 선언과 동시에 초기화가 반드시 되어야함.
	 * 클래스 별로 관리가 가능.
	 */
	static final int MAX_NUMBER = 1000;
	
	public Person(int age) {
		this.AGE = age;
	}
	
//	@Override
//	public String toString() {
//		return "NATION : " + this.NATION +
//				", AGE : " + this.AGE;
//	}
}
