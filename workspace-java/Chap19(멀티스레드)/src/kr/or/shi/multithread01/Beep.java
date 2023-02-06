package kr.or.shi.multithread01;

import java.awt.Toolkit;

public class Beep implements Runnable {
	
	@Override
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			System.out.println("비프음을 실행하는 스레드명 : "+
								Thread.currentThread().getName());
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				
			}
		}
		
	}
	

}
