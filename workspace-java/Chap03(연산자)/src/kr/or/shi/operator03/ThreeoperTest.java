package kr.or.shi.operator03;

import java.util.Scanner;

public class ThreeoperTest {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("점수를 입력하세요 : ");
	int score = scan.nextInt();
	
	//(조건식) ? 1: 2
	char grade = (score >= 90) ? 'A' : 'B';
	//String grade = (score >= 90) ? "A" : "A가 아닙니다.";
	//System.out.println("당신의 등급 : " + grade);
	
	//삼항연산자 중첩
	grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
	System.out.println("당신의 등급 : " + grade);
	
	scan.close();
	}

}
