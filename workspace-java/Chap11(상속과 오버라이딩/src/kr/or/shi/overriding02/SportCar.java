package kr.or.shi.overriding02;

public class SportCar extends Car {
	
	public SportCar() {
		
	}
	
	public SportCar(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void stop() {
		
		System.out.println("스포츠 차가 멈춥니다.");
		
		super.stop();
	}
	
}
