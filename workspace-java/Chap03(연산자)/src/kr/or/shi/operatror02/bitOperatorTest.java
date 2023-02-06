package kr.or.shi.operatror02;

public class bitOperatorTest {

	public static void main(String[] args) {
		
		//&,|,^ 3개를 비트연산자라고 한다.
		
		int x = 8;
		int y = 5;
		
		System.out.println("x를 2진수로 변환한 결과 : " + Integer.toBinaryString(x));
		System.out.println("x를 2진수로 변환한 결과 : " + Integer.toBinaryString(y));
		/*
		 * AND연산은 둘다 1일때만 1을 준다.
		 * OR연산은 하나라도 1이면 1을 준다.
		 */
		System.out.println("x와 y를 비트 &(AND)연산 결과 : " + (x & y));
		System.out.println("x와 y를 비트 |(or)연산 결과 : " + (x | y));
		/*
	     * XOR(xeclusive or) 배타적 논리합 : 서로 다를때 1을 준다. 
		 */
		System.out.println("x와 y를 비트 ^(xor)연산 결과 : " + (x ^ y));
		
		//-------------------------------------------------------
		int x2 = -8;
		int y2 = -5;
		System.out.println("x2를 2진수로 변환한 결과 : " + Integer.toBinaryString(x2));
		System.out.println("y2를 2진수로 변환한 결과 : " + Integer.toBinaryString(y2));
		
		System.out.println("x2와 y2를 비트 &(AND)연산 결과 : " + (x2 & y2));
		System.out.println("x2와 y2를 비트 |(or)연산 결과 : " + (x2 | y2));
		/*
	     * XOR(xeclusive or) 배타적 논리합 : 서로 다를때 1을 준다. 
		 */
		System.out.println("x2와 y2를 비트 ^(xor)연산 결과 : " + (x2 ^ y2));
		
		
	}

}
