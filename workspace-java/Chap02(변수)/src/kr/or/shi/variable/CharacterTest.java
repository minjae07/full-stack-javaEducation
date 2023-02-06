package kr.or.shi.variable;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		//문자도 정수로 표현함.
		System.out.println((int)ch1);
		/*
		 * 어떤 문자를 컴퓨터 내부에서 표현하기 위해 특정 정수 값을 정의.
		 * A는 65 (인코딩, encoding)
		 * encoding : 문자가 숫자로 변환 되는 것.
		 * 
		 * character set : 문자를 숫자로 변환한 값의 세트
		 * -ASCII code : 알파벳과 숫자 특수문자등을 1바이트에 표현하는데 사용하는 문자 세트
		 * -UNICODE : 전 세계 표준으로 만든 문자 세트
		 *     -UTF-8 : 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있다
		 *     -UTF-16 : 2바이트로 문자를 표현가능.
		 *     -한글 유니코드 표
		 */
		
		int ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		 int ch3 = 67;
		 System.out.println(ch3);
		System.out.println((char)ch3);    //decoding : 숫자에서 다시 문자로 변환하는 것
		
		//char ch4 = -66;                 //음수는 대입할 수 없다.
		
		char ch5 = '한';
		char ch6 = '\uD55C';
	    System.out.println(ch5);
	    System.out.println(ch6);
		
		
		
		
		
		
	}

}
