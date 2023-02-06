package kr.or.shi.loop01;

/*
 * 싱글루프 일때 :
 * int i=1 ==> 초기화코드 (최초 1번만 실행)
 * i <= 100 ==> 조건식 (참이여야만, 코드블럭이 실행)
 * i++ ==> 증감식
 */
public class ForTest01 {

	public static void main(String[] args) {
		
		//1~100까지 합
		int sum=0;
		for(int i=1; i<= 100; i++) {
			sum += i;
			System.out.println("sum : " + sum);
		}
		System.out.println("1~100까지 합 : " + sum);
		
		
	}

}
