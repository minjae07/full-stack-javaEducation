package kr.or.shi.operator03;

public class assignopertest {

	public static void main(String[] args) {
		// 복합대입 연산자는 값을 누적시킬 때 많이 사용함.
		
		int result = 0;
		result += 10;                 //result = result + 10;
		System.out.println("result : " + result);
		
		result -= 5;                  //result = result - 5;
	    System.out.println("result : " + result);
	    
	    result *= 5;                  //result = result * 5;
	    System.out.println("result : " + result);
	    
	    result /= 5;                  //result = result / 5;
	    System.out.println("result : " + result);
	    
	    result %= 5;                  //result = result % 5;
	    System.out.println("result : " + result);


	}

}
