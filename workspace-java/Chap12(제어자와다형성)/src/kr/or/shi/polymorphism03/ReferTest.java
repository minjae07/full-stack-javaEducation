package kr.or.shi.polymorphism03;

public class ReferTest {
	
	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		
		System.out.println(parent.x);			//멤버변수는 원래 타입을 벗어나지 못함
		System.out.println(child.x);
		System.out.println();
		
		parent.method();						//멤버메서드는 현재 참조하고 있는 인스턴스에 영향을 받음(오버라이드)
		child.method();
		
		parent.type(child);
		parent.type(parent);
		parent.type(new Car());					//이 경우 instanceOf 연산자를 사용하지 않으면 예외사항 발생함.
	}
}
