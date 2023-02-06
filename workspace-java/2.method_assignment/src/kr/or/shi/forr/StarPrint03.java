package kr.or.shi.forr;

import java.util.Scanner;

public class StarPrint03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력할 줄 수 : ");
		int lineNumber = scan.nextInt();
		
		//윗부분을 출력하는 for문
		for(int i=1 ; i<=lineNumber-1;i++) {
			String stars = new String();
			for(int j=1;j<=i; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		
		//아랫부분을 출력하는 for문
		for(int i=1; i<=lineNumber;i++) {
			String stars = new String();
			
			for(int j=i; j<=lineNumber;j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		
		
		
		
		
		
		scan.close();
	}

}
