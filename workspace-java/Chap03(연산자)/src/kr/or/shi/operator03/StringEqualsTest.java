package kr.or.shi.operator03;

public class StringEqualsTest {

	public static void main(String[] args) {
		// 참조형 타입의 ==, != 에 대해서 확인해보자
		
		/*
		 * 리터럴인 경우는 같은 값이 있는지 먼저 메모리공간(heap)을 확인하고나서, 
		 * 같은 값이 있다면 같은 주소를 공유하게 되고
		 * 없으면 새로운 곳에 인스턴스를 생성해준다.
		 */
		
		String str1 = "경산시";
		String str2 = "자바";
		String str3 = "경산시";
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : " + result);
		/*
		 * 참조형 타입에서 ==은 '주소비교'를 하고 있음.
		 */
		boolean result1 = (str1 == str3);
		System.out.println("str1 == str3 : " + result1);		
		
		//new 연산자 오면 무조건 새로운 인스턴스가 생성됨.
		String str4 = new String("경산시");
		result1 = (str1 == str4);
		System.out.println("str1 == str4 : " +result1);
		
		/*
		 * String 클래스의 equals()는 주소와 상관없이 '값'이 같다면.
		 * 무조건 true를 리턴함.
		 */
		result1 = str1.equals(str2);
		System.out.println("str1.equals(str2): " + result1);
		
		result1 = str1.equals(str4);
		System.out.println("str1.equals(str4): " + result1);
		
		
	}

}
