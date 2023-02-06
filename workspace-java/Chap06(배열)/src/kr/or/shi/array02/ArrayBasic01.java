package kr.or.shi.array02;

import java.util.Scanner;

/*
 * 사용자로부터 숫자를 4개 입력 받아서 
 * 배열에 차례대로 저장하고 
 * 다시 차례대로 출력하는 프로그램을 작성하시오.
 */
public class ArrayBasic01 {
	
	static final int size = 4;
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numberArray = new int[size];
		
		for(int i=0; i<numberArray.length; i++) {
			System.out.println((i+1) + "번째 값 : ");
			numberArray[i] = scan.nextInt();
		}
		
		System.out.println("------numberArray의 값들-------");
		for(int i=0; i<numberArray.length; i++) {
			System.out.printf("numberArray[%d] : %d \n", i, numberArray[i]);
		}

		scan.close();
	}

}
