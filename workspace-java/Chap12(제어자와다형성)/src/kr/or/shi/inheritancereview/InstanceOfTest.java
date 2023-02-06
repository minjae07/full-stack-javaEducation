package kr.or.shi.inheritancereview;

class Person3 {}
class Student3 extends Person3 {}
class Researcher3 extends Person3{}
class Professor3 extends Researcher3{}

public class InstanceOfTest {
	
	public static void print(Person3 p) {
		if(p instanceof Person3) {
			System.out.print("Person ");
		}
		if(p instanceof Student3) {
			System.out.print("Student ");
		}
		if(p instanceof Researcher3) {
			System.out.print("Researcher ");
		}
		if(p instanceof Professor3) {
			System.out.print("Professor ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() -> \t");
		print(new Student3());
		System.out.print("new Researcher() - > \t");
		print(new Researcher3());
		System.out.print("new Professor() - > \t");
		print(new Professor3());
		
	}

}
