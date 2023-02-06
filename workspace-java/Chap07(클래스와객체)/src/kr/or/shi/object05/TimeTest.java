package kr.or.shi.object05;

public class TimeTest {

	public static void main(String[] args) {
		
		
		Time t1 = new Time();
		//t1.hour = 10;    (private으로 불가)
		
		System.out.println(t1.getHour());
		//System.out.println(t1);
		
		//시를 설정
		t1.setHour(10);
		t1.setMinute(20);
		t1.setSecond(20);
		//System.out.println(t1.getHour());
		//System.out.println(t1.getMinute());
		//System.out.println(t1.getSecond());
		System.out.println(t1.toString());

	}

}
