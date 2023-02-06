package kr.or.shi.array01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int sum = 0;                 //총합
		double avg = 0.0;            //평균
		
		//선언과 동시에 초기화
		int[] score0 = {100, 200, 300};
		int[] score = new int [] {100, 90, 80, 50, 70};
		
		System.out.println("배열의 크기 : " + score.length);
		
		
		//뱅ㄹ의 각 요소들을 전부 더하고 있음.
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총점 : " + sum);
		
		//평균
		avg = sum / score.length;
		System.out.println("평균 : " +avg);
		
	}

}
