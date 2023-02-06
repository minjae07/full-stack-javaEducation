package kr.or.shi.inheritancereview;

class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
	
}


public class UpcastingTest {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("이순신");
		p = s;			//원래는 s앞에 (Person)캐스팅 해줘야 되는데 자손-->부모로 업캐스팅 되서 안써도 됨
		System.out.println(p.name);
		//p.grade = 'A';							//컴파일 오류
		//p.department = "Com";						//컴파일 오류
		
	}

}
