package kr.or.shi.multitype;

public class ProductTest {

	public static void main(String[] args) {
		//멀티타입 파라메터
		Product<Tv,String> p1 = new Product<>();
		p1.setT(new Tv(2021, 5));
		p1.setM("LG OLED AI TV");
		
		System.out.println("나의 TV는 " + p1.getT().getYear() + "년 " +
						   p1.getT().getMonth()+"월 식이며, "+
						   p1.getM()+"이다.");
		System.out.println("-----------------------------------");
		
		Product<Car, String> p2 = new Product<>();
		p2.setT(new Car("현대", 2021, 07));
		p2.setM("펠리셰이드 캘리그래피");
		
		Car car = p2.getT();
		String str = p2.getM();
		System.out.println("나의 차는 " + car.getYear() + "년 " +
				   car.getMonth()+"월 식이며, "+
				   car.getBrand()+"의 " + str+ "이다.");

	}

}
