package kr.or.shi.decision02;

import java.util.Scanner;

/*
 * 사용자로부터 월을 입력 받아서
 * 해당월의 마지막 날짜를 보여주는 프로그램을 작성하시오.
 */
public class SwitchTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("해당 월을 입력하시오 : ");
		
		int month = scan.nextInt();
		
			switch(month) {
			case 2:
				System.out.println("28일");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30일까지 입니다.");
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31일까지 입니다.");
				break;
				default:
					System.out.println("존재하지 않는 달입니다.");
			}
		
		scan.close();

	}

}
