package kr.or.shi.array04;

public class TwoDArrayTest {

	public static void main(String[] args) {
		//가변 배열 연습
		int[][] array = {
							{95, 86, 100, 55},    	
							{83, 92, 96},	
							{78, 83, 93, 87, 88, 77, 10}
						};
		
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0; i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		avg = (double)sum/count;
		System.out.println("위 가변배열의 합계 : " + sum);
		System.out.printf("위 가변배열의 평균 :  %.1f", avg);
	}

}
