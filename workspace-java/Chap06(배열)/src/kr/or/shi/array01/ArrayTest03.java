package kr.or.shi.array01;

import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {

		//40바이트 힙에 생성
		int[] arr1 = new int[10];
		
		//arr1배열에 난수를 10개를 할당
		for(int i=0; i<arr1.length; i++) {
			//범위 1~10까지의 난수를 대입
			arr1[i] = (int)(Math.random()*10) + 1;
			
		}
		
		//배여르이 값들을 출력
		for(int i=0; i<arr1.length; i++) {
			if(i!=9) {
				System.out.print(arr1[i] + ", ");
			}
			else {
				System.out.print(arr1[i]);
			}
		}
		
		System.out.println();
		
		//Arrays 클래스는 배열을 조작하기 쉽게 만들어놓은 유틸리티 클래스
		System.out.println(Arrays.toString(arr1));
		//출력 스트림에다가 참조변수를 넣으면, 자동적으로 참조변수명.toString() 호출이 됨.
		System.out.println(arr1);
		System.out.println(arr1.toString());             //배열타입@16진수
		System.out.println();
		
		//6바이트가 힙에 생성
		char[] chArr = new char[] {'a','b','c'};
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr);
		//char 타입은(만) 주소를 출력하려면 toString() 호출해야 됨.
		System.out.println(chArr.toString());
		
		String[] str = new String[10];
		boolean[] bool = new boolean[10];
		
	}

}
