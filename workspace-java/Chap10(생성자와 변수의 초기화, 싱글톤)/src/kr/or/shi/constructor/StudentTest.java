package kr.or.shi.constructor;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.getAge());
		System.out.println(student.getName());
		
		//매개변수가 있는 생성자를 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);
		
		Student student3 = new Student("이도");
		System.out.println(student3);
		
		Student student4 = new Student(40);
		System.out.println(student4);
	}

}
