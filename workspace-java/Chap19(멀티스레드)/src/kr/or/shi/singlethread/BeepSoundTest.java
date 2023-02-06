package kr.or.shi.singlethread;

import java.awt.Toolkit;

public class BeepSoundTest {

	//main()은 JVM이 실행한다.
	//싱글스레드를 멀티스레드로 바꿔서 프로그램을 만드는 것이 우리의 목표임/.
	public static void main(String[] args) {
		
		//현재 실행중인 스레드명을 출력함.
		System.out.println(Thread.currentThread().getName());
		
		//Tool킷은 GUI관련된 메서드로 구성되어진 인스턴스를 얻음.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			System.out.println("for문을 실행하는 스레드 이름 : " +
								Thread.currentThread().getName());
			toolkit.beep();		//비프음 출력
			try {
				Thread.sleep(500);			//스레드가 너무 빨리 실행하니까 0.5초 동안 순간 멈추게 함.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println("for문을 실행하는 스레드 이름2 : " +
								Thread.currentThread().getName());
			toolkit.beep();		//비프음 출력
			try {
				Thread.sleep(500);			//스레드가 너무 빨리 실행하니까 0.5초 동안 순간 멈추게 함.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
