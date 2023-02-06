package kr.or.shi.object03;

public class Student {
	
	//멤버필드(변수)
	String name;
	int age;
	
	/*
	 * this : 클래스의 주소, 객체 자기자신의 주소
	 *        new라는 연산자가 인스턴스를 생성하면 비로소 활성화됨.
	 * super : 조상객체의 주소
	 */
	@Override
	public String toString() {
		
		String str = "이름 : " + this.name + 
				    " , 나이 : " + this.age;
		
		return str;
				
	}

}
