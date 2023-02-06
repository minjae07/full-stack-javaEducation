package kr.or.shi.decision01;

import java.util.Scanner;

public class IfnextedTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요. : ");
		int score = scan.nextInt();
		
		if(score >=90) {
			/*
			 * 중첩 if문 (무제한적으로 중첩 if문은 들어갈 수 있다.)
			 * 보통 중첩 if문은 2개를 초과하지 않도록 하는게 가독성 면에서 좋다.
			 */
			if(score >= 95) {
				System.out.println("당신은 A+ 등급입니다.");
			}
			else {
				System.out.println("당신은 A0 등급입니다.");
			}
		}
		else if(score >= 80) {
			if(score >= 85) {
				System.out.println("당신은 B+ 등급입니다.");
			}
			else {
				System.out.println("당신은 B0 등급입니다.");
			}
	}
		else {
			System.out.println("더욱 분발해 주세요!");
		}
		
		scan.close();

	}

}
