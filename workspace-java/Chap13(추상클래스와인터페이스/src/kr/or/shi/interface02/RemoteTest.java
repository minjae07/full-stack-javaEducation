package kr.or.shi.interface02;

public class RemoteTest {
	
	public static void main(String[] args) {
		
		//인터페이스도 일종의 조상이므로 필드의 다형성 허용
		RemoteControl rControl = new Television();
		rControl.turnOn();
		rControl.setVolumn(15);
		rControl.setVolumn(-100);
		rControl.turnOff();
		System.out.println();
		
		rControl = new Audio();
		rControl.turnOn();
		rControl.setVolumn(15);
		rControl.setVolumn(-100);
		rControl.turnOff();
		
	}

}
