package kr.or.shi.boxing;

public class BoxingUnBoxingTest {

	public static void main(String[] args) {
		
		//박싱(Boxing) ==> 객체화시킴
		Integer obj1 = new Integer(100);
		Integer obj3 = Integer.valueOf(100);
		
		Integer obj2 = 100;			//컴파일시 new Integer(100)로 바뀐다. (Auto Boxing)
		
		System.out.println("박시후");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//언박싱(Unboxing) ==>기본값으로 바꾼다.
		int value1 = obj1;
		int value2 = obj1.intValue();
		int value3 = obj3;
		System.out.println("언박싱후");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		

	}

}
