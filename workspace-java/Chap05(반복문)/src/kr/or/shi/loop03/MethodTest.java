package kr.or.shi.loop03;

public class MethodTest {
	
	public static int add(int x, int y) {
		
		System.out.println("add 메서드 호출됨");
		int temp = x + y;
		return temp;
	}

	//minus
    public static int minus(int x, int y) {
		
		System.out.println("minus 메서드 호출됨");
		int temp = x - y;
		return temp;	
		}
	//multiply
    public static int multiply(int x, int y) {
	
	System.out.println("multiply 메서드 호출됨");
	int temp = x * y;
	return temp;
	}

	//divide
    public static int divide(int x, int y) {
	
	System.out.println("divide 메서드 호출됨");
	int temp = x / y;
	return temp;
	}


	/*
	 * 메서드의 선언부 구성 : 중요도(98%)  <---> 구현부(정의부)
	 * 1) 리턴타입(반환값) : int.....
	 * 2) 메서드명
	 * 3) () : 매개변수, 인자값, Arguments, parameter
	 */
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		//call by value(값에 의한 복사)
	    int result = add(num1, num2);
	    System.out.println("num1 + num2 : " + result);
	    
	    int result2 = minus(num1, num2);
	    System.out.println("num1 - num2 : " + result2);
	    
	    int result3 = multiply(num1, num2);
	    System.out.println("num1 * num2 : " + result3);
	    
	    int result4 = divide(num1, num2);
	    System.out.println("num1 / num2 : " + result4);
	    
	}

}
