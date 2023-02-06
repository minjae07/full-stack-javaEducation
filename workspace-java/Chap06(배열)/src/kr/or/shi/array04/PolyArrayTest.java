package kr.or.shi.array04;

import java.util.Arrays;

/*
 * 다중 배열 선언 : 배열 선언을 여러개 해야하는 경우 한 줄에 모두 선언하고 만들 수 있다.
 */

public class PolyArrayTest {
	public static void main(String[] args) {
		
		int[] a, b, c;
		
		int d[], e[], f[];
		
		int g[], h, i;
		
		a = new int[3];
		b = new int[3];
		c = new int[3];
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		d = new int[6];
		e = new int[6];
		f = new int[6];
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
		
		g = new int [9];
	    h = 100;
	    i = 200;
	    System.out.println(Arrays.toString(g));
	    System.out.println(h);
	    System.out.println(i);
	    
	    
		
	}

}
