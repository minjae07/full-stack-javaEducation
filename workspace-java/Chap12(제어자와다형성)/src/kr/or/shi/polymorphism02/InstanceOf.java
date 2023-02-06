package kr.or.shi.polymorphism02;

public class InstanceOf {
	
	public static void main(String[] args) {
		/*
		 * instanceOf 연산자의 결과 true라는 것 => 실제 형변환이 가능하다라는 것을 의미하며,
		 * 아울러 상속관계에 있는 것이다.
		 */
		
		
		//ctrl + t : 상속계층도를 볼 수 있는 단축키
		SportCar sportCar = new SportCar();
		
		if(sportCar instanceof SportCar) {
			System.out.println("SportCar로 타입변환이 가능합니다.");
		}

		if(sportCar instanceof Car) {
			System.out.println("Car로 타입변환이 가능합니다.");
		}
		
		if(sportCar instanceof Object) {
			System.out.println("Object로 타입변환이 가능합니다.");
		}
		
	}

}
