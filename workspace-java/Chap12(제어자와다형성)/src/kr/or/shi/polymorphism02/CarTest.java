package kr.or.shi.polymorphism02;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car car = null;
		SportCar sportCar = new SportCar();
		PoliceCar policeCar = new PoliceCar();
		
		sportCar.speedUp();
		
		car = sportCar;						//업캐스팅(자손-->조상) : 조작할 수 있는 멤버가 줄어듬.
		//car.speedUp();					//X
		
		SportCar sportCar2 = null;
		sportCar2 = (SportCar)car;			//다운캐스팅(조상-->자손) : 조작할 수 있는 멤버가 늘어남.
											//다운캐스팅을 할 때, 반드시 명시적으로 형변환 코드를 작성 해야됨.
		
		sportCar2.speedUp();
		
		//sportCar = policeCar;				// 서로 관련 없는 클래스들 간의 형변환은 이루어질 수 없다.
		
		
	}

}
