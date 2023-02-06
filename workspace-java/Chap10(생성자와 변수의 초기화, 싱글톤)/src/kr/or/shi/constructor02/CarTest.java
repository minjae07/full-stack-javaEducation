package kr.or.shi.constructor02;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();					//기본형 차 주문
		System.out.println(car1);
		
		Car car2 = new Car("흰색", "오토", 4);		//직접 차 주문
		System.out.println(car2);
		
		Car car3 = new Car(car1);
		System.out.println(car3);
		
		Car car4 = new Car(car2);
		System.out.println(car4);
		
	}
	
	
	
	
	
	
	
}


















