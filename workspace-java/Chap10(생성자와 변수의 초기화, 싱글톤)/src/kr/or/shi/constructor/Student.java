package kr.or.shi.constructor;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		/*
		 * 기본생성자 - 클래스명과 생성자명이 반드시 같아야함.
		 * 			 생성자는 리턴타입이 존재하지 않음.(void라는 것을 써주지 않음.)
		 * 			 생성자가 하나도 없는 클래스는 기본적으로 컴파일시에 컴파일러가 알아서
		 *           기본생성자를 추가했음.
		 */
		System.out.println("기본생성자 호출");
	}
	
	//매개변수가 있는 생성자
	//생성자 : 인스턴스 초기화 메서드라고 할 수 있음.
	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}
	
	//매개변수가 있는 생성자
	public Student (String name) {
		this.name = name;
	}
	
	//매개변수가 있는 생성자
	public Student (int age) {
		System.out.println("매개변수가 String만 있는 생성자 호출");
		this.age = age;
	}
	

	public String getName() {
		System.out.println("매개변수가 int만 있는 생성자 호출");
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return this.getName() +", " + this.getAge();
	}
	
	
}
