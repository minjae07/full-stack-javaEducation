package kr.or.shi.variable;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력 : ");
		/*
		 * nextLine() : 엔터키를 입력할때까지 문자열을 입력--문장을 입력시 사용.
		 */
		String str = scan.nextLine();
		System.out.println("사용자로부터 입력받은 문자열 : " + str);
		
		System.out.print("문자열을 입력(숫자) : ");
	    int result = 100;
		String num = scan.nextLine();
		int temp = Integer.parseInt(num);
		int total = result + temp;
		System.out.println("연산 결과 : " + total);
		
		scan.close();
	}

}
