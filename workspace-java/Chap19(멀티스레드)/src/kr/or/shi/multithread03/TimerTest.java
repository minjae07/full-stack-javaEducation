package kr.or.shi.multithread03;

import javax.swing.JOptionPane;

public class TimerTest {

	public static void main(String[] args) {
		Thread thread = new TimerThread();
		thread.start();
		
		String input = JOptionPane.showInputDialog("10초 안에 값을 입력하세요." );
		//System.out.println(input);
		
		if(input != null) {
			System.out.println("입력 값 : " + input);
			System.exit(0);
		}
		else {
			try {
				Thread.sleep(10000);					//10초 대기
				System.out.println("입력하지 못했습니다. 퍼펖어펑");
				System.exit(0);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				
			} 							
		}
	}

}
