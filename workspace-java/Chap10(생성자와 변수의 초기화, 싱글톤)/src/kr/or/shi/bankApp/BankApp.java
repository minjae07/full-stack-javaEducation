package kr.or.shi.bankApp;

import java.util.Scanner;

public class BankApp {
	
	//배열 100개 정적멤버로 되어 있고,배열이므로 한계가 있다. (메모리 낭비, 정적이다.)
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run){
			System.out.println("---------------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금하기 | 4. 출금하기 | 5. 종료하기");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택>");
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				
			}
			else if (choice ==2) {
				
			}
			else if (choice ==3) {
				
			}
			else if (choice ==4) {
	
			}
			else if (choice ==5) {
				System.out.println("계좌관리 프로그램을 종료합니다.");
				run = false;
				
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		
	}
	
	public static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("--------------");
		
		/*
		 * next() : 한 단어를 입력 받을 때 용이한 메서드 (공백을 발견하면 그 앞까지만 String리턴)
		 * nextLine() : 한 문장이나 한 줄을 입력 받을 때 용이한 메서드 
		 */
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		
		System.out.print("계좌주 : ");
		String owner = scan.next();
		
		System.out.print("초기 입금액 : ");
		int balance = scan.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		
	}
	

}











