package kr.or.shi.loop05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면, q를 입력하세요.");
		
		String str = null;
		
		/*
		 * do~while문은 최소 한번 이상 무조건 수행하는 반복문임.
		 * 이유는 조건문이 뒷부분에 존재하기 때문임.
		 */
		do {
			System.out.print(">");
			/*
			 * string 클래스의 next()메서드 : 공백만날까지만 그 값을 리턴함.
			 * next(): 한단어 입력 받을 때 쓸 수 있는 메서드.
			 * nextLine(): 공백포함하여 엔터키를 입력할 때까지 해당 문장을 리턴함.
			 */
			str = scan.nextLine();
			System.out.println("입력받은 메시지 : " + str);
		}
		while(!str.equals("q"));
		scan.close();
		
	}

}
