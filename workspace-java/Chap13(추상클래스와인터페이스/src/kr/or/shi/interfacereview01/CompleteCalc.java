package kr.or.shi.interfacereview01;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0)
			return ERROR;
		else
			return num1/num2;
		
	}

}
