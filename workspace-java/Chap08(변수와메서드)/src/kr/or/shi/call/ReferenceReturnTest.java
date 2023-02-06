package kr.or.shi.call;

import java.util.Arrays;

public class ReferenceReturnTest {
	
	public static void main(String[] args) {
		
		int[] origin = new int [] {10,20,30,40,50};		//원본 배열
		int[] cloned = null;							//타겟 배열
		System.out.println("copy() 호출 전 : " + Arrays.toString(cloned));
		
		cloned =copy(origin, origin.length);
		System.out.println("copy() 호출 후 origin[] 값 : " + Arrays.toString(origin));
		System.out.println("copy() 호출 후 cloned[] 값 : " + Arrays.toString(cloned));
		
		
	}

	//리턴타입으로 참조타입이 온 경우임.
	public static int [] copy(int[] arr, int size) {
		
		int[] temp = new int[5];
		//System.arraycopy(arr, 0, temp, 0, arr.length);
		for(int i=0; i<arr.length;i++) {
			temp[i] = arr[i];
		}
		return temp;
	}
	
	
}
