package kr.or.shi.constructor;

/*
 * A클래스는 아무런 생성자가 존재하지 않으므로,
 * 컴파일시에 컴파일러가 알아서 기본생성자를 추가해줌.
 */
class A {
	int value;
}

class B {
	int value;
	
//	public B() {
//
//	}
	
	public B(int value) {
		this.value = value;
	}
}

public class ConstructorTest {
	
	public static void main(String[] args) {
		A a = new A();
		
		/*
		 * 컴파일 예외 핵ㄹ 방법
		 * 1) B클래스에 기본 생성자를 추가
		 * 2) B클래스 생성자 호출시 매개변수 값으로 int 값을 지정해줌.
		 */
		B b = new B(30);
	}

}
