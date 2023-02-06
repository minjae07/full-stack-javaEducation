package kr.or.shi.loop01;

/*
 * 디버깅(debugging) : debug창으로 의도치 않게 넘어갔다면, 
 * 프로그램의 문제발생한 것으로 에러를 잡아나가는 과정을 디버깅이라고 함.
 * breakPoint(중단점)설정 후, 실행(F11)을 시키면 F8을 누르면서 한 단계식
 * 진행시켜나가면서 변수의 값들을 살펴나가면서 에러를 쉽게 잡을 수 있음.
 */
public class ForTest02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int temp = 0;
		
		//누적합계가 2000이상 일때 i의 값을 출력하시오.
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum >= 2000) {
				temp = i;
				break;
			}
		}
	System.out.println("2000이상일 때 i의 값 : " + temp);
	System.out.println("2000이상일 때 sum의 값 : " + sum);

	}

}
