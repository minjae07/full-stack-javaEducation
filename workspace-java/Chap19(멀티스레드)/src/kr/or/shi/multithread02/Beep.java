package kr.or.shi.multithread02;

import java.awt.Toolkit;

//상속을 받아서 스레드 클래스를 만듦
public class Beep extends Thread {
	
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


