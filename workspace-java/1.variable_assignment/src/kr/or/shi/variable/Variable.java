package kr.or.shi.variable;

/*
 * 자바의 primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오.
 * 정수형 타입과 문자형 타입에 대해서만 구현한다.
 * 이때, 각 타입의 최댓값과 최솟값도 같이 구하여 출력하시오.
 * 
 */
public class Variable {

	public static void main(String[] args) {
		

		byte b = 1;
		short s = 2;
		int i = 4;
		long l = 8;
		System.out.println("비트, 바이트");
		System.out.println("문자형\nchar = 15, " + s);
		System.out.println("정수형\nchar = 7, " + b);
		System.out.println("short = 15, " + s);
		System.out.println("int = 31, " + i);
		System.out.println("long = 63, " + l);
		System.out.println("float = 31, " + i);
		System.out.println("double = 15, " + l);
		System.out.println("각 primitive Data Type의 (max 바이트 크기,min 바이트 크기)");
		System.out.println("char = -2^15 , 2^15-1");
		System.out.println("byte = -2^7 , 2^7-1");
		System.out.println("short = -2^15 , 2^15-1");
		System.out.println("int = -2^31 , 2^31-1");
		System.out.println("long = -2^63 , 2^63-1");
		System.out.println("float = -2^31 , 2^31-1");
		System.out.println("long = -2^63 , 2^63-1");
	}

}
