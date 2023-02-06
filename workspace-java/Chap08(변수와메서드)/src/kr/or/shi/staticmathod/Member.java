package kr.or.shi.staticmathod;

public class Member {

	int iv = 100;								//인스턴스 변수
	static int cv = 200;						//static 멤버변수
	
	//인스턴스 메서드, 
	public void iMethod() {
		System.out.println("iv : "+ this.iv);
		System.out.println("cv : " + Member.cv);			//클래스명.정적변수명	
	}
	public static void sMethod() {
		//언제 인스턴스가 만들어질지는 아무도 모르기 때문에. this 안됨.
		//System.out.println("iv : " + this.cv);
		
		/*
		 * cv는 static 변수이기 때문에 인스턴스 생성없이도 접근가능해야하는데,
		 * static 메서드 내에서는 얼마든지 접근 가능함.
		 */
		System.out.println("cv : " + Member.cv);
	}
	
	
}
