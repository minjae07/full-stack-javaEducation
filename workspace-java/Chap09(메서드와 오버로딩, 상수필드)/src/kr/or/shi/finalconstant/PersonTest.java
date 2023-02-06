package kr.or.shi.finalconstant;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person(30);
		
		//final 속성은 상수이므로 값을 변경 절대 못함.
		//person.NATION = "China";					//불가함 확인함
		//person.AGE = 60;							//불가함 확인함
		
		System.out.println(person);
		System.out.println(Person.MAX_NUMBER);
		
		Person person2 = new Person(50);
		Person person3 = new Person(150);
		Person person4 = new Person(250);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println();
		
		System.out.println(person2.AGE);
		System.out.println(person3.AGE);
		System.out.println(person4.AGE);
		
	}

}
`
