package kr.or.shi.interface03;

public class VehiclableTest {
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.setSpeed(-50);
		
		bus.setSpeed(80);
		driver.drive(bus);						//객체를 생성하여 참조변수로 넘김
		driver.stop(bus);
		System.out.println();
		
		taxi.setSpeed(-70);
		taxi.setSpeed(120);
		driver.drive(taxi);
		driver.stop(taxi);
		
		System.out.println();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		System.out.println();
		
		Vehiclable vehiclable = driver.newCarMethod(new Taxi());
		vehiclable.run();
		vehiclable.stop();
		
		System.out.println();
		vehiclable = driver.newCarMethod(new Bus());
		vehiclable.run();
		vehiclable.stop();
		
		
	}

}
