package kr.or.shi.operator03;

public class shortcircuitTest {

	public static void main(String[] args) {
		// 논리 연산에서 모든 항이 실행되지 않는 경우 - 단락 회로 평가
		/*
		 * 논리 곱(&&)은 두 항의 결과가 모두 true일때만 결과가 true.
		 * => 앞의 항의 결과가 false 이면 뒤 항의 결과를 평가하지 않음.
		 * 
		 * 논리 합(||)은 두 항의 결과가 모두 false일때 결과가 false.
		 * => 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음.
		 */
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	    value = ((num1 = num1 + 10) > 10) || ((i = i +2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	}

}
