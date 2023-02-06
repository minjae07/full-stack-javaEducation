package kr.or.shi.interface02;

public class Television implements RemoteControl {

private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("Television를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Television를 끕니다.");
		
	}

	@Override
	public void setVolumn(int volumn) {
		//볼륨이 0~100 사이에서만 움직일 것으로 프로그래밍 함.
		if(volumn > RemoteControl.MAX_VOLUMN) {
			System.out.println("Television 볼륨의 최대치 값은 100이다.");
			this.volumn = RemoteControl.MAX_VOLUMN;
		}
		else if(volumn < RemoteControl.MIN_VOLUMN) {
			System.out.println("Television 볼륨의 최소치 값은 0이다.");
			this.volumn = RemoteControl.MIN_VOLUMN;
		}
		else {
			this.volumn = volumn;
			
		}
		System.out.println("현재 Television 볼륨 : " + this.volumn);
	}
}
