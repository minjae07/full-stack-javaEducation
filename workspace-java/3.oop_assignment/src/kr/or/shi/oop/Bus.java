package kr.or.shi.oop;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		//super();
		this.busNumber = busNumber;
	}
	
	//승차하다.
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은" + money + "원 입니다.");
	}
	
}






