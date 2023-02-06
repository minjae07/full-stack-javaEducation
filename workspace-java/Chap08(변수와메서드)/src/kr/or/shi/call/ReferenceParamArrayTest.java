package kr.or.shi.call;

public class ReferenceParamArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int [] {10, 20, 30, 40, 50};
		System.out.println("change()메서드 호출 전의 값 : " + arr[0]);
		
		System.out.println("main()arr의 주소값 :" + arr);

		
		//배열명은 주소임. call by reference
		
		change(arr);
		change(new int [] {10, 20, 30});	//주소값을 넘겨도 됨.
		System.out.println("change()메서드 호출 후의 값 : " + arr[0]);
	}
	
	
	public static void change(int[] arr) {
		arr[0] = 999;
		System.out.println("change()메서드 내의 값 :" + arr[0]);
		
		System.out.println("change()arr의 주소값 :" + arr);

		return;
	}
	
}

















