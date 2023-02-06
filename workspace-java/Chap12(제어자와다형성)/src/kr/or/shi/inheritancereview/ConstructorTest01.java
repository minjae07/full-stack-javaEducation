package kr.or.shi.inheritancereview;

/*
 * 1. IS-A 관계 (is a relationship : inheritance)
 * 		1) 일반적인(generic) 개념과 구체적인(specific) 개념과의 관계
 * 		2) 상위 클래스 : 하위 클래스보다 일반적인 개념 (ex : Employee)
 * 		3) 하위 클래스 : 상위 클래스보다 구체적인 개념들이 더해짐 (ex : Engineer, Manage...)
 * 		4) 상속은 클래스간의 결합도가 높은 설계
 * 		5) 상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음
 * 		6) 계층구조가 복잡하거나 hierarchy가 높으면 좋지 않음.
 * 
 * 2. HAS-A 관계 (composition)
 * 		1) 클래스가 다른 클래스를 포함하는 관계 (멤버변수로 선언)
 * 		2) 코드 재사용의 가장 일반적인 방법
 */

class A{
	public A() {				//기본 생성자임. public A()<<---이렇게 생긴거
		System.out.println("생성자 A");
	}
}

class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
}

class C extends B{
	public C() {
		System.out.println("생성자 C");
	}
}


public class ConstructorTest01 {
	
	public static void main(String[] args) {
		
		C c = new C();
		
		
	}
	
	
}













