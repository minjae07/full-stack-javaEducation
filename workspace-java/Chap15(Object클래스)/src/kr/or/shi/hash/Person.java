package kr.or.shi.hash;

import java.util.Objects;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	//hash 시리즈들은 동등객체 판단하기 위해서 1차적으로 hashcode() 호출함
	
	

	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		//return this.name.hashCode() + this.age ;			//하위호환
		return Objects.hash(this.name, this.age);			//신규개발
	}
	
	//2차적으로 값이 같은 equals() 호출함
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		
		if(obj instanceof Person) {
			Person person = (Person)obj;
			if( (this.name.equals(person.name))&& (this.age == person.age)){
				return true;
			}
		}return false;
	}
	
}
