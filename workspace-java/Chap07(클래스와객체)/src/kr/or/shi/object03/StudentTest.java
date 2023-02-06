package kr.or.shi.object03;

public class StudentTest {

	int test;
	
	public static void main(String[] args) {
		
		//각각 독립된 저장공간을 가지는 인스턴스가 heap에 생성됨.
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.age = 20;
		stu1.name = "김수병";
		
		System.out.println(stu1);
		System.out.println(stu2);
		
	}

}
