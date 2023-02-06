package kr.or.shi.multithread01;

public class BeepSoundTest {
	
	public static void main(String[] args) {
		//직접 생성하는 멀티스레드 방법
		//방법1 --> 구현객체(Runnable) 대입
		
		Runnable runnable = new Beep();				//구현객체 대입
		Thread thread = new Thread(runnable);
		thread.start();
		
		/*
		 * 스레드는 한번 start() 다 실행하고 나면, 재실행이 안된다.
		 * 재실행을 하고자 한다면 인스턴스를 한개 더 만들어야 한다.
		 */
		
		thread = new Thread(runnable);
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("for문을 실행하는 스레드명 : "+ 
					Thread.currentThread().getName());
			System.out.println("삐옹~");
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
