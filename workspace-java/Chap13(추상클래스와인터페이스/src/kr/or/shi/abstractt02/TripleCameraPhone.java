package kr.or.shi.abstractt02;

public class TripleCameraPhone extends Phone{

	public TripleCameraPhone(int serialNo, String company, String owner) {
		super(serialNo, company, owner);
	}

	@Override
	public void turnOn() {
		System.out.println("트리플 카메라폰이 껴졌습니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("트리플 카메라폰이 꺼졌습니다.");
	}
	
	public void cameraOn() {
		System.out.println("망원 기능이 사용됩니다.");
	}
	
	public void cameraOff() {
		System.out.println("망원 기능이 중지됩니다.");
	}
	
	

}
