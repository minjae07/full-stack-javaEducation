package kr.or.shi.object01;

public class FieldInitTest {
	
	public static void main(String[] args) {
		
		/*
		 * new 연산자 : 클래스 있는 멤버들의 크기만큼 
		 *   	   heap에 메모리 할당을 하며 동시에 초기화를 시켜주는 역할을 함.
		 *   
		 */
		FieldInit fi = new FieldInit();
		System.out.println(fi.byteField);
		System.out.println(fi.booleanField);
		System.out.println(fi.floatField);
		System.out.println(fi.arrField);
		
		System.out.println(fi);
		System.out.println(fi.toString());
	}

}
