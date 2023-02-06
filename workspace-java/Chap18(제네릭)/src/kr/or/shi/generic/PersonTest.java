package kr.or.shi.generic;

public class PersonTest {

	public static void main(String[] args) {
		
		//Person클래스에 T를 String만 들어오게끔 무조건 생성함.
		Person<String> person = new Person<>();
		person.setT("양현종");
		String str = person.getT();
		System.out.println(str);
		
		Person<Integer> person2 = new Person<>();
		person2.setT(100);				//setT(new Integer(100)) ==>자동박싱
		int value = person2.getT();		//자동언박싱
		System.out.println(value);
		
		Person<Apple> person3 = new Person<>();
		person3.setT(new Apple());
		Apple apple = person3.getT();
		System.out.println(apple);
		
	}
}









