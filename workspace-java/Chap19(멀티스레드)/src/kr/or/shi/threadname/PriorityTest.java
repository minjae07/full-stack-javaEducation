package kr.or.shi.threadname;

public class PriorityTest {
	
	/*
	 * 아무리 우선순위가 10으로 주었다 하더라도, 작업을 마치는 빈도가 높을 뿐이지
	 * 무조건 100% 먼저 끝낸다는 보장은 없다.
	 * 소결론 자바는 순환할당(Round-Robin)방식을 사용하고 있기 때문에,
	 * CPU스케줄링의 상태에 따라 달라진다.
	 */
	
	public static void main(String[] args) {
		
		//메인스레드
		Thread thread0 = Thread.currentThread();
		System.out.println(thread0.getName()+" : " + thread0.getPriority());
		
		for(int i=1 ; i<=20; i++) {
			Thread thread = new CalcThread("Thread : " +i);
			
			if(i != 20) {
				thread.setPriority(Thread.MIN_PRIORITY);				//Thread1,2,3,4는 우선순위가 가장 낮다.
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);				//Thread5는 우선순위가 10으로 가장 높다.
			}
			thread.start();
			
		}
		
	}

}
