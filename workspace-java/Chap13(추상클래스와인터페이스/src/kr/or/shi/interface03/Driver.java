package kr.or.shi.interface03;

//독립클래스 (인터페이스 매개변수의 다형성)
public class Driver {
	
	//new Taxi(), new Bus()만 들어올 수 있다.
	//위 2개의 클래스가 Vehiclable 인터페이스를 구현했기 때문에 들어올 수 있음.
	public void drive(Vehiclable vehiclable) {
		vehiclable.run();
	}
	
	public void stop(Vehiclable vehiclable) {
		vehiclable.stop();
	}
	
	//인터페이스(Vehiclable)가 리턴타입, 매개변수 타입임.
	public Vehiclable newCarMethod(Vehiclable vehiclable) {
		
		if(vehiclable instanceof Taxi) {
			System.out.println("새택시");
			Taxi taxi = (Taxi)vehiclable;				//다운캐스팅
			return taxi;
		}
		else if(vehiclable instanceof Bus) {
			System.out.println("새버스");
			Bus bus = (Bus)vehiclable;
			return bus;
		}
		return null;
	}
}