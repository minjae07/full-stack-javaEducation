package kr.or.shi.array04;

import java.util.Arrays;

/*
 * 배열 복사하기
 * arraycopy() 메서드 사용 --> 사용법 --> system.arraycopy(원본배열명, srcPos, 복사배열명, destPos, 길이)
 */
public class ArrayCopyTest {

	public static void main(String[] args) {
		
		int[] origin = new int[] { 10, 77, 33, 50};
		int[] target = new int[10];
		int count = 0;
		
		System.out.println("복사하기 전");
		System.out.println("target 길이 : " + target.length);
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
		System.out.println(target);
		System.out.println();
		
		//복사방법1) for문을 이용해서 직접 복사하는 방법
//		for(int i=0; i<origin.length;i++) {
//			target[i] = origin[i];
//		}
		
		//향상된 for문
		
//		for(int i : origin ) {
//			target[count++] = i;
//		}
		
		//복사방법2) -- 복사속도가 가장 빠름
		//System.arraycopy(origin, 0, target, 0, origin.length);
		System.arraycopy(origin, 0, target, 5, origin.length);
		
		//복사방법3)
		// 원본배열과 동일하게 복사를 해버리는 배열 복사 메서드임.
		target = Arrays.copyOf(origin, origin.length);
		
		System.out.println("복사한 후");
		System.out.println("target 길이 : " + target.length);
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
		System.out.println(target);
		System.out.println();
		
	}

}
