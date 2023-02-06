package kr.or.shi.staticmathod;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//인스턴스 메서드 호출
		int addResult = cal.add(100,200);
		System.out.println("인스턴스 메서드 add() 호출결과 : " +addResult);
		
		//static 메서드 호출
		long mulResult = Calculator.multiply(100, 20);
		System.out.println("static 메서드 호출 : " + mulResult);
		
		double divResult = Calculator.divide(102, 10.2);
		System.out.println("static 메서드 호출 : " + divResult);
		
		Integer.parseInt("100");

				
	}

}
