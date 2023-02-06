package kr.or.shi.recursive;

public class FactorialTest {
	
	public static void main(String[] args) {
		long result = FactorialTest.factorial(5L);
		System.out.println("5!(팩토리얼)의 값 : " + result);
		
	}
	
	public static long factorial(long n) {
		long result = 0;
		
		if(n==1)								//n이 비로소 1일때, 재귀호출이 더 이상 진행 안 됨. f(1) = 1됨.
			result = 1;
		else {
			System.out.println("result 값 : " + result + ", n값 : " + n);
			result = n * factorial(n-1);		//재귀호출이 직접적으로 이루어지는 곳
		}
		
		return result;
	}

}
