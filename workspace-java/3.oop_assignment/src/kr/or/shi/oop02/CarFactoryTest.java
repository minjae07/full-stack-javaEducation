package kr.or.shi.oop02;

public class CarFactoryTest {
	
	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance();
		Car myPalisade = carFactory.createCar();
		Car yourPalisade = carFactory.createCar();
		
		System.out.println(myPalisade.getCarNum());
		System.out.println(yourPalisade.getCarNum());
		
	}

}
