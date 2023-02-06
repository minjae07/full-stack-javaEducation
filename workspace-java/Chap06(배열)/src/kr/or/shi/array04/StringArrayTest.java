package kr.or.shi.array04;

import java.util.Arrays;

public class StringArrayTest {

	public static void main(String[] args) {
		
		String str = new String("자바");
		System.out.println(str.toString());
		System.out.println();
		
		//객체(클래스) 배열 => 2차원 배열
		String[] str2 = new String[] {
										"안녕", "이순신", "류성룡"         //1차원 배열 형태
		                             };
		for(int i=0; i<str2.length;i++) {
			System.out.print(str2[i] + " ");
		}
		System.out.println();
		//주소가 나옴
		System.out.println("str2 배열의 주소 : " + str2.toString());
		
		System.out.println("String 배열의 주소 : " + str2[1].toString());
		
		str2[0] = "정철";
		System.out.println(Arrays.toString(str2));
		
		//향상된 for문
		for(String str0 : str2) {
			System.out.println(str0);
	}
		
		}
	

}




























