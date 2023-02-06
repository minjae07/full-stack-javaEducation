package kr.or.shi.inheritancereview;

class A2{
	public A2() {
		System.out.println("생성자 A");
	}
	public A2(int x) {
		System.out.println("매개변수가 있는 생성자 A");
	}
}

class B2 extends A2{
//	public B2() {
//		//super();
//		System.out.println("생성자 B");
//	}
	public B2(int x) {
		super(100);
		System.out.println("매개변수가 있는 생성자 B");
		
	}
}


public class ConstructorTest02 {
	
	public static void main(String[] args) {
		
		B2 b = new B2(5);
		
	}
}
