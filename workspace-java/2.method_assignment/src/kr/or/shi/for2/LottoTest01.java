package kr.or.shi.for2;

import java.util.Random;

public class LottoTest01 {
	
	static final int SIZE = 6;
	static final int NUMBER_MAX = 45;
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		//로또 번호를 저장할 int 배열 선언과 초기화
		int[] lottoNumbers = new int[SIZE];
		
		/*
		 * for문을 사용해서 lottoNumbers의 각 요소를
		 * nextInt(int) + 1로 초기화
		 */
		for(int i=0; i<lottoNumbers.length;i++) {
			lottoNumbers[i] = random.nextInt(NUMBER_MAX)+1;
		}
		
		//lottoNumbers 전체를 출력
		for(int i=0; i<lottoNumbers.length; i++) {
			System.out.printf("%d번의 숫자 : [%d]\n", i+1, lottoNumbers[i]);
		}
		
	}
	
	
	
}
