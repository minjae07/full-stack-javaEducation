package kr.or.shi.loop05;

public class ContinueTest {

	public static void main(String[] args) {

	// 1~100까지 사이에서 홀수만 출력하는 프로그램.
		for(int i=1; i<=100; i++) {
			/*
			 * continue문은 뒷문장은 실행하지 않고
			 * 바로 증감식으로 이동함.
			 */
			if((i % 2) == 0) {
				continue;
			}
			System.out.println("홀수 : " + i);
			
		}
		
		//2와 3의 공배수만 출력하는 프로그램
		for(int i=1; i<=100; i++) {
			if((i%2) == 0 && (i%3)==0) {
				System.out.println("2와 3의 공배수 : " + i);
				
			}
		}
	}

}
