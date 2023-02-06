package kr.or.shi.oop;

public class TakeTransTest {
	
	public static void main(String[] args) {
		
		Student studentL = new Student("이순신", 5000);
		Student studentD = new Student("이도", 10000);
		
		Bus bus = new Bus(100);
		Subway subway = new Subway(2);
		
		studentL.takeBus(bus);
		studentD.takeSubway(subway);
		
		studentL.showInfo();
		studentD.showInfo();
		
		bus.showBusInfo();
		subway.showSubwayInfo();
		
	}
	
	
	
	
}
