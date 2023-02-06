package kr.or.shi.oop02;

public class Car {
	
	//carNum, serial Num
	
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

}
