package kr.or.shi.forr;

import java.util.Scanner;

public class StarPrint01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력할 줄 수 : ");
		int lineNumber = scan.nextInt();
		
		for(int i=1; i<lineNumber; i++) {
			String stars = new String();
			
			//공백(갯수만큼)을 출력하는 for
			for(int j=1 ; j<=i-1; j++) {
				stars = " ";
			}
			
			//별(갯수만큼)을 출력하는 for
			for(int j=i ; j<=lineNumber;j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		
		
		
		
		
		scan.close();
		
	}
}
