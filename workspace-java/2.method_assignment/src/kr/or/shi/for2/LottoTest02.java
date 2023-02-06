package kr.or.shi.for2;

import java.util.Random;

/*
 * 로또번호 제작기 v2.0
 * -중복 제거되는 버전
 * 
 * 배열에서 중복 -- 인덱스가 서로 다르지만 요소의 값이 서로 같은 경우임.
 * 				배열에서 중복제거하려면 중첩 for문 사용
 */

public class LottoTest02 {
	
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
		
		//중복제거 전 lottoNumbers 전체를 출력
		System.out.println("===========================중복제거 전================");
				for(int i=0; i<lottoNumbers.length; i++) {
					System.out.printf("%d번의 숫자 : [%d]\n", i+1, lottoNumbers[i]);
				}
				System.out.println("====================================");
		
		//중복제거를 위한 for문
				for(int i=0;i<lottoNumbers.length;i++) {
					for(int j=0; j<lottoNumbers.length;j++) {
						
						/*
						 * index는 다르지만 요소는 같다 (중복) => lottoNumners[i]에 새로운 값을 할당하면 된다.
						 */
						if(i!= j && lottoNumbers[i] == lottoNumbers[j]) {
							System.out.printf("index %d와 %d의 값이 중복되므로 교체함\n",i,j);
							lottoNumbers[i] = random.nextInt(NUMBER_MAX)+1;
							
						//중복제거 후 lottoNumbers 전체를 출력
							System.out.println("===========================중복제거 후================");
							for(int k=0; k<lottoNumbers.length; k++) {
								System.out.printf("%d번의 숫자 : [%d]\n", k+1, lottoNumbers[k]);
							}
							System.out.println("====================================");
					
						}
			}
		}
	}
}
