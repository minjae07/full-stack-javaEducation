package kr.or.shi.forr;

import java.util.Scanner;

public class StarPrint02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력할 줄 수 : ");
		int lineNumber = scan.nextInt();
		
		for(int i=1; i<=lineNumber;i++){
			String stars = new String();
			
			//라인당 줄 공백
			int spaceWidth = lineNumber - i;					//공백수
			for(int j=1; j<=spaceWidth;j++) {
				stars += " ";
			}
			//별(갯수만큼)을 출력하는 for
			int starWidth = 2*i - 1;							//별의 갯수
			for(int j=1; j<=starWidth;j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		
		
		
		
		
		
		scan.close();
		
	}

}
