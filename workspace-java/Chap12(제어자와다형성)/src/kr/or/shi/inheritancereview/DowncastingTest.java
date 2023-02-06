package kr.or.shi.inheritancereview;

class Person2 {
	String name;
	String id;
	public Person2(String name) {
		this.name = name;
	}
}

class Student2 extends Person2 {
	String grade;
	String department;
	public Student2(String name) {
		super(name);
	}
	
}


public class DowncastingTest {

	public static void main(String[] args) {
	
			Person2 p = new Student2("이도");						//업캐스팅
			Student2 s;
			
			s = (Student2)p;									//다운캐스팅
			System.out.println(s.name);
			s.grade = "A";										//오류 없음
			s.department = "Com";								//오류 없음
		
	}
}
