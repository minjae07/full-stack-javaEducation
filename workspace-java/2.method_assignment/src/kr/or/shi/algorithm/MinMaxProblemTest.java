package kr.or.shi.algorithm;

/*
 * 1. 나열된 수에서 최소값과 최대값 구하기
 * 		1)문제 정의 
 */
public class MinMaxProblemTest {

	public static void main(String[] args) {
		
		//int[] numbers = {10,55,23,2,79,101,16,82,30,45};
		int[] numbers = {11,22,2,35,18,351,813847,38153};
		int min = numbers[0];
		int max = numbers[0];
		int minPos = 0;
		int maxPos = 0;
		
		for(int i=1; i<numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i+1;
			}
			
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}
		}
		System.out.println("가장 큰 값은" +max+"이고, 위치는"+maxPos+"번째 입니다.");
		System.out.println("가장 작은 값은" +min+"이고, 위치는"+minPos+"번째 입니다.");
	}

}
