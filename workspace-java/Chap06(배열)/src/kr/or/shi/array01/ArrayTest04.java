package kr.or.shi.array01;

import java.util.Arrays;

/*
 *  정렬(sort)
 *  : 2개 이상의 자료를 작은 것부터 큰순서로(오름차순, ascending)정렬
 *    또는 큰 것부터 작은 것 순서로(내림차순, descending)로 재배열 하는 것.
 *    
 *    버블 정렬 (bubble sort)
 *    : 인접한 두 개의 원소를 비교하여 자리를 교환하는 방식
 *        -첫번째 원소부터 마지막 원소까지 반복하여 한 단계가 끝나면 가장 큰 원소가 마지막 자리로 정렬
 *    ex) 1,7,6,3,5,2,4  ---> 1,2,3,4,5,6,7
 */
public class ArrayTest04 {

	public static void main(String[] args) {
		//버블 정렬(bubble sort)
		
		int[] ball = new int [5];
		
		for(int i=0; i<ball.length;i++)  {
			ball[i] = (int)(Math.random()*45) + 1;
		
		}
		System.out.println();
		System.out.println("정렬 전: ");
		for(int i=0; i<ball.length;i++) {
			System.out.println(ball[i] + " ");
		}
		/*
		 * 버블소팅을 위해서는 1차원 배열이라도 더블루프가 필요하고
		 * 조건문이 하나 들어와야함.
		 */
//		for(int i=0;i<ball.length;i++) {
//			for(int j=0;j<ball.length-1;j++) {
//				if(ball[j] > ball[j+1]) {            //오름차순
//					int temp = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = temp;
//				}
//			}
//		}
		

		
//		Arrays.sort(ball);
	
		
		System.out.println("정렬 후: ");
//		for(int i=0; i<ball.length;i++) {
//			System.out.println(ball[i] + " ");
//		
//	}

		/*
		 * [] 괄호의 형태로 배열 표시를 보여주면서 출력
		 */
		
		System.out.println(Arrays.toString(ball));
		
		
      }
}
















