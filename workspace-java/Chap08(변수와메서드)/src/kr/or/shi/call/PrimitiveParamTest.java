package kr.or.shi.call;

class A{
	int data;
}

public class PrimitiveParamTest {
	
public static void main(String[] args) {
	
	A a = new A();
	a.data = 77;
	System.out.println("메서드 호출 전 main()내의 값 : " + a.data);
	
	//Call by Value(값에 의한 복사 호출) : 기본형
	PrimitiveParamTest.dataChange(a.data);

	System.out.println("dataChange() 호출");
	
	System.out.println("메서드 호출 후 main()내의 값 : " + a.data);
	
	}

	public static void dataChange(int data) {
		//지역변수
		//data값은 값복사가 이루어짐 => 호출한 곳으로 부터 아무런 영향을 받지 않는다
		data = 44;
		System.out.println("dataChange()내의 값 : " + data);
	}

}
