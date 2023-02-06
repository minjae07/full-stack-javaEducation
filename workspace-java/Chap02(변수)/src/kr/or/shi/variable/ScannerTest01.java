package kr.or.shi.variable;

import java.util.Scanner;

public class ScannerTest01 {
	public static void main(String[] args) {
		
		/*
		 * Ctrl + Shift + o : 자동 임포트
		 * Scanner 클래스 : 입력을 받기 위한 클래스이고, 입력스트림임.
		 *                자원(Resource)은 사용하고 나서 반드시 닫아줘야함.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("실수 한자리 입력 : ");
		double dnum = scan.nextInt();
		System.out.println("사용자로부터 입력받은 숫자 : " + dnum);
		System.out.print("정수 한자리 입력 : ");
		int num2 = scan.nextInt();
		System.out.println("사용자로부터 입력받은 숫자 : " + num2);
		
		
	    scan.close();
	}

}
