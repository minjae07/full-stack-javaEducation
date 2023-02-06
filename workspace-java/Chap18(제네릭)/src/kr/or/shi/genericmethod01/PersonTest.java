package kr.or.shi.genericmethod01;

public class PersonTest {
	
	public static void main(String[] args) {
		
		//Person<Integer> p1 = Util.<Integer>changing(100);				//auto boxing
		Person<Integer> p1 = Util.changing(100);		//7줄이랑 8줄이랑 같음.<>생략가능.
		int value = p1.getT();
		System.out.println("Person 객체가 가지고 있는 값 : " + value);
		
		Person<String> p2 = Util.changing("류현진");
		String str = p2.getT();
		System.out.println("Person 객체가 가지고 있는 값 : " + str);
	}

}
