package kr.or.shi.decision03;

import java.util.Scanner;

public class SWITCHIFTES {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연령대를 입력해주세요 : ");
		int age = scan.nextInt();

		
		if(age>10 && age<20) {
			System.out.println("10이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else if(age>20 && age<30) {
			System.out.println("20이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else if(age>30 && age<40) {
			System.out.println("30이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else if(age>40 && age<50) {
			System.out.println("40이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else if(age>50 && age<60) {
			System.out.println("50이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
		}
		else{
			if(age<10) {
		
			System.out.println("최소 10이상만 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);
			}
		}
		
		switch(age) {
		case 10:
			System.out.println(age+"대입니다. 참고서는 코너는 A구역입니다.");
			break;
		case 20:
			System.out.println(age+"대입니다. 참고서는 코너는 A구역입니다.");
			break;
		case 30:
			System.out.println(age+"대입니다. 참고서는 코너는 A구역입니다.");
			break;
		case 40:
			System.out.println(age+"대입니다. 참고서는 코너는 A구역입니다.");
			break;
		case 50:
			System.out.println(age+"대입니다. 참고서는 코너는 A구역입니다.");
			break;
        default:
        	System.out.println("60대 이상입니다. ");
		}
		scan.close();

	}

}
