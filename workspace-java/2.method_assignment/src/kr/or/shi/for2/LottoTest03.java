package kr.or.shi.for2;

import java.util.Random;

public class LottoTest03 {

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
				
		//정렬을 위한 for문
				
		/*
		 * 만약 lottoNumbers[i]가 lottoNumber[i+1]보다 크면
		 * 두개 위치를 바꾸고 다시 i를 처음부터 검사해주면 된다.
		 */
				
		for(int i=0; i<lottoNumbers.length-1; i++) {
			if(lottoNumbers[i]>lottoNumbers[i+1]) {
				//임시저장소에 한곳의 값을 저장하고
				//그곳의 값은 다른 변수의 값을 저장
				//다른 변수 임시저장소 값을 저장
				int temp = lottoNumbers[i];
				lottoNumbers[i] = lottoNumbers[i+1];
				lottoNumbers[i+1] = temp;
				i = -1;
			}
		}
		System.out.println("===정렬후====");
		for(int k=0; k<lottoNumbers.length; k++) {
			System.out.printf("%d번의 숫자 : [%d]\n", k+1, lottoNumbers[k]);
		}
		System.out.println("====================================");
	}
}
