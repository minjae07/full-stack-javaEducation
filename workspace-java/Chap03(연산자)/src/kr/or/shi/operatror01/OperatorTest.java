package kr.or.shi.operatror01;

public class OperatorTest {
	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		

		int result = v1 + v2;
		System.out.println("더하기 결과 : " + result);
		
	    result = v1 - v2;
		System.out.println("뺄셈 결과 : " + result);
		
		result = v1 * v2;
		System.out.println("곱셈 결과 : " + result);
		
	    result = v1 / v2;
		System.out.println("나눗셈 결과 : " + result);
		
		result = v1 % v2;
		System.out.println("나머지 결과 : " + result);
		
		try {
			result = v1 / 0;                               //산술연산예외가 발생하는 부분
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e.toString());
		}
	}

}
