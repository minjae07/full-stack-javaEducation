package kr.or.shi.interface02;

public interface RemoteControl {

	//상수(static final)
	int MAX_VOLUMN =100;
	int MIN_VOLUMN =0;
	
	//추상메서드 3개 선언(abstract
	public void turnOn();
	public void turnOff();
	public void setVolumn(int volumn);
}
