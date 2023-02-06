package kr.or.shi.object02;

public class FarmMachineTest {
	
	public static void main(String[] args) {
		
		//객체 생성
		FarmMachine fMachine = new FarmMachine();
		System.out.println(fMachine);
		
		//생성된 객체에 속성 값 입력하기
		fMachine.price = 1000000;
		fMachine.year = 2021;
		fMachine.color = "blue";
		
		//속성 값 출력하기
		System.out.println(fMachine.price);
		System.out.println(String.format("%,d", fMachine.price));
		System.out.println(fMachine.year);
		System.out.println(fMachine.color);
		
		//동작 메서드 호출
		fMachine.move();
		fMachine.dig();
		fMachine.grind();
		
		
	}

}
