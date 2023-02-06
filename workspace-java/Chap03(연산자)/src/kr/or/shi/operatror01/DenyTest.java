package kr.or.shi.operatror01;

public class DenyTest {

	public static void main(String[] args) {
       
		//! 논리부정연산자 == not 연산자  --> 반대값을 취하게하는 연산자
		
		boolean power = false;
		System.out.println("power 값 : " + power);
        
		power = !power;
		System.out.println("power 값 : " + power);
		
		power = !power;
		System.out.println("power 값 : " + power);
		
		
		if(!power) {
			System.out.println("if문 실행됨!!");
		}
		if(power) {
			System.out.println("if문 실행됨");
		}
	}

}
