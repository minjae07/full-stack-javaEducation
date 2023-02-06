package kr.or.shi.decision01;

import java.util.Scanner;

/*
 * 상수로 관리자의 아이디와 비밀번호를 만들고
 * 사용자로 부터 아이디와 비밀번호를 입력받아서
 * 만약 관리자의 아이디와 비밀번호가 일치하면 "관리자 로그인 성공!"
 * 그외에는 "로그인 실패"가 출력되는 프로그램 작성하시오.
 */
public class IfElseTest {
	
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "1234";
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID : ");
		String id = scan.nextLine();
		
		System.out.println("PW : ");
		String pw = scan.nextLine();
		
		if(id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
		System.out.println("관리자 로그인 성공!");

	}
		else {
			System.out.println("로그인 실패");
		}

		scan.close();
}
}
