package kr.or.shi.staticnonstatic;

public class MemberReferenceTest {
	
	int iv;			//인스턴스 멤버변수
	static int cv;	//정적 멤버변수
	
	/*
	 * 인스턴스 메서드
	 * 이유 : 인스턴스 메서드가 호출될 때는 이미 인스턴스가 생성되어 있을 것임.
	 * 
	 */
	public void instanceMethod() {
		System.out.println(this.iv); 				//인스턴스 변수 사용 가능
		System.out.println(cv); 					//정적멤버 변수 사용 가능
		staticMethod(); 							//정적멤버 메서드 사용 가능
	}
	
	/*
	 * 정적 메서드
	 * 이유 : 인스턴스가 언제 생성될 지 모르기 때문에 정적 메서드에서는
	 * 		 인스턴스멤버들을 절대 사용할 수 없다.
	 */
	public static void staticMethod() {
		//System.out.println(this.iv); 				//인스턴스 변수 사용이 불가능
		System.out.println(cv); 					//정적멤버 변수 사용 가능
		//this.instanceMethod()						//인스턴스 멤버 메서드 불가능
	}
		
	}
	
