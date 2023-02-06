package kr.or.shi.superr;

public class SuperTest {

	public static void main(String[] args) {
		
		/*
		 * 자손클래스의 인스턴스를 생성하면, 조상클래스의 인스턴스 생성이 제일 먼저 이루어지고나서
		 * 자손클래스의 인스턴스가 생성되어 합쳐진 상태로 heap에 할당된다.
		 */
		Child child = new Child();
		child.show();
		System.out.println();
		
		Parent parent = new Parent(1000);
		parent.show();
		System.out.println();
		
		Parent parent2 = new Child();						//다형성 (뒤에 소개함)
		parent2.show();
		
		
		
		
	}
	
}
