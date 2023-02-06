package kr.or.shi.threadname;

public class ThreadNameTest {
	
	/*
	 * 메인스레드가 2개의 스레드를 생성해서 start()시켜주는 것임.
	 * 비로소 threadDcu와 threadShi가 독립적으로 실행이 이루어짐.
	 */
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println("[프로그램 시작 스레드 명] : " + thread.getName());
		
		Thread threadDcu = new ThreadDcu();
		threadDcu.start();
		System.out.println("threadDcu를 생성한 스레드 이름 : " +
							Thread.currentThread().getName());
		
		Thread threadShi = new ThreadShi();
		threadShi.start();
		System.out.println("threadShi를 생성한 스레드 이름 : " +
				Thread.currentThread().getName());
	}

}
