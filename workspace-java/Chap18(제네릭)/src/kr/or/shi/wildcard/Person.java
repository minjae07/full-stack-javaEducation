package kr.or.shi.wildcard;
//상위클래스
public class Person {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
	
}
