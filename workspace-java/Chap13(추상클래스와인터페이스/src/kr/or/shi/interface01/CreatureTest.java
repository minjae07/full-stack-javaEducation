package kr.or.shi.interface01;

public class CreatureTest {

	public static void main(String[] args) {
		Member member = new Member();
		member.method();
		member.method1();
		System.out.println();
		
		//인터페이스도 일종의 조상이다. 그래서 다형성 개념이 적용된다.
		Creature creature = new Member();			//인터페이스 필드의 다형성
		creature.method();
		//creature.method1(); 						//원래 타입을 벗어나지 못하므로 Member클래스의 멤버메서드는 호출불가
		System.out.println();
		
		Person person = new Person();
		person.method();
		person.method2();
		System.err.println();
		
		creature = new Person();
		creature.method();
		
		System.out.println(Creature.MAX);			//상수 접근시 인터페이스명.상수명으로 접근함.
		
	}

}
