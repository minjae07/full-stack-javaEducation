package kr.or.shi.overloading;

class A {
	int data1 = 10;
	int data2 = 20;
}
public class AccumulatorTest {
	
	public static void main(String[] args) {
		Accumulator accm = new Accumulator();
		int iResult = accm.add(10, 50);
		System.out.println("iResult : " + iResult);
		
		long lResult = accm.add(100, 7500L);			//접미사 반드시 붙이도록 함.
		System.out.println("lResult : " + lResult);
		
		lResult = accm.add(1000L, 10);
		System.out.println("lResult : " + lResult);
		
		double dResult = accm.add(107.88, 11.55);
		System.out.println("dResult : " + dResult);
		
		lResult = accm.add(new int [] {1, 2, 3, 4, 5});
		System.out.println("lResult : " + lResult);
		
		iResult = accm.add(new A());
		System.out.println("iResult : " + iResult);
	}

}
