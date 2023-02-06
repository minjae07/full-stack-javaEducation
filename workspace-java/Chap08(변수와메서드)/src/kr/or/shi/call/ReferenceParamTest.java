package kr.or.shi.call;


public class ReferenceParamTest {
	
public static void main(String[] args) {
	
	A a = new A();
	a.data = 77;
	System.out.println("메서드 호출 전 main()내의 값 : " + a.data);
	
	//Call by reference(주소에 의한 복사 호출) : 참조형 - 값을 읽고 수정도 가능함.
	ReferenceParamTest.dataChange(a);

	System.out.println("dataChange() 호출");
	
	System.out.println("메서드 호출 후 main()내의 값 : " + a.data);
	
	}
	
	//참조변수 형태 => String, int[], double[]....
	public static void dataChange(A a) {
		//지역변수
		//a라는 주소 값이 매개변수로 넘어옴 => 주소를 공유하게 됨. =>호출한곳에서 영향을 무조건 받음.
		a.data = 44;
		System.out.println("dataChange()내의 값 : " + a.data);
	}

}
