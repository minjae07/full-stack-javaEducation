package kr.or.shi.loop04;

public class WhileTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;      //while문은 초기화 하는 부분이 따로 존재하지 않음.
		
		
	/*
	 * while문은 조건식만 들어가기 때문에,
	 * for문에 비해서 일반적 반복에서는 가독성이 떨어짐.
	 */
		while(i<=100) {
			sum += i;
			i++;
		}

		System.out.println("1~100까지의 합 : " + sum);
		System.out.println();
		
		/*
		 * while문은 무한루프용으로 많이 사용함.
		 * if()문은 break문과 함께 무한루프를 벗어날 코드를 작성해 주는게 맞음.
		 */
		
		int j=1;
		while(true) {
			System.out.println(j);
			if(j>=100)
				break;
			j++;
		}
		
	}

}
