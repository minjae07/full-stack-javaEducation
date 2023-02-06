package kr.or.shi.staticmathod;

public class Calculator {
	
	
	//인스턴스 메서드 : new 연산자로 인스턴스를 생성해야지만, 참조변수명. 인스턴스메세드명 접근가능.
	public int add(int x, int y) {
		double dresult = Calculator.divide(10.5, 11.7); 
		System.out.println("인스턴스메서드내에서 static 메서드 호출" + dresult);
		
		return x+y ;
	}
	
	//인스턴스 메서드
	public int substract(int x, int y) {
		return x-y ;
	}
	
	//static(정적) 메서드
	public static long multiply(long x, long y) {
		/*
		 * static메서드는 이미 메모리 상단에 올라가 있고 인스턴스 생성없이 접근이 가능해야 되는데,
		 * 아래 인스턴스가 생성되어야지만 사용가능한 add()가 왔기떄문에 예외가 발생한 것임.
		 * 즉, 인스턴스가 언제 생성될지 아무도 모르기 떄문에
		 * static 메서드 안에는 인스턴스 메서드가 절대로 오면 안됨.
		 */
		//this.add(10,5); <=== static 메서드에서는 this를 쓸 수가 없음.
		
		return x*y;
	}
	//static(정적) 메서드
		public static double divide (double x, double y) {
			return x / y;
	
		}
}












