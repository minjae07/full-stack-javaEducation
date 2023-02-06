package kr.or.shi.array01;

/*
 * 배열(array) : 자료를 순차적으로 한꺼번에 관리하는 방법.
 *              동일한 자료형의 순차적 자료 구조.
 *              인덱스 연산([])를 이용하여 빠른 참조가 가능.
 *              배열의 순서는 0부터 시작.
 *              ==> 객체 배열을 구현한 ArrayList, HashMap를 많이 활용함.
 *              
 */ 
public class ArrayTest01 {

	public static void main(String[] args) {
		int[] score = null;              //score는 참조변수임. int[]이다.
		//score = {100,200}              //메모리 할당이 안되었는데, 값을 대입하고 있음(문법에러)
		
		score = new int[5];              //score는 5개의 방을 힙에다가 생성하고 있다.(20바이트)
		                                 //배열명은 주소이다.
		System.out.println("score의 주소값 : " + score);
		
		for(int i=0; i<score.length;i++) {
			System.out.println("score[" + i +"] = " + score[i]);
		}
		System.out.println();
		
		//배열에다가 값을 대입시키는 형태
		for(int i=0; i<score.length; i++) {
			
			score[i] = i + 10;
		}
		for(int i=0; i<score.length;i++) {
			System.out.println("score[" + i +"] = " + score[i]);
		}
		System.out.println();
		
	}

}

































