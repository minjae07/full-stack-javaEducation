package kr.or.shi.operator03;

import java.util.Scanner;

public class Threetest {

	public static void main(String[] args) {
		
		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력1 :");
		int x = scan.nextInt();
		System.out.print("입력2 :");
		int y = scan.nextInt();
		
        max = (x > y) ? x : y;
		System.out.print(max);
		
		scan.close();
		

	}

}
